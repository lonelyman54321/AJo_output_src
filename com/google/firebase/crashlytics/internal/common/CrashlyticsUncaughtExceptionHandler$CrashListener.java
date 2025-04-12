/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

interface CrashlyticsUncaughtExceptionHandler$CrashListener {
    public void onUncaughtException(SettingsProvider var1, Thread var2, Throwable var3);
}

