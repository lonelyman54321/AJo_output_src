/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.bumptech.glide.load.engine.executor;

import android.os.Process;

class GlideExecutor$DefaultPriorityThreadFactory$1
extends Thread {
    public final void run() {
        Process.setThreadPriority((int)9);
        super.run();
    }
}

