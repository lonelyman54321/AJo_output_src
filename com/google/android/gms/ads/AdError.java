/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final AdError zzd;

    public AdError(int n3, String string2, String string3) {
        this(n3, string2, string3, null);
    }

    public AdError(int n3, String string2, String string3, AdError adError) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = adError;
    }

    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    public String getDomain() {
        return this.zzc;
    }

    public String getMessage() {
        return this.zzb;
    }

    public String toString() {
        Object object = this.zzb();
        int n3 = 2;
        try {
            object = object.toString(n3);
        }
        catch (JSONException jSONException) {
            object = "Error forming toString output.";
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zze zza() {
        Object object = this.zzd;
        if (object == null) {
            object = null;
        } else {
            String string2 = ((AdError)object).zzc;
            String string3 = ((AdError)object).zzb;
            int n3 = ((AdError)object).zza;
            object = new zze(n3, string3, string2, null, null);
        }
        AdError adError = object;
        int n4 = this.zza;
        String string4 = this.zzb;
        String string5 = this.zzc;
        return new zze(n4, string4, string5, (zze)((Object)adError), null);
    }

    public JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        int n3 = this.zza;
        jSONObject.put("Code", n3);
        String string2 = this.zzb;
        jSONObject.put("Message", (Object)string2);
        string2 = this.zzc;
        jSONObject.put("Domain", (Object)string2);
        Object object = this.zzd;
        string2 = "Cause";
        if (object == null) {
            object = "null";
            jSONObject.put(string2, object);
        } else {
            object = ((AdError)object).zzb();
            jSONObject.put(string2, object);
        }
        return jSONObject;
    }
}

