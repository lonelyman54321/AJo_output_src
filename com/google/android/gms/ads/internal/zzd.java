/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzd
implements zzgfa {
    public final /* synthetic */ zzf zza;
    public final /* synthetic */ Long zzb;
    public final /* synthetic */ zzdvc zzc;
    public final /* synthetic */ zzfmq zzd;
    public final /* synthetic */ zzfmc zze;

    public /* synthetic */ zzd(zzf zzf2, Long l2, zzdvc zzdvc2, zzfmq zzfmq2, zzfmc zzfmc2) {
        this.zza = zzf2;
        this.zzb = l2;
        this.zzc = zzdvc2;
        this.zzd = zzfmq2;
        this.zze = zzfmc2;
    }

    public final ListenableFuture zza(Object object) {
        Long l2 = this.zzb;
        zzdvc zzdvc2 = this.zzc;
        zzfmq zzfmq2 = this.zzd;
        zzfmc zzfmc2 = this.zze;
        object = (JSONObject)object;
        return zzf.zzd(l2, zzdvc2, zzfmq2, zzfmc2, (JSONObject)object);
    }
}

