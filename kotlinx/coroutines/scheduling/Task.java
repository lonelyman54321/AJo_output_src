/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.scheduling;

public abstract class Task
implements Runnable {
    public long a;
    public boolean b;

    public Task() {
        this(0L, false);
    }

    public Task(long l2, boolean bl2) {
        this.a = l2;
        this.b = bl2;
    }
}

