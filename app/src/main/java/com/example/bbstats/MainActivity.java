package com.example.bbstats;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;

import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトファイルでなく カスタムクラスを使用。
        //setContentView(R.layout.main);
        setContentView(R.layout.activity_main);

        Button nextButton = findViewById(R.id.direction_ball);



    }
}
