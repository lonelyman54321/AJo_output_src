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
import java.io.IOException;

final class zzfvf {
    private static zzfvf zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfvf(Context context) {
        String string2;
        this.zzb = string2 = context.getPackageName();
        context = context.getSharedPreferences("paid_storage_sp", 0);
        this.zzc = context;
    }

    public static zzfvf zzb(Context context) {
        zzfvf zzfvf2 = zza;
        if (zzfvf2 == null) {
            zza = zzfvf2 = new zzfvf(context);
        }
        return zza;
    }

    public final long zza(String string2, long l2) {
        return this.zzc.getLong(string2, (long)-1);
    }

    public final String zzc(String string2, String string3) {
        return this.zzc.getString(string2, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zzd(String var1_1, Object var2_2) {
        block4: {
            block3: {
                var3_3 = var2_2 instanceof String;
                if (!var3_3) break block3;
                var4_4 = this.zzc.edit();
                var2_2 = (String)var2_2;
                var2_2 = var4_4.putString(var1_1, (String)var2_2);
                var5_7 = var2_2.commit();
                ** GOTO lbl23
            }
            var3_3 = var2_2 instanceof Long;
            if (!var3_3) break block4;
            var4_5 = this.zzc.edit();
            var6_8 = (Long)var2_2;
            var2_2 = var4_5.putLong(var1_1, var6_8);
            var5_7 = var2_2.commit();
            ** GOTO lbl23
        }
        var3_3 = var2_2 instanceof Boolean;
        if (var3_3) {
            var4_6 = this.zzc.edit();
            var5_7 = (Boolean)var2_2;
            var2_2 = var4_6.putBoolean(var1_1, var5_7);
            var5_7 = var2_2.commit();
lbl23:
            // 3 sources

            if (var5_7) {
                return;
            }
        } else {
            var2_2 = var2_2.getClass();
            String.valueOf(var2_2);
        }
        var2_2 = this.zzb;
        var1_1 = UX.c("Failed to store ", var1_1, " for app ", (String)var2_2);
        var2_2 = new IOException(var1_1);
        throw var2_2;
    }

    public final void zze(String string2) {
        Object object = this.zzc.edit().remove(string2);
        boolean bl2 = object.commit();
        if (bl2) {
            return;
        }
        object = this.zzb;
        string2 = UX.c("Failed to remove ", string2, " for app ", (String)object);
        object = new IOException(string2);
        throw object;
    }

    public final boolean zzf(String string2, boolean bl2) {
        return this.zzc.getBoolean(string2, true);
    }

    public final boolean zzg(String string2) {
        return this.zzc.contains(string2);
    }
}

