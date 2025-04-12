/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdwf;
import org.json.JSONException;
import org.json.JSONObject;

final class zzdwg {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdwg(String string2, zzdwf zzdwf2) {
        this.zzb = string2;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdwg object) {
        Object object2 = zzbep.zzjX;
        object2 = (String)zzba.zzc().zza((zzbeg)object2);
        JSONObject jSONObject = new JSONObject();
        String string2 = "objectId";
        Object object3 = ((zzdwg)object).zza;
        jSONObject.putOpt(string2, object3);
        string2 = "eventCategory";
        object3 = ((zzdwg)object).zzb;
        jSONObject.put(string2, object3);
        string2 = "event";
        object3 = ((zzdwg)object).zzc;
        jSONObject.putOpt(string2, object3);
        string2 = "errorCode";
        object3 = ((zzdwg)object).zzd;
        jSONObject.putOpt(string2, object3);
        string2 = "rewardType";
        object3 = ((zzdwg)object).zze;
        jSONObject.putOpt(string2, object3);
        string2 = "rewardAmount";
        object = ((zzdwg)object).zzf;
        try {
            jSONObject.putOpt(string2, object);
        }
        catch (JSONException jSONException) {
            object = "Could not convert parameters to JSON.";
            zzm.zzj((String)object);
        }
        object = jSONObject.toString();
        return y02.a((String)object2, "(\"h5adsEvent\",", (String)object, ");");
    }

    public static /* bridge */ /* synthetic */ void zzb(zzdwg zzdwg2, Integer n3) {
        zzdwg2.zzd = n3;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzdwg zzdwg2, String string2) {
        zzdwg2.zzc = string2;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzdwg zzdwg2, Long l2) {
        zzdwg2.zza = l2;
    }

    public static /* bridge */ /* synthetic */ void zze(zzdwg zzdwg2, Integer n3) {
        zzdwg2.zzf = n3;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzdwg zzdwg2, String string2) {
        zzdwg2.zze = string2;
    }
}

