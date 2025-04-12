/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzcj;

final class zzbj
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzbp zzc;

    public zzbj(zzbp zzbp2, String string2, Runnable runnable2) {
        this.zza = string2;
        this.zzb = runnable2;
        this.zzc = zzbp2;
    }

    public final void run() {
        zzcj zzcj2 = zzbp.zzb(this.zzc);
        String string2 = this.zza;
        zzcj2.zzn(string2);
        this.zzb.run();
    }
}

