/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.ResultReceiver
 */
package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.zzd;

final class zzc
extends ResultReceiver {
    final /* synthetic */ TaskCompletionSource zza;

    public zzc(zzd zzd2, Handler handler, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        super(handler);
    }

    public final void onReceiveResult(int n3, Bundle bundle) {
        this.zza.trySetResult(null);
    }
}

