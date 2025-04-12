/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjk;

final class zzmf {
    public static /* synthetic */ void zza(byte by2, byte by4, byte by5, byte by6, char[] cArray, int n3) {
        zzmf.zzb(by2, by4, by5, by6, cArray, n3);
    }

    public static /* synthetic */ void zza(byte by2, byte by4, byte by5, char[] cArray, int n3) {
        zzmf.zzb(by2, by4, by5, cArray, n3);
    }

    public static /* synthetic */ void zza(byte by2, byte by4, char[] cArray, int n3) {
        zzmf.zzb(by2, by4, cArray, n3);
    }

    public static /* synthetic */ void zza(byte by2, char[] cArray, int n3) {
        zzmf.zzb(by2, cArray, n3);
    }

    public static /* synthetic */ boolean zza(byte by2) {
        return zzmf.zzd(by2);
    }

    private static void zzb(byte by2, byte by4, byte by5, byte by6, char[] cArray, int n3) {
        int n4 = zzmf.zzg(by4);
        if (n4 == 0) {
            n4 = by2 << 28;
            int n7 = by4 + 112 + n4;
            if ((n4 = n7 >> 30) == 0 && (n4 = (int)(zzmf.zzg(by5) ? 1 : 0)) == 0 && (n4 = (int)(zzmf.zzg(by6) ? 1 : 0)) == 0) {
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
        throw zzjk.zzh();
    }

    private static void zzb(byte n3, byte by2, byte by4, char[] cArray, int n4) {
        int n7 = zzmf.zzg(by2);
        if (n7 == 0) {
            n7 = -32;
            byte by5 = -96;
            if (!(n3 == n7 && by2 < by5 || n3 == (n7 = -19) && by2 >= by5 || (n7 = (int)(zzmf.zzg(by4) ? 1 : 0)) != 0)) {
                n3 = (n3 & 0xF) << 12;
                by2 = (byte)((by2 & 0x3F) << 6);
                n3 |= by2;
                by2 = (byte)(by4 & 0x3F);
                cArray[n4] = n3 = (int)((char)(n3 | by2));
                return;
            }
        }
        throw zzjk.zzh();
    }

    private static void zzb(byte by2, byte by4, char[] cArray, int n3) {
        byte by5 = -62;
        if (by2 >= by5 && (by5 = (byte)(zzmf.zzg(by4) ? 1 : 0)) == 0) {
            by2 = (byte)((by2 & 0x1F) << 6);
            by4 = (byte)(by4 & 0x3F);
            by2 = (byte)(by2 | by4);
            cArray[n3] = (char)by2;
            return;
        }
        throw zzjk.zzh();
    }

    private static void zzb(byte by2, char[] cArray, int n3) {
        by2 = by2;
        cArray[n3] = (char)by2;
    }

    public static /* synthetic */ boolean zzb(byte by2) {
        return zzmf.zze(by2);
    }

    public static /* synthetic */ boolean zzc(byte by2) {
        return zzmf.zzf(by2);
    }

    private static boolean zzd(byte by2) {
        return by2 >= 0;
    }

    private static boolean zze(byte by2) {
        byte by4 = -32;
        return by2 < by4;
    }

    private static boolean zzf(byte by2) {
        byte by4 = -16;
        return by2 < by4;
    }

    private static boolean zzg(byte by2) {
        byte by4 = -65;
        return by2 > by4;
    }
}

