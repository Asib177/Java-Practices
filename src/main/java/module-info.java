module org.example.practicesjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.practicesjava to javafx.fxml;
    exports org.example.practicesjava;
}