/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CryptoInfo
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzij;

public final class zzik {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;
    private final zzij zzj;

    public zzik() {
        MediaCodec.CryptoInfo cryptoInfo;
        this.zzi = cryptoInfo = new MediaCodec.CryptoInfo();
        int n3 = zzgd.zza;
        int n4 = 24;
        zzij zzij2 = null;
        if (n3 >= n4) {
            zzij zzij3;
            zzij2 = zzij3 = new zzij(cryptoInfo, null);
        }
        this.zzj = zzij2;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzi;
    }

    public final void zzb(int n3) {
        int n4;
        if (n3 == 0) {
            return;
        }
        int[] nArray = this.zzd;
        if (nArray == null) {
            int n7 = 1;
            this.zzd = nArray = new int[n7];
            MediaCodec.CryptoInfo cryptoInfo = this.zzi;
            cryptoInfo.numBytesOfClearData = nArray;
        }
        nArray = this.zzd;
        nArray[0] = n4 = nArray[0] + n3;
    }

    public final void zzc(int n3, int[] nArray, int[] nArray2, byte[] byArray, byte[] byArray2, int n4, int n7, int n8) {
        this.zzf = n3;
        this.zzd = nArray;
        this.zze = nArray2;
        this.zzb = byArray;
        this.zza = byArray2;
        this.zzc = n4;
        this.zzg = n7;
        this.zzh = n8;
        MediaCodec.CryptoInfo cryptoInfo = this.zzi;
        cryptoInfo.numSubSamples = n3;
        cryptoInfo.numBytesOfClearData = nArray;
        cryptoInfo.numBytesOfEncryptedData = nArray2;
        cryptoInfo.key = byArray;
        cryptoInfo.iv = byArray2;
        cryptoInfo.mode = n4;
        n3 = zzgd.zza;
        int n10 = 24;
        if (n3 >= n10) {
            zzij zzij2 = this.zzj;
            zzij2.getClass();
            zzij.zza(zzij2, n7, n8);
        }
    }
}

