/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks;
import com.google.android.gms.ads.internal.client.zzds;

public final class zzfj
extends zzds {
    private final VideoController$VideoLifecycleCallbacks zza;

    public zzfj(VideoController$VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks) {
        this.zza = videoController$VideoLifecycleCallbacks;
    }

    public final void zze() {
        this.zza.onVideoEnd();
    }

    public final void zzf(boolean bl2) {
        this.zza.onVideoMute(bl2);
    }

    public final void zzg() {
        this.zza.onVideoPause();
    }

    public final void zzh() {
        this.zza.onVideoPlay();
    }

    public final void zzi() {
        this.zza.onVideoStart();
    }
}

