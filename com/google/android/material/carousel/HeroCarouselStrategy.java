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

public class HeroCarouselStrategy
extends CarouselStrategy {
    private static final int[] MEDIUM_COUNTS;
    private static final int[] SMALL_COUNTS;
    private int keylineCount = 0;

    static {
        int n3 = 1;
        SMALL_COUNTS = new int[]{n3};
        MEDIUM_COUNTS = new int[]{0, n3};
    }

    /*
     * Enabled aggressive block sorting
     */
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int[] nArray;
        float f5;
        int n3;
        int[] nArray2;
        int n4 = carousel.getContainerHeight();
        int n7 = carousel.isHorizontal();
        if (n7 != 0) {
            n4 = carousel.getContainerWidth();
        }
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n8 = recyclerView$LayoutParams.topMargin;
        int n10 = recyclerView$LayoutParams.bottomMargin;
        float f6 = n8 += n10;
        n10 = view.getMeasuredWidth() * 2;
        float f7 = n10;
        int n14 = carousel.isHorizontal();
        if (n14 != 0) {
            n8 = recyclerView$LayoutParams.leftMargin;
            n7 = recyclerView$LayoutParams.rightMargin;
            f6 = n8 += n7;
            n7 = view.getMeasuredHeight() * 2;
            f7 = n7;
        }
        float f8 = this.getSmallItemSizeMin() + f6;
        float f11 = Math.max(this.getSmallItemSizeMax() + f6, f8);
        float f12 = f7 + f6;
        float f14 = n4;
        float f15 = Math.min(f12, f14);
        n14 = 0x40400000;
        f7 = f7 / 3.0f + f6;
        f12 = f8 + f6;
        float f16 = f11 + f6;
        f7 = PK1.a(f7, f12, f16);
        f12 = f15 + f7;
        f16 = 2.0f;
        float f17 = f12 / f16;
        Object object = SMALL_COUNTS;
        int n15 = 1;
        float f18 = f14 - (f16 *= f8);
        Object object2 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            int[] nArray3 = new int[n15];
            nArray3[0] = 0;
            nArray2 = nArray3;
        } else {
            nArray2 = object;
        }
        f12 = CarouselStrategyHelper.maxValue(object);
        f12 = qy_1.a(f11, f12, f14, f15);
        double d2 = Math.floor(f12);
        d2 = Math.max(1.0, d2);
        n14 = (int)d2;
        f16 = f14 / f15;
        double d5 = Math.ceil(f16);
        int n16 = (int)d5 - n14 + n15;
        int[] nArray4 = new int[n16];
        for (int i3 = 0; i3 < n16; ++i3) {
            int n17;
            nArray4[i3] = n17 = n14 + i3;
        }
        n14 = carousel.getCarouselAlignment();
        if (n14 == n15) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        if (n3 != 0) {
            object = CarouselStrategy.doubleCounts(nArray2);
            nArray = object;
        } else {
            nArray = nArray2;
        }
        object = n3 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS;
        int[] nArray5 = object;
        f12 = f14;
        f16 = f7;
        int[] nArray6 = nArray4;
        object = Arrangement.findLowestCostArrangement(f14, f7, f8, f11, nArray, f17, object, f15, nArray4);
        int n18 = object.getItemCount();
        HeroCarouselStrategy heroCarouselStrategy = this;
        this.keylineCount = n18;
        int n19 = object.getItemCount();
        n15 = carousel.getItemCount();
        if (n19 <= n15) {
            n7 = n3;
            f8 = f5;
            return CarouselStrategyHelper.createKeylineState(view.getContext(), f6, f14, (Arrangement)object, n7);
        }
        nArray5 = MEDIUM_COUNTS;
        nArray = nArray2;
        int[] nArray7 = nArray6;
        object = Arrangement.findLowestCostArrangement(f14, f7, f8, f11, nArray2, f17, nArray5, f15, nArray6);
        n7 = 0;
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f6, f14, (Arrangement)object, n7);
    }

    public boolean shouldRefreshKeylineState(Carousel carousel, int n3) {
        int n4;
        int n7;
        int n8;
        int n10 = carousel.getCarouselAlignment();
        if (n10 != (n8 = 1) || (n3 >= (n10 = this.keylineCount) || (n10 = carousel.getItemCount()) < (n7 = this.keylineCount)) && (n3 < (n10 = this.keylineCount) || (n4 = carousel.getItemCount()) >= (n3 = this.keylineCount))) {
            n8 = 0;
        }
        return n8 != 0;
    }
}

