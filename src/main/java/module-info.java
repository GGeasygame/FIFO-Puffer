module ch.ictbz.fifopuffer.fifopuffer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.ictbz.fifopuffer.fifopuffer to javafx.fxml;
    exports ch.ictbz.fifopuffer.fifopuffer;
}