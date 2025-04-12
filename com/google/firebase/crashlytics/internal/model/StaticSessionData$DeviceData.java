/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_DeviceData;

public abstract class StaticSessionData$DeviceData {
    public static StaticSessionData$DeviceData create(int n3, String string2, int n4, long l2, long l3, boolean bl2, int n7, String string3, String string4) {
        AutoValue_StaticSessionData_DeviceData autoValue_StaticSessionData_DeviceData = new AutoValue_StaticSessionData_DeviceData(n3, string2, n4, l2, l3, bl2, n7, string3, string4);
        return autoValue_StaticSessionData_DeviceData;
    }

    public abstract int arch();

    public abstract int availableProcessors();

    public abstract long diskSpace();

    public abstract boolean isEmulator();

    public abstract String manufacturer();

    public abstract String model();

    public abstract String modelClass();

    public abstract int state();

    public abstract long totalRam();
}

