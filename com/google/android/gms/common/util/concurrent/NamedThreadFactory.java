/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.zza;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory
implements ThreadFactory {
    private final String zza;
    private final ThreadFactory zzb;

    public NamedThreadFactory(String string2) {
        ThreadFactory threadFactory;
        this.zzb = threadFactory = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(string2, "Name must not be null");
        this.zza = string2;
    }

    public final Thread newThread(Runnable runnable2) {
        Object object = new zza(runnable2, 0);
        runnable2 = this.zzb.newThread((Runnable)object);
        object = this.zza;
        ((Thread)runnable2).setName((String)object);
        return runnable2;
    }
}

