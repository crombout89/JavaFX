package com.gamedev.shapes;

import javafx.scene.paint.Color;

/**
 *
 */
public class Rectangle2D extends Shape2D {
    /**
     * Constructs a new 2D Rectangle.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     * @param fillColor
     * @param arcWidth
     * @param arcHeight
     */
    public Rectangle2D(final double x, final double y,
                       final double width, final double height,
                       final Color fillColor, final double arcWidth,
                       final double arcHeight) {
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(x, y, width, height);
        rectangle.setFill(fillColor);
        rectangle.setArcWidth(arcWidth);
        rectangle.setArcHeight(arcHeight);
        this.shape = rectangle;
    }
}
