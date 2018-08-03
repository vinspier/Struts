package com.bjsxt.bbs2009.util;

import java.sql.*;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
public class DB {
    public static Connection createConn() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbs2009", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static PreparedStatement preparedStatement(Connection connection, String sql){
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = connection.prepareStatement(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return preparedStatement;
    }

    public static void close(Connection connection){
        try{
            connection.close();
            connection = null;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void close(Statement statement){
        try{
            statement.close();
            statement = null;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void close(ResultSet resultSet){
        try{
            resultSet.close();
            resultSet = null;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
