/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.AutoValue_CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

public abstract class CrashlyticsReportWithSessionId {
    public static CrashlyticsReportWithSessionId create(CrashlyticsReport crashlyticsReport, String string2, File file) {
        AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId = new AutoValue_CrashlyticsReportWithSessionId(crashlyticsReport, string2, file);
        return autoValue_CrashlyticsReportWithSessionId;
    }

    public abstract CrashlyticsReport getReport();

    public abstract File getReportFile();

    public abstract String getSessionId();
}

