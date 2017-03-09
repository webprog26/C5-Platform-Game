package com.dark.webprog26.c5platformgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by webpr on 09.03.2017.
 */

public class PlatformView extends SurfaceView implements Runnable{

    private boolean debugging = true;
    private volatile boolean running;
    private Thread gameThread = null;


    //for drawing
    private Paint paint;
    private Canvas canvas;
    private SurfaceHolder ourHolder;

    private Context context;
    long startFrameTime;
    long timeThisFrame;
    long fps;

    //Our new engine classes
    private LevelManager lm;
    private Viewport vp;
    InputController ic;

    public PlatformView(Context context, int screenWidth, int screenHeight) {
        super(context);
        this.context = context;
        ourHolder = getHolder();
        paint = new Paint();
    }

    @Override
    public void run() {
        while (running){
            startFrameTime = System.currentTimeMillis();
            update();
            draw();

            timeThisFrame = System.currentTimeMillis() - startFrameTime;
            if(timeThisFrame >= 1){
                fps = 1000 / timeThisFrame;
            }
        }
    }

    private void update(){
        // Our new update() code will go here
    }

    private void draw(){
        if(ourHolder.getSurface().isValid()){
            //First we lock the area of memory we will be drawing to
            canvas = ourHolder.lockCanvas();

            // Rub out the last frame with arbitrary color
            paint.setColor(Color.argb(255, 0, 0, 255));
            canvas.drawColor(Color.argb(255, 0, 0, 255));

            // New drawing code will go here

            // Unlock and draw the scene
            ourHolder.unlockCanvasAndPost(canvas);
        }
    }

    public void pause(){
        running = false;
        try {
            gameThread.join();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public void resume(){
        running = true;
        gameThread = new Thread(this);
        gameThread.start();
    }
    // End of PlatformView
}
