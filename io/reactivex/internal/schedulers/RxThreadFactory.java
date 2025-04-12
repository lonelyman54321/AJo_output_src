/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class RxThreadFactory
extends AtomicLong
implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    public final String a;
    public final int b;
    public final boolean c;

    public RxThreadFactory(String string2) {
        this(string2, 5, false);
    }

    public RxThreadFactory(String string2, int n3, boolean bl2) {
        this.a = string2;
        this.b = n3;
        this.c = bl2;
    }

    public final Thread newThread(Runnable runnable2) {
        Object object = this.a;
        CharSequence charSequence = new StringBuilder((String)object);
        charSequence.append('-');
        long l2 = this.incrementAndGet();
        charSequence.append(l2);
        charSequence = charSequence.toString();
        boolean bl2 = this.c;
        object = bl2 ? new Thread(runnable2, (String)charSequence) : new Thread(runnable2, (String)charSequence);
        int n3 = this.b;
        ((Thread)object).setPriority(n3);
        ((Thread)object).setDaemon(true);
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RxThreadFactory[");
        String string2 = this.a;
        return h30_0.a(stringBuilder, string2, "]");
    }
}

