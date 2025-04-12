/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmt;
import com.google.android.gms.internal.ads.zzdnp;

public final class zzdmr
implements Runnable {
    public final /* synthetic */ zzdmt zza;
    public final /* synthetic */ zzdnp zzb;

    public /* synthetic */ zzdmr(zzdmt zzdmt2, zzdnp zzdnp2) {
        this.zza = zzdmt2;
        this.zzb = zzdnp2;
    }

    public final void run() {
        zzdmt zzdmt2 = this.zza;
        zzdnp zzdnp2 = this.zzb;
        zzdmt2.zzb(zzdnp2);
    }
}

