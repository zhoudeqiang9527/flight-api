-- 航班表测试数据
INSERT INTO flight (flight_number, departure_airport_id, destination_airport_id, departure_date, departure_time, price) VALUES
('CA123', 1, 2, '2025-06-01', '08:00:00', 1200.50),
('CA456', 2, 3, '2025-06-02', '10:30:00', 1500.00),
('CA789', 3, 1, '2025-06-03', '14:45:00', 1800.75);

-- 机场表测试数据
INSERT INTO airport (code, name, city) VALUES
('PEK', '北京首都国际机场', '北京'),
('PVG', '上海浦东国际机场', '上海'),
('CAN', '广州白云国际机场', '广州');

-- 用户表测试数据
INSERT INTO user (email, password, first_name, last_name, country, phone) VALUES
('alice@example.com', 'password123', 'Alice', 'Smith', 'China', '13800138000'),
('bob@example.com', 'password456', 'Bob', 'Johnson', 'China', '13900139000'),
('charlie@example.com', 'password789', 'Charlie', 'Brown', 'China', '13700137000');

-- 预订表测试数据
INSERT INTO booking (user_id, flight_id, reference, status, total_price) VALUES
(1, 1, 'REF12345', 'UPCOMING', 1200.50),
(2, 2, 'REF67890', 'UPCOMING', 1500.00),
(3, 3, 'REF11223', 'PAST', 1800.75);

-- 乘客表测试数据
INSERT INTO passenger (booking_id, first_name, last_name, email) VALUES
(1, 'Alice', 'Smith', 'alice@example.com'),
(2, 'Bob', 'Johnson', 'bob@example.com'),
(3, 'Charlie', 'Brown', 'charlie@example.com');