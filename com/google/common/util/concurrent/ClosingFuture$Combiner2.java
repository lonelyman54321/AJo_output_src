/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner;
import com.google.common.util.concurrent.ClosingFuture$Combiner2$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner2$2;
import com.google.common.util.concurrent.ClosingFuture$Combiner2$AsyncClosingFunction2;
import com.google.common.util.concurrent.ClosingFuture$Combiner2$ClosingFunction2;
import java.util.concurrent.Executor;

public final class ClosingFuture$Combiner2
extends ClosingFuture$Combiner {
    private final ClosingFuture future1;
    private final ClosingFuture future2;

    private ClosingFuture$Combiner2(ClosingFuture closingFuture, ClosingFuture closingFuture2) {
        ImmutableList immutableList = ImmutableList.of(closingFuture, closingFuture2);
        super(true, immutableList, null);
        this.future1 = closingFuture;
        this.future2 = closingFuture2;
    }

    public /* synthetic */ ClosingFuture$Combiner2(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture$1 closingFuture$1) {
        this(closingFuture, closingFuture2);
    }

    public static /* synthetic */ ClosingFuture access$1800(ClosingFuture$Combiner2 closingFuture$Combiner2) {
        return closingFuture$Combiner2.future1;
    }

    public static /* synthetic */ ClosingFuture access$1900(ClosingFuture$Combiner2 closingFuture$Combiner2) {
        return closingFuture$Combiner2.future2;
    }

    public ClosingFuture call(ClosingFuture$Combiner2$ClosingFunction2 closingFuture$Combiner2$ClosingFunction2, Executor executor) {
        ClosingFuture$Combiner2$1 closingFuture$Combiner2$1 = new ClosingFuture$Combiner2$1(this, closingFuture$Combiner2$ClosingFunction2);
        return this.call(closingFuture$Combiner2$1, executor);
    }

    public ClosingFuture callAsync(ClosingFuture$Combiner2$AsyncClosingFunction2 closingFuture$Combiner2$AsyncClosingFunction2, Executor executor) {
        ClosingFuture$Combiner2$2 closingFuture$Combiner2$2 = new ClosingFuture$Combiner2$2(this, closingFuture$Combiner2$AsyncClosingFunction2);
        return this.callAsync(closingFuture$Combiner2$2, executor);
    }
}

