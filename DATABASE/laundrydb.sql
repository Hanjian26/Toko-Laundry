/*
SQLyog Professional v13.1.1 (64 bit)
MySQL - 8.0.26 : Database - laundrydb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`laundrydb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `laundrydb`;

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `login` */

insert  into `login`(`username`,`password`) values 
('admin','admin'),
('bherry','bherry'),
('hanjian','205314102'),
('marcelia','205314075'),
('morinda','205314101');

/*Table structure for table `pemesan` */

DROP TABLE IF EXISTS `pemesan`;

CREATE TABLE `pemesan` (
  `tanggal` varchar(45) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `telepon` varchar(45) NOT NULL,
  `paket` varchar(45) NOT NULL,
  `berat` int NOT NULL,
  `harga` int NOT NULL,
  `total` int NOT NULL,
  PRIMARY KEY (`nama`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `pemesan` */

insert  into `pemesan`(`tanggal`,`nama`,`telepon`,`paket`,`berat`,`harga`,`total`) values 
('12-12-2012','Aerosmith','082255224387','Kilat',100,8000,800000),
('02-10-2021','Ari','082146845613','Reguler',3,5000,15000),
('03-05-2021','Dendi','082143654987','Reguler',5,5000,25000),
('20-08-2021','Fallah','082155446678','Reguler',8,5000,40000),
('11-11-2021','Hanjian','082153468057','Kilat',5,8000,40000),
('11-01-2002','Lina','082153468057','Reguler',5,5000,25000),
('06-03-2021','Marcelia','082546879123','Kilat',4,8000,32000),
('05-05-2021','Morinda','082143679451','Reguler',6,5000,30000),
('11-01-2021','Rizki','082153468057','Reguler',5,5000,25000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
