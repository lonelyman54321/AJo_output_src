/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzg;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzao
implements RemoteCall {
    private final /* synthetic */ zzaj zza;
    private final /* synthetic */ PendingIntent zzb;
    private final /* synthetic */ SleepSegmentRequest zzc;

    public /* synthetic */ zzao(zzaj zzaj2, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.zza = zzaj2;
        this.zzb = pendingIntent;
        this.zzc = sleepSegmentRequest;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        Object object3 = this.zza;
        object2 = (TaskCompletionSource)object2;
        object = (zzg)object;
        zzah zzah2 = new zzah((zzaj)object3, (TaskCompletionSource)object2);
        object = (zzv)((BaseGmsClient)object).getService();
        object2 = this.zzb;
        object3 = this.zzc;
        object.zzm((PendingIntent)object2, (SleepSegmentRequest)object3, zzah2);
    }
}

