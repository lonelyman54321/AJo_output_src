/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.pushtemplates;

public final class PushTemplateReceiver$b {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        vj3_2 vj3_22;
        int n7 = vj3_2.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            vj3_22 = vj3_2.RATING;
            n4 = vj3_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            vj3_22 = vj3_2.FIVE_ICONS;
            n4 = vj3_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            vj3_22 = vj3_2.PRODUCT_DISPLAY;
            n4 = vj3_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            vj3_22 = vj3_2.INPUT_BOX;
            n4 = vj3_22.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            vj3_22 = vj3_2.MANUAL_CAROUSEL;
            n4 = vj3_22.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

