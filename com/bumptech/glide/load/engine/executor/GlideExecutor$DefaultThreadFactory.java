/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine.executor;

import com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory;
import com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory$1;
import com.bumptech.glide.load.engine.executor.GlideExecutor$a;
import com.bumptech.glide.load.engine.executor.GlideExecutor$a$a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class GlideExecutor$DefaultThreadFactory
implements ThreadFactory {
    public final ThreadFactory a;
    public final String b;
    public final GlideExecutor$a c;
    public final boolean d;
    public final AtomicInteger e;

    public GlideExecutor$DefaultThreadFactory(GlideExecutor$DefaultPriorityThreadFactory glideExecutor$DefaultPriorityThreadFactory, String string2, boolean bl2) {
        AtomicInteger atomicInteger;
        GlideExecutor$a$a glideExecutor$a$a = GlideExecutor$a.a;
        this.e = atomicInteger = new AtomicInteger();
        this.a = glideExecutor$DefaultPriorityThreadFactory;
        this.b = string2;
        this.c = glideExecutor$a$a;
        this.d = bl2;
    }

    public final Thread newThread(Runnable runnable2) {
        Object object = new GlideExecutor$DefaultThreadFactory$1(this, runnable2);
        runnable2 = this.a.newThread((Runnable)object);
        object = new StringBuilder("glide-");
        String string2 = this.b;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("-thread-");
        int n3 = this.e.getAndIncrement();
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        ((Thread)runnable2).setName((String)object);
        return runnable2;
    }
}

