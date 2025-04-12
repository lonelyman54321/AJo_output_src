/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfi;

final class zzcfg
implements Runnable {
    final /* synthetic */ zzcfh zza;

    public zzcfg(zzcfh zzcfh2) {
        this.zza = zzcfh2;
    }

    public final void run() {
        zzcfi zzcfi2 = zzu.zzy();
        zzcfh zzcfh2 = this.zza;
        zzcfi2.zzc(zzcfh2);
    }
}

