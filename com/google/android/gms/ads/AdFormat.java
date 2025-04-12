/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

public final class AdFormat
extends Enum {
    public static final /* enum */ AdFormat APP_OPEN_AD;
    public static final /* enum */ AdFormat BANNER;
    public static final /* enum */ AdFormat INTERSTITIAL;
    public static final /* enum */ AdFormat NATIVE;
    public static final /* enum */ AdFormat REWARDED;
    public static final /* enum */ AdFormat REWARDED_INTERSTITIAL;
    private static final /* synthetic */ AdFormat[] zza;
    private final int zzb;

    static {
        AdFormat adFormat;
        AdFormat adFormat2;
        AdFormat adFormat3;
        AdFormat adFormat4;
        AdFormat adFormat5;
        AdFormat adFormat6;
        BANNER = adFormat6 = new AdFormat("BANNER", 0, 0);
        int n3 = 1;
        INTERSTITIAL = adFormat5 = new AdFormat("INTERSTITIAL", n3, n3);
        int n4 = 2;
        REWARDED = adFormat4 = new AdFormat("REWARDED", n4, n4);
        int n7 = 3;
        REWARDED_INTERSTITIAL = adFormat3 = new AdFormat("REWARDED_INTERSTITIAL", n7, n7);
        int n8 = 4;
        NATIVE = adFormat2 = new AdFormat("NATIVE", n8, n8);
        int n10 = 5;
        int n14 = 6;
        APP_OPEN_AD = adFormat = new AdFormat("APP_OPEN_AD", n10, n14);
        AdFormat[] adFormatArray = new AdFormat[n14];
        adFormatArray[0] = adFormat6;
        adFormatArray[n3] = adFormat5;
        adFormatArray[n4] = adFormat4;
        adFormatArray[n7] = adFormat3;
        adFormatArray[n8] = adFormat2;
        adFormatArray[n10] = adFormat;
        zza = adFormatArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AdFormat() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static AdFormat valueOf(String string2) {
        return Enum.valueOf(AdFormat.class, string2);
    }

    public static AdFormat[] values() {
        return (AdFormat[])zza.clone();
    }

    public int getValue() {
        return this.zzb;
    }
}

