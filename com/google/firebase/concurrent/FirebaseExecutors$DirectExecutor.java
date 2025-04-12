/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

final class FirebaseExecutors$DirectExecutor
extends Enum
implements Executor {
    private static final /* synthetic */ FirebaseExecutors$DirectExecutor[] $VALUES;
    public static final /* enum */ FirebaseExecutors$DirectExecutor INSTANCE;

    private static /* synthetic */ FirebaseExecutors$DirectExecutor[] $values() {
        FirebaseExecutors$DirectExecutor firebaseExecutors$DirectExecutor = INSTANCE;
        FirebaseExecutors$DirectExecutor[] firebaseExecutors$DirectExecutorArray = new FirebaseExecutors$DirectExecutor[]{firebaseExecutors$DirectExecutor};
        return firebaseExecutors$DirectExecutorArray;
    }

    static {
        FirebaseExecutors$DirectExecutor firebaseExecutors$DirectExecutor;
        INSTANCE = firebaseExecutors$DirectExecutor = new FirebaseExecutors$DirectExecutor("INSTANCE", 0);
        $VALUES = FirebaseExecutors$DirectExecutor.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FirebaseExecutors$DirectExecutor() {
        void var2_-1;
        void var1_-1;
    }

    public static FirebaseExecutors$DirectExecutor valueOf(String string2) {
        return Enum.valueOf(FirebaseExecutors$DirectExecutor.class, string2);
    }

    public static FirebaseExecutors$DirectExecutor[] values() {
        return (FirebaseExecutors$DirectExecutor[])$VALUES.clone();
    }

    public void execute(Runnable runnable2) {
        runnable2.run();
    }
}

