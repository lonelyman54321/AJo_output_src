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
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzi
extends zzq {
    final /* synthetic */ TaskCompletionSource zza;

    public zzi(Fido2ApiClient fido2ApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, PendingIntent object) {
        com.google.android.gms.internal.fido.zzi zzi2 = new com.google.android.gms.internal.fido.zzi((PendingIntent)object);
        object = this.zza;
        TaskUtil.setResultOrApiException(status, zzi2, (TaskCompletionSource)object);
    }
}

