/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner;
import com.google.common.util.concurrent.ClosingFuture$Combiner5$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner5$2;
import com.google.common.util.concurrent.ClosingFuture$Combiner5$AsyncClosingFunction5;
import com.google.common.util.concurrent.ClosingFuture$Combiner5$ClosingFunction5;
import java.util.concurrent.Executor;

public final class ClosingFuture$Combiner5
extends ClosingFuture$Combiner {
    private final ClosingFuture future1;
    private final ClosingFuture future2;
    private final ClosingFuture future3;
    private final ClosingFuture future4;
    private final ClosingFuture future5;

    private ClosingFuture$Combiner5(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5) {
        ImmutableList immutableList = ImmutableList.of(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5);
        super(true, immutableList, null);
        this.future1 = closingFuture;
        this.future2 = closingFuture2;
        this.future3 = closingFuture3;
        this.future4 = closingFuture4;
        this.future5 = closingFuture5;
    }

    public /* synthetic */ ClosingFuture$Combiner5(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5, ClosingFuture$1 closingFuture$1) {
        this(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5);
    }

    public static /* synthetic */ ClosingFuture access$2700(ClosingFuture$Combiner5 closingFuture$Combiner5) {
        return closingFuture$Combiner5.future1;
    }

    public static /* synthetic */ ClosingFuture access$2800(ClosingFuture$Combiner5 closingFuture$Combiner5) {
        return closingFuture$Combiner5.future2;
    }

    public static /* synthetic */ ClosingFuture access$2900(ClosingFuture$Combiner5 closingFuture$Combiner5) {
        return closingFuture$Combiner5.future3;
    }

    public static /* synthetic */ ClosingFuture access$3000(ClosingFuture$Combiner5 closingFuture$Combiner5) {
        return closingFuture$Combiner5.future4;
    }

    public static /* synthetic */ ClosingFuture access$3100(ClosingFuture$Combiner5 closingFuture$Combiner5) {
        return closingFuture$Combiner5.future5;
    }

    public ClosingFuture call(ClosingFuture$Combiner5$ClosingFunction5 closingFuture$Combiner5$ClosingFunction5, Executor executor) {
        ClosingFuture$Combiner5$1 closingFuture$Combiner5$1 = new ClosingFuture$Combiner5$1(this, closingFuture$Combiner5$ClosingFunction5);
        return this.call(closingFuture$Combiner5$1, executor);
    }

    public ClosingFuture callAsync(ClosingFuture$Combiner5$AsyncClosingFunction5 closingFuture$Combiner5$AsyncClosingFunction5, Executor executor) {
        ClosingFuture$Combiner5$2 closingFuture$Combiner5$2 = new ClosingFuture$Combiner5$2(this, closingFuture$Combiner5$AsyncClosingFunction5);
        return this.callAsync(closingFuture$Combiner5$2, executor);
    }
}

