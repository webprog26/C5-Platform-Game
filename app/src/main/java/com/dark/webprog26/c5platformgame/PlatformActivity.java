package com.dark.webprog26.c5platformgame;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

public class PlatformActivity extends AppCompatActivity {

    private PlatformView mPlatformView;
    private Point resolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Display display = getWindowManager().getDefaultDisplay();
        display.getSize(resolution);

        mPlatformView = new PlatformView(this, resolution.x, resolution.y);
        setContentView(mPlatformView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPlatformView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPlatformView.resume();
    }
}
