package com.dark.webprog26.c5platformgame;

import android.graphics.Rect;

/**
 * Created by webpr on 09.03.2017.
 */

public class Viewport {

    private Vector2Point5D currentViewportWorldCentre;
    private Rect convertedRect;
    private int pixelsPerMetreX;
    private int pixelsPerMetreY;
    private int screenXResolution;
    private int screenYResolution;
    private int screenCentreX;
    private int screenCentreY;
    private int metresToShowX;
    private int metresToShowY;
    private int numClipped;

    public Viewport(int screenXResolution, int screenYResolution) {
        this.screenXResolution = screenXResolution;
        this.screenYResolution = screenYResolution;

        screenCentreX = this.screenXResolution / 2;
        screenCentreY = this.screenYResolution / 2;

        pixelsPerMetreX = this.screenXResolution / 32;
        pixelsPerMetreY = this.screenYResolution / 18;

        metresToShowX = 34;
        metresToShowY = 20;

        convertedRect = new Rect();
        currentViewportWorldCentre = new Vector2Point5D();
    }
}
