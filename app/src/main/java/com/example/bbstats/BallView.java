package com.example.bbstats;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.view.*;
import android.util.*;

public class BallView extends View {
    int x = 0;
    int y = 0;

    public BallView(Context context, AttributeSet attrs){
        super(context,attrs);
        setFocusable(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        int x2, y2 ;
        int _x = 1, _y =1 ;
        boolean loop = true ;
        if(ev.getAction() == MotionEvent.ACTION_DOWN) {
            // タッチした座標を取得
            x = (int)ev.getX();
            y = (int)ev.getY();
        }
        invalidate();
        return true;
    }

    public void onDraw(Canvas canvas){
        canvas.drawColor(Color.argb(125, 0, 0, 255));
        if ( canvas!=null)
        {
            // 円を描画
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.RED);
            canvas.drawCircle(x, y, 50.0f, paint);

            // テキストを描画
            paint.setTextSize(80);
            paint.setColor(Color.WHITE);
            canvas.drawText("1", x+3 , y, paint);
        }
    }

}
