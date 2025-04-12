/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions$Builder;
import com.google.android.gms.ads.formats.zzd;

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
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final int zze;
    private final VideoOptions zzf;
    private final boolean zzg;

    public /* synthetic */ NativeAdOptions(NativeAdOptions$Builder nativeAdOptions$Builder, zzd object) {
        boolean bl2;
        int n3;
        this.zza = n3 = NativeAdOptions$Builder.zzf(nativeAdOptions$Builder);
        this.zzb = n3 = NativeAdOptions$Builder.zzb(nativeAdOptions$Builder);
        this.zzc = n3 = NativeAdOptions$Builder.zzc(nativeAdOptions$Builder);
        n3 = (int)(NativeAdOptions$Builder.zze(nativeAdOptions$Builder) ? 1 : 0);
        this.zzd = n3;
        this.zze = n3 = NativeAdOptions$Builder.zza(nativeAdOptions$Builder);
        this.zzf = object = NativeAdOptions$Builder.zzd(nativeAdOptions$Builder);
        this.zzg = bl2 = NativeAdOptions$Builder.zzg(nativeAdOptions$Builder);
    }

    public int getAdChoicesPlacement() {
        return this.zze;
    }

    public int getImageOrientation() {
        return this.zzb;
    }

    public int getMediaAspectRatio() {
        return this.zzc;
    }

    public VideoOptions getVideoOptions() {
        return this.zzf;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzd;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zzg;
    }
}

