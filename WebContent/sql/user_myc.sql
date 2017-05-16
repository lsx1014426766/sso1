CREATE TABLE `user_myc` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `pwd` varchar(10) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;