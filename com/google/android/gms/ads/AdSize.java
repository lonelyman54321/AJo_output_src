/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;

public final class AdSize {
    public static final int AUTO_HEIGHT = 254;
    public static final AdSize BANNER;
    public static final AdSize FLUID;
    public static final AdSize FULL_BANNER;
    public static final int FULL_WIDTH = 255;
    public static final AdSize INVALID;
    public static final AdSize LARGE_BANNER;
    public static final AdSize LEADERBOARD;
    public static final AdSize MEDIUM_RECTANGLE;
    public static final AdSize SEARCH;
    public static final AdSize SMART_BANNER;
    public static final AdSize WIDE_SKYSCRAPER;
    public static final AdSize zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    static {
        AdSize adSize;
        int n3 = 320;
        int n4 = 50;
        BANNER = adSize = new AdSize(n3, n4, "320x50_mb");
        FULL_BANNER = adSize = new AdSize(468, 60, "468x60_as");
        LARGE_BANNER = adSize = new AdSize(n3, 100, "320x100_as");
        LEADERBOARD = adSize = new AdSize(728, 90, "728x90_as");
        MEDIUM_RECTANGLE = adSize = new AdSize(300, 250, "300x250_as");
        WIDE_SKYSCRAPER = adSize = new AdSize(160, 600, "160x600_as");
        SMART_BANNER = adSize = new AdSize(-1, -2, "smart_banner");
        int n7 = -3;
        FLUID = adSize = new AdSize(n7, -4, "fluid");
        INVALID = adSize = new AdSize(0, 0, "invalid");
        zza = adSize = new AdSize(n4, n4, "50x50_mb");
        SEARCH = adSize = new AdSize(n7, 0, "search_v2");
    }

    public AdSize(int n3, int n4) {
        int n7 = -1;
        String string2 = n3 == n7 ? "FULL" : String.valueOf(n3);
        int n8 = -2;
        String string3 = n4 == n8 ? "AUTO" : String.valueOf(n4);
        string2 = y02.a(string2, "x", string3, "_as");
        this(n3, n4, string2);
    }

    public AdSize(int n3, int n4, String string2) {
        int n7;
        if (n3 < 0 && n3 != (n7 = -1) && n3 != (n7 = -3)) {
            String string3 = hj0_0.a(n3, "Invalid width for AdSize: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        if (n4 < 0 && n4 != (n7 = -2) && n4 != (n7 = -4)) {
            String string4 = hj0_0.a(n4, "Invalid height for AdSize: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
            throw illegalArgumentException;
        }
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = string2;
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context object, int n3) {
        object = com.google.android.gms.ads.internal.util.client.zzf.zzd(object, n3, 50, 0);
        object.zze = true;
        return object;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int n3) {
        int n4;
        int n7 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (n7 == (n4 = -1)) {
            return INVALID;
        }
        AdSize adSize = new AdSize(n3, 0);
        adSize.zzg = n7;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int n3) {
        int n4 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        return AdSize.zzj(n3, n4);
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int n3, int n4) {
        String string2 = null;
        AdSize adSize = new AdSize(n3, 0);
        adSize.zzg = n4;
        adSize.zzf = true;
        n3 = 32;
        if (n4 < n3) {
            string2 = "The maximum height set for the inline adaptive ad size was ";
            CharSequence charSequence = new StringBuilder(string2);
            charSequence.append(n4);
            String string3 = " dp, which is below the minimum recommended value of 32 dp.";
            charSequence.append(string3);
            charSequence = charSequence.toString();
            zzm.zzj((String)charSequence);
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context object, int n3) {
        object = com.google.android.gms.ads.internal.util.client.zzf.zzd(object, n3, 50, 2);
        object.zze = true;
        return object;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int n3) {
        int n4 = 2;
        int n7 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, n4);
        AdSize adSize = new AdSize(n3, 0);
        n3 = -1;
        if (n7 == n3) {
            return INVALID;
        }
        adSize.zzg = n7;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context, int n3) {
        int n4 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        return AdSize.zzj(n3, n4);
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context object, int n3) {
        int n4 = 1;
        object = com.google.android.gms.ads.internal.util.client.zzf.zzd(object, n3, 50, n4);
        object.zze = n4;
        return object;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int n3) {
        int n4 = 1;
        int n7 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, n4);
        AdSize adSize = new AdSize(n3, 0);
        n3 = -1;
        if (n7 == n3) {
            return INVALID;
        }
        adSize.zzg = n7;
        adSize.zzf = n4;
        return adSize;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context, int n3) {
        int n4 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        return AdSize.zzj(n3, n4);
    }

    private static AdSize zzj(int n3, int n4) {
        int n7 = -1;
        if (n4 == n7) {
            return INVALID;
        }
        AdSize adSize = new AdSize(n3, 0);
        adSize.zzi = n4;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(Object object) {
        String string2;
        boolean bl2;
        if (object == null) {
            return false;
        }
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        int n3 = object instanceof AdSize;
        if (n3 == 0) {
            return false;
        }
        object = (AdSize)object;
        n3 = this.zzb;
        int n4 = ((AdSize)object).zzb;
        if (n3 == n4 && (n3 = this.zzc) == (n4 = ((AdSize)object).zzc) && (bl2 = (string2 = this.zzd).equals(object = ((AdSize)object).zzd))) {
            return bl3;
        }
        return false;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int n3 = this.zzc;
        int n4 = -4;
        if (n3 != n4 && n3 != (n4 = -3)) {
            n4 = -2;
            if (n3 != n4) {
                zzay.zzb();
                return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, n3);
            }
            return zzq.zza(context.getResources().getDisplayMetrics());
        }
        return -1;
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int n3 = this.zzb;
        int n4 = -3;
        int n7 = -1;
        if (n3 != n4) {
            if (n3 != n7) {
                zzay.zzb();
                return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, n3);
            }
            context = context.getResources().getDisplayMetrics();
            return context.widthPixels;
        }
        return n7;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        int n3 = this.zzc;
        int n4 = -2;
        return n3 == n4;
    }

    public boolean isFluid() {
        int n3 = this.zzb;
        int n4 = -3;
        return n3 == n4 && (n3 = this.zzc) == (n4 = -4);
    }

    public boolean isFullWidth() {
        int n3 = this.zzb;
        int n4 = -1;
        return n3 == n4;
    }

    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int n3) {
        this.zzg = n3;
    }

    public final void zzd(int n3) {
        this.zzi = n3;
    }

    public final void zze(boolean bl2) {
        this.zzf = true;
    }

    public final void zzf(boolean bl2) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }
}

