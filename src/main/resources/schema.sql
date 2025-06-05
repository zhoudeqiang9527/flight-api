-- 航班表
CREATE TABLE flight (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    flight_number VARCHAR(10),
    departure_airport_id INTEGER,
    destination_airport_id INTEGER,
    departure_date DATE,
    departure_time TIME,
    price DECIMAL(10,2)
);

-- 机场表
CREATE TABLE airport (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    code VARCHAR(10),
    name VARCHAR(100),
    city VARCHAR(100)
);

-- 用户表
CREATE TABLE user (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    email VARCHAR(100) UNIQUE,
    password VARCHAR(255),
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    country VARCHAR(100),
    phone VARCHAR(20)
);

-- 预订表
CREATE TABLE booking (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    user_id INTEGER,
    flight_id INTEGER,
    reference VARCHAR(20),
    status VARCHAR(20),
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_price DECIMAL(10,2),
    FOREIGN KEY (flight_id) REFERENCES flight(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);

-- 乘客表
CREATE TABLE passenger (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    booking_id INTEGER,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    FOREIGN KEY (booking_id) REFERENCES booking(id)
);