package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import static android.R.attr.y;

public class Practice11PieChartView extends View {
    private Paint paint;
    private int ox = 400, oy = 400;
    private int colors[] = {Color.RED, Color.BLUE, Color.BLACK, Color.GRAY};
    private float percents[] = {0.2F, 0.1F, 0.4F, 0.3F};
    private int r = 200;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (paint == null) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
        }
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        int x = 0;
        for (int i = 0; i < colors.length; i++) {
            int color = colors[i];
            float percent = percents[i];
            paint.setColor(color);
            float angle = 360 * percent;
            canvas.drawArc(ox - r, oy - r, ox + r, oy + r, x, angle, true, paint);
            x += angle;
        }
    }
}
