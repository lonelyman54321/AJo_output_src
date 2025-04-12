/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdxf;

public final class zzdwy
implements Runnable {
    public final /* synthetic */ zzdxf zza;
    public final /* synthetic */ zzccn zzb;

    public /* synthetic */ zzdwy(zzdxf zzdxf2, zzccn zzccn2) {
        this.zza = zzdxf2;
        this.zzb = zzccn2;
    }

    public final void run() {
        zzdxf zzdxf2 = this.zza;
        zzccn zzccn2 = this.zzb;
        zzdxf2.zzo(zzccn2);
    }
}

