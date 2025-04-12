/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.bumptech.glide.load.engine;

import android.os.Process;

class ActiveResources$1$1
implements Runnable {
    public final /* synthetic */ Runnable a;

    public ActiveResources$1$1(Runnable runnable2) {
        this.a = runnable2;
    }

    public final void run() {
        Process.setThreadPriority((int)10);
        this.a.run();
    }
}

