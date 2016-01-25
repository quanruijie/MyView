package com.android.hellocolor;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.io.IOException;

/**
 * CamerSurface
 *
 * @auther:dell
 * @time:2016/1/23 9:31
 */
public class CamerSurface extends SurfaceView implements SurfaceHolder.Callback{

    public final static String TAG = "CameraSurface";

    private SurfaceHolder holder;

    protected Camera camera;//照相机

    private boolean ispreview;//是否预览

    public CamerSurface(Context context) {
        super(context);
        init();
    }

    public CamerSurface(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    //初始化
    private void init(){
        holder = getHolder();
        holder.addCallback(this);

        ispreview = false;
    }
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        camera = Camera.open();//打开camera

        if(null != camera){
            try {
                camera.setPreviewDisplay(holder);   //设置预览界面到当前surface中
            } catch (IOException e) {
                e.printStackTrace();
                camera.release();
                camera = null;
            }
        }
        Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(getWidth(), getHeight());//设置camera预览的尺寸
        camera.setParameters(parameters);

        camera.startPreview();//开始预览
        ispreview = true;
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        if(null != camera){
            if(ispreview){
                camera.stopPreview();//停止预览
            }
            camera.release();//释放预览
            camera = null;
        }
    }
}