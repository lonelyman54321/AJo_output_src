/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.cloudmessaging;

import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

public final class zzad
implements OnCompleteListener {
    public final /* synthetic */ Rpc zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ScheduledFuture zzc;

    public /* synthetic */ zzad(Rpc rpc, String string2, ScheduledFuture scheduledFuture) {
        this.zza = rpc;
        this.zzb = string2;
        this.zzc = scheduledFuture;
    }

    public final void onComplete(Task task2) {
        Rpc rpc = this.zza;
        String string2 = this.zzb;
        ScheduledFuture scheduledFuture = this.zzc;
        rpc.zzd(string2, scheduledFuture, task2);
    }
}

