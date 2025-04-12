/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.ResultReceiver
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.l;

final class k
extends ResultReceiver {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ l b;

    public k(l l2, Handler handler, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
        this.b = l2;
        super(handler);
    }

    public final void onReceiveResult(int n3, Bundle object) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                TaskCompletionSource taskCompletionSource = this.a;
                object = new AssetPackException(-100);
                taskCompletionSource.trySetException((Exception)object);
                return;
            }
            TaskCompletionSource taskCompletionSource = this.a;
            object = 0;
            taskCompletionSource.trySetResult(object);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.a;
        object = -1;
        taskCompletionSource.trySetResult(object);
        l.b(this.b).b(null);
    }
}

