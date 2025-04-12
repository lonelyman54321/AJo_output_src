/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2;

public final class SessionDatastoreImpl$special$$inlined$map$1$2$1
extends h80_0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionDatastoreImpl$special$$inlined$map$1$2 this$0;

    public SessionDatastoreImpl$special$$inlined$map$1$2$1(SessionDatastoreImpl$special$$inlined$map$1$2 sessionDatastoreImpl$special$$inlined$map$1$2, f80_0 f80_02) {
        this.this$0 = sessionDatastoreImpl$special$$inlined$map$1$2;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return this.this$0.emit(null, this);
    }
}

