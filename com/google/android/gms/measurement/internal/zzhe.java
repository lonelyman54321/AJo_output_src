/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Pair
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzjf;
import java.util.Random;

public final class zzhe {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final /* synthetic */ zzha zze;

    private zzhe(zzha object, String string2, long l2) {
        this.zze = object;
        Preconditions.checkNotEmpty(string2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            l4 = 1;
        } else {
            l4 = 0;
            object = null;
        }
        Preconditions.checkArgument((boolean)l4);
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(":start");
        this.zza = object = ((StringBuilder)object).toString();
        this.zzb = object = Ft2.a(string2, ":count");
        this.zzc = object = Ft2.a(string2, ":value");
        this.zzd = l2;
    }

    public /* synthetic */ zzhe(zzha zzha2, String string2, long l2, zzhg zzhg2) {
        this(zzha2, string2, l2);
    }

    private final long zzb() {
        SharedPreferences sharedPreferences2 = this.zze.zzg();
        String string2 = this.zza;
        return sharedPreferences2.getLong(string2, 0L);
    }

    private final void zzc() {
        this.zze.zzv();
        long l2 = this.zze.zzb().currentTimeMillis();
        SharedPreferences.Editor editor = this.zze.zzg().edit();
        String string2 = this.zzb;
        editor.remove(string2);
        string2 = this.zzc;
        editor.remove(string2);
        string2 = this.zza;
        editor.putLong(string2, l2);
        editor.apply();
    }

    public final Pair zza() {
        long l2;
        long l3;
        Object object;
        this.zze.zzv();
        Object object2 = this.zze;
        ((zzjf)object2).zzv();
        long l4 = this.zzb();
        long l7 = 0L;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 == false) {
            this.zzc();
            l4 = l7;
        } else {
            object = this.zze.zzb();
            l3 = object.currentTimeMillis();
            l4 = Math.abs(l4 - l3);
        }
        l3 = this.zzd;
        Object object3 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (object3 < 0) {
            return null;
        }
        long l12 = l4 - (l3 <<= 1);
        object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object3 > 0) {
            this.zzc();
            return null;
        }
        object2 = this.zze.zzg();
        String string2 = this.zzc;
        object2 = object2.getString(string2, null);
        string2 = this.zze.zzg();
        object = this.zzb;
        l3 = string2.getLong((String)object, l7);
        this.zzc();
        if (object2 != null && (l2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1)) > 0) {
            Long l14 = l3;
            string2 = new Pair(object2, (Object)l14);
            return string2;
        }
        return zzha.zza;
    }

    public final void zza(String string2, long l2) {
        boolean bl2;
        long l3;
        zzha zzha2 = this.zze;
        zzha2.zzv();
        l2 = this.zzb();
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 == false) {
            this.zzc();
        }
        if (string2 == null) {
            string2 = "";
        }
        zzha2 = this.zze.zzg();
        String string3 = this.zzb;
        l2 = zzha2.getLong(string3, l4);
        long l8 = 1L;
        Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object <= 0) {
            zzha2 = this.zze.zzg().edit();
            string3 = this.zzc;
            zzha2.putString(string3, string2);
            string2 = this.zzb;
            zzha2.putLong(string2, l8);
            zzha2.apply();
            return;
        }
        Object object2 = this.zze.zzs().zzw();
        l4 = ((Random)object2).nextLong();
        long l12 = Long.MAX_VALUE;
        if ((l7 = (l3 = (l4 &= l12) - (l12 /= (l2 += l8))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        SharedPreferences.Editor editor = this.zze.zzg().edit();
        if (bl2) {
            object2 = this.zzc;
            editor.putString((String)object2, string2);
        }
        string2 = this.zzb;
        editor.putLong(string2, l2);
        editor.apply();
    }
}

