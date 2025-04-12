/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;

final class zzaja {
    private static final long[] zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    static {
        long[] lArray;
        long[] lArray2 = lArray = new long[8];
        long[] lArray3 = lArray;
        lArray2[0] = 128L;
        lArray3[1] = 64;
        lArray2[2] = 32;
        lArray3[3] = 16;
        lArray2[4] = 8;
        lArray3[5] = 4;
        lArray2[6] = 2;
        lArray3[7] = 1L;
        zza = lArray;
    }

    public zzaja() {
        byte[] byArray = new byte[8];
        this.zzb = byArray;
    }

    public static int zzb(int n3) {
        int n4;
        block2: {
            int n7 = 0;
            while (n7 < (n4 = 8)) {
                n4 = n7 + 1;
                long[] lArray = zza;
                long l2 = lArray[n7];
                long l3 = n3;
                long l4 = l2 & l3;
                long l7 = 0L;
                long l8 = l4 - l7;
                if ((n7 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                    n7 = n4;
                    continue;
                }
                break block2;
            }
            n4 = -1;
        }
        return n4;
    }

    public static long zzc(byte[] byArray, int n3, boolean n4) {
        long l2;
        byte by2 = byArray[0];
        long l3 = by2;
        long l4 = 255L;
        l3 &= l4;
        if (n4 != 0) {
            n4 = n3 + -1;
            long[] lArray = zza;
            long l7 = lArray[n4];
            l2 = l7 ^ (long)-1;
            l3 &= l2;
        }
        for (n4 = 1; n4 < n3; ++n4) {
            l3 <<= 8;
            byte by4 = byArray[n4];
            l2 = (long)by4 & l4;
            l3 |= l2;
        }
        return l3;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(zzadv object, boolean n3, boolean bl2, int n4) {
        int n7 = this.zzc;
        int n8 = -1;
        int n10 = 1;
        if (n7 == 0) {
            byte[] byArray = this.zzb;
            if ((n3 = (int)(object.zzn(byArray, 0, n10, n3 != 0) ? 1 : 0)) == 0) {
                return -1;
            }
            byte[] byArray2 = this.zzb;
            this.zzd = n3 = zzaja.zzb(byArray2[0] & 0xFF);
            if (n3 != n8) {
                this.zzc = n10;
            } else {
                object = new IllegalStateException("No valid varint length mask found");
                throw object;
            }
        }
        if ((n3 = this.zzd) > n4) {
            this.zzc = 0;
            return -2;
        }
        if (n3 != n10) {
            byte[] byArray = this.zzb;
            object = (zzadi)object;
            ((zzadi)object).zzn(byArray, n10, n3 += n8, false);
        }
        this.zzc = 0;
        object = this.zzb;
        n3 = this.zzd;
        return zzaja.zzc((byte[])object, n3, bl2);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}

