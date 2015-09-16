package edu.elon.cs.dotpainter;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * A single dot on the screen.
 *
 * @author J. Hollingsworth and CSC 303 - Fall 2015
 */
public class Dot {

    private float x0, y0, x1, y1;
    private int penWidth;
    private Paint paint;

    public Dot(float x0, float y0, int penWidth) {
        this.x0 = x0;
        this.y0 = y0;

        this.penWidth = penWidth;

        // random color
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        int alpha = (int) (Math.random() * 256);
        paint = new Paint();
        paint.setARGB(alpha, red, green, blue);
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(x0, y0, penWidth, paint);
    }

}
