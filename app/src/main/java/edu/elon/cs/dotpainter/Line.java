package edu.elon.cs.dotpainter;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * A single dot on the screen.
 *
 * @author J. Hollingsworth and CSC 303 - Fall 2015
 */
public class Line {

    private float x0, y0, x1, y1;
    private int penWidth;
    private Paint drawPaint, canvasPaint;
    public Path drawPath;
    private Canvas drawCanvas;
    private Bitmap canvasBitmap;

    public Line(float x0, float y0, int penWidth) {
        drawPath = new Path();
        drawPaint = new Paint();
        this.x0 = x0;
        this.y0 = y0;

        this.penWidth = penWidth;

        drawPaint.setAntiAlias(true);
        //drawPaint.setStrokeWidth(20);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);

        canvasPaint = new Paint(Paint.DITHER_FLAG);

        // random color
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        int alpha = (int) (Math.random() * 256);
        drawPaint = new Paint();
        drawPaint.setARGB(alpha, red, green, blue);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(canvasBitmap, 0, 0, canvasPaint);
        canvas.drawPath(drawPath, drawPaint);
    }



    }


