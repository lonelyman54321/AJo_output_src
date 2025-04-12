/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhi;
import com.google.android.gms.internal.vision.zzma;
import com.google.android.gms.internal.vision.zzme;
import com.google.android.gms.internal.vision.zzmg;
import com.google.android.gms.internal.vision.zzmh;
import com.google.android.gms.internal.vision.zzmj;

final class zzmd {
    private static final zzme zza;

    static {
        boolean bl2 = zzma.zza();
        zzme zzme2 = bl2 && (bl2 = zzma.zzb()) && !(bl2 = zzhi.zza()) ? new zzmj() : new zzmh();
        zza = zzme2;
    }

    public static /* synthetic */ int zza(int n3) {
        return zzmd.zzb(n3);
    }

    public static /* synthetic */ int zza(int n3, int n4) {
        return zzmd.zzb(n3, n4);
    }

    public static /* synthetic */ int zza(int n3, int n4, int n7) {
        return zzmd.zzb(n3, n4, n7);
    }

    public static int zza(CharSequence object) {
        int n3;
        int n4;
        int n7;
        int n8 = object.length();
        int n10 = 0;
        StringBuilder stringBuilder = null;
        for (n7 = 0; n7 < n8 && (n4 = (int)object.charAt(n7)) < (n3 = 128); ++n7) {
        }
        n4 = n8;
        while (n7 < n8) {
            int n14;
            n3 = object.charAt(n7);
            if (n3 < (n14 = 2048)) {
                n3 = 127 - n3 >>> 31;
                n4 += n3;
                ++n7;
                continue;
            }
            n3 = object.length();
            while (n7 < n3) {
                int n15 = object.charAt(n7);
                if (n15 < n14) {
                    n15 = 127 - n15 >>> 31;
                    n10 += n15;
                } else {
                    n10 += 2;
                    int n16 = 55296;
                    if (n16 <= n15 && n15 <= (n16 = 57343)) {
                        n15 = Character.codePointAt((CharSequence)object, n7);
                        if (n15 >= (n16 = 65536)) {
                            ++n7;
                        } else {
                            object = new zzmg(n7, n3);
                            throw object;
                        }
                    }
                }
                ++n7;
            }
            n4 += n10;
            break;
        }
        if (n4 >= n8) {
            return n4;
        }
        long l2 = (long)n4 + 0x100000000L;
        stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(l2);
        String string2 = stringBuilder.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static int zza(CharSequence charSequence, byte[] byArray, int n3, int n4) {
        return zza.zza(charSequence, byArray, n3, n4);
    }

    public static boolean zza(byte[] byArray) {
        zzme zzme2 = zza;
        int n3 = byArray.length;
        return zzme2.zza(byArray, 0, n3);
    }

    public static boolean zza(byte[] byArray, int n3, int n4) {
        return zza.zza(byArray, n3, n4);
    }

    private static int zzb(int n3) {
        int n4 = -12;
        if (n3 > n4) {
            n3 = -1;
        }
        return n3;
    }

    private static int zzb(int n3, int n4) {
        int n7 = -12;
        if (n3 <= n7 && n4 <= (n7 = -65)) {
            return n3 ^ (n4 <<= 8);
        }
        return -1;
    }

    private static int zzb(int n3, int n4, int n7) {
        int n8 = -12;
        if (n3 <= n8 && n4 <= (n8 = -65) && n7 <= n8) {
            n4 = n7 << 16;
            return (n3 ^= (n4 <<= 8)) ^ n4;
        }
        return -1;
    }

    public static String zzb(byte[] byArray, int n3, int n4) {
        return zza.zzb(byArray, n3, n4);
    }

    public static /* synthetic */ int zzc(byte[] byArray, int n3, int n4) {
        return zzmd.zzd(byArray, n3, n4);
    }

    private static int zzd(byte[] object, int n3, int n4) {
        int n7 = n3 + -1;
        n7 = object[n7];
        if ((n4 -= n3) != 0) {
            int n8 = 1;
            if (n4 != n8) {
                int n10 = 2;
                if (n4 == n10) {
                    n4 = object[n3];
                    byte by2 = object[n3 += n8];
                    return zzmd.zzb(n7, n4, (int)by2);
                }
                object = new AssertionError;
                object();
                throw object;
            }
            byte by4 = object[n3];
            return zzmd.zzb(n7, by4);
        }
        return zzmd.zzb(n7);
    }
}

