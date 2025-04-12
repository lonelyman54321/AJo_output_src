/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView$ScaleType
 */
package com.ril.ajio.customviews.widgets;

import android.widget.ImageView;

class LandingCircularImageView$1 {
    static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ImageView.ScaleType scaleType;
        int n7 = ImageView.ScaleType.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$android$widget$ImageView$ScaleType = nArray;
        try {
            scaleType = ImageView.ScaleType.CENTER_CROP;
            n4 = scaleType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$android$widget$ImageView$ScaleType;
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
            n4 = scaleType.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

