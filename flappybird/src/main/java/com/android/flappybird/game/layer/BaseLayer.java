package com.android.flappybird.game.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.android.flappybird.game.GameSurface;

/**
 * BaseLayer
 *
 * @auther:dell
 * @time:2016/1/24 10:16
 */
public abstract class BaseLayer {

    protected GameSurface surface;
    protected Resources res;
    protected int screenW, screenH;//当前surface视图的宽,高

    public BaseLayer(GameSurface surface) {
        this.surface = surface;

        this.screenW = surface.getWidth();
        this.screenH = surface.getHeight();

        res = surface.getResources();
    }
    //画图
    public abstract void draw(Canvas canvas, Paint paint){

    }
    // 逻辑
    public abstract void logic(){

    }
    //触摸事件
    public abstract void onTouchEvent(MotionEvent event){

    }
    //按键点击事件
    public abstract void onKeyDown(int KeyCode, KeyEvent event){

    }
}
