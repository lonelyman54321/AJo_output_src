/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzem;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcu
implements RemoteCall {
    private final /* synthetic */ PendingIntent zza;

    public /* synthetic */ zzcu(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        zzem zzem2 = zzem.zzb(this.zza);
        ((zzdz)object).zzF(zzem2, (TaskCompletionSource)object2);
    }
}

