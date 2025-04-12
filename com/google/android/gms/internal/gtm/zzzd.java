/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaet;
import com.google.android.gms.internal.gtm.zzzi;

abstract class zzzd
extends zzzi {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzzd(int n3) {
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
        throw null;
    }

    public final void zzc(byte by2) {
        byte[] byArray = this.zza;
        int n3 = this.zzc;
        byArray[n3] = by2;
        this.zzc = ++n3;
        by2 = (byte)(this.zzd + 1);
        this.zzd = by2;
    }

    public final void zzd(int n3) {
        int n4 = this.zzc;
        int n7 = n4 + 1;
        int n8 = n3;
        byte[] byArray = this.zza;
        byArray[n4] = n8;
        byArray[n7] = n8 = (byte)(n3 >> 8);
        n7 = n3 >> 16;
        n8 = n4 + 2;
        byArray[n8] = n7 = (int)((byte)n7);
        n3 >>= 24;
        n7 = n4 + 3;
        byArray[n7] = n3 = (int)((byte)n3);
        this.zzc = n4 += 4;
        this.zzd = n3 = this.zzd + 4;
    }

    public final void zze(long l2) {
        int n3;
        int n4 = this.zzc;
        int n7 = n4 + 1;
        int n8 = (int)l2;
        byte[] byArray = this.zza;
        byArray[n4] = n8;
        n8 = 8;
        byArray[n7] = n3 = (int)((int)(l2 >> n8));
        n7 = (int)(l2 >> 16);
        n3 = n4 + 2;
        byArray[n3] = n7 = (int)((byte)n7);
        n7 = (int)(l2 >> 24);
        n3 = n4 + 3;
        byArray[n3] = n7 = (int)((byte)n7);
        n7 = (int)(l2 >> 32);
        n3 = n4 + 4;
        byArray[n3] = n7 = (int)((byte)n7);
        n7 = (int)(l2 >> 40);
        n3 = n4 + 5;
        byArray[n3] = n7 = (int)((byte)n7);
        n7 = (int)(l2 >> 48);
        n3 = n4 + 6;
        byArray[n3] = n7 = (int)((byte)n7);
        int n10 = (int)(l2 >> 56);
        int n14 = n4 + 7;
        byArray[n14] = n10 = (int)((byte)n10);
        this.zzc = n4 += n8;
        this.zzd = n14 = this.zzd + n8;
    }

    public final void zzf(int n3) {
        int n4 = zzzi.zzF();
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
                    zzaet.zzn(byArray, l3, (byte)n3);
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
                byte by2 = (byte)(n3 | 0x80);
                zzaet.zzn(byArray, l3, by2);
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
            byArray[n15] = n14 = (int)((byte)(n3 | 0x80));
            this.zzd = n4 = this.zzd + 1;
            n3 >>>= 7;
        }
    }

    public final void zzg(long l2) {
        int n3 = zzzi.zzF();
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
                    zzaet.zzn(byArray, l12, (byte)n8);
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
                by2 = (byte)(by2 | 0x80);
                zzaet.zzn(byArray, l14, by2);
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
            byArray[n18] = n15 = (int)((byte)(n15 | 0x80));
            this.zzd = n3 = this.zzd + 1;
            l2 >>>= n4;
        }
    }
}

