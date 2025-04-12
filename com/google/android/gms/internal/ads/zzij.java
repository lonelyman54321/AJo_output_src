/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$CryptoInfo$Pattern
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.zzii;

final class zzij {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb;

    public /* synthetic */ zzij(MediaCodec.CryptoInfo cryptoInfo, zzii zzii2) {
        this.zza = cryptoInfo;
        cryptoInfo = ce0_0.a();
        this.zzb = cryptoInfo;
    }

    public static /* bridge */ /* synthetic */ void zza(zzij zzij2, int n3, int n4) {
        de0_0.a(zzij2.zzb, n3, n4);
        MediaCodec.CryptoInfo cryptoInfo = zzij2.zza;
        zzij2 = zzij2.zzb;
        Ee0.a(cryptoInfo, (MediaCodec.CryptoInfo.Pattern)zzij2);
    }
}

