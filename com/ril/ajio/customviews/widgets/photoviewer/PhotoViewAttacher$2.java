/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView$ScaleType
 */
package com.ril.ajio.customviews.widgets.photoviewer;

import android.widget.ImageView;

class PhotoViewAttacher$2 {
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
            scaleType = ImageView.ScaleType.MATRIX;
            n4 = scaleType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$android$widget$ImageView$ScaleType;
            scaleType = ImageView.ScaleType.FIT_START;
            n4 = scaleType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$android$widget$ImageView$ScaleType;
            scaleType = ImageView.ScaleType.FIT_END;
            n4 = scaleType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$android$widget$ImageView$ScaleType;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            n4 = scaleType.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$android$widget$ImageView$ScaleType;
            scaleType = ImageView.ScaleType.FIT_XY;
            n4 = scaleType.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

