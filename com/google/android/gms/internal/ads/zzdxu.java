/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import org.json.JSONObject;

final class zzdxu {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdxu(String string2, String string3, String string4, int n3, String string5, int n4, boolean bl2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = n3;
        this.zze = string5;
        this.zzf = n4;
        this.zzg = bl2;
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        Object object = this.zza;
        jSONObject.put("adapterClassName", object);
        object = this.zzc;
        jSONObject.put("version", object);
        Object object2 = zzbep.zzjq;
        object = zzba.zzc();
        object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = this.zzb;
            object = "sdkVersion";
            jSONObject.put((String)object, object2);
        }
        int n3 = this.zzd;
        jSONObject.put("status", n3);
        object2 = this.zze;
        jSONObject.put("description", object2);
        int n4 = this.zzf;
        jSONObject.put("initializationLatencyMillis", n4);
        object2 = zzbep.zzjr;
        object = zzba.zzc();
        object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if (bl3) {
            boolean bl4 = this.zzg;
            object = "supportsInitialization";
            jSONObject.put((String)object, bl4);
        }
        return jSONObject;
    }
}

