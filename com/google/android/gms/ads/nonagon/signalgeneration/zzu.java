/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzu
implements zzgfa {
    public final /* synthetic */ zzaj zza;
    public final /* synthetic */ zzdqs[] zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzu(zzaj zzaj2, zzdqs[] zzdqsArray, String string2) {
        this.zza = zzaj2;
        this.zzb = zzdqsArray;
        this.zzc = string2;
    }

    public final ListenableFuture zza(Object object) {
        zzaj zzaj2 = this.zza;
        zzdqs[] zzdqsArray = this.zzb;
        String string2 = this.zzc;
        object = (zzdqs)object;
        return zzaj2.zzv(zzdqsArray, string2, (zzdqs)object);
    }
}

