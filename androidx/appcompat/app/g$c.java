/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.app;

import androidx.appcompat.app.g$d;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class g$c
implements Executor {
    public final Object a;
    public final ArrayDeque b;
    public final Executor c;
    public Runnable d;

    public g$c(g$d g$d) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.a = arrayDeque;
        this.b = arrayDeque = new ArrayDeque();
        this.c = g$d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.b;
                        object2 = ((ArrayDeque)object2).poll();
                        this.d = object2 = (Runnable)object2;
                        if (object2 == null) break block3;
                        Executor executor = this.c;
                        executor.execute((Runnable)object2);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void execute(Runnable runnable2) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ArrayDeque arrayDeque = this.b;
                        Um um = new Um(this, runnable2);
                        arrayDeque.add(um);
                        runnable2 = this.d;
                        if (runnable2 != null) break block3;
                        this.a();
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

