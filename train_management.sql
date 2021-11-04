-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2021 at 09:22 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `train_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking_table`
--

CREATE TABLE `booking_table` (
  `passengerid` bigint(20) NOT NULL,
  `passenger_name` varchar(255) DEFAULT NULL,
  `train_name` varchar(255) DEFAULT NULL,
  `travel_time_date` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `seat_no` varchar(255) DEFAULT NULL,
  `station_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking_table`
--

INSERT INTO `booking_table` (`passengerid`, `passenger_name`, `train_name`, `travel_time_date`, `destination`, `seat_no`, `station_name`) VALUES
(34, NULL, NULL, NULL, 'Shirajganj', '75-A', 'Tarakandi rail station'),
(35, 'Sadia Mubasshera', 'Jamuna Express', '15/10/2021', 'Shirajganj', '75-A', 'Tarakandi rail station'),
(36, 'Nusrat Jahan', 'Upobon Express', '15/10/2021', 'Shunamganj', '77-A', 'Shunamganj rail station'),
(37, 'Saikat Saha', 'Upobon Express', '25/10/2021', NULL, '78-A', 'Shunamganj rail station'),
(38, 'Saikat Saha', 'Upobon Express', '25/10/2021', NULL, '78-A', 'Shunamganj rail station'),
(39, 'Saikat Saha', 'Upobon Express', '25/10/2021', NULL, '78-A', 'Shunamganj rail station'),
(40, 'protiva', 'Tista express', '12/11/2021', NULL, '2', 'kamlapur rail station'),
(41, 'Oishe', 'Korotoa Express', '30/10/2021', NULL, '4', 'Shahjalal Airport Rail station'),
(42, 'nusrat', 'shuborno express', '12/11/2021', NULL, '2', 'kamlapur rail station'),
(43, 'tamanna', 'Tista express', '12/11/2021', NULL, '5', 'kamlapur rail station'),
(44, 'protiva', 'shuborno express', '30/10/2021', NULL, '4', 'kamlapur rail station'),
(45, 'protiva', 'Korotoa Express', '30/10/2021', NULL, '4', 'Shahjalal Airport Rail station'),
(46, 'protiva', 'Korotoa Express', '30/10/2021', NULL, '4', 'Shahjalal Airport Rail station'),
(47, 'faiaz', 'Turna-Nishitha Express', '24/11/2021', NULL, '3', 'Rajshahi'),
(48, 'tamanna', 'shuborno express', '30/10/2021', NULL, '3', 'kamlapur rail station'),
(49, 'protiva', 'shuborno express', '30/10/2021', NULL, '2', 'kamlapur rail station'),
(50, 'abir', 'shuborno express', '30/12/2021', NULL, '3', 'kamlapur rail station'),
(51, 'protiva', 'shuborno express', '30/10/2021', NULL, '4', 'kamlapur rail station'),
(52, 'protiva', 'Tista express', '30/12/2021', NULL, '5', 'kamlapur rail station'),
(53, 'anik', 'Korotoa Express', '12/11/2021', NULL, '2', 'Rajshahi'),
(54, 'tamanna', 'Turna-Nishitha Express', '30/12/2021', NULL, '3', 'kamlapur rail station'),
(55, 'Sifat', 'Tista Express', '13/11/2021', NULL, '4', 'Feni rail station '),
(56, 'sani', 'Turna-Nishitha Express', '14/11/2021', NULL, '1', 'Laksmipur station'),
(57, 'Tanvir', 'Karnafuli express', '20/12/2021', NULL, '4', 'Hathazari rail station'),
(58, 'Shupria', 'Tista express', '13/11/2021', NULL, '2', 'Hathazari rail station'),
(59, 'pritha', 'Tista Express', '30/10/2021', NULL, '3', 'Shahjalal Airport Rail station'),
(60, 'sani', 'Sagor dari Express', '17/11/2021', NULL, '2', 'Jessore rail station'),
(61, 'sani', 'shuborno express', '30/12/2021', NULL, '1', 'Hathazari rail station');

-- --------------------------------------------------------

--
-- Table structure for table `district`
--

CREATE TABLE `district` (
  `district_id` bigint(20) NOT NULL,
  `district_name` varchar(255) DEFAULT NULL,
  `div_id` varchar(255) DEFAULT NULL,
  `divsion_id` bigint(20) DEFAULT NULL,
  `division_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `district`
--

INSERT INTO `district` (`district_id`, `district_name`, `div_id`, `divsion_id`, `division_id`) VALUES
(3, NULL, NULL, NULL, NULL),
(5, 'Cox\'s Bazar', '4', NULL, NULL),
(7, 'Shunamganj', '6', NULL, NULL),
(9, 'MauloviBazar', '6', NULL, NULL),
(11, 'Bagerhat', '3', NULL, NULL),
(13, 'Natore', '2', NULL, NULL),
(15, 'Shirajganj', '2', NULL, NULL),
(17, 'Jamalpur', '2', NULL, NULL),
(19, 'Dhaka', '1', NULL, NULL),
(21, 'Khulna', '3', NULL, NULL),
(24, 'Chattagram sadar', '4', NULL, NULL),
(26, 'Chattagram sadar', '4', NULL, NULL),
(28, 'Dinajpur', '7', NULL, NULL),
(30, 'Nilfamari', '7', NULL, NULL),
(32, 'Gaibandha', '7', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `division`
--

CREATE TABLE `division` (
  `division_id` bigint(20) NOT NULL,
  `div_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `division`
--

INSERT INTO `division` (`division_id`, `div_name`) VALUES
(1, 'Dhaka'),
(2, 'Rajshahi'),
(3, 'Khulna'),
(4, 'Chattagram'),
(5, 'Barishal'),
(6, 'Sylhet'),
(7, 'Rangpur'),
(8, 'Mymensingh');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(62);

-- --------------------------------------------------------

--
-- Table structure for table `mapping_table`
--

CREATE TABLE `mapping_table` (
  `map_id` bigint(20) NOT NULL,
  `date_time` date DEFAULT NULL,
  `station_id` bigint(20) DEFAULT NULL,
  `train_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `station_info`
--

CREATE TABLE `station_info` (
  `station_id` bigint(20) NOT NULL,
  `division_name` varchar(255) DEFAULT NULL,
  `station_name` varchar(255) DEFAULT NULL,
  `district_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `station_info`
--

INSERT INTO `station_info` (`station_id`, `division_name`, `station_name`, `district_id`) VALUES
(1, NULL, 'panchagarh rail station', NULL),
(4, 'Chattagram', 'Cox\'s Bazar rail station', 3),
(6, 'Chattagram', 'Cox\'s Bazar rail station', 5),
(8, 'Sylhet', 'Shunamganj rail station', 7),
(10, 'Sylhet', 'MauloviBazar rail station', 9),
(12, 'Khulna', 'Bagerhat rail station', 11),
(14, 'Rajshahi', 'Natore rail station', 13),
(16, 'Rajshahi', 'Tarakandi rail station', 15),
(18, 'Rajshahi', 'Sharishabari rail station', 17),
(20, 'Dhaka', 'Kamlapur rail station', 19),
(22, 'Khulna', 'Khulna rail station', 21),
(25, 'Chattagram', 'Chattagram sadar rail station', 24),
(27, 'Chattagram', 'Hathazari rail station', 26),
(29, 'Rangpur', 'Dinajpur rail station', 28),
(31, 'Rangpur', 'nilfamari rail station', 30),
(33, 'Rangpur', 'Gaibandha rail station', 32);

-- --------------------------------------------------------

--
-- Table structure for table `train_booking`
--

CREATE TABLE `train_booking` (
  `booking_id` bigint(20) NOT NULL,
  `train_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `train_info`
--

CREATE TABLE `train_info` (
  `train_id` bigint(20) NOT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `seat_no` varchar(255) DEFAULT NULL,
  `train_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `train_info`
--

INSERT INTO `train_info` (`train_id`, `destination`, `seat_no`, `train_name`) VALUES
(100, 'Chattagram', '600', 'Chattala Express'),
(101, 'Shunamganj', '500', 'Upaban Express'),
(102, 'Panchagarh', '500', 'Ekota Express'),
(103, 'MauloviBazar', '500', 'Jayantika Express'),
(104, 'Bagerhat', '700', 'Sundarban Express'),
(105, 'Natore', '500', 'Padma Express'),
(106, 'Shirajganj', '500', 'Jamuna Express'),
(107, 'Jamalpur', '500', 'Jamalpur Express'),
(108, 'Dhaka', '500', 'Chitra Express'),
(109, 'Khulna', '500', 'Chitra Express'),
(111, 'Dhaka-Rangpur', '500', 'Korotoa Express');

-- --------------------------------------------------------

--
-- Table structure for table `train_station_mapping`
--

CREATE TABLE `train_station_mapping` (
  `train_id` bigint(20) NOT NULL,
  `station_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `train_station_mapping`
--

INSERT INTO `train_station_mapping` (`train_id`, `station_id`) VALUES
(102, 1),
(101, 8),
(103, 10),
(104, 12),
(105, 14),
(106, 16),
(107, 18),
(108, 20),
(109, 22),
(100, 27),
(111, 33);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking_table`
--
ALTER TABLE `booking_table`
  ADD PRIMARY KEY (`passengerid`);

--
-- Indexes for table `district`
--
ALTER TABLE `district`
  ADD PRIMARY KEY (`district_id`),
  ADD KEY `FKtjsej81rnvgs4dus3qxckwv9m` (`divsion_id`),
  ADD KEY `FK78g8m793eebrogjuuey668ihu` (`division_id`);

--
-- Indexes for table `division`
--
ALTER TABLE `division`
  ADD PRIMARY KEY (`division_id`);

--
-- Indexes for table `mapping_table`
--
ALTER TABLE `mapping_table`
  ADD PRIMARY KEY (`map_id`);

--
-- Indexes for table `station_info`
--
ALTER TABLE `station_info`
  ADD PRIMARY KEY (`station_id`),
  ADD KEY `FK5v2dm96hxinujbjp92obc3sdd` (`district_id`);

--
-- Indexes for table `train_booking`
--
ALTER TABLE `train_booking`
  ADD KEY `FKr874ynx9bpfc5lhrrb3vq023o` (`train_id`),
  ADD KEY `FKm240bxxua16m8hwv4mtihn90p` (`booking_id`);

--
-- Indexes for table `train_info`
--
ALTER TABLE `train_info`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `train_station_mapping`
--
ALTER TABLE `train_station_mapping`
  ADD KEY `FK4lvmkn2ryk5y22ptppxn2oy7y` (`station_id`),
  ADD KEY `FK6og3f781gd6dfef4276g0oirv` (`train_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `district`
--
ALTER TABLE `district`
  ADD CONSTRAINT `FK78g8m793eebrogjuuey668ihu` FOREIGN KEY (`division_id`) REFERENCES `division` (`division_id`),
  ADD CONSTRAINT `FKtjsej81rnvgs4dus3qxckwv9m` FOREIGN KEY (`divsion_id`) REFERENCES `division` (`division_id`);

--
-- Constraints for table `station_info`
--
ALTER TABLE `station_info`
  ADD CONSTRAINT `FK5v2dm96hxinujbjp92obc3sdd` FOREIGN KEY (`district_id`) REFERENCES `district` (`district_id`);

--
-- Constraints for table `train_booking`
--
ALTER TABLE `train_booking`
  ADD CONSTRAINT `FKm240bxxua16m8hwv4mtihn90p` FOREIGN KEY (`booking_id`) REFERENCES `booking_table` (`passengerid`),
  ADD CONSTRAINT `FKr874ynx9bpfc5lhrrb3vq023o` FOREIGN KEY (`train_id`) REFERENCES `train_info` (`train_id`);

--
-- Constraints for table `train_station_mapping`
--
ALTER TABLE `train_station_mapping`
  ADD CONSTRAINT `FK4lvmkn2ryk5y22ptppxn2oy7y` FOREIGN KEY (`station_id`) REFERENCES `station_info` (`station_id`),
  ADD CONSTRAINT `FK6og3f781gd6dfef4276g0oirv` FOREIGN KEY (`train_id`) REFERENCES `train_info` (`train_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
