package com.BookQueryB.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @ClassName BaseDao
 * @Author KaoRouFan
 * @Date 2023/6/14 上午 8:54
 * @Version 1.0
 */
public class BaseDao {
    private Connection conn;
    private PreparedStatement prep;
    private ResultSet rs;

    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    static{
        init();
    }

    public static void init(){
        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("database.properties");
        Properties prop = new Properties();
        try {
            prop.load(is);
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public ResultSet excute(Connection conn,String sql,String [] params){
        try {
            prep = conn.prepareStatement(sql);
            if(params!=null){
                for (int i = 0; i < params.length; i++) {
                    prep.setString(i+1,params[i]);
                }
            }
            rs = prep.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    public int excuteUpdate(Connection conn,String sql,String [] params){
        int index = 0;
        try {
            prep = conn.prepareStatement(sql);
            if(params!=null){
                for (int i = 0; i < params.length; i++) {
                    prep.setString(i+1,params[i]);
                }
            }
            index = prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return index;
    }

    public void close(Connection conn,PreparedStatement prep,ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(prep!=null){
            try {
                prep.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
