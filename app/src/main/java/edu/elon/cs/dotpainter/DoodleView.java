package edu.elon.cs.dotpainter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Draw dots to the screen on touches.
 *
 * @author J. Hollingsworth and CSC 303 - Fall 2015
 */
public class DoodleView extends View {

    private static final String TAG = "DrawView";

    public final static int DEFAULT_WIDTH = 25;
    public final static int DEFAULT_COLOR = 45;
    //private float x1;
    //private float y1;

    private ArrayList<Line> theLine;
    private Line line;
    //public Line drawPaint, drawPath, drawCanvas;

    //private int penWidth = DEFAULT_WIDTH;
    //private int setColor = DEFAULT_COLOR;

    //private float x0, y0, x1, y1;
    private int penWidth;
    private Paint drawPaint, canvasPaint;
    public Path drawPath;
    private Canvas drawCanvas;
    private Bitmap canvasBitmap;



    public DoodleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        theLine = new ArrayList<Line>();
    }

    public void setupDrawing() {

        //public Line(float x0, float y0, int penWidth) {
            drawPath = new Path();
            drawPaint = new Paint();
            //this.x0 = x0;
            //this.y0 = y0;

            //this.penWidth = penWidth;

            drawPaint.setAntiAlias(true);
            //drawPaint.setStrokeWidth(20);
            drawPaint.setColor(56);
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

    //@Override
    //protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        //super.onSizeChanged(w, h, oldw, oldh);
        //canvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        //drawCanvas = new Canvas(canvasBitmap);
//view given size
    //}

    @Override
    protected void onDraw(Canvas canvas) {
        //canvas.drawBitmap(canvasBitmap, 0, 0, canvasPaint);
        //canvas.drawPath(drawPath, drawPaint);
    }
    //}


    //public boolean onTouchEvent(MotionEvent event) {
        public boolean onTouch(View view, MotionEvent event) {
            // if(event.getAction() != MotionEvent.ACTION_DOWN)
            // return super.onTouchEvent(event);
        float x0;
        float y0;
            x0 = event.getX();
            y0 = event.getY();

            Line line = new Line(x0, y0, penWidth);
            //x0 = event.getX();
        //y0 = event.getY();
            //line.add(line);
            invalidate();
            Log.d(TAG, "point: " + line);
            return true;
        }








    public void setPenWidth(int penWidth) {

        this.penWidth = penWidth;
    }

    public int getPenWidth() {

        return penWidth;
    }
}