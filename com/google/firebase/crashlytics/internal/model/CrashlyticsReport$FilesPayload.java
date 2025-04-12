/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder;
import java.util.List;

public abstract class CrashlyticsReport$FilesPayload {
    public static CrashlyticsReport$FilesPayload$Builder builder() {
        AutoValue_CrashlyticsReport_FilesPayload$Builder autoValue_CrashlyticsReport_FilesPayload$Builder = new AutoValue_CrashlyticsReport_FilesPayload$Builder();
        return autoValue_CrashlyticsReport_FilesPayload$Builder;
    }

    public abstract List getFiles();

    public abstract String getOrgId();

    public abstract CrashlyticsReport$FilesPayload$Builder toBuilder();
}

