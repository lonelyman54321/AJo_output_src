/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zznb;
import com.google.android.gms.internal.measurement.zznd;
import com.google.android.gms.internal.measurement.zzne;

final class zzna {
    private static final zznb zza;

    static {
        boolean bl2 = zzmz.zzc();
        if (bl2) {
            bl2 = zzmz.zzd();
        }
        zzne zzne2 = new zzne();
        zza = zzne2;
    }

    public static int zza(String object) {
        int n3;
        int n4;
        int n7;
        int n8 = ((String)object).length();
        int n10 = 0;
        for (n7 = 0; n7 < n8 && (n4 = (int)((String)object).charAt(n7)) < (n3 = 128); ++n7) {
        }
        n4 = n8;
        while (n7 < n8) {
            int n14;
            n3 = ((String)object).charAt(n7);
            if (n3 < (n14 = 2048)) {
                n3 = 127 - n3 >>> 31;
                n4 += n3;
                ++n7;
                continue;
            }
            n3 = ((String)object).length();
            while (n7 < n3) {
                int n15 = ((String)object).charAt(n7);
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
                            object = new zznd(n7, n3);
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
        String string2 = Wm2.a((long)n4 + 0x100000000L, "UTF-8 length does not fit in int: ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static int zza(String string2, byte[] byArray, int n3, int n4) {
        return zza.zza(string2, byArray, n3, n4);
    }

    public static /* synthetic */ int zza(byte[] object, int n3, int n4) {
        int n7 = n3 + -1;
        n7 = object[n7];
        int n8 = -1;
        int n10 = -12;
        if ((n4 -= n3) != 0) {
            byte by2 = -65;
            int n14 = 1;
            if (n4 != n14) {
                int n15 = 2;
                if (n4 == n15) {
                    n4 = object[n3];
                    byte by4 = object[n3 += n14];
                    if (n7 <= n10 && n4 <= by2 && by4 <= by2) {
                        n3 = n4 << 8 ^ n7;
                        return by4 << 16 ^ n3;
                    }
                    return n8;
                }
                object = new AssertionError;
                object();
                throw object;
            }
            byte by5 = object[n3];
            if (n7 <= n10 && by5 <= by2) {
                return by5 << 8 ^ n7;
            }
            return n8;
        }
        if (n7 > n10) {
            return n8;
        }
        return n7;
    }

    public static String zzb(byte[] byArray, int n3, int n4) {
        return zza.zza(byArray, n3, n4);
    }

    public static boolean zzc(byte[] byArray, int n3, int n4) {
        zznb zznb2 = zza;
        int n7 = zznb2.zza(0, byArray, n3, n4);
        return n7 == 0;
    }
}

