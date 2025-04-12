/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgz;

final class zzbem
implements zzbgz {
    final /* synthetic */ SharedPreferences zza;

    public zzbem(zzben zzben2, SharedPreferences sharedPreferences2) {
        this.zza = sharedPreferences2;
    }

    public final Boolean zza(String string2, boolean bl2) {
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza;
        }
        catch (ClassCastException classCastException) {
            sharedPreferences2 = this.zza;
            String string3 = String.valueOf(bl2);
            return Boolean.valueOf(sharedPreferences2.getString(string2, string3));
        }
        boolean bl3 = sharedPreferences2.getBoolean(string2, bl2);
        return bl3;
    }

    public final Double zzb(String string2, double d2) {
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza;
        }
        catch (ClassCastException classCastException) {
            sharedPreferences2 = this.zza;
            String string3 = String.valueOf(d2);
            return Double.valueOf(sharedPreferences2.getString(string2, string3));
        }
        float f5 = (float)d2;
        float f6 = sharedPreferences2.getFloat(string2, f5);
        double d5 = f6;
        return d5;
    }

    public final Long zzc(String string2, long l2) {
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza;
        }
        catch (ClassCastException classCastException) {
            sharedPreferences2 = this.zza;
            int n3 = (int)l2;
            return sharedPreferences2.getInt(string2, n3);
        }
        long l3 = sharedPreferences2.getLong(string2, l2);
        return l3;
    }

    public final String zzd(String string2, String string3) {
        return this.zza.getString(string2, string3);
    }
}

