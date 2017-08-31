package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    private Paint paint;

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (paint == null) {
            paint = new Paint();
            paint.setAntiAlias(true);
        }
//        练习内容：使用 canvas.drawPath() 方法画心形
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();

        path.moveTo(400, 400);
        path.arcTo(300, 350, 400, 450, 0, -220, true);
        path.lineTo(400, 530);

        path.arcTo(400, 350, 500, 450, 40, -220, false);

        canvas.drawPath(path, paint);
    }
}
