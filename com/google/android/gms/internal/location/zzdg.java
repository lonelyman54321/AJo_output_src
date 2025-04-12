/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzs;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdg
extends zzs {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdg(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(int n3, String[] object) {
        n3 = GeofenceStatusCodes.zza(n3);
        object = new Status(n3);
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException((Status)object, taskCompletionSource);
    }

    public final void zzc(int n3, String[] object) {
        n3 = GeofenceStatusCodes.zza(n3);
        object = new Status(n3);
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException((Status)object, taskCompletionSource);
    }

    public final void zzd(int n3, PendingIntent object) {
        n3 = GeofenceStatusCodes.zza(n3);
        object = new Status(n3);
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException((Status)object, taskCompletionSource);
    }
}

