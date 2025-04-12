/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdnp;

public final class zzdlf
implements Runnable {
    public final /* synthetic */ zzdlo zza;
    public final /* synthetic */ zzdnp zzb;

    public /* synthetic */ zzdlf(zzdlo zzdlo2, zzdnp zzdnp2) {
        this.zza = zzdlo2;
        this.zzb = zzdnp2;
    }

    public final void run() {
        zzdlo zzdlo2 = this.zza;
        zzdnp zzdnp2 = this.zzb;
        zzdlo2.zzA(zzdnp2);
    }
}

