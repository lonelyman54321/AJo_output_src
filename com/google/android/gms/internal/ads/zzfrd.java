/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftk;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfrd
implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzfrd(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        TaskCompletionSource taskCompletionSource = this.zza;
        zzftk zzftk2 = zzftk.zzc();
        taskCompletionSource.setResult(zzftk2);
    }
}

