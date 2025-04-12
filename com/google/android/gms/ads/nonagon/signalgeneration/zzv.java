/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.internal.ads.zzdqs;

public final class zzv
implements Runnable {
    public final /* synthetic */ zzaj zza;
    public final /* synthetic */ zzdqs[] zzb;

    public /* synthetic */ zzv(zzaj zzaj2, zzdqs[] zzdqsArray) {
        this.zza = zzaj2;
        this.zzb = zzdqsArray;
    }

    public final void run() {
        zzaj zzaj2 = this.zza;
        zzdqs[] zzdqsArray = this.zzb;
        zzaj2.zzJ(zzdqsArray);
    }
}

