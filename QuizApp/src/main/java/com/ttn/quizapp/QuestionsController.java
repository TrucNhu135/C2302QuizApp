/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ttn.quizapp;

import com.ttn.pojo.Category;
import com.ttn.pojo.Level;
import com.ttn.services.CategoryServices;
import com.ttn.services.LevelServices;
//import java.lang.System.Logger.Level;
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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {
    @FXML private VBox vbChoice;
        @FXML private ComboBox<Category> cbcates;
        @FXML private ComboBox<Level> cbLevels;
        private static final CategoryServices cateService= new CategoryServices();
        private static final LevelServices levelService=new LevelServices();
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
               this.cbLevels.setItems(FXCollections.observableList(levelService.getLevels()));
        } catch (SQLException ex) {
            System.getLogger(QuestionsController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    public void handleMoreChoice(ActionEvent event)
    {
        HBox h=new HBox();
        h.getStyleClass().add("Main");
       
        RadioButton r=new RadioButton();
        TextField txt=new TextField();
        txt.getStyleClass().add("Input");
        
        h.getChildren().addAll(r,txt);
        this.vbChoice.getChildren().add(h);
    }
}
