/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.GmsRpc;

public final class h
implements Continuation {
    public final /* synthetic */ GmsRpc a;

    public /* synthetic */ h(GmsRpc gmsRpc) {
        this.a = gmsRpc;
    }

    public final Object then(Task task2) {
        return GmsRpc.a(this.a, task2);
    }
}

