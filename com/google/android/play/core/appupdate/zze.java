/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.ResultReceiver
 */
package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.zzg;

final class zze
extends ResultReceiver {
    final /* synthetic */ TaskCompletionSource zza;

    public zze(zzg zzg2, Handler handler, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        super(handler);
    }

    public final void onReceiveResult(int n3, Bundle object) {
        int n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                TaskCompletionSource taskCompletionSource = this.zza;
                object = n4;
                taskCompletionSource.trySetResult(object);
                return;
            }
            TaskCompletionSource taskCompletionSource = this.zza;
            object = 0;
            taskCompletionSource.trySetResult(object);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.zza;
        object = -1;
        taskCompletionSource.trySetResult(object);
    }
}

