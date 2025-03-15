package com.gamedev.shapes;

import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

/**
 *
 */
public class Circle2D extends Shape2D {
    /**
     * Constructs a new 2D Circle.
     *
     * @param centerX
     * @param centerY
     * @param radius
     * @param fillColor
     * @param strokeColor
     */
    public Circle2D(final double centerX, final double centerY, final double radius,
                    final Color fillColor, final Color strokeColor) {
        javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle(centerX, centerY, radius);
        circle.setFill(fillColor);
        circle.setStroke(strokeColor);
        this.shape = circle;
    }
}
