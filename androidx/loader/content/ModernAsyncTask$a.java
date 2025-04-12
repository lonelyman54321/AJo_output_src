/*
 * Decompiled with CFR 0.152.
 */
package androidx.loader.content;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class ModernAsyncTask$a
implements ThreadFactory {
    public final AtomicInteger a;

    public ModernAsyncTask$a() {
        AtomicInteger atomicInteger;
        this.a = atomicInteger = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable2) {
        CharSequence charSequence = new StringBuilder("ModernAsyncTask #");
        int n3 = this.a.getAndIncrement();
        charSequence.append(n3);
        charSequence = charSequence.toString();
        Thread thread2 = new Thread(runnable2, (String)charSequence);
        return thread2;
    }
}

