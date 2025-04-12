/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData;

public abstract class StaticSessionData {
    public static StaticSessionData create(StaticSessionData$AppData staticSessionData$AppData, StaticSessionData$OsData staticSessionData$OsData, StaticSessionData$DeviceData staticSessionData$DeviceData) {
        AutoValue_StaticSessionData autoValue_StaticSessionData = new AutoValue_StaticSessionData(staticSessionData$AppData, staticSessionData$OsData, staticSessionData$DeviceData);
        return autoValue_StaticSessionData;
    }

    public abstract StaticSessionData$AppData appData();

    public abstract StaticSessionData$DeviceData deviceData();

    public abstract StaticSessionData$OsData osData();
}

