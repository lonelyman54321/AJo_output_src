/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceBinder;
import com.google.firebase.messaging.WithinAppServiceConnection$BindRequest;

public final class o
implements OnCompleteListener {
    public final /* synthetic */ WithinAppServiceConnection$BindRequest a;

    public /* synthetic */ o(WithinAppServiceConnection$BindRequest withinAppServiceConnection$BindRequest) {
        this.a = withinAppServiceConnection$BindRequest;
    }

    public final void onComplete(Task task2) {
        WithinAppServiceBinder.a(this.a, task2);
    }
}

