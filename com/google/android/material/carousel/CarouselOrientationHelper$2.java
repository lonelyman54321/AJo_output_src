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

class CarouselOrientationHelper$2
extends CarouselOrientationHelper {
    final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

    public CarouselOrientationHelper$2(int n3, CarouselLayoutManager carouselLayoutManager) {
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
        float f14 = rectF2.left;
        float f15 = rectF3.left;
        float f16 = f14 - f15;
        Object object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (object < 0 && (object = (f12 = (f11 = rectF2.right) - f15) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) > 0) {
            f15 -= f14;
            rectF.left = f14 = rectF.left + f15;
            rectF2.left = f14 = rectF2.left + f15;
        }
        if ((f8 = (f7 = (f14 = rectF2.right) - (f6 = rectF3.right)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0 && (f8 = (f5 = (f15 = rectF2.left) - f6) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) < 0) {
            f14 -= f6;
            f6 = rectF.right - f14;
            f15 = rectF.left;
            rectF.right = f6 = Math.max(f6, f15);
            float f17 = rectF2.right - f14;
            f6 = rectF2.left;
            rectF2.right = f17 = Math.max(f17, f6);
        }
    }

    public int getDecoratedCrossAxisMeasurement(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.val$carouselLayoutManager.getDecoratedMeasuredHeight(view);
        int n4 = recyclerView$LayoutParams.topMargin;
        int n7 = recyclerView$LayoutParams.bottomMargin;
        return (n3 += n4) + n7;
    }

    public float getMaskMargins(RecyclerView$LayoutParams recyclerView$LayoutParams) {
        int n3 = recyclerView$LayoutParams.rightMargin;
        int n4 = recyclerView$LayoutParams.leftMargin;
        return n3 + n4;
    }

    public RectF getMaskRect(float f5, float f6, float f7, float f8) {
        RectF rectF = new RectF(f8, 0.0f, f6 -= f8, f5);
        return rectF;
    }

    public int getParentBottom() {
        int n3 = this.val$carouselLayoutManager.getHeight();
        int n4 = this.val$carouselLayoutManager.getPaddingBottom();
        return n3 - n4;
    }

    public int getParentEnd() {
        CarouselLayoutManager carouselLayoutManager = this.val$carouselLayoutManager;
        int n3 = carouselLayoutManager.isLayoutRtl();
        n3 = n3 != 0 ? this.getParentLeft() : this.getParentRight();
        return n3;
    }

    public int getParentLeft() {
        return 0;
    }

    public int getParentRight() {
        return this.val$carouselLayoutManager.getWidth();
    }

    public int getParentStart() {
        CarouselLayoutManager carouselLayoutManager = this.val$carouselLayoutManager;
        int n3 = carouselLayoutManager.isLayoutRtl();
        n3 = n3 != 0 ? this.getParentRight() : this.getParentLeft();
        return n3;
    }

    public int getParentTop() {
        return this.val$carouselLayoutManager.getPaddingTop();
    }

    public void layoutDecoratedWithMargins(View view, int n3, int n4) {
        int n7 = this.getParentTop();
        int n8 = this.getDecoratedCrossAxisMeasurement(view);
        int n10 = n7 + n8;
        this.val$carouselLayoutManager.layoutDecoratedWithMargins(view, n3, n7, n4, n10);
    }

    public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11 = rectF2.right;
        float f12 = rectF3.left;
        float f14 = 1.0f;
        Object object = f11 == f12 ? 0 : (f11 < f12 ? -1 : 1);
        if (object <= 0) {
            double d2 = Math.floor(rectF.right);
            rectF.right = f11 = (float)d2 - f14;
            f12 = rectF.left;
            rectF.left = f11 = Math.min(f12, f11);
        }
        if ((f8 = (f7 = (f6 = rectF2.left) - (f5 = rectF3.right)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0) {
            double d5 = Math.ceil(rectF.left);
            rectF.left = f6 = (float)d5 + f14;
            f5 = rectF.right;
            rectF.right = f6 = Math.max(f6, f5);
        }
    }

    public void offsetChild(View view, Rect rect, float f5, float f6) {
        float f7 = (float)rect.left + f5;
        int n3 = (int)(f6 - f7);
        view.offsetLeftAndRight(n3);
    }
}

