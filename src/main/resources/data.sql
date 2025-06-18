-- 航班表测试数据
-- 北京(PEK)出发的航班
INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1501', 1, 2, '2023-12-01', '08:00:00', 1200.00); -- 北京->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1502', 1, 2, '2023-12-01', '10:30:00', 1150.00); -- 北京->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1503', 1, 2, '2023-12-01', '13:15:00', 1300.00); -- 北京->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1504', 1, 2, '2023-12-01', '16:45:00', 980.00); -- 北京->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1505', 1, 2, '2023-12-01', '19:00:00', 1050.00); -- 北京->上海

INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price)
VALUES ('CA1506', 1, 2, '2023-12-01', '22:20:00', 1280.00); -- 北京->上海

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
INSERT INTO airport (code, name, city) VALUES ('PEK', '北京首都国际机场', '北京');

-- 上海浦东国际机场
INSERT INTO airport (code, name, city) VALUES ('PVG', '上海浦东国际机场', '上海');

-- 广州白云国际机场
INSERT INTO airport (code, name, city) VALUES ('CAN', '广州白云国际机场', '广州');

-- 深圳宝安国际机场
INSERT INTO airport (code, name, city) VALUES ('SZX', '深圳宝安国际机场', '深圳');

-- 成都双流国际机场
INSERT INTO airport (code, name, city) VALUES ('CTU', '成都双流国际机场', '成都');

-- 重庆江北国际机场
INSERT INTO airport (code, name, city) VALUES ('CKG', '重庆江北国际机场', '重庆');

-- 昆明长水国际机场
INSERT INTO airport (code, name, city) VALUES ('KMG', '昆明长水国际机场', '昆明');

-- 西安咸阳国际机场
INSERT INTO airport (code, name, city) VALUES ('XIY', '西安咸阳国际机场', '西安');

-- 杭州萧山国际机场
INSERT INTO airport (code, name, city) VALUES ('HGH', '杭州萧山国际机场', '杭州');

-- 武汉天河国际机场
INSERT INTO airport (code, name, city) VALUES ('WUH', '武汉天河国际机场', '武汉');

-- 用户表测试数据
INSERT INTO user (email, password, first_name, last_name, country, phone) VALUES
('alice@example.com', 'password123', 'Alice', 'Smith', 'China', '13800138000'),
('bob@example.com', 'password456', 'Bob', 'Johnson', 'China', '13900139000'),
('charlie@example.com', 'password789', 'Charlie', 'Brown', 'China', '13700137000');





-- 乘客表测试数据
INSERT INTO passenger (booking_id, first_name, last_name, email) VALUES
(1, 'Alice', 'Smith', 'alice@example.com'),
(2, 'Bob', 'Johnson', 'bob@example.com'),
(3, 'Charlie', 'Brown', 'charlie@example.com');

-- 为booking表插入50条记录（每条记录单独INSERT）
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 1, 'REF10001', 'CONFIRMED', 1200.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 3, 'REF10002', 'CONFIRMED', 1400.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 5, 'REF10003', 'CONFIRMED', 1100.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 7, 'REF10004', 'CONFIRMED', 900.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 9, 'REF10005', 'CONFIRMED', 600.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 11, 'REF10006', 'CONFIRMED', 1400.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 13, 'REF10007', 'CONFIRMED', 500.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 15, 'REF10008', 'CONFIRMED', 700.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 17, 'REF10009', 'CONFIRMED', 650.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 19, 'REF10010', 'CONFIRMED', 1300.00);

INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 2, 'REF20001', 'CONFIRMED', 1500.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 4, 'REF20002', 'CONFIRMED', 1300.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 6, 'REF20003', 'CONFIRMED', 1100.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 8, 'REF20004', 'CONFIRMED', 950.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 10, 'REF20005', 'CONFIRMED', 1400.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 12, 'REF20006', 'CONFIRMED', 850.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 14, 'REF20007', 'CONFIRMED', 800.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 16, 'REF20008', 'CONFIRMED', 450.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 18, 'REF20009', 'CONFIRMED', 750.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 20, 'REF20010', 'CONFIRMED', 900.00);

INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 21, 'REF30001', 'CONFIRMED', 1100.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 22, 'REF30002', 'CONFIRMED', 950.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 23, 'REF30003', 'CONFIRMED', 700.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 24, 'REF30004', 'CONFIRMED', 550.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 25, 'REF30005', 'CONFIRMED', 600.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 26, 'REF30006', 'CONFIRMED', 1200.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 27, 'REF30007', 'CONFIRMED', 650.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 28, 'REF30008', 'CONFIRMED', 400.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 29, 'REF30009', 'CONFIRMED', 750.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 30, 'REF30010', 'CONFIRMED', 850.00);

INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 6, 'REF40001', 'CONFIRMED', 1100.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 11, 'REF40002', 'CONFIRMED', 1400.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 16, 'REF40003', 'CONFIRMED', 450.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 21, 'REF40004', 'CONFIRMED', 1100.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 26, 'REF40005', 'CONFIRMED', 1200.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 1, 'REF40006', 'CONFIRMED', 1200.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 7, 'REF40007', 'CONFIRMED', 900.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 12, 'REF40008', 'CONFIRMED', 850.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 17, 'REF40009', 'CONFIRMED', 650.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 22, 'REF40010', 'CONFIRMED', 950.00);

INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 27, 'REF50001', 'CONFIRMED', 650.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 2, 'REF50002', 'CONFIRMED', 1500.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (1, 8, 'REF50003', 'CONFIRMED', 950.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (2, 13, 'REF50004', 'CONFIRMED', 500.00);
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES (3, 18, 'REF50005', 'CONFIRMED', 750.00);