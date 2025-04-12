/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlinx.coroutines.EventLoopImplBase$DelayedTask;

final class EventLoopImplBase$DelayedRunnableTask
extends EventLoopImplBase$DelayedTask {
    public final Runnable c;

    public EventLoopImplBase$DelayedRunnableTask(long l2, Runnable runnable2) {
        super(l2);
        this.c = runnable2;
    }

    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = super.toString();
        stringBuilder.append((String)object);
        object = this.c;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

