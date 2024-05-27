mysqldump: [Warning] Using a password on the command line interface can be insecure.
-- MySQL dump 10.13  Distrib 8.0.33, for Linux (x86_64)
--
-- Host: localhost    Database: students
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `school_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Ana','Garca','111-222-3333',8),(2,'Luis','Martnez','444-555-6666',8),(3,'Sofa','Hernndez','777-888-9999',8),(4,'Diego','Lpez','555-444-3333',8),(5,'Isabella','Prez','222-888-7777',8),(6,'Carlos','Gmez','777-555-2222',8),(7,'Valentina','Rodrguez','444-222-1111',8),(8,'Javier','Fernndez','111-555-4444',8),(9,'Luca','Daz','333-888-5555',8),(10,'Miguel','Chvez','888-111-2222',8),(11,'Camila','Torres','111-222-3333',6),(12,'Sebastin','Ramrez','444-555-6666',6),(13,'Valeria','Rojas','777-888-9999',6),(14,'Martn','Gutirrez','555-444-3333',6),(15,'Mariana','Snchez','222-888-7777',6),(16,'Alejandro','Hernndez','777-555-2222',6),(17,'Valentina','Lpez','444-222-1111',6),(18,'Andrs','Martnez','111-555-4444',6),(19,'Isabella','Garca','333-888-5555',6),(20,'Juan','Fernndez','888-111-2222',6),(21,'Elena','Prez','111-222-3333',7),(22,'Gabriel','Gmez','444-555-6666',7),(23,'Luciana','Daz','777-888-9999',7),(24,'Santiago','Hernndez','555-444-3333',7),(25,'Valentina','Lpez','222-888-7777',7),(26,'Emiliano','Martnez','777-555-2222',7),(27,'Isabella','Rodrguez','444-222-1111',7),(28,'Sebastin','Fernndez','111-555-4444',7),(29,'Valeria','Garca','111-222-3333',4),(30,'Alejandro','Martnez','444-555-6666',4),(31,'Camila','Ramrez','777-888-9999',4),(32,'Sebastin','Hernndez','555-444-3333',4),(33,'Valentina','Lpez','222-888-7777',4),(34,'Lucas','Snchez','777-555-2222',4),(35,'Elena','Daz','444-222-1111',4),(36,'Emiliano','Prez','111-555-4444',4),(37,'Mariana','Gmez','333-888-5555',4),(38,'Juan','Fernndez','888-111-2222',4),(39,'Luca','Chvez','111-333-5555',4),(40,'Santiago','Rojas','444-888-1111',4),(41,'Andrea','Rodrguez','111-222-3333',5),(42,'Joaqun','Gmez','444-555-6666',5),(43,'Valentina','Hernndez','777-888-9999',5),(44,'Mateo','Martnez','555-444-3333',5),(45,'Mara','Lpez','222-888-7777',5),(46,'Gabriela','Snchez','777-555-2222',5),(47,'Juan','Prez','444-222-1111',5),(48,'Valeria','Fernndez','111-555-4444',5),(49,'Lucas','Garca','333-888-5555',5),(50,'Elena','Chvez','888-111-2222',5),(51,'Sofa','Rojas','111-333-5555',5),(52,'Emiliano','Torres','444-888-1111',5);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-25 15:31:08
