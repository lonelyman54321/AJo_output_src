/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;

public final class NativeAdOptions$Builder {
    private boolean zza = false;
    private int zzb = 0;
    private boolean zzc = false;
    private VideoOptions zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;

    public NativeAdOptions$Builder() {
        int n3;
        this.zze = n3 = 1;
        this.zzf = false;
        this.zzg = false;
        this.zzh = 0;
        this.zzi = n3;
    }

    public static /* bridge */ /* synthetic */ int zza(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zze;
    }

    public static /* bridge */ /* synthetic */ int zzb(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzh;
    }

    public static /* bridge */ /* synthetic */ int zzc(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzb;
    }

    public static /* bridge */ /* synthetic */ VideoOptions zzd(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzd;
    }

    public static /* bridge */ /* synthetic */ boolean zze(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zza;
    }

    public static /* bridge */ /* synthetic */ boolean zzh(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzf;
    }

    public static /* bridge */ /* synthetic */ int zzj(NativeAdOptions$Builder nativeAdOptions$Builder) {
        return nativeAdOptions$Builder.zzi;
    }

    public NativeAdOptions build() {
        NativeAdOptions nativeAdOptions = new NativeAdOptions(this, null);
        return nativeAdOptions;
    }

    public NativeAdOptions$Builder enableCustomClickGestureDirection(int n3, boolean bl2) {
        this.zzg = bl2;
        this.zzh = n3;
        return this;
    }

    public NativeAdOptions$Builder setAdChoicesPlacement(int n3) {
        this.zze = n3;
        return this;
    }

    public NativeAdOptions$Builder setMediaAspectRatio(int n3) {
        this.zzb = n3;
        return this;
    }

    public NativeAdOptions$Builder setRequestCustomMuteThisAd(boolean bl2) {
        this.zzf = bl2;
        return this;
    }

    public NativeAdOptions$Builder setRequestMultipleImages(boolean bl2) {
        this.zzc = bl2;
        return this;
    }

    public NativeAdOptions$Builder setReturnUrlsForImageAssets(boolean bl2) {
        this.zza = bl2;
        return this;
    }

    public NativeAdOptions$Builder setVideoOptions(VideoOptions videoOptions) {
        this.zzd = videoOptions;
        return this;
    }

    public final NativeAdOptions$Builder zzi(int n3) {
        this.zzi = n3;
        return this;
    }
}

