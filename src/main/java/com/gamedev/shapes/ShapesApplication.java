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
        createShapes();
        configureStage(stage);
    }

    /*
     *
     */
    private void initializeScene() {
        root = new Group();
        scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, BG_COLOR);
    }
}
