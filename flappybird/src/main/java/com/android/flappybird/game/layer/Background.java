package com.android.flappybird.game.layer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.android.flappybird.game.GameSurface;
import com.android.flappybird.utils.Assist;

/**
 * Background
 *
 * @auther:dell
 * @time:2016/1/24 10:05
 */
public class Background extends BaseLayer {

    public Background(GameSurface surface) {
        super(surface);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Assist.getColor(res, R.color.Cyan));
        // 画纯色背景
        canvas.drawRect(0, 0, screenW, screenH, paint);
    }

    @Override
    public void logic() {

    }

    @Override
    public void onTouchEvent(MotionEvent event) {

    }

    @Override
    public void onKeyDown(int KeyCode, KeyEvent event) {

    }
}
