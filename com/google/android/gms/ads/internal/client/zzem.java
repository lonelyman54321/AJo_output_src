/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzem {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzem(String string2, Bundle bundle, String string3) {
        this.zza = string2;
        this.zzb = bundle;
        this.zzc = string3;
    }

    public final Bundle zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        String string2 = this.zzc;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = "";
        if (!bl2) {
            String string4;
            try {
                string4 = this.zzc;
            }
            catch (JSONException jSONException) {}
            string2 = new JSONObject(string4);
            string4 = "request_id";
            return string2.optString(string4, string3);
        }
        return string3;
    }
}

