module com.mycompany.trucable {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.trucable to javafx.fxml;
    exports com.mycompany.trucable;
}
