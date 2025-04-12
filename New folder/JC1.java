/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class JC1
implements ThreadFactory {
    public static final AtomicInteger d;
    public final ThreadGroup a;
    public final AtomicInteger b;
    public final String c;

    static {
        AtomicInteger atomicInteger;
        d = atomicInteger = new AtomicInteger(1);
    }

    public JC1() {
        int n3 = 1;
        Object object = new AtomicInteger(n3);
        this.b = object;
        object = System.getSecurityManager();
        object = object == null ? Thread.currentThread().getThreadGroup() : ((SecurityManager)object).getThreadGroup();
        this.a = object;
        object = new StringBuilder("lottie-");
        n3 = d.getAndIncrement();
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("-thread-");
        this.c = object = ((StringBuilder)object).toString();
    }

    public final Thread newThread(Runnable runnable2) {
        Thread thread2;
        Object object = new StringBuilder();
        Object object2 = this.c;
        ((StringBuilder)object).append((String)object2);
        int n3 = this.b.getAndIncrement();
        ((StringBuilder)object).append(n3);
        String string2 = ((StringBuilder)object).toString();
        object2 = this.a;
        object = thread2;
        thread2 = new Thread((ThreadGroup)object2, runnable2, string2, 0L);
        thread2.setDaemon(false);
        thread2.setPriority(10);
        return thread2;
    }
}

