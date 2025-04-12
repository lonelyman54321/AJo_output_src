/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzd;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzb
implements Callable {
    public final /* synthetic */ zzd zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ JSONObject zzc;

    public /* synthetic */ zzb(zzd zzd2, String string2, JSONObject jSONObject) {
        this.zza = zzd2;
        this.zzb = string2;
        this.zzc = jSONObject;
    }

    public final Object call() {
        zzd zzd2 = this.zza;
        String string2 = this.zzb;
        JSONObject jSONObject = this.zzc;
        return zzd2.zzb(string2, jSONObject);
    }
}

