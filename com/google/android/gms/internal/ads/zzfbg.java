/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzexv;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbg
implements zzexv {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzj(Object object) {
        int n3;
        object = (JSONObject)object;
        String string2 = "sdk_env";
        try {
            object = object.getJSONObject(string2);
            string2 = "container_version";
            n3 = 12451000;
        }
        catch (JSONException jSONException) {
            return;
        }
        object.put(string2, n3);
    }
}

