/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoadAdError
extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int n3, String string2, String string3, AdError adError, ResponseInfo responseInfo) {
        super(n3, string2, string3, adError);
        this.zza = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.zza;
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
        JSONObject jSONObject = super.zzb();
        Object object = this.getResponseInfo();
        String string2 = "Response Info";
        if (object == null) {
            object = "null";
            jSONObject.put(string2, object);
        } else {
            object = ((ResponseInfo)object).zzd();
            jSONObject.put(string2, object);
        }
        return jSONObject;
    }
}

