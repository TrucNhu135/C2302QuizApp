package com.ttn.quizapp;

import com.ttn.utils.MyAlert;
import com.ttn.utils.MyStage;
import com.ttn.utils.theme.DarkThemeFactory;
import com.ttn.utils.theme.DefaultThemeFactory;
import com.ttn.utils.theme.LightThemeFactory;
import com.ttn.utils.theme.Theme;
import com.ttn.utils.theme.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class PrimaryController implements Initializable  {
    @FXML private ComboBox<Theme> cbThemes;
    public void handleQuestionManagement(ActionEvent event) throws IOException{
        MyStage.getinstance().showStage("questions.fxml");
//        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
//        Stage stage=new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Quiz App");
//        stage.show();
    }
//public void handleQuestionManagement(ActionEvent event){
//    MyAlert.getInstance().showMsg("QuestionManagement: Coming soon...");
//}
public void handlePractice(ActionEvent event){
     MyAlert.getInstance().showMsg("QuestionManagement: Coming soon...");
}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     this.cbThemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }
    public void handleTheme(ActionEvent event)
    {
        switch(this.cbThemes.getSelectionModel().getSelectedItem()){
            case DARK:
               ThemeManager.setThemeFactory(new DarkThemeFactory());
                break;
            case LIGHT:
                 ThemeManager.setThemeFactory(new LightThemeFactory());
                break;
            case DEFAULT:
                ThemeManager.setThemeFactory(new DefaultThemeFactory());
                break;
        }
        ThemeManager.applyTheme(this.cbThemes.getScene());
    }
}
