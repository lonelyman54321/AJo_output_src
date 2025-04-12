/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcnt;

public final class zzcns
implements Runnable {
    public final /* synthetic */ zzcnt zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcns(zzcnt zzcnt2, Runnable runnable2) {
        this.zza = zzcnt2;
        this.zzb = runnable2;
    }

    public final void run() {
        zzcnt zzcnt2 = this.zza;
        Runnable runnable2 = this.zzb;
        zzcnt2.zzc(runnable2);
    }
}

