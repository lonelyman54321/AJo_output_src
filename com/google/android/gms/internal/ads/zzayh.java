/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.DisplayMetrics
 */
package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

public final class zzayh {
    public static final /* synthetic */ int zza;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static long zza(double d2, int n3, DisplayMetrics displayMetrics) {
        double d5 = displayMetrics.density;
        return Math.round(d2 / d5);
    }

    public static String zzb(byte[] object) {
        int n3;
        int n4 = ((byte[])object).length;
        n4 += n4;
        char[] cArray = new char[n4];
        for (int i3 = 0; i3 < (n3 = ((byte[])object).length); ++i3) {
            n3 = object[i3];
            int n7 = n3 & 0xFF;
            char[] cArray2 = zzb;
            n7 >>>= 4;
            n7 = cArray2[n7];
            int n8 = i3 + i3;
            cArray[n8] = n7;
            n3 &= 0xF;
            cArray[++n8] = n3 = cArray2[n3];
        }
        object = new String;
        object(cArray);
        return object;
    }

    public static boolean zzc() {
        Looper looper;
        Looper looper2 = Looper.myLooper();
        return looper2 == (looper = Looper.getMainLooper());
    }

    public static boolean zzd(String string2) {
        boolean bl2;
        return string2 == null || (bl2 = string2.isEmpty());
        {
        }
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        float f5;
        float f6;
        float f7;
        return displayMetrics != null && (f7 = (f6 = (f5 = displayMetrics.density) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false;
    }

    public static byte[] zzf(String object) {
        int n3 = ((String)object).length();
        int n4 = n3 % 2;
        if (n4 == 0) {
            n4 = n3 / 2;
            byte[] byArray = new byte[n4];
            for (int i3 = 0; i3 < n3; i3 += 2) {
                int n7 = i3 / 2;
                int n8 = ((String)object).charAt(i3);
                int n10 = 16;
                n8 = Character.digit((char)n8, n10) << 4;
                char c2 = i3 + 1;
                c2 = ((String)object).charAt(c2);
                n10 = Character.digit(c2, n10) + n8;
                byArray[n7] = n8 = (int)((byte)n10);
            }
            return byArray;
        }
        object = new IllegalArgumentException("String must be of even-length");
        throw object;
    }
}

