package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint paint;
    int dx = 40;
    int itemWidth = 100;

    int items[] = {10, 10, 20, 80, 100, 150};
    String names[] = {"a", "b", "c", "d", "e", "f"};
    int ox = 100, oy = 700;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (paint == null) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.WHITE);
        }
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        canvas.drawLine(ox, oy, ox, 100, paint);
        canvas.drawLine(ox, oy, 1000, oy, paint);

        int x = ox + dx, y = oy + 20;
        for (int i = 0; i < items.length; i++) {
            int item = items[i];
            canvas.drawText(names[i], x + itemWidth / 2, y, paint);
            canvas.drawRect(x, oy - item, x + itemWidth, oy, paint);
            x += dx + itemWidth;
        }

    }
}
