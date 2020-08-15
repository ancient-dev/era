module era.main {
    requires javafx.fxml;
    requires javafx.controls;

    opens org.example.era to javafx.fxml;
    exports org.example.era;
}