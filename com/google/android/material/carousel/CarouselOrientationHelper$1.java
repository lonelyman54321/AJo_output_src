/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.view.View
 */
package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.CarouselOrientationHelper;

class CarouselOrientationHelper$1
extends CarouselOrientationHelper {
    final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

    public CarouselOrientationHelper$1(int n3, CarouselLayoutManager carouselLayoutManager) {
        this.val$carouselLayoutManager = carouselLayoutManager;
        super(n3, null);
    }

    public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        float f14 = rectF2.top;
        float f15 = rectF3.top;
        float f16 = f14 - f15;
        Object object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (object < 0 && (object = (f12 = (f11 = rectF2.bottom) - f15) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) > 0) {
            f15 -= f14;
            rectF.top = f14 = rectF.top + f15;
            rectF3.top = f14 = rectF3.top + f15;
        }
        if ((f8 = (f7 = (f14 = rectF2.bottom) - (f6 = rectF3.bottom)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0 && (f8 = (f5 = (f15 = rectF2.top) - f6) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) < 0) {
            f14 -= f6;
            f6 = rectF.bottom - f14;
            f15 = rectF.top;
            rectF.bottom = f6 = Math.max(f6, f15);
            float f17 = rectF2.bottom - f14;
            f6 = rectF2.top;
            rectF2.bottom = f17 = Math.max(f17, f6);
        }
    }

    public int getDecoratedCrossAxisMeasurement(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.val$carouselLayoutManager.getDecoratedMeasuredWidth(view);
        int n4 = recyclerView$LayoutParams.leftMargin;
        int n7 = recyclerView$LayoutParams.rightMargin;
        return (n3 += n4) + n7;
    }

    public float getMaskMargins(RecyclerView$LayoutParams recyclerView$LayoutParams) {
        int n3 = recyclerView$LayoutParams.topMargin;
        int n4 = recyclerView$LayoutParams.bottomMargin;
        return n3 + n4;
    }

    public RectF getMaskRect(float f5, float f6, float f7, float f8) {
        RectF rectF = new RectF(0.0f, f7, f6, f5 -= f7);
        return rectF;
    }

    public int getParentBottom() {
        return this.val$carouselLayoutManager.getHeight();
    }

    public int getParentEnd() {
        return this.getParentBottom();
    }

    public int getParentLeft() {
        return this.val$carouselLayoutManager.getPaddingLeft();
    }

    public int getParentRight() {
        int n3 = this.val$carouselLayoutManager.getWidth();
        int n4 = this.val$carouselLayoutManager.getPaddingRight();
        return n3 - n4;
    }

    public int getParentStart() {
        return this.getParentTop();
    }

    public int getParentTop() {
        return 0;
    }

    public void layoutDecoratedWithMargins(View view, int n3, int n4) {
        int n7 = this.getParentLeft();
        int n8 = this.getDecoratedCrossAxisMeasurement(view);
        int n10 = n7 + n8;
        this.val$carouselLayoutManager.layoutDecoratedWithMargins(view, n7, n3, n10, n4);
    }

    public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11 = rectF2.bottom;
        float f12 = rectF3.top;
        float f14 = 1.0f;
        Object object = f11 == f12 ? 0 : (f11 < f12 ? -1 : 1);
        if (object <= 0) {
            double d2 = Math.floor(rectF.bottom);
            rectF.bottom = f11 = (float)d2 - f14;
            f12 = rectF.top;
            rectF.top = f11 = Math.min(f12, f11);
        }
        if ((f8 = (f7 = (f6 = rectF2.top) - (f5 = rectF3.bottom)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0) {
            double d5 = Math.ceil(rectF.top);
            rectF.top = f6 = (float)d5 + f14;
            f5 = rectF.bottom;
            rectF.bottom = f6 = Math.max(f6, f5);
        }
    }

    public void offsetChild(View view, Rect rect, float f5, float f6) {
        float f7 = (float)rect.top + f5;
        int n3 = (int)(f6 - f7);
        view.offsetTopAndBottom(n3);
    }
}

