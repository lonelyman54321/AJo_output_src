/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzn;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzw
extends zzn {
    final /* synthetic */ TaskCompletionSource zza;

    public zzw(zzab zzab2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = this.zza;
        zzab.zzf(status, bundle, taskCompletionSource);
    }
}

