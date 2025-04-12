/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.utils;

import androidx.work.impl.utils.SerialExecutorImpl$Task;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class SerialExecutorImpl
implements VZ2 {
    public final ArrayDeque a;
    public final Executor b;
    public Runnable c;
    public final Object d;

    public SerialExecutorImpl(Executor object) {
        this.b = object;
        object = new ArrayDeque();
        this.a = object;
        this.d = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Object object = this.d;
        synchronized (object) {
            ArrayDeque arrayDeque = this.a;
            return arrayDeque.isEmpty() ^ true;
        }
    }

    public final void b() {
        Runnable runnable2;
        this.c = runnable2 = (Runnable)this.a.poll();
        if (runnable2 != null) {
            Executor executor = this.b;
            executor.execute(runnable2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void execute(Runnable runnable2) {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ArrayDeque arrayDeque = this.a;
                        SerialExecutorImpl$Task serialExecutorImpl$Task = new SerialExecutorImpl$Task(this, runnable2);
                        arrayDeque.add(serialExecutorImpl$Task);
                        runnable2 = this.c;
                        if (runnable2 != null) break block3;
                        this.b();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

