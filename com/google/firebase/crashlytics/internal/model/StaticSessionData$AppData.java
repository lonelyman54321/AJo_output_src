/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_AppData;

public abstract class StaticSessionData$AppData {
    public static StaticSessionData$AppData create(String string2, String string3, String string4, String string5, int n3, DevelopmentPlatformProvider developmentPlatformProvider) {
        AutoValue_StaticSessionData_AppData autoValue_StaticSessionData_AppData = new AutoValue_StaticSessionData_AppData(string2, string3, string4, string5, n3, developmentPlatformProvider);
        return autoValue_StaticSessionData_AppData;
    }

    public abstract String appIdentifier();

    public abstract int deliveryMechanism();

    public abstract DevelopmentPlatformProvider developmentPlatformProvider();

    public abstract String installUuid();

    public abstract String versionCode();

    public abstract String versionName();
}

