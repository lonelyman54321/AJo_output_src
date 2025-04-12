/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

public final class zzgo {
    private final Context zza;
    private final Random zzb;
    private final String zzc;

    public zzgo(Context object, String string2) {
        Random random = new Random();
        this.zza = object = (Context)Preconditions.checkNotNull(object);
        object = (String)Preconditions.checkNotNull(string2);
        this.zzc = object;
        this.zzb = random;
    }

    private final long zzg(long l2, long l3) {
        SharedPreferences sharedPreferences2 = this.zzh();
        long l4 = 0L;
        long l7 = sharedPreferences2.getLong("FORBIDDEN_COUNT", l4);
        l7 = Math.max(l4, l7);
        long l8 = sharedPreferences2.getLong("SUCCESSFUL_COUNT", l4);
        l8 = Math.max(l4, l8);
        float f5 = l7;
        float f6 = (l7 += l8) + 1L;
        float f7 = l3 -= l2;
        l3 = (long)((f5 /= f6) * f7);
        f7 = this.zzb.nextFloat();
        float f8 = l2 += l3;
        return (long)(f7 * f8);
    }

    private final SharedPreferences zzh() {
        String string2 = String.valueOf(this.zzc);
        Context context = this.zza;
        string2 = "v5_gtmContainerRefreshPolicy_".concat(string2);
        return context.getSharedPreferences(string2, 0);
    }

    public final long zza() {
        SharedPreferences sharedPreferences2 = this.zzh();
        String string2 = "FORBIDDEN_COUNT";
        long l2 = 0L;
        long l3 = sharedPreferences2.getLong(string2, l2);
        long l4 = (l3 = Math.max(l2, l3)) - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return l2;
        }
        l2 = 10000L;
        return this.zzg(l2, 600000L) + l2;
    }

    public final long zzb() {
        return this.zzg(0x6DDD00L, 259200000L) + 43200000L;
    }

    public final long zzc() {
        return this.zzg(600000L, 86400000L) + 3600000L;
    }

    public final void zzd() {
        SharedPreferences sharedPreferences2 = this.zzh();
        String string2 = "FORBIDDEN_COUNT";
        long l2 = 0L;
        long l3 = sharedPreferences2.getLong(string2, l2);
        String string3 = "SUCCESSFUL_COUNT";
        long l4 = sharedPreferences2.getLong(string3, l2);
        sharedPreferences2 = sharedPreferences2.edit();
        long l7 = 10;
        Object object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object == false) {
            l3 = 3;
        } else {
            long l8 = 1L;
            l3 += l8;
            l3 = Math.min(l7, l3);
        }
        l4 = Math.min(l4, l7 -= l3);
        l2 = Math.max(l2, l4);
        sharedPreferences2.putLong(string2, l3);
        sharedPreferences2.putLong(string3, l2);
        sharedPreferences2.apply();
    }

    public final void zze() {
        SharedPreferences sharedPreferences2 = this.zzh();
        String string2 = "SUCCESSFUL_COUNT";
        long l2 = 0L;
        long l3 = sharedPreferences2.getLong(string2, l2);
        String string3 = "FORBIDDEN_COUNT";
        long l4 = sharedPreferences2.getLong(string3, l2);
        ++l3;
        long l7 = 10;
        l3 = Math.min(l7, l3);
        l4 = Math.min(l4, l7 -= l3);
        l2 = Math.max(l2, l4);
        sharedPreferences2 = sharedPreferences2.edit();
        sharedPreferences2.putLong(string2, l3);
        sharedPreferences2.putLong(string3, l2);
        sharedPreferences2.apply();
    }

    public final boolean zzf() {
        SharedPreferences sharedPreferences2 = this.zzh();
        String string2 = "FORBIDDEN_COUNT";
        long l2 = 0L;
        long l3 = sharedPreferences2.getLong(string2, l2);
        long l4 = (l3 = Math.max(l2, l3)) - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object > 0;
    }
}

