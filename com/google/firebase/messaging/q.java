/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection$BindRequest;
import java.util.concurrent.ScheduledFuture;

public final class q
implements OnCompleteListener {
    public final /* synthetic */ ScheduledFuture a;

    public /* synthetic */ q(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void onComplete(Task task2) {
        WithinAppServiceConnection$BindRequest.a(this.a, task2);
    }
}

