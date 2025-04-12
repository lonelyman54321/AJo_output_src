/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcic;

public final class zzchz
implements Runnable {
    public final /* synthetic */ zzcic zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzchz(zzcic zzcic2, String string2) {
        this.zza = zzcic2;
        this.zzb = string2;
    }

    public final void run() {
        zzcic zzcic2 = this.zza;
        String string2 = this.zzb;
        zzcic2.zzaV(string2);
    }
}

