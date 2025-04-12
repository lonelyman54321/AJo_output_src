/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;

final class KeylineState$Keyline {
    final float cutoff;
    final boolean isAnchor;
    final float leftOrTopPaddingShift;
    final float loc;
    final float locOffset;
    final float mask;
    final float maskedItemSize;
    final float rightOrBottomPaddingShift;

    public KeylineState$Keyline(float f5, float f6, float f7, float f8) {
        this(f5, f6, f7, f8, false, 0.0f, 0.0f, 0.0f);
    }

    public KeylineState$Keyline(float f5, float f6, float f7, float f8, boolean bl2, float f11, float f12, float f14) {
        this.loc = f5;
        this.locOffset = f6;
        this.mask = f7;
        this.maskedItemSize = f8;
        this.isAnchor = bl2;
        this.cutoff = f11;
        this.leftOrTopPaddingShift = f12;
        this.rightOrBottomPaddingShift = f14;
    }

    public static KeylineState$Keyline lerp(KeylineState$Keyline keylineState$Keyline, KeylineState$Keyline keylineState$Keyline2, float f5) {
        float f6 = keylineState$Keyline.loc;
        float f7 = keylineState$Keyline2.loc;
        f6 = AnimationUtils.lerp(f6, f7, f5);
        f7 = keylineState$Keyline.locOffset;
        float f8 = keylineState$Keyline2.locOffset;
        f7 = AnimationUtils.lerp(f7, f8, f5);
        f8 = keylineState$Keyline.mask;
        float f11 = keylineState$Keyline2.mask;
        f8 = AnimationUtils.lerp(f8, f11, f5);
        float f12 = keylineState$Keyline.maskedItemSize;
        float f14 = keylineState$Keyline2.maskedItemSize;
        f12 = AnimationUtils.lerp(f12, f14, f5);
        KeylineState$Keyline keylineState$Keyline3 = new KeylineState$Keyline(f6, f7, f8, f12);
        return keylineState$Keyline3;
    }
}

