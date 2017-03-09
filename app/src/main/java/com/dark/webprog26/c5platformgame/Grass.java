package com.dark.webprog26.c5platformgame;

/**
 * Created by webpr on 09.03.2017.
 */

public class Grass extends GameObject{

    public Grass(float worldStartX, float worldStartY, char type) {
        final float HEIGHT = 1;
        final float WIDTH = 1;

        setWidth(WIDTH);
        setHeight(HEIGHT);

        setType(type);

        setBitmapName("turf");
        setWorldLocation(worldStartX, worldStartY, 0);
    }

    @Override
    public void update(long fps, float gravity) {

    }
}
