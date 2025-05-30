package com.repository;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BaseRepository<T> {
    private Connection connection;
    private static final Logger logger = LogManager.getLogger(BaseRepository.class);

    public BaseRepository()  {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getResourceAsStream("/config.properties"));

//            String url = properties.getProperty("db.url");
//            String username = properties.getProperty("db.username");
//            String password = properties.getProperty("db.password");

            // H2 内存数据库配置（无需外部配置文件）
            String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1"; // 内存模式，关闭连接后不删除数据
            String username = "sa";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException  | IOException e) {
            logger.error("Error connecting to database: {}", e.getMessage());
            throw new RuntimeException("Error connecting to database: " + e.getMessage());
        }
    }

    // 使用传入的 SQL 文本获取所有记录
    public List<T> findAll(String selectSql, Class<T> clazz) {
        List<T> entities = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSql)) {
            while (resultSet.next()) {
                T entity = clazz.getDeclaredConstructor().newInstance();
                setEntityProperties(resultSet, entity);
                entities.add(entity);
            }
        } catch (SQLException e) {
            logger.error("SQL error occurred in findAll: {}", e.getMessage());
            throw new RuntimeException("SQL error occurred in findAll: " + e.getMessage());
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            logger.error("Error instantiating or setting properties for entity: {}", e.getMessage());
            throw new RuntimeException("Error instantiating or setting properties for entity: " + e.getMessage());
        }
        return entities;
    }

    // 将 ResultSet 中的属性设置到实体对象中
    private void setEntityProperties(ResultSet resultSet, T entity) throws SQLException, IllegalAccessException, InvocationTargetException {
        for (Field field : entity.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String columnName = field.getName();
            Object value = resultSet.getObject(columnName);
            field.set(entity, value);
        }
    }

    public int update(String updateSql, T entity) {
        try (Statement statement = connection.createStatement()) {
            return statement.executeUpdate(updateSql);
        } catch (SQLException e) {
            logger.error("SQL error occurred in update: {}", e.getMessage());
            throw new RuntimeException("SQL error occurred in update: " + e.getMessage());
        }
    }






    // 在类销毁时关闭数据库连接
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                logger.error("Error closing database connection: {}", e.getMessage());
            }
        }
    }
}
