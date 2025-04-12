/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxd;
import com.google.android.gms.internal.ads.zzdxf;

public final class zzdxc
implements Runnable {
    public final /* synthetic */ zzdxd zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdxc(zzdxd zzdxd2, String string2) {
        this.zza = zzdxd2;
        this.zzb = string2;
    }

    public final void run() {
        zzdxf zzdxf2 = this.zza.zza;
        String string2 = this.zzb;
        zzdxf.zzj(zzdxf2, string2);
    }
}

