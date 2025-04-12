/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbyt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbqz {
    public final List zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final List zzf;
    public final String zzg;
    public final String zzh;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbqz(JSONObject jSONObject) {
        String string2;
        String string3;
        List list;
        int n3;
        Object object;
        int n4 = 2;
        boolean bl2 = zzm.zzm(n4);
        if (bl2) {
            String string4 = String.valueOf(jSONObject.toString(n4));
            object = "Mediation Response JSON: ";
            String string5 = ((String)object).concat(string4);
            com.google.android.gms.ads.internal.util.zze.zza(string5);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        int n7 = jSONArray.length();
        object = new ArrayList(n7);
        n7 = -1;
        Object object2 = null;
        int n8 = -1;
        block2: for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            boolean bl3;
            String string6;
            Object object3;
            Object object4;
            try {
                object4 = jSONArray.getJSONObject(i3);
                object3 = new zzbqy((JSONObject)object4);
                object4 = ((zzbqy)object3).zzv;
                string6 = "banner";
                string6.equalsIgnoreCase((String)object4);
            }
            catch (JSONException jSONException) {
                continue;
            }
            ((ArrayList)object).add(object3);
            if (n8 >= 0) continue;
            object3 = ((zzbqy)object3).zzc.iterator();
            while (bl3 = object3.hasNext()) {
                object4 = (String)object3.next();
                bl3 = ((String)object4).equals(string6 = "com.google.ads.mediation.admob.AdMobAdapter");
                if (!bl3) continue;
                n8 = i3;
                continue block2;
            }
        }
        jSONArray.length();
        this.zza = list = Collections.unmodifiableList(object);
        this.zzg = string3 = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", n7);
        long l2 = -1;
        jSONObject.optLong("timeout_ms", l2);
        jSONObject = jSONObject.optJSONObject("settings");
        n4 = 0;
        Object var4_9 = null;
        if (jSONObject == null) {
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzh = null;
            return;
        }
        jSONObject.optLong("ad_network_timeout_millis", l2);
        zzu.zzg();
        object2 = zzbra.zza(jSONObject, "click_urls");
        this.zzb = object2;
        zzu.zzg();
        object2 = zzbra.zza(jSONObject, "imp_urls");
        this.zzc = object2;
        zzu.zzg();
        object2 = zzbra.zza(jSONObject, "downloaded_imp_urls");
        this.zzd = object2;
        zzu.zzg();
        object2 = zzbra.zza(jSONObject, "nofill_urls");
        this.zze = object2;
        zzu.zzg();
        object2 = zzbra.zza(jSONObject, "remote_ping_urls");
        this.zzf = object2;
        jSONObject.optBoolean("render_in_browser", false);
        object2 = "refresh";
        jSONObject.optLong((String)object2, l2);
        object = zzbyt.zza(jSONObject.optJSONArray("rewards"));
        this.zzh = object == null ? null : (string2 = ((zzbyt)object).zza);
        jSONObject.optBoolean("use_displayed_impression", false);
        jSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}

