/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner;
import com.google.common.util.concurrent.ClosingFuture$Combiner3$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner3$2;
import com.google.common.util.concurrent.ClosingFuture$Combiner3$AsyncClosingFunction3;
import com.google.common.util.concurrent.ClosingFuture$Combiner3$ClosingFunction3;
import java.util.concurrent.Executor;

public final class ClosingFuture$Combiner3
extends ClosingFuture$Combiner {
    private final ClosingFuture future1;
    private final ClosingFuture future2;
    private final ClosingFuture future3;

    private ClosingFuture$Combiner3(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3) {
        ImmutableList immutableList = ImmutableList.of(closingFuture, closingFuture2, closingFuture3);
        super(true, immutableList, null);
        this.future1 = closingFuture;
        this.future2 = closingFuture2;
        this.future3 = closingFuture3;
    }

    public /* synthetic */ ClosingFuture$Combiner3(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture$1 closingFuture$1) {
        this(closingFuture, closingFuture2, closingFuture3);
    }

    public static /* synthetic */ ClosingFuture access$2000(ClosingFuture$Combiner3 closingFuture$Combiner3) {
        return closingFuture$Combiner3.future1;
    }

    public static /* synthetic */ ClosingFuture access$2100(ClosingFuture$Combiner3 closingFuture$Combiner3) {
        return closingFuture$Combiner3.future2;
    }

    public static /* synthetic */ ClosingFuture access$2200(ClosingFuture$Combiner3 closingFuture$Combiner3) {
        return closingFuture$Combiner3.future3;
    }

    public ClosingFuture call(ClosingFuture$Combiner3$ClosingFunction3 closingFuture$Combiner3$ClosingFunction3, Executor executor) {
        ClosingFuture$Combiner3$1 closingFuture$Combiner3$1 = new ClosingFuture$Combiner3$1(this, closingFuture$Combiner3$ClosingFunction3);
        return this.call(closingFuture$Combiner3$1, executor);
    }

    public ClosingFuture callAsync(ClosingFuture$Combiner3$AsyncClosingFunction3 closingFuture$Combiner3$AsyncClosingFunction3, Executor executor) {
        ClosingFuture$Combiner3$2 closingFuture$Combiner3$2 = new ClosingFuture$Combiner3$2(this, closingFuture$Combiner3$AsyncClosingFunction3);
        return this.callAsync(closingFuture$Combiner3$2, executor);
    }
}

