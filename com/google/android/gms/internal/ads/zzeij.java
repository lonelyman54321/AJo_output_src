/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzeim;

public final class zzeij
implements Runnable {
    public final /* synthetic */ zzeim zza;
    public final /* synthetic */ zzchd zzb;

    public /* synthetic */ zzeij(zzeim zzeim2, zzchd zzchd2) {
        this.zza = zzeim2;
        this.zzb = zzchd2;
    }

    public final void run() {
        zzeim zzeim2 = this.zza;
        zzchd zzchd2 = this.zzb;
        zzeim2.zzd(zzchd2);
    }
}

