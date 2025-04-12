/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Store$Token;

public final class d
implements SuccessContinuation {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Store$Token c;

    public /* synthetic */ d(FirebaseMessaging firebaseMessaging, String string2, Store$Token store$Token) {
        this.a = firebaseMessaging;
        this.b = string2;
        this.c = store$Token;
    }

    public final Task then(Object object) {
        Store$Token store$Token = this.c;
        object = (String)object;
        FirebaseMessaging firebaseMessaging = this.a;
        String string2 = this.b;
        return FirebaseMessaging.b(firebaseMessaging, string2, store$Token, (String)object);
    }
}

