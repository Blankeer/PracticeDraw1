package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint paint;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (paint == null) {
            paint = new Paint();
            paint.setAntiAlias(true);
        }
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(100, 100, 500, 400, -90, 90, true, paint);

        canvas.drawArc(100, 100, 500, 400, 10, 90, false, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(100, 100, 500, 400, 120, 30, false, paint);
        canvas.drawArc(100, 100, 500, 400, 180, 50, true, paint);


    }
}
