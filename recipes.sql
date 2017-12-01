-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2017 at 11:49 AM
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
-- Table structure for table `lechon_paksiw_ing`
--

CREATE TABLE `lechon_paksiw_ing` (
  `Ingredient` varchar(80) NOT NULL,
  `Measurement Type` varchar(20) NOT NULL,
  `Measurement Size` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lechon_paksiw_ing`
--

INSERT INTO `lechon_paksiw_ing` (`Ingredient`, `Measurement Type`, `Measurement Size`) VALUES
('Beef Stock', 'cup', '2'),
('Dried Bay Leaves', 'piece', '8'),
('Garlic, crushed', 'cloves', '6'),
('Lechon sauce', 'cup', '3'),
('Leftover Lechon/Lechon Kawali', 'lb', '4'),
('Onions, chopped', 'large', '2'),
('Soy Sauce', 'cup', '1/2'),
('Sugar', 'cup', '3/4'),
('Vinegar', 'cup', '3/4'),
('Whole Peppercorn', 'tsp', '1');

-- --------------------------------------------------------

--
-- Table structure for table `lechon_paksiw_steps`
--

CREATE TABLE `lechon_paksiw_steps` (
  `Step Number` int(11) NOT NULL,
  `Content` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lechon_paksiw_steps`
--

INSERT INTO `lechon_paksiw_steps` (`Step Number`, `Content`) VALUES
(1, 0x48656174206120636f6f6b696e6720706f7420616e6420706f75722d696e2074686520626565662073746f636b2e204272696e6720746f206120626f696c2e),
(2, 0x5075742d696e20746865206761726c696320616e64206f6e696f6e73207468656e20636f6f6b20756e74696c207468652074657874757265206265636f6d657320736f66742e),
(3, 0x416464207468652077686f6c6520706570706572636f726e732c20647269656420626179206c65617665732c20616e6420736f792073617563652e),
(4, 0x5075742d696e20746865206c6566746f766572206c6563686f6e20616e642073696d6d657220666f7220333020746f203335206d696e757465732e),
(5, 0x416464207468652076696e6567617220616e64206272696e6720746f206120626f696c2e2053696d6d657220666f72203130206d696e757465732e),
(6, 0x4164642074686520737567617220616e64206c6563686f6e207361756365207468656e2073696d6d657220666f7220616e6f746865722035206d696e757465732e),
(7, 0x446173682d696e20736f6d652073616c7420746f2074617374207468656e20737469722e),
(8, 0x5475726e206f666620746865206865617420616e64207472616e7366657220746f20612073657276696e6720706c6174652e),
(9, 0x536572766520686f74207769746820726963652e20536861726520616e6420656e6a6f792e);

-- --------------------------------------------------------

--
-- Table structure for table `mainindex`
--

CREATE TABLE `mainindex` (
  `Recipe Title` varchar(150) NOT NULL,
  `Recipe Type` varchar(200) DEFAULT NULL,
  `Serving Size` varchar(10) DEFAULT NULL,
  `Ingredients` varchar(200) NOT NULL,
  `Steps` varchar(200) NOT NULL,
  `Privacy` enum('private','public') NOT NULL DEFAULT 'public'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mainindex`
--

INSERT INTO `mainindex` (`Recipe Title`, `Recipe Type`, `Serving Size`, `Ingredients`, `Steps`, `Privacy`) VALUES
('Lechon Paksiw', 'Main Course', '8', 'lechon_paksiw_ing', 'lechon_paksiw_steps', 'public'),
('Picadillo', 'Main Course', '6', 'picadillo_ing', 'picadillo_steps', 'public'),
('Pork Adobo', 'Main Course', '4-6', 'pork_adobo_ing', 'pork_adobo_steps', 'public'),
('Pork Sisig', 'Main Course', '6', 'pork_sisig_ing', 'pork_sisig_steps', 'public');

-- --------------------------------------------------------

--
-- Table structure for table `picadillo_ing`
--

CREATE TABLE `picadillo_ing` (
  `Ingredient` varchar(80) NOT NULL,
  `Measurement Type` varchar(20) NOT NULL,
  `Measurement Size` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `picadillo_ing`
--

INSERT INTO `picadillo_ing` (`Ingredient`, `Measurement Type`, `Measurement Size`) VALUES
('80/20 Ground Beef', 'lb', '1'),
('Carrots, peeled and cut into 1/2 inch dice', 'cups', '2'),
('Chili Garlic Paste', 'tsp', '1'),
('Extra Virgin Olive Oil, divided', 'tbsp', '3'),
('Fish Sauce', 'tbsp', '1'),
('Fresh Garlic, minced', 'tbsp', '1'),
('Fresh Plum/San Marzano, seeded, corded and diced', 'lb', '1/2'),
('Freshly Ground Black Pepper', 'tsp', '1/4'),
('Fried Egg', 'each serve', '1'),
('Frozen Peas, thawed', 'cups', '1'),
('Good Quality Soy Sauce', 'tbsp', '3'),
('Ground Pork', 'lb', '1/2'),
('Kosher Salt', 'tsp', '1/2'),
('Onion, diced', 'cups', '1 1/2'),
('Raisins', 'cups', '1/2'),
('Tabasco Sauce', '', ''),
('Tomato Paste', 'tbsp', '1'),
('Uncooked White Rice', 'cups', '2'),
('Water', 'cups', '1'),
('Yellow Potatoes, peeled and diced into bite size', 'cups', '2 1/2');

-- --------------------------------------------------------

--
-- Table structure for table `picadillo_steps`
--

CREATE TABLE `picadillo_steps` (
  `Step Number` int(11) NOT NULL,
  `Content` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `picadillo_steps`
--

INSERT INTO `picadillo_steps` (`Step Number`, `Content`) VALUES
(1, 0x426567696e20636f6f6b696e67207269636520627920616464696e67207477696365206173206d756368207761746572206173207269636520746f612070616e206f72207269636520706f742e20436f6f6b2072696365207768696c6520707265706172696e672074686520646973682e),
(2, 0x496e2061206c6172676520736b696c6c6574206f722073617574652070616e2c206f766572206d656469756d20746f206d656469756d206869676820686561742c20706c6163652032207461626c6573706f6f6e73206f66206f6c697665206f696c20616e64206f6e6365207368696d6d6572696e672c2061646420706f7461746f20616e6420636172726f74732e),
(3, 0x467279207468697320666f72203135206d696e757465732c207374697272696e67206f63636173696f6e616c6c792e20546865792073686f756c6420737461727420746f2062726f776e20616e64206265206a75737420736879206f662074656e6465722e2052656d6f766520746865736520746f206120626f776c2077697468206120736c6f747465642073706f6f6e20627574206c65617665206f696c20696e2070616e2e),
(4, 0x4164642072656d61696e696e67207461626c6573706f6f6e206f66206f696c20616e64206f6e696f6e20616e6420736175746520666f722033206d696e75746573),
(5, 0x416464206761726c696320616e6420736175746520666f722031206d696e757465),
(6, 0x416464207468652067726f756e64206265656620616e642067726f756e6420706f726b20616e6420736175746520666f722061626f75742038206d696e75746573206f7220756e74696c2062726f776e65642e),
(7, 0x4d616b65206120686f6c6520696e207468652063656e74657220616e642061646420746f6d61746f20706173746520616e642073746972207468617420666f722031206d696e7574652e),
(8, 0x4164642074686520746f6d61746f65732c2073616c742c207065707065722c2072616973696e732c20666973682073617563652c20736f792073617563652c206368696c69206761726c69632070617374652c20776174657220616e6420726573657276656420636f6f6b656420706f7461746f20616e6420636172726f74206d697874757265),
(9, 0x526564756365206865617420746f206d656469756d20616e642073696d6d657220756e74696c206d6f7374206f6620746865206c69717569642068617320657661706f72617465642e),
(10, 0x41646420706561732c207374697220616e642072656d6f76652066726f6d2068656174),
(11, 0x496e2061206672792070616e2c2066727920656e6f7567682073756e6e792073696465206f72206f76657220656173792065676773206173206e656564656420666f7220656163682064696e6e65722067756573742e),
(12, 0x536572766520627920706c6163696e6720636f6f6b6564207768697465207269636520696e20612073657276696e6720626f776c2c20746f70207769746820746865205069636164696c6c6f207468656e20746f702077697468206f6e6520667269656420656767206f6e20746f70206f66206561636820706f7274696f6e2e),
(13, 0x53657276652077697468205461626173636f206f6e2074686520736964652e);

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
-- Indexes for table `lechon_paksiw_ing`
--
ALTER TABLE `lechon_paksiw_ing`
  ADD PRIMARY KEY (`Ingredient`);

--
-- Indexes for table `lechon_paksiw_steps`
--
ALTER TABLE `lechon_paksiw_steps`
  ADD PRIMARY KEY (`Step Number`);

--
-- Indexes for table `mainindex`
--
ALTER TABLE `mainindex`
  ADD PRIMARY KEY (`Recipe Title`);

--
-- Indexes for table `picadillo_ing`
--
ALTER TABLE `picadillo_ing`
  ADD PRIMARY KEY (`Ingredient`);

--
-- Indexes for table `picadillo_steps`
--
ALTER TABLE `picadillo_steps`
  ADD PRIMARY KEY (`Step Number`);

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
-- AUTO_INCREMENT for table `lechon_paksiw_steps`
--
ALTER TABLE `lechon_paksiw_steps`
  MODIFY `Step Number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `picadillo_steps`
--
ALTER TABLE `picadillo_steps`
  MODIFY `Step Number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

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
