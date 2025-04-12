/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTimestamp
 *  android.media.AudioTrack
 */
package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class zzqw {
    private final AudioTrack zza;
    private final AudioTimestamp zzb;
    private long zzc;
    private long zzd;
    private long zze;

    public zzqw(AudioTrack audioTrack) {
        this.zza = audioTrack;
        this.zzb = audioTrack;
    }

    public final long zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzb.nanoTime / 1000L;
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zza;
        AudioTimestamp audioTimestamp = this.zzb;
        boolean bl2 = audioTrack.getTimestamp(audioTimestamp);
        if (bl2) {
            audioTimestamp = this.zzb;
            long l2 = this.zzd;
            long l3 = audioTimestamp.framePosition;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object > 0) {
                l2 = this.zzc;
                long l7 = 1L;
                this.zzc = l2 += l7;
            }
            this.zzd = l3;
            l2 = this.zzc;
            object = 32;
            this.zze = l3 += (l2 <<= object);
        }
        return bl2;
    }
}

