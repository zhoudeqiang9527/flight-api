-- 航班表测试数据
-- 北京(PEK)出发的航班
INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1501', 1, 2, '2023-12-01', '08:00:00', 1200.00); -- 北京->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1305', 1, 3, '2023-12-01', '09:30:00', 1500.00); -- 北京->广州

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1807', 1, 4, '2023-12-01', '10:45:00', 1400.00); -- 北京->深圳

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA4101', 1, 5, '2023-12-02', '07:20:00', 1100.00); -- 北京->成都

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1409', 1, 6, '2023-12-02', '14:15:00', 1300.00); -- 北京->重庆

-- 上海(PVG)出发的航班
INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('MU5102', 2, 1, '2023-12-01', '11:30:00', 1100.00); -- 上海->北京

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('MU5301', 2, 3, '2023-12-01', '13:20:00', 900.00); -- 上海->广州

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('ZH9801', 2, 7, '2023-12-02', '08:40:00', 1200.00); -- 上海->昆明

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('HO1071', 2, 8, '2023-12-02', '16:10:00', 950.00); -- 上海->西安

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('9C8871', 2, 9, '2023-12-03', '07:15:00', 600.00); -- 上海->杭州

-- 广州(CAN)出发的航班
INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CZ3101', 3, 1, '2023-12-01', '12:40:00', 1400.00); -- 广州->北京

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CZ3521', 3, 2, '2023-12-01', '15:30:00', 850.00); -- 广州->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CZ3367', 3, 4, '2023-12-02', '09:20:00', 500.00); -- 广州->深圳

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CZ3401', 3, 10, '2023-12-02', '11:50:00', 700.00); -- 广州->武汉

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CZ3481', 3, 6, '2023-12-03', '14:15:00', 650.00); -- 广州->重庆

-- 深圳(SZX)出发的航班
INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('ZH9803', 4, 1, '2023-12-01', '13:45:00', 1300.00); -- 深圳->北京

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('ZH9515', 4, 2, '2023-12-02', '10:10:00', 800.00); -- 深圳->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('ZH9841', 4, 3, '2023-12-02', '16:30:00', 450.00); -- 深圳->广州

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('ZH9411', 4, 5, '2023-12-03', '08:40:00', 750.00); -- 深圳->成都

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('ZH9477', 4, 7, '2023-12-03', '12:20:00', 900.00); -- 深圳->昆明

-- 成都(CTU)出发的航班
INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('3U8881', 5, 1, '2023-12-01', '07:50:00', 1100.00); -- 成都->北京

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA4501', 5, 2, '2023-12-02', '09:30:00', 950.00); -- 成都->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('EU2237', 5, 4, '2023-12-02', '11:40:00', 700.00); -- 成都->深圳

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('3U8633', 5, 8, '2023-12-03', '13:15:00', 550.00); -- 成都->西安

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('TV9823', 5, 10, '2023-12-03', '15:50:00', 600.00); -- 成都->武汉

-- 重庆(CKG)出发的航班
INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('OQ2301', 6, 1, '2023-12-01', '10:20:00', 1200.00); -- 重庆->北京

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('G52681', 6, 3, '2023-12-02', '12:40:00', 650.00); -- 重庆->广州

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('PN6211', 6, 5, '2023-12-02', '14:30:00', 400.00); -- 重庆->成都

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CZ2835', 6, 7, '2023-12-03', '08:10:00', 750.00); -- 重庆->昆明

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('GJ8811', 6, 9, '2023-12-03', '17:20:00', 850.00); -- 重庆->杭州

-- 机场表测试数据
-- 北京首都国际机场
INSERT INTO airports (code, name, city) VALUES ('PEK', '北京首都国际机场', '北京');

-- 上海浦东国际机场
INSERT INTO airports (code, name, city) VALUES ('PVG', '上海浦东国际机场', '上海');

-- 广州白云国际机场
INSERT INTO airports (code, name, city) VALUES ('CAN', '广州白云国际机场', '广州');

-- 深圳宝安国际机场
INSERT INTO airports (code, name, city) VALUES ('SZX', '深圳宝安国际机场', '深圳');

-- 成都双流国际机场
INSERT INTO airports (code, name, city) VALUES ('CTU', '成都双流国际机场', '成都');

-- 重庆江北国际机场
INSERT INTO airports (code, name, city) VALUES ('CKG', '重庆江北国际机场', '重庆');

-- 昆明长水国际机场
INSERT INTO airports (code, name, city) VALUES ('KMG', '昆明长水国际机场', '昆明');

-- 西安咸阳国际机场
INSERT INTO airports (code, name, city) VALUES ('XIY', '西安咸阳国际机场', '西安');

-- 杭州萧山国际机场
INSERT INTO airports (code, name, city) VALUES ('HGH', '杭州萧山国际机场', '杭州');

-- 武汉天河国际机场
INSERT INTO airports (code, name, city) VALUES ('WUH', '武汉天河国际机场', '武汉');

-- 用户表测试数据
INSERT INTO user (email, password, first_name, last_name, country, phone) VALUES
('alice@example.com', 'password123', 'Alice', 'Smith', 'China', '13800138000'),
('bob@example.com', 'password456', 'Bob', 'Johnson', 'China', '13900139000'),
('charlie@example.com', 'password789', 'Charlie', 'Brown', 'China', '13700137000');

-- 预订表测试数据
-- 插入50条随机数据（SQLite语法）
INSERT INTO booking (user_id, flight_id, reference, route, booking_time, status, total_price) VALUES
(1, 1, 'REF-0001', 'New York → London', '2025-05-01 08:15:00', 'CONFIRMED', 1200.50),
(2, 3, 'REF-0002', 'Tokyo → Sydney', '2025-05-02 14:30:00', 'PENDING', 3450.75),
(3, 2, 'REF-0003', 'Paris → Berlin', '2025-05-03 09:45:00', 'CONFIRMED', 899.99),
(4, 1, 'REF-0004', 'London → Dubai', '2025-05-04 16:20:00', 'CANCELLED', 2100.00),
(1, 3, 'REF-0005', 'Sydney → Auckland', '2025-05-05 11:10:00', 'CONFIRMED', 1500.25),
(2, 2, 'REF-0006', 'Berlin → Rome', '2025-05-06 13:50:00', 'PENDING', 750.50),
(3, 1, 'REF-0007', 'Dubai → Mumbai', '2025-05-07 18:00:00', 'CONFIRMED', 3200.00),
(4, 3, 'REF-0008', 'Auckland → Los Angeles', '2025-05-08 07:30:00', 'CONFIRMED', 4200.75),
(1, 2, 'REF-0009', 'Rome → Madrid', '2025-05-09 10:45:00', 'PENDING', 950.00),
(2, 1, 'REF-0010', 'Mumbai → Delhi', '2025-05-10 12:15:00', 'CONFIRMED', 1100.50),
(3, 3, 'REF-0011', 'Los Angeles → Chicago', '2025-05-11 15:40:00', 'CANCELLED', 2300.25),
(4, 2, 'REF-0012', 'Madrid → Barcelona', '2025-05-12 08:20:00', 'CONFIRMED', 850.75),
(1, 1, 'REF-0013', 'Delhi → Bangalore', '2025-05-13 17:10:00', 'PENDING', 1300.00),
(2, 3, 'REF-0014', 'Chicago → Toronto', '2025-05-14 09:55:00', 'CONFIRMED', 3800.50),
(3, 2, 'REF-0015', 'Barcelona → Lisbon', '2025-05-15 14:25:00', 'CONFIRMED', 1200.75),
(4, 1, 'REF-0016', 'Bangalore → Hyderabad', '2025-05-16 11:30:00', 'PENDING', 900.00),
(1, 3, 'REF-0017', 'Toronto → Vancouver', '2025-05-17 16:45:00', 'CONFIRMED', 2900.25),
(2, 2, 'REF-0018', 'Lisbon → Porto', '2025-05-18 10:10:00', 'CANCELLED', 650.50),
(3, 1, 'REF-0019', 'Hyderabad → Chennai', '2025-05-19 13:20:00', 'CONFIRMED', 1050.75),
(4, 3, 'REF-0020', 'Vancouver → Seattle', '2025-05-20 08:50:00', 'CONFIRMED', 1800.00),
(1, 2, 'REF-0021', 'Porto → Faro', '2025-05-01 12:40:00', 'PENDING', 1150.25),
(2, 1, 'REF-0022', 'Chennai → Kolkata', '2025-05-02 15:15:00', 'CONFIRMED', 1250.50),
(3, 3, 'REF-0023', 'Seattle → San Francisco', '2025-05-03 09:20:00', 'CONFIRMED', 2200.75),
(4, 2, 'REF-0024', 'Faro → Lisbon', '2025-05-04 14:50:00', 'PENDING', 800.00),
(1, 1, 'REF-0025', 'Kolkata → Guwahati', '2025-05-05 18:30:00', 'CONFIRMED', 1350.25),
(2, 3, 'REF-0026', 'San Francisco → Las Vegas', '2025-05-06 07:45:00', 'CANCELLED', 2400.50),
(3, 2, 'REF-0027', 'Lisbon → Madrid', '2025-05-07 11:55:00', 'CONFIRMED', 950.75),
(4, 1, 'REF-0028', 'Guwahati → Imphal', '2025-05-08 16:10:00', 'PENDING', 1100.00),
(1, 3, 'REF-0029', 'Las Vegas → Denver', '2025-05-09 10:25:00', 'CONFIRMED', 3300.25),
(2, 2, 'REF-0030', 'Madrid → Valencia', '2025-05-10 13:40:00', 'CONFIRMED', 850.50),
(3, 1, 'REF-0031', 'Imphal → Aizawl', '2025-05-11 08:05:00', 'PENDING', 1200.75),
(4, 3, 'REF-0032', 'Denver → Dallas', '2025-05-12 15:30:00', 'CONFIRMED', 2700.00),
(1, 2, 'REF-0033', 'Valencia → Seville', '2025-05-13 09:50:00', 'CANCELLED', 700.25),
(2, 1, 'REF-0034', 'Aizawl → Shillong', '2025-05-14 14:15:00', 'CONFIRMED', 1300.50),
(3, 3, 'REF-0035', 'Dallas → Houston', '2025-05-15 18:40:00', 'CONFIRMED', 1900.75),
(4, 2, 'REF-0036', 'Seville → Malaga', '2025-05-16 12:05:00', 'PENDING', 900.00),
(1, 1, 'REF-0037', 'Shillong → Agartala', '2025-05-17 07:20:00', 'CONFIRMED', 1400.25),
(2, 3, 'REF-0038', 'Houston → Atlanta', '2025-05-18 10:35:00', 'CONFIRMED', 3100.50),
(3, 2, 'REF-0039', 'Malaga → Granada', '2025-05-19 13:50:00', 'PENDING', 850.75),
(4, 1, 'REF-0040', 'Agartala → Silchar', '2025-05-20 17:05:00', 'CONFIRMED', 1150.00),
(1, 3, 'REF-0041', 'Atlanta → Miami', '2025-05-01 09:30:00', 'CANCELLED', 2500.25),
(2, 2, 'REF-0042', 'Granada → Cordoba', '2025-05-02 14:55:00', 'CONFIRMED', 950.50),
(3, 1, 'REF-0043', 'Silchar → Dibrugarh', '2025-05-03 08:10:00', 'PENDING', 1250.75),
(4, 3, 'REF-0044', 'Miami → Orlando', '2025-05-04 11:25:00', 'CONFIRMED', 1800.00),
(1, 2, 'REF-0045', 'Cordoba → Toledo', '2025-05-05 16:40:00', 'CONFIRMED', 1000.25),
(2, 1, 'REF-0046', 'Dibrugarh → Jorhat', '2025-05-06 10:05:00', 'PENDING', 1350.50),
(3, 3, 'REF-0047', 'Orlando → Tampa', '2025-05-07 13:20:00', 'CONFIRMED', 2000.75),
(4, 2, 'REF-0048', 'Toledo → Salamanca', '2025-05-08 18:35:00', 'CONFIRMED', 900.00),
(1, 1, 'REF-0049', 'Jorhat → Tezpur', '2025-05-09 12:00:00', 'CANCELLED', 1400.25),
(2, 3, 'REF-0050', 'Tampa → Fort Lauderdale', '2025-05-10 15:15:00', 'CONFIRMED', 2200.50);


-- 乘客表测试数据
INSERT INTO passenger (booking_id, first_name, last_name, email) VALUES
(1, 'Alice', 'Smith', 'alice@example.com'),
(2, 'Bob', 'Johnson', 'bob@example.com'),
(3, 'Charlie', 'Brown', 'charlie@example.com');