module com.example.libraryassignmentapseries3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.libraryassignmentapseries3 to javafx.fxml;
    exports com.example.libraryassignmentapseries3;
}