/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.InstallationId$Companion;

final class InstallationId$Companion$create$1
extends h80_0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InstallationId$Companion this$0;

    public InstallationId$Companion$create$1(InstallationId$Companion installationId$Companion, f80_0 f80_02) {
        this.this$0 = installationId$Companion;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return this.this$0.create(null, this);
    }
}

