package org.example.mybatis.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 23:19:00
 */
public class DBUtil {
    static String ip = "127.0.0.1";
    static int port = 3306;
    static String database = "train_21995";
    static String encoding = "UTF-8";
    static String loginName = "root";
    static String password = "root";

    static {
        try {
            // Register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&serverTimezone=UTC&useSSL=false", ip, port, database, encoding);
        return DriverManager.getConnection(url, loginName, password);
    }
}
