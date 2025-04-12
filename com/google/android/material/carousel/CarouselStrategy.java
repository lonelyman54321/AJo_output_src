/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import com.google.android.material.carousel.Carousel;
import com.google.android.material.carousel.CarouselStrategyHelper;
import com.google.android.material.carousel.KeylineState;

public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    public static int[] doubleCounts(int[] nArray) {
        int n3 = nArray.length;
        int[] nArray2 = new int[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            nArray2[i3] = n4 = nArray[i3] * 2;
        }
        return nArray2;
    }

    public static float getChildMaskPercentage(float f5, float f6, float f7) {
        f5 -= f7;
        return 1.0f - (f5 /= (f6 -= f7));
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    public void initialize(Context context) {
        float f5 = this.smallSizeMin;
        int n3 = 0;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object <= 0) {
            f5 = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = f5;
        f5 = this.smallSizeMax;
        float f7 = f5 - 0.0f;
        n3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (n3 <= 0) {
            f5 = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = f5;
    }

    public boolean isContained() {
        return true;
    }

    public abstract KeylineState onFirstChildMeasuredWithMargins(Carousel var1, View var2);

    public void setSmallItemSizeMax(float f5) {
        this.smallSizeMax = f5;
    }

    public void setSmallItemSizeMin(float f5) {
        this.smallSizeMin = f5;
    }

    public boolean shouldRefreshKeylineState(Carousel carousel, int n3) {
        return false;
    }
}

