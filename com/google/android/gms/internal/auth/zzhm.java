/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdr;
import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.internal.auth.zzhi;
import com.google.android.gms.internal.auth.zzhj;
import com.google.android.gms.internal.auth.zzhk;
import com.google.android.gms.internal.auth.zzhl;

final class zzhm {
    private static final zzhk zza;

    static {
        int n3 = zzhi.zzu();
        if (n3 != 0 && (n3 = zzhi.zzv()) != 0) {
            n3 = zzdr.zza;
        }
        zzhl zzhl2 = new zzhl();
        zza = zzhl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ /* synthetic */ int zza(byte[] object, int n3, int n4) {
        int n7;
        int n8 = n7 + -1;
        n8 = object[n8];
        int n10 = -12;
        if ((by2 -= n7) != 0) {
            byte by2;
            byte by4 = 1;
            int n14 = -65;
            if (by2 != by4) {
                byte by5 = 2;
                if (by2 != by5) {
                    AssertionError assertionError = new AssertionError();
                    throw assertionError;
                }
                by2 = object[n7];
                int n15 = object[n7 += by4];
                if (n8 > n10) return -1;
                if (by2 > n14) return -1;
                if (n15 > n14) return -1;
                n7 = by2 << 8 ^ n8;
                return n7 ^ (n15 <<= 16);
            }
            int n16 = object[n7];
            if (n8 > n10) return -1;
            if (n16 > n14) return -1;
            return n8 ^= (n16 <<= 8);
        }
        if (n8 <= n10) return n8;
        return -1;
    }

    public static String zzb(byte[] object, int n3, int n4) {
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        int n14 = ((byte[])object).length;
        int n15 = n3 | n4;
        int n16 = n14 - n3 - n4;
        if ((n15 |= n16) >= 0) {
            int n17;
            n14 = n3 + n4;
            char[] cArray = new char[n4];
            n15 = 0;
            while (n3 < n14 && (n17 = zzhj.zzd((byte)(n16 = object[n3]))) != 0) {
                n3 += n10;
                n17 = n15 + 1;
                cArray[n15] = n16 = (int)n16;
                n15 = n17;
            }
            int n18 = n15;
            while (n3 < n14) {
                int n19;
                n15 = n3 + 1;
                n16 = object[n3];
                n17 = zzhj.zzd((byte)n16);
                if (n17 != 0) {
                    n3 = n18 + 1;
                    cArray[n18] = n16 = (char)n16;
                    n18 = n3;
                    n3 = n15;
                    while (n3 < n14 && (n16 = (int)(zzhj.zzd((byte)(n15 = object[n3])) ? 1 : 0)) != 0) {
                        n3 = n3 + n10;
                        n16 = n18 + 1;
                        cArray[n18] = n15 = (int)n15;
                        n18 = n16;
                    }
                    continue;
                }
                n17 = -32;
                if (n16 < n17) {
                    if (n15 < n14) {
                        n3 += n8;
                        n17 = n18 + 1;
                        n15 = object[n15];
                        zzhj.zzc((byte)n16, (byte)n15, cArray, n18);
                        n18 = n17;
                        continue;
                    }
                    throw zzfa.zzb();
                }
                n17 = -16;
                if (n16 < n17) {
                    n17 = n14 + -1;
                    if (n15 < n17) {
                        n17 = n3 + 2;
                        n3 = n3 + n7;
                        n19 = n18 + 1;
                        n15 = object[n15];
                        n17 = object[n17];
                        zzhj.zzb((byte)n16, (byte)n15, (byte)n17, cArray, n18);
                        n18 = n19;
                        continue;
                    }
                    throw zzfa.zzb();
                }
                n17 = n14 + -2;
                if (n15 < n17) {
                    n17 = n3 + 2;
                    n19 = n3 + 3;
                    n3 = n3 + 4;
                    byte by2 = object[n15];
                    n17 = object[n17];
                    n19 = object[n19];
                    n15 = n16;
                    n16 = by2;
                    zzhj.zza((byte)n15, by2, (byte)n17, (byte)n19, cArray, n18);
                    n18 += n8;
                    continue;
                }
                throw zzfa.zzb();
            }
            object = new String;
            object(cArray, 0, n18);
            return object;
        }
        object = new ArrayIndexOutOfBoundsException;
        Integer n20 = n14;
        Object object2 = n3;
        Integer n21 = n4;
        Object[] objectArray = new Object[n7];
        objectArray[0] = n20;
        objectArray[n10] = object2;
        objectArray[n8] = n21;
        object2 = String.format("buffer length=%d, index=%d, size=%d", objectArray);
        object((String)object2);
        throw object;
    }

    public static boolean zzc(byte[] byArray) {
        zzhk zzhk2 = zza;
        int n3 = byArray.length;
        return zzhk2.zzb(byArray, 0, n3);
    }

    public static boolean zzd(byte[] byArray, int n3, int n4) {
        return zza.zzb(byArray, n3, n4);
    }
}

