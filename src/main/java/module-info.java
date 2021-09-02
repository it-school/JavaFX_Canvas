module com.itschool.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.itschool.demo to javafx.fxml;
    exports com.itschool.demo;
}