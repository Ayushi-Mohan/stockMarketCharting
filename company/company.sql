CREATE DATABASE  IF NOT EXISTS `stock_market_charting`;
USE `stock_market_charting`;

DROP TABLE IF EXISTS `company`;

CREATE TABLE `company` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `comp_name` varchar(45) DEFAULT NULL,
  `turnover` decimal(2) ,
  `ceo` varchar(45) DEFAULT NULL,
  `bod` varchar(45) DEFAULT NULL,
  `stock_exchange` varchar(45) DEFAULT NULL,
  `sector` varchar(45) DEFAULT NULL,
  `brief` varchar(45) DEFAULT NULL,
  `comp_code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;