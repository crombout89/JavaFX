package com.gamedev.shapes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

/**
 *
 */
public class Ellipse2D extends Shape2D {
    /**
     * Constructs a new 2D Ellipse.
     *
     * @param centerX
     * @param centerY
     * @param radiusX
     * @param radiusY
     * @param fillColor
     */
    public Ellipse2D(final double centerX, final double centerY,
                     final double radiusX, final double radiusY,
                     final Color fillColor) {
        javafx.scene.shape.Ellipse ellipse = new javafx.scene.shape.Ellipse(centerX,
                centerY, radiusX, radiusY);
        ellipse.setFill(fillColor);
        this.shape = ellipse;
    }

    /**
     * Creates a default 2D Ellipse.
     * @return the default 2D Ellipse
     */
    public static Ellipse2D createDefaultEllipse() {
        return new Ellipse2D(
          50,
          50,
          200,
          100,
          Color.DEEPPINK);
    }
}
