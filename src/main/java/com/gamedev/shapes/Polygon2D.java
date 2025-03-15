package com.gamedev.shapes;

import javafx.scene.paint.Color;

/**
 *
 */
public class Polygon2D extends Shape2D {
    /**
     * Constructs a new 2D Polygon.
     *
     * @param points
     * @param fillColor
     */
    public Polygon2D(final double[] points, final Color fillColor) {
        javafx.scene.shape.Polygon polygon = new javafx.scene.shape.Polygon(points);
        polygon.setFill(fillColor);
        this.shape = polygon;
    }
}
