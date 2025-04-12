/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder;
import java.util.List;

public abstract class CrashlyticsReport$ApplicationExitInfo {
    public static CrashlyticsReport$ApplicationExitInfo$Builder builder() {
        AutoValue_CrashlyticsReport_ApplicationExitInfo$Builder autoValue_CrashlyticsReport_ApplicationExitInfo$Builder = new AutoValue_CrashlyticsReport_ApplicationExitInfo$Builder();
        return autoValue_CrashlyticsReport_ApplicationExitInfo$Builder;
    }

    public abstract List getBuildIdMappingForArch();

    public abstract int getImportance();

    public abstract int getPid();

    public abstract String getProcessName();

    public abstract long getPss();

    public abstract int getReasonCode();

    public abstract long getRss();

    public abstract long getTimestamp();

    public abstract String getTraceFile();
}

