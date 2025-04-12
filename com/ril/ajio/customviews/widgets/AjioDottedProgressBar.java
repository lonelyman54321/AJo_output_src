/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;

public class AjioDottedProgressBar
extends View {
    private int heightSize;
    private int mDotCount;
    private Handler mHandler;
    private int mIndex;
    private Paint mPaint;
    private Paint mPaintFill;
    private float mRadius;
    private Runnable mRunnable;
    private int step;
    private int widthSize;

    public AjioDottedProgressBar(Context context) {
        super(context);
        Object object;
        int n3 = 1;
        this.mPaintFill = object = new Paint(n3);
        this.mPaint = object = new Paint(n3);
        super();
        this.mHandler = object;
        this.mIndex = 0;
        this.mDotCount = 3;
        this.step = n3;
        super(this);
        this.mRunnable = object;
        this.init(context);
    }

    public AjioDottedProgressBar(Context context, AttributeSet object) {
        super(context, object);
        int n3 = 1;
        super(n3);
        this.mPaintFill = object;
        super(n3);
        this.mPaint = object;
        super();
        this.mHandler = object;
        this.mIndex = 0;
        this.mDotCount = 3;
        this.step = n3;
        super(this);
        this.mRunnable = object;
        this.init(context);
    }

    public AjioDottedProgressBar(Context context, AttributeSet object, int n3) {
        super(context, object, n3);
        n3 = 1;
        super(n3);
        this.mPaintFill = object;
        super(n3);
        this.mPaint = object;
        super();
        this.mHandler = object;
        this.mIndex = 0;
        this.mDotCount = 3;
        this.step = n3;
        super(this);
        this.mRunnable = object;
        this.init(context);
    }

    public static /* bridge */ /* synthetic */ int a(AjioDottedProgressBar ajioDottedProgressBar) {
        return ajioDottedProgressBar.mDotCount;
    }

    public static /* bridge */ /* synthetic */ Handler b(AjioDottedProgressBar ajioDottedProgressBar) {
        return ajioDottedProgressBar.mHandler;
    }

    public static /* bridge */ /* synthetic */ int c(AjioDottedProgressBar ajioDottedProgressBar) {
        return ajioDottedProgressBar.mIndex;
    }

    public static /* bridge */ /* synthetic */ Runnable d(AjioDottedProgressBar ajioDottedProgressBar) {
        return ajioDottedProgressBar.mRunnable;
    }

    public static /* bridge */ /* synthetic */ int e(AjioDottedProgressBar ajioDottedProgressBar) {
        return ajioDottedProgressBar.step;
    }

    public static /* bridge */ /* synthetic */ void f(AjioDottedProgressBar ajioDottedProgressBar, int n3) {
        ajioDottedProgressBar.mIndex = n3;
    }

    public static /* bridge */ /* synthetic */ void g(AjioDottedProgressBar ajioDottedProgressBar, int n3) {
        ajioDottedProgressBar.step = n3;
    }

    private void init(Context context) {
        float f5;
        context = context.getResources();
        int n3 = R$dimen.circle_indicator_radius;
        this.mRadius = f5 = context.getDimension(n3);
        context = this.mPaintFill;
        Paint.Style style2 = Paint.Style.FILL;
        context.setStyle(style2);
        context = this.mPaintFill;
        Resources resources = this.getResources();
        int n4 = R$color.light_fire_bush;
        int n7 = resources.getColor(n4);
        context.setColor(n7);
        this.mPaint.setStyle(style2);
        this.mPaint.setColor(0x33000000);
        this.start();
    }

    public void onDraw(Canvas canvas) {
        int n3;
        super.onDraw(canvas);
        int n4 = this.widthSize;
        float f5 = n4;
        int n7 = this.mDotCount;
        float f6 = n7;
        float f7 = this.mRadius;
        f6 *= f7;
        f7 = 2.0f;
        f5 -= (f6 *= f7);
        int n8 = 4;
        f6 = 5.6E-45f;
        float f8 = (n7 += -1) * 4;
        f5 = (f5 - f8) / f7;
        n7 = this.heightSize / 2;
        f8 = n7;
        for (int i3 = 0; i3 < (n3 = this.mDotCount); ++i3) {
            Paint paint;
            float f11;
            n3 = this.mIndex;
            if (i3 == n3) {
                f11 = this.mRadius;
                paint = this.mPaintFill;
                canvas.drawCircle(f5, f8, f11, paint);
            } else {
                f11 = this.mRadius;
                paint = this.mPaint;
                canvas.drawCircle(f5, f8, f11, paint);
            }
            f11 = this.mRadius * f7;
            float f12 = n8;
            f5 += (f11 += f12);
        }
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        this.widthSize = n3 = View.MeasureSpec.getSize((int)n3);
        n3 = (int)this.mRadius * 2;
        n4 = this.getPaddingBottom() + n3;
        this.heightSize = n3 = this.getPaddingTop() + n4;
        n4 = this.widthSize;
        this.setMeasuredDimension(n4, n3);
    }

    public void setDotsCount(int n3) {
        this.mDotCount = n3;
    }

    public void start() {
        this.mIndex = -1;
        Handler handler = this.mHandler;
        Runnable runnable2 = this.mRunnable;
        handler.removeCallbacks(runnable2);
        handler = this.mHandler;
        runnable2 = this.mRunnable;
        handler.post(runnable2);
    }

    public void stop() {
        Handler handler = this.mHandler;
        Runnable runnable2 = this.mRunnable;
        handler.removeCallbacks(runnable2);
    }
}

