package com.example.bbstats;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.view.*;
import android.util.*;

import java.util.ArrayList;
import java.util.List;

public class BallView extends View {
    List<Ball> balls = new ArrayList<>();
    private int count = 1;

    public BallView(Context context, AttributeSet attrs){
        super(context,attrs);
        setFocusable(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if(ev.getAction() == MotionEvent.ACTION_DOWN) {
            // タッチした座標を取得
            Ball ball = new Ball();
            ball.setX((int)ev.getX());
            ball.setY((int)ev.getY());
            ball.setCount(count);
            setCount(getCount()+1);
            balls.add(ball);
        }
        invalidate();
        return true;
    }

    public void onDraw(Canvas canvas){
        canvas.drawColor(Color.argb(125, 0, 0, 255));
        if ( canvas!=null)
        {
            for(Ball ball : balls){
                // 円を描画
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(Color.RED);
                canvas.drawCircle(ball.getX(), ball.getY(), 50.0f, paint);

                // テキストを描画
                paint.setTextSize(80);
                paint.setColor(Color.WHITE);
                canvas.drawText(String.valueOf(ball.getCount()), ball.getX()+3 , ball.getY(), paint);
                canvas.save();
            }

        }
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
