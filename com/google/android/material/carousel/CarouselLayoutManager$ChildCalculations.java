/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.carousel;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager$KeylineRange;

final class CarouselLayoutManager$ChildCalculations {
    final float center;
    final View child;
    final float offsetCenter;
    final CarouselLayoutManager.KeylineRange range;

    public CarouselLayoutManager$ChildCalculations(View view, float f5, float f6, CarouselLayoutManager.KeylineRange keylineRange) {
        this.child = view;
        this.center = f5;
        this.offsetCenter = f6;
        this.range = keylineRange;
    }
}

