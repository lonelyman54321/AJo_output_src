/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler$CrashListener;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsUncaughtExceptionHandler
implements Thread.UncaughtExceptionHandler {
    private final CrashlyticsUncaughtExceptionHandler$CrashListener crashListener;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicBoolean isHandlingException;
    private final CrashlyticsNativeComponent nativeComponent;
    private final SettingsProvider settingsProvider;

    public CrashlyticsUncaughtExceptionHandler(CrashlyticsUncaughtExceptionHandler$CrashListener object, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = object;
        this.settingsProvider = settingsProvider;
        this.defaultHandler = uncaughtExceptionHandler;
        this.isHandlingException = object = new AtomicBoolean(false);
        this.nativeComponent = crashlyticsNativeComponent;
    }

    private boolean shouldRecordUncaughtException(Thread object, Throwable throwable) {
        if (object == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (throwable == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        object = this.nativeComponent;
        boolean bl2 = object.hasCrashDataForCurrentSession();
        if (bl2) {
            Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    public boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void uncaughtException(Thread var1_1, Throwable var2_2) {
        block10: {
            var3_3 = "Completed exception processing, but no default exception handler.";
            var4_4 = "Completed exception processing. Invoking default exception handler.";
            var5_5 = this.isHandlingException;
            var6_6 = 1;
            var5_5.set((boolean)var6_6);
            var5_5 = null;
            try {
                var7_7 = this.shouldRecordUncaughtException((Thread)var1_1, var2_2);
                if (var7_7) {
                    var8_8 = this.crashListener;
                    var9_12 = this.settingsProvider;
                    var8_8.onUncaughtException(var9_12, (Thread)var1_1, var2_2);
                } else {
                    var8_8 = Logger.getLogger();
                    var9_13 = "Uncaught exception will not be recorded by Crashlytics.";
                    var8_8.d(var9_13);
                }
                var8_8 = this.defaultHandler;
                if (var8_8 == null) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            catch (Throwable var8_9) {
                break block10;
            }
            catch (Exception var8_10) {}
            var9_14 = Logger.getLogger();
            var10_16 = "An error occurred in the uncaught exception handler";
            var9_14.e(var10_16, var8_10);
            var8_11 = this.defaultHandler;
            if (var8_11 != null) lbl-1000:
            // 2 sources

            {
                Logger.getLogger().d(var4_4);
                var3_3 = this.defaultHandler;
                var3_3.uncaughtException((Thread)var1_1, var2_2);
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = Logger.getLogger();
                var1_1.d((String)var3_3);
                System.exit(var6_6);
            }
            var1_1 = this.isHandlingException;
            var1_1.set(false);
            return;
        }
        var9_15 = this.defaultHandler;
        if (var9_15 != null) {
            Logger.getLogger().d(var4_4);
            var3_3 = this.defaultHandler;
            var3_3.uncaughtException((Thread)var1_1, var2_2);
        } else {
            var1_1 = Logger.getLogger();
            var1_1.d((String)var3_3);
            System.exit(var6_6);
        }
        this.isHandlingException.set(false);
        throw var8_9;
    }
}

