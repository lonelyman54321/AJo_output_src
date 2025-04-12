/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.utils;

import androidx.work.impl.utils.SerialExecutorImpl;

class SerialExecutorImpl$Task
implements Runnable {
    public final SerialExecutorImpl a;
    public final Runnable b;

    public SerialExecutorImpl$Task(SerialExecutorImpl serialExecutorImpl, Runnable runnable2) {
        this.a = serialExecutorImpl;
        this.b = runnable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        try {
            object = this.b;
            object.run();
            return;
        }
        finally {
            object = this.a.d;
            synchronized (object) {
                SerialExecutorImpl serialExecutorImpl = this.a;
                serialExecutorImpl.b();
            }
        }
    }
}

