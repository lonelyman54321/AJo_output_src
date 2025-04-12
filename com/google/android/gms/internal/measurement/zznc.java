/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkp;

final class zznc {
    public static /* synthetic */ void zza(byte by2, byte by4, byte by5, byte by6, char[] cArray, int n3) {
        int n4 = zznc.zza(by4);
        if (n4 == 0) {
            n4 = by2 << 28;
            int n7 = by4 + 112 + n4;
            if ((n4 = n7 >> 30) == 0 && (n4 = (int)(zznc.zza(by5) ? 1 : 0)) == 0 && (n4 = (int)(zznc.zza(by6) ? 1 : 0)) == 0) {
                by2 = (byte)((by2 & 7) << 18);
                by4 = (byte)((by4 & 0x3F) << 12);
                by2 = (byte)(by2 | by4);
                by4 = (byte)((by5 & 0x3F) << 6);
                by2 = (byte)(by2 | by4);
                by4 = (byte)(by6 & 0x3F);
                by2 = (byte)(by2 | by4);
                by4 = (byte)((by2 >>> 10) + 55232);
                cArray[n3] = (char)by4;
                by2 = (byte)((by2 & 0x3FF) + 56320);
                cArray[++n3] = (char)by2;
                return;
            }
        }
        throw zzkp.zzd();
    }

    public static /* synthetic */ void zza(byte n3, byte by2, byte by4, char[] cArray, int n4) {
        int n7 = zznc.zza(by2);
        if (n7 == 0) {
            n7 = -32;
            byte by5 = -96;
            if (!(n3 == n7 && by2 < by5 || n3 == (n7 = -19) && by2 >= by5 || (n7 = (int)(zznc.zza(by4) ? 1 : 0)) != 0)) {
                n3 = (n3 & 0xF) << 12;
                by2 = (byte)((by2 & 0x3F) << 6);
                n3 |= by2;
                by2 = (byte)(by4 & 0x3F);
                cArray[n4] = n3 = (int)((char)(n3 | by2));
                return;
            }
        }
        throw zzkp.zzd();
    }

    public static /* synthetic */ void zza(byte by2, byte by4, char[] cArray, int n3) {
        byte by5 = -62;
        if (by2 >= by5 && (by5 = (byte)(zznc.zza(by4) ? 1 : 0)) == 0) {
            by2 = (byte)((by2 & 0x1F) << 6);
            by4 = (byte)(by4 & 0x3F);
            by2 = (byte)(by2 | by4);
            cArray[n3] = (char)by2;
            return;
        }
        throw zzkp.zzd();
    }

    public static /* synthetic */ void zza(byte by2, char[] cArray, int n3) {
        by2 = by2;
        cArray[n3] = (char)by2;
    }

    private static boolean zza(byte by2) {
        byte by4 = -65;
        return by2 > by4;
    }
}

