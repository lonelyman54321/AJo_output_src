/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;

public final class Xq0$b
implements ThreadFactory {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Thread newThread(Runnable runnable2) {
        synchronized (this) {
            String string2 = "glide-disk-lru-cache-thread";
            Thread thread2 = new Thread(runnable2, string2);
            int n3 = 1;
            thread2.setPriority(n3);
            return thread2;
        }
    }
}

