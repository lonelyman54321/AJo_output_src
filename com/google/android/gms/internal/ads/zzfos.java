/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzfou;
import java.util.Timer;
import java.util.TimerTask;

final class zzfos
extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzfou zzb;
    final /* synthetic */ zzchs zzc;

    public zzfos(zzfou zzfou2, zzchs zzchs2, Timer timer) {
        this.zzc = zzchs2;
        this.zza = timer;
        this.zzb = zzfou2;
    }

    public final void run() {
        zzfou.zzc(this.zzb);
        this.zzc.zza(true);
        this.zza.cancel();
    }
}

