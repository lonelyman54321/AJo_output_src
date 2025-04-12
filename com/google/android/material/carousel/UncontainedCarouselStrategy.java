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
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.google.android.material.carousel.Carousel;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.CarouselStrategyHelper;
import com.google.android.material.carousel.KeylineState;
import com.google.android.material.carousel.KeylineState$Builder;

public final class UncontainedCarouselStrategy
extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    private float calculateMediumChildSize(float f5, float f6, float f7) {
        float f8;
        float f11 = (f5 = Math.max(1.5f * f7, f5)) - (f8 = 0.85f * f6);
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object > 0) {
            f5 = Math.max(f8, f7 *= 1.2f);
        }
        return Math.min(f6, f5);
    }

    private KeylineState createCenterAlignedKeylineState(float f5, float f6, float f7, int n3, float f8, float f11, float f12) {
        float f14 = f6;
        float f15 = f11;
        float f16 = Math.min(f11, f7);
        float f17 = CarouselStrategy.getChildMaskPercentage(f16, f7, f6);
        float f18 = CarouselStrategy.getChildMaskPercentage(f8, f7, f6);
        f14 = f12 + 0.0f;
        f15 = 2.0f;
        float f19 = f8 / f15;
        float f20 = (f14 -= f19) + f19;
        float f22 = f14 - f19;
        float f23 = f16 / f15;
        f15 = f7 / f15 + f20;
        int bl2 = n3;
        float f24 = (float)n3 * f7 + f20;
        KeylineState$Builder keylineState$Builder = new KeylineState$Builder(f7, f5);
        KeylineState$Builder keylineState$Builder2 = keylineState$Builder.addAnchorKeyline(f22 -= f23, f17, f16).addKeyline(f14, f18, f8, false);
        boolean bl3 = true;
        keylineState$Builder2 = keylineState$Builder2.addKeylineRange(f15, 0.0f, f7, n3, bl3);
        f19 += f24;
        f24 += f8;
        keylineState$Builder2.addKeyline(f19, f18, f8, false);
        keylineState$Builder2.addAnchorKeyline(f24 += f23, f17, f16);
        return keylineState$Builder2.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f5, float f6, float f7, int n3, float f8, int n4, float f11) {
        float f12 = f5;
        float f14 = f11;
        float f15 = Math.min(f11, f7);
        f14 = 0.5f * f8;
        f14 = Math.max(f15, f14);
        float f16 = CarouselStrategy.getChildMaskPercentage(f14, f7, f5);
        float f17 = CarouselStrategy.getChildMaskPercentage(f15, f7, f5);
        float f18 = CarouselStrategy.getChildMaskPercentage(f8, f7, f5);
        float f19 = 2.0f;
        f12 = f14 / f19;
        f12 = 0.0f - f12;
        float f20 = f7 / f19;
        float f22 = (float)n3 * f7 + 0.0f;
        float f23 = f6;
        KeylineState$Builder keylineState$Builder = new KeylineState$Builder(f7, f6);
        KeylineState$Builder keylineState$Builder2 = keylineState$Builder.addAnchorKeyline(f12, f16, f14);
        boolean bl2 = true;
        f23 = Float.MIN_VALUE;
        f16 = 0.0f;
        f14 = f20;
        f20 = f23;
        keylineState$Builder2 = keylineState$Builder2.addKeylineRange(f14, 0.0f, f7, n3, bl2);
        if (n4 > 0) {
            f14 = f8 / f19 + f22;
            f22 += f8;
            f16 = 0.0f;
            keylineState$Builder2.addKeyline(f14, f18, f8, false);
        }
        f14 = CarouselStrategyHelper.getExtraSmallSize(context) / f19 + f22;
        keylineState$Builder2.addAnchorKeyline(f14, f17, f15);
        return keylineState$Builder2.build();
    }

    public boolean isContained() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int n3;
        float f5;
        float f6;
        int n4 = carousel.isHorizontal();
        n4 = n4 != 0 ? carousel.getContainerWidth() : carousel.getContainerHeight();
        float f7 = f6 = (float)n4;
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n7 = recyclerView$LayoutParams.topMargin;
        int n8 = recyclerView$LayoutParams.bottomMargin;
        float f8 = n7 += n8;
        n8 = view.getMeasuredHeight();
        float f11 = n8;
        boolean bl2 = carousel.isHorizontal();
        if (bl2) {
            n7 = recyclerView$LayoutParams.leftMargin;
            n4 = recyclerView$LayoutParams.rightMargin;
            f6 = n7 + n4;
            n7 = view.getMeasuredWidth();
            f11 = n7;
            f5 = f6;
        } else {
            f5 = f8;
        }
        float f12 = f11 + f5;
        recyclerView$LayoutParams = view.getContext();
        f6 = CarouselStrategyHelper.getExtraSmallSize((Context)recyclerView$LayoutParams) + f5;
        Context context = view.getContext();
        float f14 = CarouselStrategyHelper.getExtraSmallSize(context) + f5;
        double d2 = Math.floor(f7 / f12);
        n7 = (int)d2;
        n8 = 1;
        f11 = Float.MIN_VALUE;
        int n10 = Math.max(n8, n7);
        f8 = (float)n10 * f12;
        f8 = f7 - f8;
        int n14 = carousel.getCarouselAlignment();
        if (n14 == n8) {
            float f15 = f8 / 2.0f;
            float f16 = this.getSmallItemSizeMin() + f5;
            f16 = Math.max(Math.min(3.0f * f15, f12), f16);
            UncontainedCarouselStrategy uncontainedCarouselStrategy = this;
            f11 = f7;
            f7 = f12;
            float f17 = f14;
            return this.createCenterAlignedKeylineState(f11, f5, f12, n10, f16, f14, f15);
        }
        float f18 = 0.0f;
        carousel = null;
        float f19 = f8 - 0.0f;
        n14 = (int)(f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1));
        if (n14 > 0) {
            n3 = 1;
            float f20 = Float.MIN_VALUE;
        } else {
            n14 = 0;
            f18 = 0.0f;
            carousel = null;
            n3 = 0;
            float f22 = 0.0f;
        }
        float f23 = this.calculateMediumChildSize(f6, f12, f8);
        Context context2 = view.getContext();
        UncontainedCarouselStrategy uncontainedCarouselStrategy = this;
        return this.createLeftAlignedKeylineState(context2, f5, f7, f12, n10, f23, n3, f14);
    }
}

