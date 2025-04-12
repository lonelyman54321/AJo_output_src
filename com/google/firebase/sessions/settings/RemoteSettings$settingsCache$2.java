/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.SettingsCache;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class RemoteSettings$settingsCache$2
extends Lambda
implements Function0 {
    final /* synthetic */ ui0 $dataStore;

    public RemoteSettings$settingsCache$2(ui0 ui02) {
        this.$dataStore = ui02;
        super(0);
    }

    public final SettingsCache invoke() {
        ui0 ui02 = this.$dataStore;
        SettingsCache settingsCache2 = new SettingsCache(ui02);
        return settingsCache2;
    }
}

