/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.R$dimen;
import com.google.android.material.carousel.Arrangement;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import com.google.android.material.carousel.KeylineState$Builder;

final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    public static float addEnd(float f5, float f6, int n3) {
        return (float)Math.max(0, n3 += -1) * f6 + f5;
    }

    public static float addStart(float f5, float f6, int n3) {
        if (n3 > 0) {
            return f6 / 2.0f + f5;
        }
        return f5;
    }

    public static KeylineState createCenterAlignedKeylineState(Context context, float f5, float f6, Arrangement arrangement) {
        double d2;
        float f7;
        float f8 = f5;
        Arrangement arrangement2 = arrangement;
        float f11 = CarouselStrategyHelper.getExtraSmallSize(context) + f5;
        float f12 = arrangement.largeSize;
        f11 = Math.min(f11, f12);
        int n3 = 0x40000000;
        f12 = 2.0f;
        float f14 = f11 / f12;
        float f15 = 0.0f - f14;
        float f16 = arrangement.smallSize;
        int n4 = arrangement.smallCount;
        f16 = CarouselStrategyHelper.addStart(0.0f, f16, n4);
        float f17 = arrangement.smallSize;
        double d5 = Math.floor((float)arrangement.smallCount / f12);
        int n7 = (int)d5;
        f17 = CarouselStrategyHelper.addEnd(f16, f17, n7);
        float f18 = arrangement.smallSize;
        int n8 = arrangement.smallCount;
        float f19 = CarouselStrategyHelper.updateCurPosition(0.0f, f17, f18, n8);
        f17 = arrangement.mediumSize;
        n7 = arrangement.mediumCount;
        f17 = CarouselStrategyHelper.addStart(f19, f17, n7);
        f18 = arrangement.mediumSize;
        double d7 = Math.floor((float)arrangement.mediumCount / f12);
        n8 = (int)d7;
        f18 = CarouselStrategyHelper.addEnd(f17, f18, n8);
        float f20 = arrangement.mediumSize;
        int n10 = arrangement.mediumCount;
        f19 = CarouselStrategyHelper.updateCurPosition(f19, f18, f20, n10);
        f18 = arrangement.largeSize;
        n8 = arrangement.largeCount;
        float f22 = CarouselStrategyHelper.addStart(f19, f18, n8);
        f18 = arrangement.largeSize;
        n8 = arrangement.largeCount;
        f18 = CarouselStrategyHelper.addEnd(f22, f18, n8);
        f20 = arrangement.largeSize;
        n10 = arrangement.largeCount;
        f19 = CarouselStrategyHelper.updateCurPosition(f19, f18, f20, n10);
        f18 = arrangement.mediumSize;
        n8 = arrangement.mediumCount;
        f18 = CarouselStrategyHelper.addStart(f19, f18, n8);
        f20 = arrangement.mediumSize;
        double d9 = Math.ceil((float)arrangement.mediumCount / f12);
        n10 = (int)d9;
        f20 = CarouselStrategyHelper.addEnd(f18, f20, n10);
        float f23 = arrangement.mediumSize;
        int n14 = arrangement.mediumCount;
        f19 = CarouselStrategyHelper.updateCurPosition(f19, f20, f23, n14);
        f20 = arrangement.smallSize;
        n10 = arrangement.smallCount;
        f19 = CarouselStrategyHelper.addStart(f19, f20, n10);
        f14 += f6;
        f20 = arrangement.largeSize;
        f20 = CarouselStrategy.getChildMaskPercentage(f11, f20, f5);
        f23 = arrangement.smallSize;
        float f24 = arrangement.largeSize;
        float f25 = CarouselStrategy.getChildMaskPercentage(f23, f24, f5);
        f23 = arrangement.mediumSize;
        f24 = arrangement.largeSize;
        f8 = CarouselStrategy.getChildMaskPercentage(f23, f24, f5);
        f24 = arrangement.largeSize;
        KeylineState$Builder keylineState$Builder = new KeylineState$Builder(f24, f6);
        KeylineState$Builder keylineState$Builder2 = keylineState$Builder.addAnchorKeyline(f15, f20, f11);
        int n15 = arrangement.smallCount;
        if (n15 > 0) {
            f23 = arrangement.smallSize;
            f15 = (float)n15 / f12;
            f7 = f14;
            d2 = Math.floor(f15);
            n3 = (int)d2;
            keylineState$Builder2.addKeylineRange(f16, f25, f23, n3);
        } else {
            f7 = f14;
        }
        n3 = arrangement2.mediumCount;
        if (n3 > 0) {
            f14 = arrangement2.mediumSize;
            f12 = n3;
            n15 = 0x40000000;
            f15 = 2.0f;
            double d12 = Math.floor(f12 /= f15);
            n3 = (int)d12;
            keylineState$Builder2.addKeylineRange(f17, f8, f14, n3);
        }
        f12 = arrangement2.largeSize;
        int n16 = arrangement2.largeCount;
        boolean bl2 = true;
        n14 = 0;
        f24 = 0.0f;
        keylineState$Builder = keylineState$Builder2;
        f15 = f25;
        f25 = f12;
        keylineState$Builder2.addKeylineRange(f22, 0.0f, f12, n16, bl2);
        n3 = arrangement2.mediumCount;
        if (n3 > 0) {
            f14 = arrangement2.mediumSize;
            f12 = n3;
            f16 = 2.0f;
            double d13 = Math.ceil(f12 /= f16);
            n3 = (int)d13;
            keylineState$Builder2.addKeylineRange(f18, f8, f14, n3);
        } else {
            f16 = 2.0f;
        }
        int n17 = arrangement2.smallCount;
        if (n17 > 0) {
            float f26 = arrangement2.smallSize;
            f8 = (float)n17 / f16;
            d2 = Math.ceil(f8);
            n17 = (int)d2;
            keylineState$Builder2.addKeylineRange(f19, f15, f26, n17);
        }
        f8 = f7;
        keylineState$Builder2.addAnchorKeyline(f7, f20, f11);
        return keylineState$Builder2.build();
    }

    public static KeylineState createKeylineState(Context context, float f5, float f6, Arrangement arrangement, int n3) {
        int n4 = 1;
        if (n3 == n4) {
            return CarouselStrategyHelper.createCenterAlignedKeylineState(context, f5, f6, arrangement);
        }
        return CarouselStrategyHelper.createLeftAlignedKeylineState(context, f5, f6, arrangement);
    }

    public static KeylineState createLeftAlignedKeylineState(Context context, float f5, float f6, Arrangement arrangement) {
        int n3;
        float f7 = CarouselStrategyHelper.getExtraSmallSize(context) + f5;
        float f8 = arrangement.largeSize;
        f7 = Math.min(f7, f8);
        f8 = f7 / 2.0f;
        float f11 = 0.0f - f8;
        float f12 = arrangement.largeSize;
        int n4 = arrangement.largeCount;
        float f14 = CarouselStrategyHelper.addStart(0.0f, f12, n4);
        f12 = arrangement.largeSize;
        n4 = arrangement.largeCount;
        f12 = CarouselStrategyHelper.addEnd(f14, f12, n4);
        float f15 = arrangement.largeSize;
        int n7 = arrangement.largeCount;
        float f16 = CarouselStrategyHelper.updateCurPosition(0.0f, f12, f15, n7);
        f12 = arrangement.mediumSize;
        n4 = arrangement.mediumCount;
        f12 = CarouselStrategyHelper.addStart(f16, f12, n4);
        f15 = arrangement.mediumSize;
        n7 = arrangement.mediumCount;
        f16 = CarouselStrategyHelper.updateCurPosition(f16, f12, f15, n7);
        f15 = arrangement.smallSize;
        n7 = arrangement.smallCount;
        f16 = CarouselStrategyHelper.addStart(f16, f15, n7);
        f8 += f6;
        f15 = arrangement.largeSize;
        f15 = CarouselStrategy.getChildMaskPercentage(f7, f15, f5);
        float f17 = arrangement.smallSize;
        float f18 = arrangement.largeSize;
        float f19 = CarouselStrategy.getChildMaskPercentage(f17, f18, f5);
        f17 = arrangement.mediumSize;
        f18 = arrangement.largeSize;
        f5 = CarouselStrategy.getChildMaskPercentage(f17, f18, f5);
        f18 = arrangement.largeSize;
        KeylineState$Builder keylineState$Builder = new KeylineState$Builder(f18, f6);
        keylineState$Builder = keylineState$Builder.addAnchorKeyline(f11, f15, f7);
        float f20 = arrangement.largeSize;
        int n8 = arrangement.largeCount;
        boolean bl2 = true;
        f18 = 0.0f;
        KeylineState$Builder keylineState$Builder2 = keylineState$Builder.addKeylineRange(f14, 0.0f, f20, n8, bl2);
        int n10 = arrangement.mediumCount;
        if (n10 > 0) {
            f11 = arrangement.mediumSize;
            keylineState$Builder2.addKeyline(f12, f5, f11);
        }
        if ((n3 = arrangement.smallCount) > 0) {
            float f22 = arrangement.smallSize;
            keylineState$Builder2.addKeylineRange(f16, f19, f22, n3);
        }
        keylineState$Builder2.addAnchorKeyline(f8, f15, f7);
        return keylineState$Builder2.build();
    }

    public static float getExtraSmallSize(Context context) {
        context = context.getResources();
        int n3 = R$dimen.m3_carousel_gone_size;
        return context.getDimension(n3);
    }

    public static float getSmallSizeMax(Context context) {
        context = context.getResources();
        int n3 = R$dimen.m3_carousel_small_item_size_max;
        return context.getDimension(n3);
    }

    public static float getSmallSizeMin(Context context) {
        context = context.getResources();
        int n3 = R$dimen.m3_carousel_small_item_size_min;
        return context.getDimension(n3);
    }

    public static int maxValue(int[] nArray) {
        int n3 = nArray.length;
        int n4 = -1 << -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = nArray[i3];
            if (n7 <= n4) continue;
            n4 = n7;
        }
        return n4;
    }

    public static float updateCurPosition(float f5, float f6, float f7, int n3) {
        if (n3 > 0) {
            return f7 / 2.0f + f6;
        }
        return f5;
    }
}

