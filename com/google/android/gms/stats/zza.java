/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.stats;

import com.google.android.gms.stats.WakeLock;

public final class zza
implements Runnable {
    public final /* synthetic */ WakeLock zza;

    public /* synthetic */ zza(WakeLock wakeLock) {
        this.zza = wakeLock;
    }

    public final void run() {
        WakeLock.zza(this.zza);
    }
}

