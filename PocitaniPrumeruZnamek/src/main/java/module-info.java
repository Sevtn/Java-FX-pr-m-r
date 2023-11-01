module com.example.pocitaniprumeruznamek {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pocitaniprumeruznamek to javafx.fxml;
    exports com.example.pocitaniprumeruznamek;
}