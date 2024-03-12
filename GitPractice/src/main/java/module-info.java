module com.example.gitpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitpractice to javafx.fxml;
    exports com.example.gitpractice;
}