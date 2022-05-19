package com.chinatelecom.operations.aqmhserivce.utils;

import java.sql.*;
public class JdbcUtils {
    private static String driver="org.postgresql.Driver";
    private static String url="jdbc:postgresql://134.95.237.173:8001/irad";
    private static String user="irad";
    private static String password="Irad173%";

    static{/*随着类的加载而执行，而且只执行一次*/
        try {
            // 1.加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() throws SQLException {
        //2.创建链接
        Connection conn= DriverManager.getConnection(url, user, password);
        return conn;
    }
    //最后关闭资源
    public static void closeAll(ResultSet rs, Statement stat, Connection conn){
        try {
            if ( rs != null ){
                rs.close();
            }
            if ( stat != null ){
                stat.close();
            }
            if ( conn != null ){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}