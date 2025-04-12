/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbpw;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzccn;
import org.json.JSONException;
import org.json.JSONObject;

final class zzbqs
implements zzbme {
    final /* synthetic */ zzbqt zza;
    private final zzccn zzb;

    public zzbqs(zzbqt zzbqt2, zzccn zzccn2) {
        this.zza = zzbqt2;
        this.zzb = zzccn2;
    }

    /*
     * Unable to fully structure code
     */
    public final void zza(String var1_1) {
        if (var1_1 != null) ** GOTO lbl12
        try {
            var1_1 = this.zzb;
        }
        catch (IllegalStateException v0) {
            ** continue;
        }
        var2_2 = new zzbpw();
        var1_1.zzd(var2_2);
        return;
lbl12:
        // 1 sources

        var2_3 = this.zzb;
        var3_4 = new zzbpw((String)var1_1);
        var2_3.zzd(var3_4);
lbl18:
        // 2 sources

    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzb(JSONObject jSONObject) {
        zzccn zzccn2 = this.zzb;
        try {
            zzccn2.zzc(jSONObject);
            return;
        }
        catch (JSONException jSONException) {
            zzccn2 = this.zzb;
            zzccn2.zzd(jSONException);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
    }
}

