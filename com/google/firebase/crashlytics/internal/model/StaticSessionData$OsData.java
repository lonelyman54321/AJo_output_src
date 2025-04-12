/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_OsData;

public abstract class StaticSessionData$OsData {
    public static StaticSessionData$OsData create(String string2, String string3, boolean bl2) {
        AutoValue_StaticSessionData_OsData autoValue_StaticSessionData_OsData = new AutoValue_StaticSessionData_OsData(string2, string3, bl2);
        return autoValue_StaticSessionData_OsData;
    }

    public abstract boolean isRooted();

    public abstract String osCodeName();

    public abstract String osRelease();
}

