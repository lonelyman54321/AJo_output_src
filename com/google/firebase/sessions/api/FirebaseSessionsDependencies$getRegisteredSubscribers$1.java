/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies;

final class FirebaseSessionsDependencies$getRegisteredSubscribers$1
extends h80_0 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseSessionsDependencies this$0;

    public FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, f80_0 f80_02) {
        this.this$0 = firebaseSessionsDependencies;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return this.this$0.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
    }
}

