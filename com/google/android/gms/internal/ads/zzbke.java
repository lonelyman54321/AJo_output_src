/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzblp;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbke
implements zzblp {
    private final zzbkf zza;

    public zzbke(zzbkf zzbkf2) {
        this.zza = zzbkf2;
    }

    public final void zza(Object object, Map object2) {
        object = this.zza;
        if (object == null) {
            return;
        }
        object = (String)object2.get("name");
        if (object == null) {
            zzm.zzi("Ad metadata with no name parameter.");
            object = "";
        }
        String string2 = "info";
        boolean bl2 = object2.containsKey(string2);
        Bundle bundle = null;
        if (bl2) {
            object2 = object2.get(string2);
            object2 = (String)object2;
            try {
                JSONObject jSONObject = new JSONObject((String)object2);
                bundle = zzbw.zza(jSONObject);
            }
            catch (JSONException jSONException) {
                string2 = "Failed to convert ad metadata to JSON.";
                zzm.zzh(string2, jSONException);
            }
        }
        if (bundle == null) {
            zzm.zzg("Failed to convert ad metadata to Bundle.");
            return;
        }
        this.zza.zza((String)object, bundle);
    }
}

