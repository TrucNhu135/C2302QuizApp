/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ttn.quizapp;

import com.ttn.pojo.Category;
import com.ttn.services.CategoryServices;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {
        @FXML private ComboBox<Category> cbcates;
        private static final CategoryServices cateService= new CategoryServices();
    /**
   
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            //B1
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //B2
//            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/quizdb","root","trucnhu2025@");
//            //B3:
//            Statement stm=conn.createStatement();
//            ResultSet rs=stm.executeQuery("SELECT * FROM category");
//            List<Category> cates=new ArrayList<>();
//            while(rs.next())
//            {
////              int id= rs.getInt("id");
////              String name=rs.getString("name");
////              
////              System.out.printf("%d - %s\n",id,name);
//                Category c=new Category(rs.getInt("id"),rs.getString("name"));
//                cates.add(c);
//            }
//            //b4
//            conn.close();

            this.cbcates.setItems(FXCollections.observableList(cateService.getCates()));
        } catch (SQLException ex) {
            System.getLogger(QuestionsController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
