/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.internal.gtm.zzen;

public final class zzd {
    public static String zza(int n3) {
        return zzd.zzn("&cd", n3);
    }

    public static String zzb(int n3) {
        return zzd.zzn("cd", n3);
    }

    public static String zzc(int n3) {
        return zzd.zzn("cd", n3);
    }

    public static String zzd(int n3) {
        return zzd.zzn("&cm", n3);
    }

    public static String zze(int n3) {
        return zzd.zzn("cm", n3);
    }

    public static String zzf(int n3) {
        return zzd.zzn("cm", n3);
    }

    public static String zzg(int n3) {
        return zzd.zzn("&il", n3);
    }

    public static String zzh(int n3) {
        return zzd.zzn("il", n3);
    }

    public static String zzi(int n3) {
        return zzd.zzn("pi", n3);
    }

    public static String zzj(int n3) {
        return zzd.zzn("&pr", n3);
    }

    public static String zzk(int n3) {
        return zzd.zzn("pr", n3);
    }

    public static String zzl(int n3) {
        return zzd.zzn("&promo", n3);
    }

    public static String zzm(int n3) {
        return zzd.zzn("promo", n3);
    }

    private static String zzn(String string2, int n3) {
        if (n3 <= 0) {
            zzen.zzb("index out of range for prefix", string2);
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

