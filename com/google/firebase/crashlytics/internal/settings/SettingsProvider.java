/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.settings;

import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.settings.Settings;

public interface SettingsProvider {
    public Task getSettingsAsync();

    public Settings getSettingsSync();
}

