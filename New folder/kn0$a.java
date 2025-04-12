/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class kn0$a
implements ThreadFactory {
    public final AtomicInteger a;

    public kn0$a() {
        AtomicInteger atomicInteger;
        this.a = atomicInteger = new AtomicInteger(0);
    }

    public final Thread newThread(Runnable object) {
        Thread thread2 = new Thread((Runnable)object);
        object = new StringBuilder("arch_disk_io_");
        int n3 = this.a.getAndIncrement();
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        thread2.setName((String)object);
        return thread2;
    }
}

