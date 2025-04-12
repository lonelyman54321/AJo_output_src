/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

public final class zzbdz {
    public static int zza(Context context) {
        return zzbdz.zzf(context, "crash_without_write");
    }

    public static int zzb(Context context) {
        return zzbdz.zzf(context, "init_without_write");
    }

    public static void zzc(Context context) {
        zzbdz.zzg(context, "crash_without_write");
    }

    public static void zzd(Context context) {
        zzbdz.zzg(context, "init_without_write");
    }

    public static void zze(Context context) {
        String string2 = "admob";
        if ((context = context.getSharedPreferences(string2, 0)) == null) {
            return;
        }
        context.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    private static int zzf(Context context, String string2) {
        String string3 = "admob";
        if ((context = context.getSharedPreferences(string3, 0)) == null) {
            return 0;
        }
        try {
            return context.getInt(string2, 0);
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    private static void zzg(Context context, String string2) {
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("admob", 0);
        if (sharedPreferences2 == null) {
            return;
        }
        int n3 = zzbdz.zzf(context, string2) + 1;
        sharedPreferences2.edit().putInt(string2, n3).commit();
    }
}

