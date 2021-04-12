CREATE DATABASE  IF NOT EXISTS `acorde` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `acorde`;
-- MariaDB dump 10.19  Distrib 10.4.18-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: acorde
-- ------------------------------------------------------
-- Server version	10.4.18-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alimento`
--

DROP TABLE IF EXISTS `alimento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alimento` (
  `idAlimento` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) NOT NULL,
  `proteina` varchar(10) DEFAULT NULL,
  `gordura` varchar(10) DEFAULT NULL,
  `caloria` varchar(10) DEFAULT NULL,
  `qtdProteina` varchar(10) DEFAULT NULL,
  `qtdGordura` varchar(10) DEFAULT NULL,
  `qtdCaloria` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idAlimento`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `Sobrenome` varchar(30) NOT NULL,
  `DataNascimento` varchar(20) DEFAULT NULL,
  `CPF` varchar(20) DEFAULT NULL,
  `Telefone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dietaalmoco`
--

DROP TABLE IF EXISTS `dietaalmoco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dietaalmoco` (
  `Segunda` varchar(150) DEFAULT NULL,
  `Terca` varchar(150) DEFAULT NULL,
  `Quarta` varchar(150) DEFAULT NULL,
  `Quinta` varchar(150) DEFAULT NULL,
  `Sexta` varchar(150) DEFAULT NULL,
  `Sabado` varchar(150) DEFAULT NULL,
  `Domingo` varchar(150) DEFAULT NULL,
  `anotacao` varchar(150) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `IdDieta` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdDieta`),
  KEY `fk_CliDietaAlmoco` (`idCliente`),
  CONSTRAINT `fk_CliDietaAlmoco` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dietacafemanha`
--

DROP TABLE IF EXISTS `dietacafemanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dietacafemanha` (
  `Segunda` varchar(150) DEFAULT NULL,
  `Terca` varchar(150) DEFAULT NULL,
  `Quarta` varchar(150) DEFAULT NULL,
  `Quinta` varchar(150) DEFAULT NULL,
  `Sexta` varchar(150) DEFAULT NULL,
  `Sabado` varchar(150) DEFAULT NULL,
  `Domingo` varchar(150) DEFAULT NULL,
  `anotacao` varchar(150) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `IdDieta` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdDieta`),
  KEY `fk_CliDietaCafe` (`idCliente`),
  CONSTRAINT `fk_CliDietaCafe` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dietajanta`
--

DROP TABLE IF EXISTS `dietajanta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dietajanta` (
  `Segunda` varchar(150) DEFAULT NULL,
  `Terca` varchar(150) DEFAULT NULL,
  `Quarta` varchar(150) DEFAULT NULL,
  `Quinta` varchar(150) DEFAULT NULL,
  `Sexta` varchar(150) DEFAULT NULL,
  `Sabado` varchar(150) DEFAULT NULL,
  `Domingo` varchar(150) DEFAULT NULL,
  `anotacao` varchar(150) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `IdDieta` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdDieta`),
  KEY `fk_CliDietaJanta` (`idCliente`),
  CONSTRAINT `fk_CliDietaJanta` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dietalanchemanha`
--

DROP TABLE IF EXISTS `dietalanchemanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dietalanchemanha` (
  `Segunda` varchar(150) DEFAULT NULL,
  `Terca` varchar(150) DEFAULT NULL,
  `Quarta` varchar(150) DEFAULT NULL,
  `Quinta` varchar(150) DEFAULT NULL,
  `Sexta` varchar(150) DEFAULT NULL,
  `Sabado` varchar(150) DEFAULT NULL,
  `Domingo` varchar(150) DEFAULT NULL,
  `anotacao` varchar(150) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `IdDieta` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdDieta`),
  KEY `fk_CliDietaLM` (`idCliente`),
  CONSTRAINT `fk_CliDietaLM` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dietalanchenoite`
--

DROP TABLE IF EXISTS `dietalanchenoite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dietalanchenoite` (
  `Segunda` varchar(150) DEFAULT NULL,
  `Terca` varchar(150) DEFAULT NULL,
  `Quarta` varchar(150) DEFAULT NULL,
  `Quinta` varchar(150) DEFAULT NULL,
  `Sexta` varchar(150) DEFAULT NULL,
  `Sabado` varchar(150) DEFAULT NULL,
  `Domingo` varchar(150) DEFAULT NULL,
  `anotacao` varchar(150) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `IdDieta` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdDieta`),
  KEY `fk_CliDieta` (`idCliente`),
  CONSTRAINT `fk_CliDieta` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dietalanchetarde`
--

DROP TABLE IF EXISTS `dietalanchetarde`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dietalanchetarde` (
  `Segunda` varchar(150) DEFAULT NULL,
  `Terca` varchar(150) DEFAULT NULL,
  `Quarta` varchar(150) DEFAULT NULL,
  `Quinta` varchar(150) DEFAULT NULL,
  `Sexta` varchar(150) DEFAULT NULL,
  `Sabado` varchar(150) DEFAULT NULL,
  `Domingo` varchar(150) DEFAULT NULL,
  `anotacao` varchar(150) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `IdDieta` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdDieta`),
  KEY `fk_CliDietaLT` (`idCliente`),
  CONSTRAINT `fk_CliDietaLT` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `educador_fisico`
--

DROP TABLE IF EXISTS `educador_fisico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `educador_fisico` (
  `idEducadorFisico` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `Sobrenome` varchar(30) NOT NULL,
  `DataNascimento` varchar(20) DEFAULT NULL,
  `CREF` varchar(6) DEFAULT NULL,
  `Telefone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idEducadorFisico`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `nutricionista`
--

DROP TABLE IF EXISTS `nutricionista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nutricionista` (
  `idNutricionista` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `Sobrenome` varchar(30) NOT NULL,
  `DataNascimento` varchar(20) DEFAULT NULL,
  `CRN` varchar(6) DEFAULT NULL,
  `Telefone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idNutricionista`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `treino`
--

DROP TABLE IF EXISTS `treino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `treino` (
  `idTreino` int(11) NOT NULL AUTO_INCREMENT,
  `nomeExercicio` varchar(50) DEFAULT NULL,
  `descricaoExercicio` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idTreino`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `treinoaer`
--

DROP TABLE IF EXISTS `treinoaer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `treinoaer` (
  `Segunda` varchar(150) DEFAULT NULL,
  `Terca` varchar(150) DEFAULT NULL,
  `Quarta` varchar(150) DEFAULT NULL,
  `Quinta` varchar(150) DEFAULT NULL,
  `Sexta` varchar(150) DEFAULT NULL,
  `Sabado` varchar(150) DEFAULT NULL,
  `Domingo` varchar(150) DEFAULT NULL,
  `anotacao` varchar(150) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `IdTreino` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdTreino`),
  KEY `fk_TreinoAer` (`idCliente`),
  CONSTRAINT `fk_TreinoAer` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `treinoanaer`
--

DROP TABLE IF EXISTS `treinoanaer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `treinoanaer` (
  `Segunda` varchar(150) DEFAULT NULL,
  `Terca` varchar(150) DEFAULT NULL,
  `Quarta` varchar(150) DEFAULT NULL,
  `Quinta` varchar(150) DEFAULT NULL,
  `Sexta` varchar(150) DEFAULT NULL,
  `Sabado` varchar(150) DEFAULT NULL,
  `Domingo` varchar(150) DEFAULT NULL,
  `anotacao` varchar(150) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `IdTreino` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdTreino`),
  KEY `fk_TreinoAnaer` (`idCliente`),
  CONSTRAINT `fk_TreinoAnaer` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-05 12:28:48
