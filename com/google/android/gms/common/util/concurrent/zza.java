/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class zza
implements Runnable {
    private final Runnable zza;

    public zza(Runnable runnable2, int n3) {
        this.zza = runnable2;
    }

    public final void run() {
        Process.setThreadPriority((int)0);
        this.zza.run();
    }
}

