package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcHelper {
    private static String url="jdbc:mysql://localhost:3306/infoTest?characterEncoding=utf-8";
    private static String userName="luosen";
    private static String userPasswd="2035";
    private static String driver="com.mysql.jdbc.Driver";
    private static Connection conn=null;

    public static Connection getConn(){
        if(conn==null){
            try{
                Class.forName(driver);
                conn= DriverManager.getConnection(url,userName,userPasswd);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return conn;
    }
    /*public static void main(String [] args){
        System.err.println(JdbcHelper.getConn());
    }*/
}
