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

    /**
     * Creates a default 2D Polyline.
     * @return the default 2D Polyline.
     */
    public static Polyline2D createDefaultPolyline() {
        double[] points = {
                450.0, 200.0,  // First point
                500.0, 250.0,  // Second point
                425.0, 275.0,  // Third point
                475.0, 300.0   // Fourth point
        };
        return new Polyline2D(points, Color.ORANGE, 3.0);
    }
}
