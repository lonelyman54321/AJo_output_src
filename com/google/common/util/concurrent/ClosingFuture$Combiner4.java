/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner;
import com.google.common.util.concurrent.ClosingFuture$Combiner4$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner4$2;
import com.google.common.util.concurrent.ClosingFuture$Combiner4$AsyncClosingFunction4;
import com.google.common.util.concurrent.ClosingFuture$Combiner4$ClosingFunction4;
import java.util.concurrent.Executor;

public final class ClosingFuture$Combiner4
extends ClosingFuture$Combiner {
    private final ClosingFuture future1;
    private final ClosingFuture future2;
    private final ClosingFuture future3;
    private final ClosingFuture future4;

    private ClosingFuture$Combiner4(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4) {
        ImmutableList immutableList = ImmutableList.of(closingFuture, closingFuture2, closingFuture3, closingFuture4);
        super(true, immutableList, null);
        this.future1 = closingFuture;
        this.future2 = closingFuture2;
        this.future3 = closingFuture3;
        this.future4 = closingFuture4;
    }

    public /* synthetic */ ClosingFuture$Combiner4(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture$1 closingFuture$1) {
        this(closingFuture, closingFuture2, closingFuture3, closingFuture4);
    }

    public static /* synthetic */ ClosingFuture access$2300(ClosingFuture$Combiner4 closingFuture$Combiner4) {
        return closingFuture$Combiner4.future1;
    }

    public static /* synthetic */ ClosingFuture access$2400(ClosingFuture$Combiner4 closingFuture$Combiner4) {
        return closingFuture$Combiner4.future2;
    }

    public static /* synthetic */ ClosingFuture access$2500(ClosingFuture$Combiner4 closingFuture$Combiner4) {
        return closingFuture$Combiner4.future3;
    }

    public static /* synthetic */ ClosingFuture access$2600(ClosingFuture$Combiner4 closingFuture$Combiner4) {
        return closingFuture$Combiner4.future4;
    }

    public ClosingFuture call(ClosingFuture$Combiner4$ClosingFunction4 closingFuture$Combiner4$ClosingFunction4, Executor executor) {
        ClosingFuture$Combiner4$1 closingFuture$Combiner4$1 = new ClosingFuture$Combiner4$1(this, closingFuture$Combiner4$ClosingFunction4);
        return this.call(closingFuture$Combiner4$1, executor);
    }

    public ClosingFuture callAsync(ClosingFuture$Combiner4$AsyncClosingFunction4 closingFuture$Combiner4$AsyncClosingFunction4, Executor executor) {
        ClosingFuture$Combiner4$2 closingFuture$Combiner4$2 = new ClosingFuture$Combiner4$2(this, closingFuture$Combiner4$AsyncClosingFunction4);
        return this.callAsync(closingFuture$Combiner4$2, executor);
    }
}

