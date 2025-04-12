/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;
import com.google.android.gms.internal.vision.zzec;

final class zzea {
    public static int zza(int n3, int n4, int n7) {
        int n8 = ~n7;
        return (n3 &= n8) | (n4 &= n7);
    }

    public static int zza(Object object, int n3) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return ((byte[])object)[n3] & 0xFF;
        }
        bl2 = object instanceof short[];
        if (bl2) {
            return ((short[])object)[n3] & (char)-1;
        }
        return ((int[])object)[n3];
    }

    public static int zza(Object object, Object object2, int n3, Object object3, int[] nArray, Object[] objectArray, Object[] objectArray2) {
        int n4 = zzec.zza(object);
        int n7 = n4 & n3;
        int n8 = zzea.zza(object3, n7);
        int n10 = -1;
        if (n8 == 0) {
            return n10;
        }
        int n14 = ~n3;
        n4 &= n14;
        int n15 = -1;
        while (true) {
            Object object4;
            int n16;
            int n17;
            if ((n17 = (n16 = nArray[n8 += -1]) & n14) == n4 && (n17 = (int)(zzcz.zza(object, object4 = objectArray[n8]) ? 1 : 0)) != 0 && (objectArray2 == null || (n17 = (int)(zzcz.zza(object2, object4 = objectArray2[n8]) ? 1 : 0)) != 0)) {
                int n18 = n16 & n3;
                if (n15 == n10) {
                    zzea.zza(object3, n7, n18);
                } else {
                    int n19 = nArray[n15];
                    nArray[n15] = n18 = zzea.zza(n19, n18, n3);
                }
                return n8;
            }
            n15 = n16 & n3;
            if (n15 == 0) {
                return n10;
            }
            int n20 = n15;
            n15 = n8;
            n8 = n20;
        }
    }

    public static Object zza(int n3) {
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
        String string2 = tk3_2.a(52, n3, "must be power of 2 between 2^1 and 2^30: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void zza(Object object, int n3, int n4) {
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

    public static int zzb(int n3) {
        int n4 = 32;
        n4 = n3 < n4 ? 4 : 2;
        return (n3 + 1) * n4;
    }
}

