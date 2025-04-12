/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzg;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzak
implements RemoteCall {
    private final /* synthetic */ PendingIntent zza;

    public /* synthetic */ zzak(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzg)object;
        Api api = zzaj.zzb;
        api = this.zza;
        ((zzg)object).zzp((PendingIntent)api);
        ((TaskCompletionSource)object2).setResult(null);
    }
}

