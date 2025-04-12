/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.SettingsCache;

final class SettingsCache$updateConfigValue$1
extends h80_0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    public SettingsCache$updateConfigValue$1(SettingsCache settingsCache2, f80_0 f80_02) {
        this.this$0 = settingsCache2;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return SettingsCache.access$updateConfigValue(this.this$0, null, null, this);
    }
}

