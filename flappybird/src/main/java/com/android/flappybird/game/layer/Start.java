package com.android.flappybird.game.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.provider.SyncStateContract;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.android.flappybird.game.GameSurface;

/**
 * Start
 *
 * @auther:dell
 * @time:2016/1/24 10:06
 */
public class Start extends BaseLayer {

    public float x, y;
    public float w, h;

    private float triangleW, triangleH;

    public Start(GameSurface surface) {
        super(surface);

        w = 250;
        h = 150;
        x = screenW / 2 - w / 2;
        y = 2 * screenH / 3 - h / 2;

        triangleW = 80;
        triangleH = 50;
    }

    @Override
    public void draw(Canvas canvas, Paint paint {
        paint.setColor(Color.WHITE);
        canvas.drawRect(x, y, x + w, y + h, paint);

        paint.setColor(Color.GREEN);
        Path path = new Path();
        path.moveTo(x + w / 2 - triangleH / 2, y + h / 2 - triangleW / 2);
        path.lineTo(x + w / 2 - triangleH / 2, y + h / 2 + triangleW / 2);
        path.lineTo(x + w / 2 + triangleH / 2, y + h / 2);
        canvas.drawPath(path, paint);
    }

    @Override
    public void logic() {

    }

    @Override
    public void onTouchEvent(MotionEvent event) {
        int touchX = (int) event.getX();
        int touchY = (int) event.getY();

        // 判断是否点击了开始按钮
        if (touchX > x && touchX < x + w && touchY > y && touchY < y + h) {
            surface.setGameState(SyncStateContract.Constants.GAMING);
        }
    }

    @Override
    public void onKeyDown(int KeyCode, KeyEvent event) {

    }
}
