module com.ttn.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires lombok;
    opens com.ttn.quizapp to javafx.fxml;
    exports com.ttn.quizapp;
}
