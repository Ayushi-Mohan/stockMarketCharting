package com.ayushi.userAuth;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import com.ayushi.userAuth.jwt.AuthRequest;
import com.ayushi.userAuth.jwt.AuthResponse;
import com.ayushi.userAuth.jwt.JwtUtils;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {
    private final AuthenticationManager authenticationManager;
    private final UserService userDetailService;
    private final JwtUtils jwtUtil;

    public UserController(AuthenticationManager authenticationManager, UserService userDetailService, JwtUtils jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.userDetailService = userDetailService;
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/home")
    public ResponseEntity<?> home(){
        Map<String, String> res = new HashMap<>();
        res.put("status","Successful");
        return ResponseEntity.ok(res);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthRequest authRequest) throws Exception{
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authRequest.getUsername(), authRequest.getPassword()));
        } catch (BadCredentialsException badCredentialsException){
            return ResponseEntity.badRequest().body("Incorrect username or password");
        }

        final UserDetails userDetails = userDetailService.loadUserByUsername(authRequest.getUsername());
        final String JWT = jwtUtil.generateToken(userDetails);

        AuthResponse authResponse = new AuthResponse();
        authResponse.setJwt(JWT);
        authResponse.setUsername(userDetails.getUsername());
        authResponse.setAdmin(userDetailService.getRoleByUsername(userDetails.getUsername()));
        return ResponseEntity.ok(authResponse);
    }


}
