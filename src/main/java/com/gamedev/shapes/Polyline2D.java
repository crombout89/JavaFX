package com.gamedev.shapes;

import javafx.scene.paint.Color;

public class Polyline2D extends Shape2D {
    /**
     * Constructs a new 2D Polyline.
     *
     * @param points
     * @param strokeColor
     * @param strokeWidth
     */
    public Polyline2D(final double[] points, final Color strokeColor, final double strokeWidth) {
        javafx.scene.shape.Polyline polyline = new javafx.scene.shape.Polyline(points);
        polyline.setStroke(strokeColor);
        polyline.setStrokeWidth(strokeWidth);
        this.shape = polyline;
    }
}
