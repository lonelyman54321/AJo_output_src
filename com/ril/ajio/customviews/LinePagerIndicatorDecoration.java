/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.Interpolator
 */
package com.ril.ajio.customviews;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import kotlin.jvm.internal.Intrinsics;

public class LinePagerIndicatorDecoration
extends RecyclerView$n {
    private static final float DP = Resources.getSystem().getDisplayMetrics().density;
    private final int mIndicatorHeight;
    private final float mIndicatorItemLength;
    private final float mIndicatorItemPadding;
    private final float mIndicatorStrokeWidth;
    private final Interpolator mInterpolator;
    private final Paint mPaint;

    public LinePagerIndicatorDecoration() {
        float f5;
        float f6;
        int n3;
        float f7 = DP;
        this.mIndicatorHeight = n3 = (int)(20.0f * f7);
        this.mIndicatorStrokeWidth = f6 = 4.0f * f7;
        this.mIndicatorItemLength = f5 = 24.0f * f7;
        this.mIndicatorItemPadding = f7 *= 8.0f;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        this.mInterpolator = accelerateDecelerateInterpolator;
        this.mPaint = accelerateDecelerateInterpolator;
        Paint.Cap cap = Paint.Cap.ROUND;
        accelerateDecelerateInterpolator.setStrokeCap(cap);
        accelerateDecelerateInterpolator.setStrokeWidth(f6);
        Paint.Style style2 = Paint.Style.STROKE;
        accelerateDecelerateInterpolator.setStyle(style2);
        accelerateDecelerateInterpolator.setAntiAlias(true);
    }

    private void drawHighlights(Canvas canvas, float f5, float f6, int n3, float f7, int n4) {
        int n7;
        float f8;
        int n8;
        ld3_2 ld3_22;
        String string2;
        Object object;
        LinePagerIndicatorDecoration linePagerIndicatorDecoration = this;
        int n10 = n3;
        CharSequence charSequence = od3_2.a;
        int n14 = ((String)charSequence).length();
        if (n14 == 0) {
            charSequence = od3_2.a();
        }
        if ((n14 = (int)(s20.a ? 1 : 0)) == 0 && (n14 = (int)(Intrinsics.areEqual(object = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && (n8 = Intrinsics.areEqual(charSequence, object = ld3_22.getStoreId())) == 0) {
            n8 = 0;
            f8 = 0.0f;
            charSequence = null;
        } else {
            n8 = 1;
            f8 = Float.MIN_VALUE;
        }
        object = "#";
        if (n8 != 0) {
            charSequence = new StringBuilder((String)object);
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            n7 = R$color.white;
            n14 = t70.getColor((Context)object, n7);
            object = Integer.toHexString(n14);
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            n8 = Color.parseColor((String)charSequence);
        } else {
            charSequence = new StringBuilder((String)object);
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            n7 = R$color.indicator_grey;
            n14 = t70.getColor((Context)object, n7);
            object = Integer.toHexString(n14);
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            n8 = Color.parseColor((String)charSequence);
        }
        object = linePagerIndicatorDecoration.mPaint;
        object.setColor(n8);
        f8 = linePagerIndicatorDecoration.mIndicatorItemLength;
        float f11 = linePagerIndicatorDecoration.mIndicatorItemPadding + f8;
        float f12 = (float)n10 * f11 + f5;
        float f14 = 0.0f;
        ld3_22 = null;
        float f15 = f7 - 0.0f;
        n7 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
        if (n7 == 0) {
            float f16 = f12 + f8;
            Paint paint = linePagerIndicatorDecoration.mPaint;
            string2 = canvas;
            canvas.drawLine(f12, f6, f16, f6, paint);
        } else {
            f14 = f8 * f7;
            float f17 = f12 + f14;
            float f18 = f12 + f8;
            Paint paint = linePagerIndicatorDecoration.mPaint;
            canvas.drawLine(f17, f6, f18, f6, paint);
            n8 = n4 + -1;
            if (n10 < n8) {
                f17 = f12 + f11;
                f18 = f17 + f14;
                paint = linePagerIndicatorDecoration.mPaint;
                canvas.drawLine(f17, f6, f18, f6, paint);
            }
        }
    }

    private void drawInactiveIndicators(Canvas canvas, float f5, float f6, int n3) {
        int n4;
        float f7;
        int n7;
        ld3_2 ld3_22;
        String string2;
        Object object;
        CharSequence charSequence = od3_2.a;
        int n8 = ((String)charSequence).length();
        if (n8 == 0) {
            charSequence = od3_2.a();
        }
        n8 = (int)(s20.a ? 1 : 0);
        int n10 = 0;
        if (n8 == 0 && (n8 = (int)(Intrinsics.areEqual(object = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && (n7 = Intrinsics.areEqual(charSequence, object = ld3_22.getStoreId())) == 0) {
            n7 = 0;
            f7 = 0.0f;
            charSequence = null;
        } else {
            n7 = 1;
            f7 = Float.MIN_VALUE;
        }
        object = "#";
        if (n7 != 0) {
            charSequence = new StringBuilder((String)object);
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            n4 = R$color.color_a5a5a5;
            n8 = t70.getColor((Context)object, n4);
            object = Integer.toHexString(n8);
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            n7 = Color.parseColor((String)charSequence);
        } else {
            charSequence = new StringBuilder((String)object);
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            n4 = R$color.color_2e4151_30;
            n8 = t70.getColor((Context)object, n4);
            object = Integer.toHexString(n8);
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            n7 = Color.parseColor((String)charSequence);
        }
        object = this.mPaint;
        object.setColor(n7);
        f7 = this.mIndicatorItemLength;
        float f8 = this.mIndicatorItemPadding;
        f7 += f8;
        while (n10 < n3) {
            f8 = this.mIndicatorItemLength;
            float f11 = f5 + f8;
            Paint paint = this.mPaint;
            ld3_22 = canvas;
            canvas.drawLine(f5, f6, f11, f6, paint);
            f5 += f7;
            ++n10;
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        int n3;
        super.getItemOffsets(rect, view, recyclerView, recyclerView$y);
        rect.bottom = n3 = this.mIndicatorHeight;
    }

    public void onDrawOver(Canvas canvas, RecyclerView object, RecyclerView$y object2) {
        int n3;
        int n4;
        super.onDrawOver(canvas, (RecyclerView)object, (RecyclerView$y)object2);
        object2 = ((RecyclerView)object).getAdapter();
        int n7 = 0;
        float f5 = 0.0f;
        if (object2 != null) {
            object2 = ((RecyclerView)object).getAdapter();
            n3 = n4 = ((RecyclerView$f)object2).getItemCount();
        } else {
            n3 = 0;
        }
        float f6 = this.mIndicatorItemLength;
        float f7 = n3;
        f6 *= f7;
        int n8 = n3 + -1;
        f5 = Math.max(0, n8);
        f7 = this.mIndicatorItemPadding;
        f5 = f5 * f7 + f6;
        f6 = (float)object.getWidth() - f5;
        n7 = 0x40000000;
        f5 = 2.0f;
        float f8 = f6 / f5;
        n4 = object.getHeight();
        f6 = n4;
        n8 = this.mIndicatorHeight;
        f7 = (float)n8 / f5;
        float f11 = f6 - f7;
        this.drawInactiveIndicators(canvas, f8, f11, n3);
        object = (LinearLayoutManager)((RecyclerView)object).getLayoutManager();
        if (object == null) {
            return;
        }
        int n10 = ((LinearLayoutManager)object).findFirstVisibleItemPosition();
        n4 = -1;
        f6 = 0.0f / 0.0f;
        if (n10 == n4) {
            return;
        }
        if ((object = ((LinearLayoutManager)object).findViewByPosition(n10)) == null) {
            return;
        }
        n7 = object.getLeft();
        int n14 = object.getWidth();
        Object object3 = this.mInterpolator;
        f6 = n7 * -1;
        float f12 = n14;
        float f14 = object3.getInterpolation(f6 /= f12);
        object3 = this;
        this.drawHighlights(canvas, f8, f11, n10, f14, n3);
    }
}

