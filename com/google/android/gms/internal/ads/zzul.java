/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zztm;
import com.google.android.gms.internal.ads.zzuk;
import java.nio.ByteBuffer;

public final class zzul
implements zztm {
    private final MediaCodec zza;

    public /* synthetic */ zzul(MediaCodec mediaCodec, zzuk zzuk2) {
        this.zza = mediaCodec;
    }

    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int n3;
        int n4;
        do {
            long l2;
            MediaCodec mediaCodec;
            if ((n4 = (mediaCodec = this.zza).dequeueOutputBuffer(bufferInfo, l2 = 0L)) != (n3 = -3)) continue;
            n4 = zzgd.zza;
            n4 = -3;
        } while (n4 == n3);
        return n4;
    }

    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    public final ByteBuffer zzf(int n3) {
        return this.zza.getInputBuffer(n3);
    }

    public final ByteBuffer zzg(int n3) {
        return this.zza.getOutputBuffer(n3);
    }

    public final void zzi() {
        this.zza.flush();
    }

    public final void zzj(int n3, int n4, int n7, long l2, int n8) {
        this.zza.queueInputBuffer(n3, 0, n7, l2, n8);
    }

    public final void zzk(int n3, int n4, zzik zzik2, long l2, int n7) {
        MediaCodec.CryptoInfo cryptoInfo = zzik2.zza();
        this.zza.queueSecureInputBuffer(n3, 0, cryptoInfo, l2, 0);
    }

    public final void zzl() {
        this.zza.release();
    }

    public final void zzm(int n3, long l2) {
        this.zza.releaseOutputBuffer(n3, l2);
    }

    public final void zzn(int n3, boolean bl2) {
        this.zza.releaseOutputBuffer(n3, false);
    }

    public final void zzo(Surface surface) {
        Jq.a(this.zza, surface);
    }

    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    public final void zzq(int n3) {
        this.zza.setVideoScalingMode(n3);
    }
}

