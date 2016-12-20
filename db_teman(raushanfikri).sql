/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.5.5-10.1.10-MariaDB : Database - db_teman(raushanfikri)
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_teman(raushanfikri)` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_teman(raushanfikri)`;

/*Table structure for table `tbl_teman` */

DROP TABLE IF EXISTS `tbl_teman`;

CREATE TABLE `tbl_teman` (
  `id_teman` char(10) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `no_hp` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_teman`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_teman` */

insert  into `tbl_teman`(`id_teman`,`nama`,`no_hp`,`email`,`alamat`) values ('1','raushan','085609580008','fikriraushan17@gmail','jln. gunung krakatau'),('2','Raymon','089793832','raymonsanjaya@gmail.com','jln. Apa Ajalah'),('3','Randi','08570918129','randiprabowo@gmail.com','jln. Situ Ajalah');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
