/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.services;

import com.ttn.pojo.Level;
import com.ttn.utils.jdbcConnector;
//import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class LevelServices {
     public List<Level> getLevels() throws SQLException {
        Connection conn = jdbcConnector.getInstance().connect();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM level");
        List<Level> levels = new ArrayList<>();
        while (rs.next()) {
//              int id= rs.getInt("id");
//              String name=rs.getString("name");
//              
//              System.out.printf("%d - %s\n",id,name);
            
           
           //Level c = new Level(rs.getInt("id"), rs.getString("name"),rs.getString("note"));
           Level c=new Level(rs.getInt("id"),rs.getString("name"),rs.getString("note"));
           levels.add(c);
        }
        return levels;
    }
}
