package com.android.flappybird.game.layer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.android.flappybird.game.GameSurface;
import com.android.flappybird.utils.Assist;

/**
 * Player
 *
 * @auther:dell
 * @time:2016/1/24 10:04
 */
public class Player extends BaseLayer {

    private float x, y;
    private float radius;

    private float speed;
    private float acc;

    public Player(GameSurface surface) {
        super(surface);
        x = screenW / 2;
        y = screenH / 2;

        radius = 60;
        speed = 15;
        acc = 4;
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Assist.getColor(res, R.color.Black));
        canvas.drawCircle(x, y, radius, paint);

    }

    @Override
    public void logic() {
        y += speed;
        speed += acc;

    }

    @Override
    public void onTouchEvent(MotionEvent event) {
        speed -= 20;
    }

    @Override
    public void onKeyDown(int KeyCode, KeyEvent event) {

    }
}

