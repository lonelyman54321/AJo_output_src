/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;

public final class zzctq
implements Runnable {
    public final /* synthetic */ zzchd zza;

    public /* synthetic */ zzctq(zzchd zzchd2) {
        this.zza = zzchd2;
    }

    public final void run() {
        this.zza.onPause();
    }
}

