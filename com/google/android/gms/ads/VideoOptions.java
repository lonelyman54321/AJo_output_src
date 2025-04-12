/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.VideoOptions$Builder;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.zzi;

public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ VideoOptions(VideoOptions$Builder videoOptions$Builder, zzi zzi2) {
        boolean bl2;
        boolean bl3;
        this.zza = bl3 = VideoOptions$Builder.zzc(videoOptions$Builder);
        this.zzb = bl3 = VideoOptions$Builder.zzb(videoOptions$Builder);
        this.zzc = bl2 = VideoOptions$Builder.zza(videoOptions$Builder);
    }

    public VideoOptions(zzfk zzfk2) {
        boolean bl2;
        boolean bl3;
        this.zza = bl3 = zzfk2.zza;
        this.zzb = bl3 = zzfk2.zzb;
        this.zzc = bl2 = zzfk2.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}

