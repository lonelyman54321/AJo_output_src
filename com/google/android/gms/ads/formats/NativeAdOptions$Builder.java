/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;

public final class NativeAdOptions$Builder {
    private boolean zza = false;
    private int zzb = -1;
    private int zzc = 0;
    private boolean zzd = false;
    private VideoOptions zze;
    private int zzf = 1;
    private boolean zzg = false;

    public static /* bridge */ /* synthetic */ int zza(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzf;
    }

    public static /* bridge */ /* synthetic */ int zzb(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzb;
    }

    public static /* bridge */ /* synthetic */ int zzc(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzc;
    }

    public static /* bridge */ /* synthetic */ VideoOptions zzd(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zze;
    }

    public static /* bridge */ /* synthetic */ boolean zze(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzd;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zza;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzg;
    }

    public NativeAdOptions build() {
        NativeAdOptions nativeAdOptions = new NativeAdOptions(this, null);
        return nativeAdOptions;
    }

    public NativeAdOptions$Builder setAdChoicesPlacement(int n3) {
        this.zzf = n3;
        return this;
    }

    public NativeAdOptions$Builder setImageOrientation(int n3) {
        this.zzb = n3;
        return this;
    }

    public NativeAdOptions$Builder setMediaAspectRatio(int n3) {
        this.zzc = n3;
        return this;
    }

    public NativeAdOptions$Builder setRequestCustomMuteThisAd(boolean bl2) {
        this.zzg = bl2;
        return this;
    }

    public NativeAdOptions$Builder setRequestMultipleImages(boolean bl2) {
        this.zzd = bl2;
        return this;
    }

    public NativeAdOptions$Builder setReturnUrlsForImageAssets(boolean bl2) {
        this.zza = bl2;
        return this;
    }

    public NativeAdOptions$Builder setVideoOptions(VideoOptions videoOptions) {
        this.zze = videoOptions;
        return this;
    }
}

