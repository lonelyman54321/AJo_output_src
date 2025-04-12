/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcou;
import org.json.JSONObject;

final class zzcpn
implements zzcou {
    private final zzcak zza;

    public zzcpn(zzcak zzcak2) {
        this.zza = zzcak2;
    }

    public final void zza(JSONObject jSONObject) {
        int n3;
        String string2 = "timestamp";
        long l2 = jSONObject.optLong(string2);
        String string3 = "npa_reset";
        boolean bl2 = jSONObject.optBoolean(string3);
        if (bl2) {
            n3 = -1;
        } else {
            string3 = "npa";
            n3 = (int)(jSONObject.optBoolean(string3) ? 1 : 0);
        }
        this.zza.zzb(n3, l2);
    }
}

