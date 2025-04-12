/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.SessionsSettings;

final class SessionsSettings$updateSettings$1
extends h80_0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionsSettings this$0;

    public SessionsSettings$updateSettings$1(SessionsSettings sessionsSettings, f80_0 f80_02) {
        this.this$0 = sessionsSettings;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return this.this$0.updateSettings(this);
    }
}

