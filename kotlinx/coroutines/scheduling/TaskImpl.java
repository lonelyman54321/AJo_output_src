/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.Task;

final class TaskImpl
extends Task {
    public final Runnable c;

    public TaskImpl(Runnable runnable2, long l2, boolean bl2) {
        super(l2, bl2);
        this.c = runnable2;
    }

    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Task[");
        Object object = this.c;
        String string2 = object.getClass().getSimpleName();
        stringBuilder.append(string2);
        char c2 = '@';
        stringBuilder.append(c2);
        object = si0_2.d(object);
        stringBuilder.append((String)object);
        object = ", ";
        stringBuilder.append((String)object);
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append((String)object);
        boolean bl2 = this.b;
        string2 = xi3_2.a;
        object = bl2 ? "Blocking" : "Non-blocking";
        return ui0_1.a(stringBuilder, (String)object, ']');
    }
}

