/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzai;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzg;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzam
implements RemoteCall {
    private final /* synthetic */ PendingIntent zza;

    public /* synthetic */ zzam(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzg)object;
        Object object3 = zzaj.zzb;
        object3 = new zzai((TaskCompletionSource)object2);
        Preconditions.checkNotNull(object3, "ResultHolder not provided.");
        object2 = new StatusCallback((BaseImplementation$ResultHolder)object3);
        object = (zzv)((BaseGmsClient)object).getService();
        object3 = this.zza;
        object.zzk((PendingIntent)object3, (IStatusCallback)object2);
    }
}

