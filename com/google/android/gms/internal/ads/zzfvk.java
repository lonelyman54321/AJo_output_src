/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfvi;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzggk;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzfvk {
    public static ListenableFuture zza(Task task2, CancellationTokenSource object) {
        object = new zzfvj(task2, null);
        Executor executor = zzggk.zzb();
        zzfvi zzfvi2 = new zzfvi((zzfvj)object);
        task2.addOnCompleteListener(executor, (OnCompleteListener)zzfvi2);
        return object;
    }
}

