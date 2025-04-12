/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzgau;

final class zzgam {
    public static int zza(int n3) {
        int n4 = 32;
        n4 = n3 < n4 ? 4 : 2;
        return (n3 + 1) * n4;
    }

    public static int zzb(Object object, Object object2, int n3, Object object3, int[] nArray, Object[] objectArray, Object[] objectArray2) {
        int n4 = zzgau.zzb(object);
        int n7 = n4 & n3;
        int n8 = zzgam.zzc(object3, n7);
        int n10 = -1;
        if (n8 != 0) {
            int n14 = ~n3;
            n4 &= n14;
            int n15 = -1;
            while (true) {
                Object object4;
                int n16 = nArray[n8 += n10];
                int n17 = n16 & n3;
                if ((n16 &= n14) == n4 && (n16 = (int)(zzfya.zza(object, object4 = objectArray[n8]) ? 1 : 0)) != 0 && (objectArray2 == null || (n16 = (int)(zzfya.zza(object2, object4 = objectArray2[n8]) ? 1 : 0)) != 0)) {
                    if (n15 == n10) {
                        zzgam.zze(object3, n7, n17);
                    } else {
                        int n18 = nArray[n15] & n14;
                        int n19 = n17 & n3;
                        nArray[n15] = n18 |= n19;
                    }
                    return n8;
                }
                if (n17 == 0) break;
                n15 = n8;
                n8 = n17;
            }
        }
        return n10;
    }

    public static int zzc(Object object, int n3) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return ((byte[])object)[n3] & 0xFF;
        }
        bl2 = object instanceof short[];
        if (bl2) {
            return (char)((short[])object)[n3];
        }
        return ((int[])object)[n3];
    }

    public static Object zzd(int n3) {
        int n4 = 2;
        if (n3 >= n4 && n3 <= (n4 = 0x40000000) && (n4 = Integer.highestOneBit(n3)) == n3) {
            n4 = 256;
            if (n3 <= n4) {
                return new byte[n3];
            }
            n4 = 65536;
            if (n3 <= n4) {
                return new short[n3];
            }
            return new int[n3];
        }
        String string2 = hj0_0.a(n3, "must be power of 2 between 2^1 and 2^30: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void zze(Object object, int n3, int n4) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            object = (byte[])object;
            n4 = (byte)n4;
            object[n3] = n4;
            return;
        }
        bl2 = object instanceof short[];
        if (bl2) {
            object = (short[])object;
            n4 = (short)n4;
            object[n3] = n4;
            return;
        }
        ((int[])object)[n3] = n4;
    }
}

