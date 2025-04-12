/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzdqg
implements zzgfa {
    public final /* synthetic */ zzdqs zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ JSONObject zzc;

    public /* synthetic */ zzdqg(zzdqs zzdqs2, String string2, JSONObject jSONObject) {
        this.zza = zzdqs2;
        this.zzb = string2;
        this.zzc = jSONObject;
    }

    public final ListenableFuture zza(Object object) {
        zzdqs zzdqs2 = this.zza;
        String string2 = this.zzb;
        JSONObject jSONObject = this.zzc;
        object = (zzchd)object;
        return zzdqs2.zzf(string2, jSONObject, (zzchd)object);
    }
}

