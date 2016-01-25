package com.android.hellocolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private CicleCrossView crossView;//颜色环
    private PerviewSurface previewSurface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

//        crossView = (CicleCrossView)findViewById(R.id.cross_view);
//        Log.i(TAG, "crossView");
//        crossView.setColor(Color.GREEN);
//        crossView.refresh();
//        Log.i(TAG, "refresh");

        crossView = (CircleCrossView)findViewById(R.id.cross_view);
        previewSurface = (PreviewSurface)findViewById(R.id.preview_surface);

        previewSurface.setOnColorListener(this);
    }

    public void onColor(int color){
        crossView.setColor(color);
        crossView.refresh();
    }
}
