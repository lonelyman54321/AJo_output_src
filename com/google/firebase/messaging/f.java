/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RequestDeduplicator$GetTokenRequest;
import com.google.firebase.messaging.Store$Token;

public final class f
implements RequestDeduplicator$GetTokenRequest {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Store$Token c;

    public /* synthetic */ f(FirebaseMessaging firebaseMessaging, String string2, Store$Token store$Token) {
        this.a = firebaseMessaging;
        this.b = string2;
        this.c = store$Token;
    }

    public final Task start() {
        String string2 = this.b;
        Store$Token store$Token = this.c;
        return FirebaseMessaging.l(this.a, string2, store$Token);
    }
}

