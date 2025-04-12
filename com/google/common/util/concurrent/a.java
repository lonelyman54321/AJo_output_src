/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractExecutionThreadService$1;

public final class a
implements Supplier {
    public final /* synthetic */ AbstractExecutionThreadService$1 a;

    public /* synthetic */ a(AbstractExecutionThreadService$1 abstractExecutionThreadService$1) {
        this.a = abstractExecutionThreadService$1;
    }

    public final Object get() {
        return AbstractExecutionThreadService$1.a(this.a);
    }
}

