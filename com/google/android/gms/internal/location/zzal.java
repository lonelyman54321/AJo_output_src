/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzai;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzg;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzal
implements RemoteCall {
    private final /* synthetic */ ActivityTransitionRequest zza;
    private final /* synthetic */ PendingIntent zzb;

    public /* synthetic */ zzal(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.zza = activityTransitionRequest;
        this.zzb = pendingIntent;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzg)object;
        Object object3 = zzaj.zzb;
        object3 = new zzai((TaskCompletionSource)object2);
        object2 = this.zza;
        Preconditions.checkNotNull(object2, "activityTransitionRequest must be specified.");
        PendingIntent pendingIntent = this.zzb;
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(object3, "ResultHolder not provided.");
        StatusCallback statusCallback = new StatusCallback((BaseImplementation$ResultHolder)object3);
        ((zzv)((BaseGmsClient)object).getService()).zzj((ActivityTransitionRequest)object2, pendingIntent, statusCallback);
    }
}

