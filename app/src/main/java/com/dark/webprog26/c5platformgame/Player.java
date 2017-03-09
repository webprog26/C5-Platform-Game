package com.dark.webprog26.c5platformgame;

import android.content.Context;

/**
 * Created by webpr on 09.03.2017.
 */

public class Player extends GameObject{

    public Player(Context context, float worldStartX,
                  float worldStartY, int pixelsPerMetre) {
        final float HEIGHT = 2;
        final float WIDTH = 1;

        setWidth(WIDTH);
        setHeight(HEIGHT);

        setType('p');

        // Choose a Bitmap
        // This is a sprite sheet with multiple frames
        // of animation. So it will look silly until we animate it
        // In chapter 6.

        setBitmapName("player");

        // X and y locations from constructor parameters
        setWorldLocation(worldStartX, worldStartY, 0);
    }

    @Override
    public void update(long fps, float gravity) {

    }
}
