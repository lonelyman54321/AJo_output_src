/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CryptoInfo
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

final class zzte {
    public int zza;
    public int zzb;
    public int zzc;
    public final MediaCodec.CryptoInfo zzd;
    public long zze;
    public int zzf;

    public zzte() {
        MediaCodec.CryptoInfo cryptoInfo;
        this.zzd = cryptoInfo = new MediaCodec.CryptoInfo();
    }

    public final void zza(int n3, int n4, int n7, long l2, int n8) {
        this.zza = n3;
        this.zzb = 0;
        this.zzc = n7;
        this.zze = l2;
        this.zzf = n8;
    }
}

