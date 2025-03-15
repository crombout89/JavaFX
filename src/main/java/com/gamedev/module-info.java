module com.gamedev {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    exports com.gamedev.views;
    opens com.gamedev.views to javafx.fxml;
    exports com.gamedev.controllers;
    opens com.gamedev.controllers to javafx.fxml;
    exports com.gamedev.models;
    opens com.gamedev.models to javafx.fxml;
    exports com.gamedev.styling;
    opens com.gamedev.styling to javafx.fxml;
}