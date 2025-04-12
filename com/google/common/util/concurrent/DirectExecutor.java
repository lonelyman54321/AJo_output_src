/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

final class DirectExecutor
extends Enum
implements Executor {
    private static final /* synthetic */ DirectExecutor[] $VALUES;
    public static final /* enum */ DirectExecutor INSTANCE;

    private static /* synthetic */ DirectExecutor[] $values() {
        DirectExecutor directExecutor = INSTANCE;
        DirectExecutor[] directExecutorArray = new DirectExecutor[]{directExecutor};
        return directExecutorArray;
    }

    static {
        DirectExecutor directExecutor;
        INSTANCE = directExecutor = new DirectExecutor("INSTANCE", 0);
        $VALUES = DirectExecutor.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DirectExecutor() {
        void var2_-1;
        void var1_-1;
    }

    public static DirectExecutor valueOf(String string2) {
        return Enum.valueOf(DirectExecutor.class, string2);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[])$VALUES.clone();
    }

    public void execute(Runnable runnable2) {
        runnable2.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

