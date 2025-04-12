/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcns;
import com.google.android.gms.internal.ads.zzcnt;
import com.google.android.gms.internal.ads.zzgge;

public final class zzcnr
implements Runnable {
    public final /* synthetic */ zzcnt zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcnr(zzcnt zzcnt2, Runnable runnable2) {
        this.zza = zzcnt2;
        this.zzb = runnable2;
    }

    public final void run() {
        zzgge zzgge2 = zzcci.zze;
        zzcnt zzcnt2 = this.zza;
        Runnable runnable2 = this.zzb;
        zzcns zzcns2 = new zzcns(zzcnt2, runnable2);
        zzgge2.execute(zzcns2);
    }
}

