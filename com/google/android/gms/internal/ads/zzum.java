/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zztn;

final class zzum
implements zztn {
    private final MediaCodec zza;

    public zzum(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    public final void zzb() {
    }

    public final void zzc() {
    }

    public final void zzd(int n3, int n4, int n7, long l2, int n8) {
        this.zza.queueInputBuffer(n3, 0, n7, l2, n8);
    }

    public final void zze(int n3, int n4, zzik zzik2, long l2, int n7) {
        MediaCodec.CryptoInfo cryptoInfo = zzik2.zza();
        this.zza.queueSecureInputBuffer(n3, 0, cryptoInfo, l2, 0);
    }

    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    public final void zzg() {
    }

    public final void zzh() {
    }
}

