/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.utils;

import com.ttn.quizapp.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */

public class MyStage {
    private final Stage stage;
    private static Scene scene;
private static MyStage instance;
    private MyStage(){
        stage=new Stage();
        stage.setTitle("Quiz App");
    }
    public static MyStage getinstance(){
        if(instance==null)
            instance=new MyStage();
        return instance;
    }
    public void showStage(String fxml) throws IOException{
        if(scene==null)
            scene=new Scene(new FXMLLoader(App.class.getResource(fxml)).load());
        else 
            scene.setRoot(new FXMLLoader(App.class.getResource(fxml)).load());
        
        this.stage.setScene(scene);
        this.stage.show();
    }
}
