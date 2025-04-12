/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.RequestDeduplicator;

public final class k
implements Continuation {
    public final /* synthetic */ RequestDeduplicator a;
    public final /* synthetic */ String b;

    public /* synthetic */ k(RequestDeduplicator requestDeduplicator, String string2) {
        this.a = requestDeduplicator;
        this.b = string2;
    }

    public final Object then(Task task2) {
        RequestDeduplicator requestDeduplicator = this.a;
        String string2 = this.b;
        return RequestDeduplicator.a(requestDeduplicator, string2, task2);
    }
}

