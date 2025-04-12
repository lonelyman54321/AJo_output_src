/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.TopicsSubscriber;

public final class e
implements SuccessContinuation {
    public final /* synthetic */ String a;

    public /* synthetic */ e(String string2) {
        this.a = string2;
    }

    public final Task then(Object object) {
        String string2 = this.a;
        object = (TopicsSubscriber)object;
        return FirebaseMessaging.g(string2, (TopicsSubscriber)object);
    }
}

