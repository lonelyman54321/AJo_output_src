/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.VideoOptions;

public final class VideoOptions$Builder {
    private boolean zza = true;
    private boolean zzb = false;
    private boolean zzc = false;

    public static /* bridge */ /* synthetic */ boolean zza(VideoOptions$Builder videoOptions$Builder) {
        return videoOptions$Builder.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzb(VideoOptions$Builder videoOptions$Builder) {
        return videoOptions$Builder.zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzc(VideoOptions$Builder videoOptions$Builder) {
        return videoOptions$Builder.zza;
    }

    public VideoOptions build() {
        VideoOptions videoOptions = new VideoOptions(this, null);
        return videoOptions;
    }

    public VideoOptions$Builder setClickToExpandRequested(boolean bl2) {
        this.zzc = bl2;
        return this;
    }

    public VideoOptions$Builder setCustomControlsRequested(boolean bl2) {
        this.zzb = bl2;
        return this;
    }

    public VideoOptions$Builder setStartMuted(boolean bl2) {
        this.zza = bl2;
        return this;
    }
}

