/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.zzt;
import com.google.android.gms.tasks.zzu;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    public static final Executor MAIN_THREAD;
    static final Executor zza;

    static {
        Executor executor = new zzu();
        MAIN_THREAD = executor;
        executor = new zzt();
        zza = executor;
    }

    private TaskExecutors() {
    }
}

