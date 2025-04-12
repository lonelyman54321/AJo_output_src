/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.z;

public final class r
implements OnCompleteListener {
    public final /* synthetic */ z a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ r(z z5, TaskCompletionSource taskCompletionSource) {
        this.a = z5;
        this.b = taskCompletionSource;
    }

    public final void onComplete(Task task2) {
        z z5 = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        z.k(z5, taskCompletionSource, task2);
    }
}

