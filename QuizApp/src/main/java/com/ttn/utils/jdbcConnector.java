/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TRUCNHU
 */
public class jdbcConnector {
    private static jdbcConnector instance;
private final Connection conn;

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.getLogger(jdbcConnector.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    public jdbcConnector() throws SQLException {
        this.conn= DriverManager.getConnection("jdbc:mysql://localhost/quizdb","root","root");
    }
    
    public static jdbcConnector getInstance() throws SQLException{
        if(instance==null)
            instance= new jdbcConnector();
        return instance;
    }
    public Connection connect(){
        return this.conn;
    }
    public void close() throws SQLException
    {
        if(this.conn!=null)
        {
            this.conn.close();
        }
    }
}
