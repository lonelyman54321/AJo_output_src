/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;

public final class AdapterResponseInfo {
    private final zzu zza;
    private final AdError zzb;

    private AdapterResponseInfo(zzu object) {
        this.zza = object;
        object = ((zzu)object).zzc;
        object = object == null ? null : ((zze)object).zza();
        this.zzb = object;
    }

    public static AdapterResponseInfo zza(zzu zzu2) {
        if (zzu2 != null) {
            AdapterResponseInfo adapterResponseInfo = new AdapterResponseInfo(zzu2);
            return adapterResponseInfo;
        }
        return null;
    }

    public AdError getAdError() {
        return this.zzb;
    }

    public String getAdSourceId() {
        return this.zza.zzf;
    }

    public String getAdSourceInstanceId() {
        return this.zza.zzh;
    }

    public String getAdSourceInstanceName() {
        return this.zza.zzg;
    }

    public String getAdSourceName() {
        return this.zza.zze;
    }

    public String getAdapterClassName() {
        return this.zza.zza;
    }

    public Bundle getCredentials() {
        return this.zza.zzd;
    }

    public long getLatencyMillis() {
        return this.zza.zzb;
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

    public final JSONObject zzb() {
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        Object object = this.zza.zza;
        jSONObject.put("Adapter", object);
        long l2 = this.zza.zzb;
        jSONObject.put("Latency", l2);
        object = this.getAdSourceName();
        Object object2 = "Ad Source Name";
        String string2 = "null";
        if (object == null) {
            jSONObject.put((String)object2, (Object)string2);
        } else {
            jSONObject.put((String)object2, object);
        }
        object = this.getAdSourceId();
        object2 = "Ad Source ID";
        if (object == null) {
            jSONObject.put((String)object2, (Object)string2);
        } else {
            jSONObject.put((String)object2, object);
        }
        object = this.getAdSourceInstanceName();
        object2 = "Ad Source Instance Name";
        if (object == null) {
            jSONObject.put((String)object2, (Object)string2);
        } else {
            jSONObject.put((String)object2, object);
        }
        object = this.getAdSourceInstanceId();
        object2 = "Ad Source Instance ID";
        if (object == null) {
            jSONObject.put((String)object2, (Object)string2);
        } else {
            jSONObject.put((String)object2, object);
        }
        object = new JSONObject();
        object2 = this.zza.zzd.keySet().iterator();
        while (bl2 = object2.hasNext()) {
            String string3 = (String)object2.next();
            Object object3 = this.zza.zzd.get(string3);
            object.put(string3, object3);
        }
        jSONObject.put("Credentials", object);
        object = this.zzb;
        object2 = "Ad Error";
        if (object == null) {
            jSONObject.put((String)object2, (Object)string2);
        } else {
            object = ((AdError)object).zzb();
            jSONObject.put((String)object2, object);
        }
        return jSONObject;
    }
}

