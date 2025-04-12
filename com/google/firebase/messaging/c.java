/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.TopicsSubscriber;

public final class c
implements OnSuccessListener {
    public final /* synthetic */ FirebaseMessaging a;

    public /* synthetic */ c(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    public final void onSuccess(Object object) {
        FirebaseMessaging firebaseMessaging = this.a;
        object = (TopicsSubscriber)object;
        FirebaseMessaging.m(firebaseMessaging, (TopicsSubscriber)object);
    }
}

