/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.google.android.material.carousel.Arrangement;
import com.google.android.material.carousel.Carousel;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.CarouselStrategyHelper;
import com.google.android.material.carousel.KeylineState;

public final class MultiBrowseCarouselStrategy
extends CarouselStrategy {
    private static final int[] MEDIUM_COUNTS;
    private static final int[] SMALL_COUNTS;
    private int keylineCount = 0;

    static {
        int n3 = 1;
        SMALL_COUNTS = new int[]{n3};
        MEDIUM_COUNTS = new int[]{n3, 0};
    }

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int n3) {
        int n4;
        int n7 = arrangement.getItemCount() - n3;
        n3 = 1;
        n4 = n7 > 0 && ((n4 = arrangement.smallCount) > 0 || (n4 = arrangement.mediumCount) > n3) ? 1 : 0;
        while (n7 > 0) {
            int n8 = arrangement.smallCount;
            if (n8 > 0) {
                arrangement.smallCount = n8 += -1;
            } else {
                n8 = arrangement.mediumCount;
                if (n8 > n3) {
                    arrangement.mediumCount = n8 += -1;
                }
            }
            n7 += -1;
        }
        return n4 != 0;
    }

    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this;
        int n3 = carousel.getContainerHeight();
        float f5 = n3;
        int n4 = carousel.isHorizontal();
        if (n4 != 0) {
            n3 = carousel.getContainerWidth();
            f5 = n3;
        }
        Object object = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n7 = ((ViewGroup.MarginLayoutParams)object).topMargin;
        int n8 = ((ViewGroup.MarginLayoutParams)object).bottomMargin;
        float f6 = n7 += n8;
        n8 = view.getMeasuredHeight();
        float f7 = n8;
        int n10 = (int)(carousel.isHorizontal() ? 1 : 0);
        if (n10 != 0) {
            n7 = ((ViewGroup.MarginLayoutParams)object).leftMargin;
            n4 = ((ViewGroup.MarginLayoutParams)object).rightMargin;
            f6 = n7 += n4;
            n4 = view.getMeasuredWidth();
            f7 = n4;
        }
        float f8 = f6;
        float f11 = this.getSmallItemSizeMin() + f6;
        float f12 = Math.max(this.getSmallItemSizeMax() + f6, f11);
        float f14 = Math.min(f7 + f6, f5);
        n4 = 0x40400000;
        f7 = f7 / 3.0f + f6;
        float f15 = f11 + f6;
        f6 = f12 + f6;
        float f16 = PK1.a(f7, f15, f6);
        f15 = f14 + f16;
        f6 = 2.0f;
        float f17 = f15 / f6;
        object = SMALL_COUNTS;
        n8 = 0;
        f7 = 0.0f;
        n10 = 1;
        float f18 = f5 - (f6 *= f11);
        n7 = (int)(f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1));
        if (n7 < 0) {
            object = new int[n10];
            object[0] = (RecyclerView$LayoutParams)false;
        }
        Object object2 = MEDIUM_COUNTS;
        int n14 = carousel.getCarouselAlignment();
        if (n14 == n10) {
            object = CarouselStrategy.doubleCounts((int[])object);
            object2 = CarouselStrategy.doubleCounts(object2);
        }
        Object object3 = object;
        int[] nArray = object2;
        f15 = (float)CarouselStrategyHelper.maxValue(object2) * f17;
        f15 = f5 - f15;
        f6 = CarouselStrategyHelper.maxValue((int[])object);
        f15 = qy_1.a(f12, f6, f15, f14);
        double d2 = Math.floor(f15);
        d2 = Math.max(1.0, d2);
        n4 = (int)d2;
        f6 = f5 / f14;
        double d5 = Math.ceil(f6);
        n7 = (int)d5;
        n4 = n7 - n4 + n10;
        int[] nArray2 = new int[n4];
        while (n8 < n4) {
            nArray2[n8] = n10 = n7 - n8;
            ++n8;
        }
        f15 = f5;
        f6 = f16;
        f7 = f11;
        object = Arrangement.findLowestCostArrangement(f5, f16, f11, f12, (int[])object3, f17, nArray, f14, nArray2);
        multiBrowseCarouselStrategy.keylineCount = n7 = ((Arrangement)object).getItemCount();
        n7 = carousel.getItemCount();
        if ((n7 = (int)(multiBrowseCarouselStrategy.ensureArrangementFitsItemCount((Arrangement)object, n7) ? 1 : 0)) != 0) {
            n7 = ((Arrangement)object).smallCount;
            object3 = new int[]{n7};
            n7 = ((Arrangement)object).mediumCount;
            nArray = new int[]{n7};
            n4 = ((Arrangement)object).largeCount;
            nArray2 = new int[]{n4};
            object = Arrangement.findLowestCostArrangement(f5, f16, f11, f12, (int[])object3, f17, nArray, f14, nArray2);
        }
        object2 = view.getContext();
        n8 = carousel.getCarouselAlignment();
        return CarouselStrategyHelper.createKeylineState((Context)object2, f8, f5, (Arrangement)object, n8);
    }

    public boolean shouldRefreshKeylineState(Carousel carousel, int n3) {
        int n4;
        int n7;
        int n8 = this.keylineCount;
        if (n3 < n8 && (n8 = carousel.getItemCount()) >= (n7 = this.keylineCount) || n3 >= (n8 = this.keylineCount) && (n4 = carousel.getItemCount()) < (n3 = this.keylineCount)) {
            n4 = 1;
        } else {
            n4 = 0;
            carousel = null;
        }
        return n4 != 0;
    }
}

