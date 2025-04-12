/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionFirelogPublisherImpl;

final class SessionFirelogPublisherImpl$shouldLogSession$1
extends h80_0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    public SessionFirelogPublisherImpl$shouldLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, f80_0 f80_02) {
        this.this$0 = sessionFirelogPublisherImpl;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return SessionFirelogPublisherImpl.access$shouldLogSession(this.this$0, this);
    }
}

