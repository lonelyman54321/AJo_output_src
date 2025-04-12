/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbw;
import org.json.JSONObject;

public final class zzfgy {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfgy(JsonReader jsonReader) {
        String string2;
        jsonReader = zzbw.zzi(jsonReader);
        this.zzd = jsonReader;
        this.zza = string2 = jsonReader.optString("ad_html", null);
        this.zzb = string2 = jsonReader.optString("ad_base_url", null);
        jsonReader = jsonReader.optJSONObject("ad_json");
        this.zzc = jsonReader;
    }
}

