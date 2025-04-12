/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.carousel;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.google.android.material.carousel.Arrangement;
import com.google.android.material.carousel.Carousel;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.CarouselStrategyHelper;
import com.google.android.material.carousel.KeylineState;

public class FullScreenCarouselStrategy
extends CarouselStrategy {
    /*
     * Enabled aggressive block sorting
     */
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int n3;
        float f5;
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n4 = carousel.isHorizontal();
        if (n4 != 0) {
            int n7 = carousel.getContainerWidth();
            f5 = n7;
            n4 = recyclerView$LayoutParams.leftMargin;
            n3 = recyclerView$LayoutParams.rightMargin;
        } else {
            int n8 = carousel.getContainerHeight();
            f5 = n8;
            n4 = recyclerView$LayoutParams.topMargin;
            n3 = recyclerView$LayoutParams.bottomMargin;
        }
        float f6 = n4 += n3;
        float f7 = Math.min(f5 + f6, f5);
        Arrangement arrangement = new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, f7, 1, f5);
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f6, f5, arrangement);
    }
}

