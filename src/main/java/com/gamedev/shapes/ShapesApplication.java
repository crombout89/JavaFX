package com.gamedev.shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 */
public class ShapesApplication extends Application {
    private static final int SCENE_WIDTH = 800;
    private static final int SCENE_HEIGHT = 600;
    private static final Color BG_COLOR = Color.LIGHTGREY;

    private Group root;
    private Scene scene;

    /**
     *
     * @param stage
     */
    public void start(final Stage stage) {
        initializeScene();
        createAndPositionShapes();
        configureStage(stage);
    }

    /*
     *
     */
    private void initializeScene() {
        root = new Group();
        scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, BG_COLOR);
    }

    /*
     *
     */
    private void createAndPositionShapes() {
        Shape2D[] shapes = {
                Circle2D.createDefaultCircle(),
                Rectangle2D.createDefaultRectangle(),
                Ellipse2D.createDefaultEllipse(),
                Polygon2D.createDefaultPolygon(),
                Polyline2D.createDefaultPolyline()
        };

        addShapesToScene(shapes);
    }

    /*
     *
     * @param shapes
     */
    private void addShapesToScene(final Shape2D[] shapes) {
        for (Shape2D shape : shapes) {
            root.getChildren().add(shape.getShape());
        }
    }

    /*
     *
     * @param stage
     */
    private void configureStage(final Stage stage) {
        stage.setTitle("JavaFX 2D Shapes Demo");
        stage.setScene(scene);
        stage.show();
    }

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
