/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit;

public final class g
implements EventHandler {
    public final /* synthetic */ FirebaseMessaging$AutoInit a;

    public /* synthetic */ g(FirebaseMessaging$AutoInit firebaseMessaging$AutoInit) {
        this.a = firebaseMessaging$AutoInit;
    }

    public final void handle(Event event) {
        FirebaseMessaging$AutoInit.a(this.a, event);
    }
}

