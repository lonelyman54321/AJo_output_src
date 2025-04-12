/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WakeLockHolder;

public final class n
implements OnCompleteListener {
    public final /* synthetic */ Intent a;

    public /* synthetic */ n(Intent intent) {
        this.a = intent;
    }

    public final void onComplete(Task task2) {
        WakeLockHolder.a(this.a, task2);
    }
}

