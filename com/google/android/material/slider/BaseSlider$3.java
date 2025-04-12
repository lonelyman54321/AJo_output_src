/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.slider;

import com.google.android.material.slider.BaseSlider$FullCornerDirection;

class BaseSlider$3 {
    static final /* synthetic */ int[] $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection;
        int n7 = BaseSlider$FullCornerDirection.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection = nArray;
        try {
            baseSlider$FullCornerDirection = BaseSlider$FullCornerDirection.NONE;
            n4 = baseSlider$FullCornerDirection.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;
            baseSlider$FullCornerDirection = BaseSlider$FullCornerDirection.LEFT;
            n4 = baseSlider$FullCornerDirection.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;
            baseSlider$FullCornerDirection = BaseSlider$FullCornerDirection.RIGHT;
            n4 = baseSlider$FullCornerDirection.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;
            baseSlider$FullCornerDirection = BaseSlider$FullCornerDirection.BOTH;
            n4 = baseSlider$FullCornerDirection.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

