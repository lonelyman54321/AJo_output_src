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
import com.google.android.material.carousel.CarouselOrientationHelper$1;
import com.google.android.material.carousel.CarouselOrientationHelper$2;

abstract class CarouselOrientationHelper {
    final int orientation;

    private CarouselOrientationHelper(int n3) {
        this.orientation = n3;
    }

    public /* synthetic */ CarouselOrientationHelper(int n3, CarouselOrientationHelper$1 var2_2) {
        this(n3);
    }

    private static CarouselOrientationHelper createHorizontalHelper(CarouselLayoutManager carouselLayoutManager) {
        CarouselOrientationHelper$2 carouselOrientationHelper$2 = new CarouselOrientationHelper$2(0, carouselLayoutManager);
        return carouselOrientationHelper$2;
    }

    public static CarouselOrientationHelper createOrientationHelper(CarouselLayoutManager object, int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                return CarouselOrientationHelper.createVerticalHelper((CarouselLayoutManager)object);
            }
            object = new IllegalArgumentException("invalid orientation");
            throw object;
        }
        return CarouselOrientationHelper.createHorizontalHelper((CarouselLayoutManager)object);
    }

    private static CarouselOrientationHelper createVerticalHelper(CarouselLayoutManager carouselLayoutManager) {
        CarouselOrientationHelper$1 carouselOrientationHelper$1 = new CarouselOrientationHelper$1(1, carouselLayoutManager);
        return carouselOrientationHelper$1;
    }

    public abstract void containMaskWithinBounds(RectF var1, RectF var2, RectF var3);

    public abstract int getDecoratedCrossAxisMeasurement(View var1);

    public abstract float getMaskMargins(RecyclerView$LayoutParams var1);

    public abstract RectF getMaskRect(float var1, float var2, float var3, float var4);

    public abstract int getParentBottom();

    public abstract int getParentEnd();

    public abstract int getParentLeft();

    public abstract int getParentRight();

    public abstract int getParentStart();

    public abstract int getParentTop();

    public abstract void layoutDecoratedWithMargins(View var1, int var2, int var3);

    public abstract void moveMaskOnEdgeOutsideBounds(RectF var1, RectF var2, RectF var3);

    public abstract void offsetChild(View var1, Rect var2, float var3, float var4);
}

