/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import org.json.JSONObject;

public final class zzcqy
implements Runnable {
    public final /* synthetic */ zzchd zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcqy(zzchd zzchd2, JSONObject jSONObject) {
        this.zza = zzchd2;
        this.zzb = jSONObject;
    }

    public final void run() {
        zzchd zzchd2 = this.zza;
        JSONObject jSONObject = this.zzb;
        zzchd2.zzl("AFMA_updateActiveView", jSONObject);
    }
}

