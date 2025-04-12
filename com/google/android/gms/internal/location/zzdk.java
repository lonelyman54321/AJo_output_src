/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdk
extends zzy {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdk(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, Location location) {
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException(status, location, taskCompletionSource);
    }
}

