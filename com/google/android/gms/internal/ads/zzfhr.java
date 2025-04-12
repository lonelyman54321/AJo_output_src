/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import org.json.JSONObject;

public final class zzfhr {
    private final JSONObject zza;

    public zzfhr(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        int n3;
        int n4 = this.zzc() + -1;
        if (n4 != (n3 = 1)) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        Object object = zzbep.zzfd;
        object = (String)zzba.zzc().zza((zzbeg)object);
        return this.zza.optBoolean((String)object, true);
    }

    public final int zzc() {
        JSONObject jSONObject = this.zza;
        String string2 = "media_type";
        int n3 = -1;
        int n4 = jSONObject.optInt(string2, n3);
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                return 3;
            }
            return n7;
        }
        return 2;
    }
}

