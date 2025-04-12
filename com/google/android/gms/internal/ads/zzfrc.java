/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzftk;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfrc
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzfrc(Context context, TaskCompletionSource taskCompletionSource) {
        this.zza = context;
        this.zzb = taskCompletionSource;
    }

    public final void run() {
        Object object = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        object = zzftk.zzb(object, "GLAS", null);
        taskCompletionSource.setResult(object);
    }
}

