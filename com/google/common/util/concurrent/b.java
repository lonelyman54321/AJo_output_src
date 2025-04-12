/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractExecutionThreadService$1;

public final class b
implements Runnable {
    public final /* synthetic */ AbstractExecutionThreadService$1 a;

    public /* synthetic */ b(AbstractExecutionThreadService$1 var1_1) {
        this.a = var1_1;
    }

    public final void run() {
        AbstractExecutionThreadService$1.b(this.a);
    }
}

