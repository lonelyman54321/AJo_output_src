/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package androidx.core.provider;

import android.os.Process;

class RequestExecutor$DefaultThreadFactory$ProcessPriorityThread
extends Thread {
    public final int a;

    public RequestExecutor$DefaultThreadFactory$ProcessPriorityThread(Runnable runnable2, String string2, int n3) {
        super(runnable2, string2);
        this.a = n3;
    }

    public final void run() {
        Process.setThreadPriority((int)this.a);
        super.run();
    }
}

