/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymannagersystem;

import java.sql.*;
/**
 *
 * @author 18787
 */
public class Database {
    private static String url = "jdbc:sqlserver://localhost;DatabaseName = library;";
    private static String user = "sa";
    private static String pwd = "zhaoru98";
    
    private Connection connection = null;
    private static Database database = new Database();
    
    private  Database(){
 
    }
    
    public static Database getDatabase(){
        return database;
    }
    
    public  Connection getDatabaseConnection(){
        try{
              connection = DriverManager.getConnection(url,user,pwd);
              return connection;
         }catch(SQLException e){
              e.printStackTrace();
              return null;
          }  
    }
}
