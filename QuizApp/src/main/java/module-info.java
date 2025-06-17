module com.ttn.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.ttn.quizapp to javafx.fxml;
    exports com.ttn.quizapp;
}
