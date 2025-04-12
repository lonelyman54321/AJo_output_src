/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdpo;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzdpe
implements zzgfa {
    public final /* synthetic */ zzdpo zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdpe(zzdpo zzdpo2, JSONObject jSONObject) {
        this.zza = zzdpo2;
        this.zzb = jSONObject;
    }

    public final ListenableFuture zza(Object object) {
        zzdpo zzdpo2 = this.zza;
        JSONObject jSONObject = this.zzb;
        object = (zzchd)object;
        return zzdpo2.zzc(jSONObject, (zzchd)object);
    }
}

