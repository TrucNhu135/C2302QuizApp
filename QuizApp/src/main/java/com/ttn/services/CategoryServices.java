/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.services;

import com.ttn.pojo.Category;
import com.ttn.utils.jdbcConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRUCNHU
 */
public class CategoryServices {

    public List<Category> getCates() throws SQLException {
        Connection conn = jdbcConnector.getInstance().connect();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM category");
        List<Category> cates = new ArrayList<>();
        while (rs.next()) {
//              int id= rs.getInt("id");
//              String name=rs.getString("name");
//              
//              System.out.printf("%d - %s\n",id,name);
            Category c = new Category(rs.getInt("id"), rs.getString("name"));
            cates.add(c);
        }
        return cates;
    }
}
