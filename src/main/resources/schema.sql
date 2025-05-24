-- 航班表
CREATE TABLE flight (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键，自增',
    flight_number VARCHAR(10) COMMENT '航班号',
    departure_airport_id BIGINT COMMENT '出发机场ID',
    destination_airport_id BIGINT COMMENT '到达机场ID',
    departure_date DATE COMMENT '出发日期',
    departure_time TIME COMMENT '出发时间',
    price DECIMAL(10,2) COMMENT '票价'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='航班表';

-- 机场表
CREATE TABLE airport (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键，自增',
    code VARCHAR(10) COMMENT '机场代码',
    name VARCHAR(100) COMMENT '机场名称',
    city VARCHAR(100) COMMENT '城市'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='机场表';

-- 用户表
CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键，自增',
    email VARCHAR(100) UNIQUE COMMENT '邮箱地址，唯一',
    password VARCHAR(255) COMMENT '加密密码',
    first_name VARCHAR(50) COMMENT '名',
    last_name VARCHAR(50) COMMENT '姓',
    country VARCHAR(100) COMMENT '国家',
    phone VARCHAR(20) NULL COMMENT '手机号，可空'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- 预订表
CREATE TABLE booking (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键，自增',
    user_id BIGINT COMMENT '用户ID',
    flight_id BIGINT COMMENT '航班ID',
    reference VARCHAR(20) COMMENT '预订参考号',
    status VARCHAR(20) COMMENT '状态为UPCOMING或PAST',
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
    total_price DECIMAL(10,2) COMMENT '订单总金额',
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (flight_id) REFERENCES flight(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='预订表';

-- 乘客表
CREATE TABLE passenger (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键，自增',
    booking_id BIGINT COMMENT '关联的预订ID',
    first_name VARCHAR(50) COMMENT '乘客名',
    last_name VARCHAR(50) COMMENT '乘客姓',
    email VARCHAR(100) COMMENT '乘客邮箱',
    FOREIGN KEY (booking_id) REFERENCES booking(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='乘客表';