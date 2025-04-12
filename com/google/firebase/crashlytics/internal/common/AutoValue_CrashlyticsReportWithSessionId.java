/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

final class AutoValue_CrashlyticsReportWithSessionId
extends CrashlyticsReportWithSessionId {
    private final CrashlyticsReport report;
    private final File reportFile;
    private final String sessionId;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport object, String string2, File file) {
        if (object != null) {
            this.report = object;
            if (string2 != null) {
                this.sessionId = string2;
                if (file != null) {
                    this.reportFile = file;
                    return;
                }
                object = new NullPointerException("Null reportFile");
                throw object;
            }
            object = new NullPointerException("Null sessionId");
            throw object;
        }
        object = new NullPointerException("Null report");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof CrashlyticsReportWithSessionId;
        if (bl3) {
            boolean bl4;
            Object object2 = this.report;
            Object object3 = ((CrashlyticsReportWithSessionId)(object = (CrashlyticsReportWithSessionId)object)).getReport();
            bl3 = object2.equals(object3);
            if (!(bl3 && (bl3 = ((String)(object2 = this.sessionId)).equals(object3 = ((CrashlyticsReportWithSessionId)object).getSessionId())) && (bl4 = ((File)(object2 = this.reportFile)).equals(object = ((CrashlyticsReportWithSessionId)object).getReportFile())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public CrashlyticsReport getReport() {
        return this.report;
    }

    public File getReportFile() {
        return this.reportFile;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int n3 = this.report.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.sessionId.hashCode();
        n3 = (n3 ^ n7) * n4;
        n4 = this.reportFile.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CrashlyticsReportWithSessionId{report=");
        Object object = this.report;
        stringBuilder.append(object);
        stringBuilder.append(", sessionId=");
        object = this.sessionId;
        stringBuilder.append((String)object);
        stringBuilder.append(", reportFile=");
        object = this.reportFile;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

