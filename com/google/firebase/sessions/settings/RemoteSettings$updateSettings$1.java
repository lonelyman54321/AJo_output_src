/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.RemoteSettings;

final class RemoteSettings$updateSettings$1
extends h80_0 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteSettings this$0;

    public RemoteSettings$updateSettings$1(RemoteSettings remoteSettings, f80_0 f80_02) {
        this.this$0 = remoteSettings;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return this.this$0.updateSettings(this);
    }
}

