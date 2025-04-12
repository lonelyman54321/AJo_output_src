/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import kotlin.time.a;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface SettingsProvider {
    public Double getSamplingRate();

    public Boolean getSessionEnabled();

    public a getSessionRestartTimeout-FghU774();

    public boolean isSettingsStale();

    public Object updateSettings(f80_0 var1);
}

