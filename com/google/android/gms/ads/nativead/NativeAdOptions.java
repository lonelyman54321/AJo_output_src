/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions$Builder;
import com.google.android.gms.ads.nativead.zza;

public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    private final boolean zza;
    private final int zzb;
    private final boolean zzc;
    private final int zzd;
    private final VideoOptions zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int zzh;
    private final int zzi;

    public /* synthetic */ NativeAdOptions(NativeAdOptions$Builder nativeAdOptions$Builder, zza object) {
        int n3;
        int n4;
        this.zza = n4 = NativeAdOptions$Builder.zzg(nativeAdOptions$Builder);
        this.zzb = n4 = NativeAdOptions$Builder.zzc(nativeAdOptions$Builder);
        n4 = (int)(NativeAdOptions$Builder.zzf(nativeAdOptions$Builder) ? 1 : 0);
        this.zzc = n4;
        this.zzd = n4 = NativeAdOptions$Builder.zza(nativeAdOptions$Builder);
        this.zze = object = NativeAdOptions$Builder.zzd(nativeAdOptions$Builder);
        n4 = (int)(NativeAdOptions$Builder.zzh(nativeAdOptions$Builder) ? 1 : 0);
        this.zzf = n4;
        n4 = (int)(NativeAdOptions$Builder.zze(nativeAdOptions$Builder) ? 1 : 0);
        this.zzg = n4;
        this.zzh = n4 = NativeAdOptions$Builder.zzb(nativeAdOptions$Builder);
        this.zzi = n3 = NativeAdOptions$Builder.zzj(nativeAdOptions$Builder);
    }

    public int getAdChoicesPlacement() {
        return this.zzd;
    }

    public int getMediaAspectRatio() {
        return this.zzb;
    }

    public VideoOptions getVideoOptions() {
        return this.zze;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzc;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final int zza() {
        return this.zzh;
    }

    public final boolean zzb() {
        return this.zzg;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzi;
    }
}

