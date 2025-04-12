/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class zzbqy {
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final String zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final List zzl;
    public final List zzm;
    public final List zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final List zzt;
    public final String zzu;
    public final String zzv;

    public zzbqy(JSONObject jSONObject) {
        int n3;
        Object object = jSONObject.optString("id");
        this.zzb = object;
        object = jSONObject.getJSONArray("adapters");
        int n4 = object.length();
        ArrayList<String> arrayList = new ArrayList<String>(n4);
        Object object2 = null;
        for (n4 = 0; n4 < (n3 = object.length()); ++n4) {
            String string2 = object.getString(n4);
            arrayList.add(string2);
        }
        this.zzc = object = Collections.unmodifiableList(arrayList);
        arrayList = null;
        this.zzd = object = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzf = object = zzbra.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzg = object = zzbra.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzh = object = zzbra.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzj = object = zzbra.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzl = object = zzbra.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzn = object = zzbra.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzm = object = zzbra.zza(jSONObject, "video_reward_urls");
        this.zzo = object = jSONObject.optString("transaction_id");
        this.zzp = object = jSONObject.optString("valid_from_timestamp");
        object = jSONObject.optJSONObject("ad");
        if (object != null) {
            com.google.android.gms.ads.internal.zzu.zzg();
            object2 = zzbra.zza((JSONObject)object, "manual_impression_urls");
        } else {
            n4 = 0;
            object2 = null;
        }
        this.zzi = object2;
        object = object != null ? object.toString() : null;
        this.zza = object;
        object = jSONObject.optJSONObject("data");
        if (object != null) {
            object2 = object.toString();
        } else {
            n4 = 0;
            object2 = null;
        }
        this.zzk = object2;
        if (object != null) {
            object2 = "class_name";
            object = object.optString((String)object2);
        } else {
            object = null;
        }
        this.zze = object;
        this.zzq = object = jSONObject.optString("html_template", null);
        this.zzr = object = jSONObject.optString("ad_base_url", null);
        object = jSONObject.optJSONObject("assets");
        object = object != null ? object.toString() : null;
        this.zzs = object;
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzt = object = zzbra.zza(jSONObject, "template_ids");
        object = jSONObject.optJSONObject("ad_loader_options");
        object = object != null ? object.toString() : null;
        this.zzu = object;
        this.zzv = object = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", (long)-1);
    }
}

