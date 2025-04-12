/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbea;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbec;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzben;
import org.json.JSONObject;

public abstract class zzbeg {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbeg(int n3, String string2, Object object, Object object2, zzbef zzbef2) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = object;
        this.zzd = object2;
        zzba.zza().zzd(this);
    }

    public static zzbeg zzf(int n3, String string2, float f5, float f6) {
        Float f7 = Float.valueOf(f5);
        Float f8 = Float.valueOf(f6);
        zzbed zzbed2 = new zzbed(1, string2, f7, f8);
        return zzbed2;
    }

    public static zzbeg zzg(int n3, String string2, int n4, int n7) {
        Integer n8 = n4;
        Integer n10 = n7;
        zzbeb zzbeb2 = new zzbeb(1, string2, n8, n10);
        return zzbeb2;
    }

    public static zzbeg zzh(int n3, String string2, long l2, long l3) {
        Long l4 = l2;
        Long l7 = l3;
        zzbec zzbec2 = new zzbec(1, string2, l4, l7);
        return zzbec2;
    }

    public static zzbeg zzi(int n3, String string2, Boolean bl2, Boolean bl3) {
        zzbea zzbea2 = new zzbea(n3, string2, bl2, bl3);
        return zzbea2;
    }

    public static zzbeg zzj(int n3, String string2, String string3, String string4) {
        zzbee zzbee2 = new zzbee(1, string2, string3, string4);
        return zzbee2;
    }

    public static zzbeg zzk(int n3, String string2) {
        zzbeg zzbeg2 = zzbeg.zzj(1, "gads:sdk_core_constants:experiment_id", null, null);
        zzba.zza().zzc(zzbeg2);
        return zzbeg2;
    }

    public abstract Object zza(JSONObject var1);

    public abstract Object zzb(Bundle var1);

    public abstract Object zzc(SharedPreferences var1);

    public abstract void zzd(SharedPreferences.Editor var1, Object var2);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return zzba.zzc().zza(this);
    }

    public final Object zzm() {
        Object object = zzba.zzc();
        boolean bl2 = ((zzben)object).zzf();
        object = bl2 ? this.zzd : this.zzc;
        return object;
    }

    public final String zzn() {
        return this.zzb;
    }
}

