/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhfa;

abstract class zzhao
extends zzhat {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzhao(int n3) {
        super(null);
        if (n3 >= 0) {
            byte[] byArray = new byte[Math.max(n3, 20)];
            this.zza = byArray;
            this.zzb = n3 = byArray.length;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("bufferSize must be >= 0");
        throw illegalArgumentException;
    }

    public final int zzb() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        throw unsupportedOperationException;
    }

    public final void zzc(byte by2) {
        int n3;
        int n4 = this.zzc;
        this.zzc = n3 = n4 + 1;
        this.zza[n4] = by2;
        by2 = (byte)(this.zzd + 1);
        this.zzd = by2;
    }

    public final void zzd(int n3) {
        byte by2;
        int n4;
        int n7 = this.zzc;
        this.zzc = n4 = n7 + 1;
        int n8 = n3 & 0xFF;
        byte[] byArray = this.zza;
        byArray[n7] = n8;
        this.zzc = n8 = n7 + 2;
        byArray[n4] = by2 = (byte)(n3 >> 8 & 0xFF);
        this.zzc = n4 = n7 + 3;
        byArray[n8] = by2 = (byte)(n3 >> 16 & 0xFF);
        this.zzc = n7 += 4;
        byArray[n4] = n3 = (int)((byte)(n3 >> 24 & 0xFF));
        this.zzd = n3 = this.zzd + 4;
    }

    public final void zze(long l2) {
        int n3;
        byte by2;
        int n4;
        byte by4;
        int n7;
        int n8 = this.zzc;
        this.zzc = n7 = n8 + 1;
        long l3 = 255L;
        int n10 = (int)(l2 & l3);
        byte[] byArray = this.zza;
        byArray[n8] = n10;
        this.zzc = n10 = n8 + 2;
        int n14 = 8;
        byArray[n7] = by4 = (byte)(l2 >> n14 & l3);
        this.zzc = n7 = n8 + 3;
        byArray[n10] = by4 = (byte)(l2 >> 16 & l3);
        this.zzc = n10 = n8 + 4;
        long l4 = l2 >> 24;
        byArray[n7] = n4 = (int)((int)(l3 & l4));
        this.zzc = n7 = n8 + 5;
        byArray[n10] = n4 = (byte)((int)(l2 >> 32) & 0xFF);
        this.zzc = n4 = n8 + 6;
        byArray[n7] = by2 = (byte)((int)(l2 >> 40) & 0xFF);
        this.zzc = n7 = n8 + 7;
        byArray[n4] = by2 = (byte)((int)(l2 >> 48) & 0xFF);
        this.zzc = n8 += n14;
        byArray[n7] = n3 = (int)((int)(l2 >> 56) & 0xFF);
        this.zzd = n3 = this.zzd + n14;
    }

    public final void zzf(int n3) {
        int n4 = zzhat.zzI();
        if (n4 != 0) {
            n4 = this.zzc;
            long l2 = n4;
            while (true) {
                long l3;
                int n7;
                int n8;
                byte[] byArray;
                int n10;
                if ((n10 = n3 & 0xFFFFFF80) == 0) {
                    byArray = this.zza;
                    n8 = this.zzc;
                    this.zzc = n7 = n8 + 1;
                    l3 = n8;
                    n3 = (byte)n3;
                    zzhfa.zzq(byArray, l3, (byte)n3);
                    long l4 = (long)this.zzc - l2;
                    n3 = this.zzd;
                    n4 = (int)l4;
                    this.zzd = n3 += n4;
                    return;
                }
                byArray = this.zza;
                n8 = this.zzc;
                this.zzc = n7 = n8 + 1;
                l3 = n8;
                byte by2 = (byte)((n3 | 0x80) & 0xFF);
                zzhfa.zzq(byArray, l3, by2);
                n3 >>>= 7;
            }
        }
        while (true) {
            int n14;
            int n15;
            byte[] byArray;
            if ((n4 = n3 & 0xFFFFFF80) == 0) {
                byArray = this.zza;
                n15 = this.zzc;
                this.zzc = n14 = n15 + 1;
                byArray[n15] = n3 = (int)((byte)n3);
                this.zzd = n3 = this.zzd + 1;
                return;
            }
            byArray = this.zza;
            n15 = this.zzc;
            this.zzc = n14 = n15 + 1;
            byArray[n15] = n14 = (int)((byte)((n3 | 0x80) & 0xFF));
            this.zzd = n4 = this.zzd + 1;
            n3 >>>= 7;
        }
    }

    public final void zzg(long l2) {
        int n3 = zzhat.zzI();
        int n4 = 7;
        long l3 = 0L;
        long l4 = -128;
        if (n3 != 0) {
            n3 = this.zzc;
            long l7 = n3;
            while (true) {
                int n7;
                long l8 = l2 & l4;
                n3 = (int)(l8 == l3 ? 0 : (l8 < l3 ? -1 : 1));
                byte by2 = (int)l2;
                if (n3 == 0) {
                    byte[] byArray = this.zza;
                    int n8 = this.zzc;
                    this.zzc = n3 = n8 + 1;
                    long l12 = n8;
                    n8 = by2;
                    zzhfa.zzq(byArray, l12, (byte)n8);
                    l2 = (long)this.zzc - l7;
                    n3 = this.zzd;
                    n8 = (int)l2;
                    this.zzd = n3 += n8;
                    return;
                }
                byte[] byArray = this.zza;
                int n10 = this.zzc;
                this.zzc = n7 = n10 + 1;
                long l14 = n10;
                by2 = (byte)((by2 | 0x80) & 0xFF);
                zzhfa.zzq(byArray, l14, by2);
                l2 >>>= n4;
            }
        }
        while (true) {
            int n14;
            long l15 = l2 & l4;
            n3 = (int)(l15 == l3 ? 0 : (l15 < l3 ? -1 : 1));
            int n15 = (int)l2;
            if (n3 == 0) {
                int n16;
                byte[] byArray = this.zza;
                int n17 = this.zzc;
                this.zzc = n3 = n17 + 1;
                byArray[n17] = n3 = (int)((byte)n15);
                this.zzd = n16 = this.zzd + 1;
                return;
            }
            byte[] byArray = this.zza;
            int n18 = this.zzc;
            this.zzc = n14 = n18 + 1;
            byArray[n18] = n15 = (int)((byte)((n15 | 0x80) & 0xFF));
            this.zzd = n3 = this.zzd + 1;
            l2 >>>= n4;
        }
    }
}

