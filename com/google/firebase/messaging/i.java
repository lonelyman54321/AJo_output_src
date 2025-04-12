/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ProxyNotificationInitializer;

public final class i
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ i(Context context, boolean bl2, TaskCompletionSource taskCompletionSource) {
        this.a = context;
        this.b = bl2;
        this.c = taskCompletionSource;
    }

    public final void run() {
        boolean bl2 = this.b;
        TaskCompletionSource taskCompletionSource = this.c;
        ProxyNotificationInitializer.a(this.a, bl2, taskCompletionSource);
    }
}

