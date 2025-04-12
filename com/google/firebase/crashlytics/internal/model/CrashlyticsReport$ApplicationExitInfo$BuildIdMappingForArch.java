/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder;

public abstract class CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch {
    public static CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder builder() {
        AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder autoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder = new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder();
        return autoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder;
    }

    public abstract String getArch();

    public abstract String getBuildId();

    public abstract String getLibraryName();
}

