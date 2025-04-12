/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzz
implements Continuation {
    public final /* synthetic */ Rpc zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzz(Rpc rpc, Bundle bundle) {
        this.zza = rpc;
        this.zzb = bundle;
    }

    public final Object then(Task task2) {
        Rpc rpc = this.zza;
        Bundle bundle = this.zzb;
        return rpc.zzb(bundle, task2);
    }
}

