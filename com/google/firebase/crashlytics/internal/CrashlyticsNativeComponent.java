/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

public interface CrashlyticsNativeComponent {
    public NativeSessionFileProvider getSessionFileProvider(String var1);

    public boolean hasCrashDataForCurrentSession();

    public boolean hasCrashDataForSession(String var1);

    public void prepareNativeSession(String var1, String var2, long var3, StaticSessionData var5);
}

