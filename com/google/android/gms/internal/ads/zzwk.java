/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzwr;

public final class zzwk
implements Runnable {
    public final /* synthetic */ zzwr zza;
    public final /* synthetic */ zzaet zzb;

    public /* synthetic */ zzwk(zzwr zzwr2, zzaet zzaet2) {
        this.zza = zzwr2;
        this.zzb = zzaet2;
    }

    public final void run() {
        zzwr zzwr2 = this.zza;
        zzaet zzaet2 = this.zzb;
        zzwr2.zzG(zzaet2);
    }
}

