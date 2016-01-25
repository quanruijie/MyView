package com.android.flappybird.game.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.android.flappybird.game.GameSurface;

/**
 * Score
 *
 * @auther:dell
 * @time:2016/1/24 10:09
 */
public class Score extends BaseLayer{

    public Score(GameSurface surface) {
        super(surface);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {

    }

    @Override
    public void logic() {
        if(isStart){
            startTime = System
        }
    }

    @Override
    public void onTouchEvent(MotionEvent event) {

    }

    @Override
    public void onKeyDown(int KeyCode, KeyEvent event) {

    }
}
