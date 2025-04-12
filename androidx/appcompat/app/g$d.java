/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.app;

import java.util.concurrent.Executor;

public final class g$d
implements Executor {
    public final void execute(Runnable runnable2) {
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}

