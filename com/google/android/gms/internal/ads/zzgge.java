/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface zzgge
extends ExecutorService {
    public ListenableFuture zza(Runnable var1);

    public ListenableFuture zzb(Callable var1);
}

