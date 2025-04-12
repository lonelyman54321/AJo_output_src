/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.google.android.gms.analytics;

import android.os.Process;

final class zzp
extends Thread {
    public zzp(Runnable runnable2, String string2) {
        super(runnable2, string2);
    }

    public final void run() {
        Process.setThreadPriority((int)10);
        super.run();
    }
}

