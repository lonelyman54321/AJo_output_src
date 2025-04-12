/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdlo;

public final class zzdlk
implements Runnable {
    public final /* synthetic */ zzdlo zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzdlk(zzdlo zzdlo2, boolean bl2) {
        this.zza = zzdlo2;
        this.zzb = bl2;
    }

    public final void run() {
        zzdlo zzdlo2 = this.zza;
        boolean bl2 = this.zzb;
        zzdlo2.zzy(bl2);
    }
}

