/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzlh;
import com.google.android.gms.internal.ads.zzmj;

public final class zzky
implements Runnable {
    public final /* synthetic */ zzlh zza;
    public final /* synthetic */ zzmj zzb;

    public /* synthetic */ zzky(zzlh zzlh2, zzmj zzmj2) {
        this.zza = zzlh2;
        this.zzb = zzmj2;
    }

    public final void run() {
        zzlh.zzr(this.zzb);
    }
}

