/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inapp;

public final class InAppController$c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        int n4;
        Enum enum_;
        int n7;
        Object object2;
        int n8;
        Object object3;
        int n10;
        Object object4;
        int n14 = ei_1.values().length;
        int[] nArray = new int[n14];
        b = nArray;
        int n15 = 1;
        try {
            object4 = ei_1.CTInAppTypeCoverHTML;
            n10 = object4.ordinal();
            nArray[n10] = n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n14 = 2;
        try {
            object4 = b;
            object3 = ei_1.CTInAppTypeInterstitialHTML;
            n8 = object3.ordinal();
            object4[n8] = (ei_1)n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 3;
        try {
            object3 = b;
            object2 = ei_1.CTInAppTypeHalfInterstitialHTML;
            n7 = ((Enum)object2).ordinal();
            object3[n7] = (ei_1)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 4;
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeCover;
            n4 = enum_.ordinal();
            object2[n4] = (ei_1)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeHalfInterstitial;
            n4 = enum_.ordinal();
            n3 = 5;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeInterstitial;
            n4 = enum_.ordinal();
            n3 = 6;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeAlert;
            n4 = enum_.ordinal();
            n3 = 7;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeInterstitialImageOnly;
            n4 = enum_.ordinal();
            n3 = 8;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeHalfInterstitialImageOnly;
            n4 = enum_.ordinal();
            n3 = 9;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeCoverImageOnly;
            n4 = enum_.ordinal();
            n3 = 10;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeFooterHTML;
            n4 = enum_.ordinal();
            n3 = 11;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeHeaderHTML;
            n4 = enum_.ordinal();
            n3 = 12;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeFooter;
            n4 = enum_.ordinal();
            n3 = 13;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeHeader;
            n4 = enum_.ordinal();
            n3 = 14;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = ei_1.CTInAppTypeCustomCodeTemplate;
            n4 = enum_.ordinal();
            n3 = 15;
            object2[n4] = (ei_1)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = xf1_1.values().length;
        object2 = new int[n7];
        a = (int[])object2;
        try {
            enum_ = xf1_1.CUSTOM_CODE;
            n4 = enum_.ordinal();
            object2[n4] = (ei_1)n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = xf1_1.CLOSE;
            n7 = ((Enum)object2).ordinal();
            object[n7] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = (Object)xf1_1.OPEN_URL;
            n15 = ((Enum)object).ordinal();
            nArray[n15] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = xf1_1.KEY_VALUES;
            n15 = ((Enum)object).ordinal();
            nArray[n15] = n8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

