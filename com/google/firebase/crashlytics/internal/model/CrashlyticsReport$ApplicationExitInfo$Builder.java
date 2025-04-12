/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import java.util.List;

public abstract class CrashlyticsReport$ApplicationExitInfo$Builder {
    public abstract CrashlyticsReport$ApplicationExitInfo build();

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setBuildIdMappingForArch(List var1);

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setImportance(int var1);

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setPid(int var1);

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setProcessName(String var1);

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setPss(long var1);

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setReasonCode(int var1);

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setRss(long var1);

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setTimestamp(long var1);

    public abstract CrashlyticsReport$ApplicationExitInfo$Builder setTraceFile(String var1);
}

