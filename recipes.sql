-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 19, 2017 at 04:35 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `recipes`
--

-- --------------------------------------------------------

--
-- Table structure for table `mainindex`
--

CREATE TABLE `mainindex` (
  `Recipe Title` varchar(150) NOT NULL,
  `Recipe Type` varchar(200) DEFAULT NULL,
  `Serving Size` varchar(10) DEFAULT NULL,
  `Ingredients` varchar(200) NOT NULL,
  `Steps` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mainindex`
--

INSERT INTO `mainindex` (`Recipe Title`, `Recipe Type`, `Serving Size`, `Ingredients`, `Steps`) VALUES
('Pork Adobo', 'Main Course', '4-6', 'pork_adobo_ing', 'pork_adobo_steps'),
('Pork Sisig', 'Main Course', '6', 'pork_sisig_ing', 'pork_sisig_steps');

-- --------------------------------------------------------

--
-- Table structure for table `pork_adobo_ing`
--

CREATE TABLE `pork_adobo_ing` (
  `Ingredient` varchar(80) NOT NULL,
  `Measurement Type` varchar(20) NOT NULL,
  `Measurement Size` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pork_adobo_ing`
--

INSERT INTO `pork_adobo_ing` (`Ingredient`, `Measurement Type`, `Measurement Size`) VALUES
('garlic, chopped', 'tablespoon', '2'),
('ground black pepper', 'teaspoon', '1/2'),
('laurel leaf', 'piece', '1'),
('Liempo, cut in cubes', 'kilo', '1/2'),
('Maggi Magic Sarap', 'sachet', '1'),
('Maggi Soy Cooking & Seasoning Sauce', 'cup', '1/4'),
('oil for frying', 'tablespoon', '2'),
('Vinegar', 'cup', '1/4');

-- --------------------------------------------------------

--
-- Table structure for table `pork_adobo_steps`
--

CREATE TABLE `pork_adobo_steps` (
  `Step Number` int(11) NOT NULL,
  `Content` blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pork_adobo_steps`
--

INSERT INTO `pork_adobo_steps` (`Step Number`, `Content`) VALUES
(1, 0x496e206120706f742c20636f6d62696e6520706f726b2c76696e656761722c204d4147474920534f5920434f4f4b494e47202620534541534f4e494e472053415543452c204d41474749204d414749432053415241502c206761726c69632c206c617572656c206c6561662c20616e6420626c61636b207065707065722e),
(2, 0x436f6f6b20756e636f766572656420756e74696c206d69787475726520626f696c732e204c6f776572206865617420616e642073696d6d657220666f72203130206d696e757465732e2053747261696e20736175636520666f72206c61746572207573652e),
(3, 0x496e206c617267652070616e2c2068656174206f696c2e2050616e2d66727920706f726b20756e74696c20676f6c64656e2062726f776e2c2061626f75742032206d696e75746573206561636820736964652e20506f757220696e20726573657276656420736175636520616e642073696d6d6d657220666f722033206d696e757465732e);

-- --------------------------------------------------------

--
-- Table structure for table `pork_sisig_ing`
--

CREATE TABLE `pork_sisig_ing` (
  `Ingredient` varchar(80) NOT NULL,
  `Measurement Type` varchar(20) NOT NULL,
  `Measurement Size` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pork_sisig_ing`
--

INSERT INTO `pork_sisig_ing` (`Ingredient`, `Measurement Type`, `Measurement Size`) VALUES
('Butter(or Margarine)', 'cup', '1/2'),
('Chicken Liver', 'lb', '1/4'),
('Chili Flakes', 'tablespoon', '3'),
('Garlic Powder', 'teaspoon', '1/2'),
('Ginger, Minced', 'knob', '1'),
('Ground Black Pepper', 'teaspoon', '1/4'),
('Large Onion, Minced', 'Large', '1'),
('Lemon(or 3-5 calamansi)', 'piece', '1'),
('Mayonnaise', 'tablespoon', '3'),
('Pig Ears', 'lb.', '1'),
('Pork Belly', 'lb', '1 1/2'),
('Salt', 'teaspoon', '1'),
('Soy Sauce', 'tablespoon', '3'),
('Water', 'cup', '6');

-- --------------------------------------------------------

--
-- Table structure for table `pork_sisig_steps`
--

CREATE TABLE `pork_sisig_steps` (
  `Step Number` int(11) NOT NULL,
  `Content` blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pork_sisig_steps`
--

INSERT INTO `pork_sisig_steps` (`Step Number`, `Content`) VALUES
(1, 0x506f75722074686520776174657220696e20612070616e20616e64206272696e6720746f206120626f696c2c206164642073616c7420616e64207065707065722e),
(2, 0x5075742d696e2074686520706967206561727320616e6420706f726b2062656c6c79207468656e2073696d6d657220666f72203430206d696e7574657320746f203120686f7572286f7220756e74696c2074656e64657229),
(3, 0x52656d6f76652074686520626f696c656420696e6772656469656e74732066726f6d2074686520706f74207468656e20647261696e206578636573732077617465722e),
(4, 0x4772696c6c2074686520626f696c656420706967206561727320616e6420706f726b2062656c6c7920756e74696c20646f6e652e),
(5, 0x43686f702074686520706967206561727320616e6420706f726b2062656c6c7920696e746f2066696e65207069656365732e),
(6, 0x496e206120776964652070616e2c206d656c742074686520627574746572206f72206d6172676172696e652e2041646420746865206f6e696f6e732e20436f6f6b20756e74696c206f6e696f6e732061726520736f66742e),
(7, 0x5075742d696e207468652067696e67657220616e6420636f6f6b20666f722032206d696e757465732e),
(8, 0x4164642074686520636869636b656e206c697665722e2043727573682074686520636869636b656e206c69766572207768696c6520636f6f6b696e6720697420696e207468652070616e2e),
(9, 0x416464207468652063686f7070656420706967206561727320616e6420706f726b2062656c6c792e20436f6f6b20666f7220313020746f203132206d696e757465732e),
(10, 0x5075742d696e2074686520736f792073617563652c206761726c696320706f776465722c20616e64206368696c692e204d69782077656c6c2e),
(11, 0x4164642073616c7420616e642070657070657220746f2074617374652e),
(12, 0x5075742d696e20746865206d61796f6e6e6169736520616e64206d6978207769746820746865206f7468657220696e6772656469656e74732e),
(13, 0x5472616e7366657220746f20612073657276696e6720706c6174652e20546f7020776974682063686f7070656420677265656e206f6e696f6e7320616e6420726177206567672e),
(14, 0x536572766520686f742e20536861726520616e6420656e6a6f792e);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mainindex`
--
ALTER TABLE `mainindex`
  ADD PRIMARY KEY (`Recipe Title`);

--
-- Indexes for table `pork_adobo_ing`
--
ALTER TABLE `pork_adobo_ing`
  ADD PRIMARY KEY (`Ingredient`);

--
-- Indexes for table `pork_adobo_steps`
--
ALTER TABLE `pork_adobo_steps`
  ADD PRIMARY KEY (`Step Number`);

--
-- Indexes for table `pork_sisig_ing`
--
ALTER TABLE `pork_sisig_ing`
  ADD PRIMARY KEY (`Ingredient`);

--
-- Indexes for table `pork_sisig_steps`
--
ALTER TABLE `pork_sisig_steps`
  ADD PRIMARY KEY (`Step Number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pork_adobo_steps`
--
ALTER TABLE `pork_adobo_steps`
  MODIFY `Step Number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pork_sisig_steps`
--
ALTER TABLE `pork_sisig_steps`
  MODIFY `Step Number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
