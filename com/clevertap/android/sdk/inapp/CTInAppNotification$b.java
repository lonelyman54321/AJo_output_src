/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inapp;

public final class CTInAppNotification$b {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ei_1 ei_12;
        int n7 = ei_1.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            ei_12 = ei_1.CTInAppTypeFooter;
            n4 = ei_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            ei_12 = ei_1.CTInAppTypeHeader;
            n4 = ei_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            ei_12 = ei_1.CTInAppTypeCover;
            n4 = ei_12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            ei_12 = ei_1.CTInAppTypeHalfInterstitial;
            n4 = ei_12.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            ei_12 = ei_1.CTInAppTypeCoverImageOnly;
            n4 = ei_12.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            ei_12 = ei_1.CTInAppTypeHalfInterstitialImageOnly;
            n4 = ei_12.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            ei_12 = ei_1.CTInAppTypeInterstitialImageOnly;
            n4 = ei_12.ordinal();
            nArray[n4] = n3 = 7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

