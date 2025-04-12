/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzkw;
import com.google.android.gms.internal.ads.zzlf;

public final class zzkl
implements Runnable {
    public final /* synthetic */ zzkw zza;
    public final /* synthetic */ zzlf zzb;

    public /* synthetic */ zzkl(zzkw zzkw2, zzlf zzlf2) {
        this.zza = zzkw2;
        this.zzb = zzlf2;
    }

    public final void run() {
        zzkw zzkw2 = this.zza;
        zzlf zzlf2 = this.zzb;
        zzkw2.zzS(zzlf2);
    }
}

