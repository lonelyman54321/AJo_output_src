/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler$CrashListener;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

class CrashlyticsController$1
implements CrashlyticsUncaughtExceptionHandler$CrashListener {
    final /* synthetic */ CrashlyticsController this$0;

    public CrashlyticsController$1(CrashlyticsController crashlyticsController) {
        this.this$0 = crashlyticsController;
    }

    public void onUncaughtException(SettingsProvider settingsProvider, Thread thread2, Throwable throwable) {
        this.this$0.handleUncaughtException(settingsProvider, thread2, throwable);
    }
}

