/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.fido.u2f;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.fido.u2f.U2fApiClient;
import com.google.android.gms.internal.fido.zzt;
import com.google.android.gms.internal.fido.zzu;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzc
extends zzu {
    final /* synthetic */ TaskCompletionSource zza;

    public zzc(U2fApiClient u2fApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, PendingIntent object) {
        zzt zzt2 = new zzt((PendingIntent)object);
        object = this.zza;
        TaskUtil.setResultOrApiException(status, zzt2, (TaskCompletionSource)object);
    }
}

