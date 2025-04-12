/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzekf;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzekb
implements zzgfa {
    public final /* synthetic */ zzekf zza;
    public final /* synthetic */ zzdqs zzb;

    public /* synthetic */ zzekb(zzekf zzekf2, zzdqs zzdqs2) {
        this.zza = zzekf2;
        this.zzb = zzdqs2;
    }

    public final ListenableFuture zza(Object object) {
        zzekf zzekf2 = this.zza;
        zzdqs zzdqs2 = this.zzb;
        object = (JSONObject)object;
        return zzekf2.zzd(zzdqs2, (JSONObject)object);
    }
}

