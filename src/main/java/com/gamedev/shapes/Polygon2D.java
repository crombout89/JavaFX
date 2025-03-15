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

    /**
     * Creates a default 2D Polygon.
     * @return the default Polygon.
     */
    public static Polygon2D createDefaultPolygon() {
        double[] points = {
                300.0, 200.0,  // x1, y1
                350.0, 250.0,  // x2, y2
                250.0, 250.0   // x3, y3
        };
        return new Polygon2D(points, Color.YELLOWGREEN);
    }
}
