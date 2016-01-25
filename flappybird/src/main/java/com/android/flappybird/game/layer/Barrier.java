package com.android.flappybird.game.layer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.android.flappybird.game.GameSurface;
import com.android.flappybird.utils.Assist;

import java.util.Random;

/**
 * Barrier
 *
 * @auther:dell
 * @time:2016/1/24 10:07
 */
public class Barrier extends BaseLayer {

    /*private float spaceH;//障碍间距
    private float distance;//左右间距

    private float barrierW, barrierY;
    private float speed;

    private float barrier1X;
    private float barrier1H;

    private float barrier2X;
    private float barrier2H;
*/


    public Barrier(GameSurface surface) {
        super(surface);
        /*spaceH = screenH / 4;
        barrierW = 130;
        distance = screenW / 2 - barrierW / 2;
        barrierY = 0;
        speed = 10;
        barrier1X = screenW + 200;
        barrier1H = getBarrierH();

        barrier1X = screenW / 2 + distance;
        barrier1H = getBarrierH();
*/
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
       /* paint.setColor(Assist.getColor(res, android.R.color.SpringGreen));
        //一上
        canvas.drawRect(barrier1X, barrierY, barrier1X + barrierW, barrierY + barrier1H, paint);
        //一下
        canvas.drawRect(barrier1X, barrierY + spaceH, screenH - barrier1H - spaceH, barrier2X + barrierW, barrierY + barrierW);
        //二上
        canvas.drawRect(barrier2X, barrierY, barrier2X + barrierW, );
        //二下
        canvas.drawRect(barrier2X, barrierY + spaceH, barrier2X + barrierW, );*/
    }

    @Override
    public void logic() {
        /*barrier1X -= speed;
        barrier2X = barrier1X + distance + barrierW;

        if (barrier1X + barrierW < 0) {
            barrier1X = screenW;
            barrier1H = getBarrierH();
        }

        if (barrier2X + barrierW < 0) {
            barrier2X = screenW;
            barrier2H = getBarrierH();
        }

        boolean isColl1 = isColl1;
        boolean isColl2 = isColl2;
        boolean isColl3 = isColl3;
        boolean isColl4 = isColl4;
        if(isColl1||isColl2||isColl3||isColl4){
            surface.setGameState
        }*/
    }

    @Override
    public void onTouchEvent(MotionEvent event) {

    }

    @Override
    public void onKeyDown(int KeyCode, KeyEvent event) {

    }

    private float getBarrierH(){
        return new Random().nextInt((int) (screenH - spaceH - 50));
    }

    private boolean circleAndRect(float circleX, float circleY, float circleR, float rectX, float
            rectY, float rectW, float rectH) {
        if (circleX + circleR < rectX) {
            return false;
        } else if (circleX - circleR > rectX + rectW) {
            return false;
        } else if (circleY + circleR < rectY) {
            return false;
        } else if (circleY - circleR > rectY + rectH) {
            return false;
        } else if (Math.pow(rectX - circleX, 2) + Math.pow(rectY - circleY, 2) > circleR *
                circleR && circleX < rectX && circleY < rectX) {
            return false;
        } else if (Math.pow(rectX + rectW - circleX, 2) + Math.pow(rectY - circleY, 2) > circleR *
                circleR && circleX > rectX + rectW && circleY < rectY) {
            return false;
        } else if (Math.pow(rectX - circleX, 2) + Math.pow(rectY + rectH - circleY, 2) > circleR *
                circleR && circleX < rectX && circleY > rectY + rectH) {
            return false;
        } else if (Math.pow(rectX + rectW - circleX, 2) + Math.pow(rectY + rectH - circleY, 2) >
                circleR * circleR && circleX > rectX + rectW && circleY > rectY + rectH) {
            return false;
        }
        return true;
    }
}
