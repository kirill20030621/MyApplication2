package com.example.myapplication2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView  extends View {
    public MyView(Context context) {
        super(context);
    }
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
    }
}
