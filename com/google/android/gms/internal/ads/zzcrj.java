/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcrk;
import org.json.JSONObject;

public final class zzcrj
implements Runnable {
    public final /* synthetic */ zzcrk zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcrj(zzcrk zzcrk2, JSONObject jSONObject) {
        this.zza = zzcrk2;
        this.zzb = jSONObject;
    }

    public final void run() {
        zzcrk zzcrk2 = this.zza;
        JSONObject jSONObject = this.zzb;
        zzcrk2.zzd(jSONObject);
    }
}

