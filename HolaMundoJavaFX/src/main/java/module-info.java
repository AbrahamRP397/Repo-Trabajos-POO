module com.abraham.holamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.abraham.holamundojavafx to javafx.fxml;
    exports com.abraham.holamundojavafx;
}