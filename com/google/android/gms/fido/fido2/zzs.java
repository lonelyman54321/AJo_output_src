/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.fido.fido2;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.internal.fido.zzi;
import com.google.android.gms.internal.fido.zzl;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzs
extends zzl {
    final /* synthetic */ TaskCompletionSource zza;

    public zzs(Fido2PrivilegedApiClient fido2PrivilegedApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, PendingIntent object) {
        zzi zzi2 = new zzi((PendingIntent)object);
        object = this.zza;
        TaskUtil.setResultOrApiException(status, zzi2, (TaskCompletionSource)object);
    }
}

