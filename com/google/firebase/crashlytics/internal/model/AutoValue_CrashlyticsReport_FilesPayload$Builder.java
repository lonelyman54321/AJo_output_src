/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder;
import java.util.List;

final class AutoValue_CrashlyticsReport_FilesPayload$Builder
extends CrashlyticsReport$FilesPayload$Builder {
    private List files;
    private String orgId;

    public AutoValue_CrashlyticsReport_FilesPayload$Builder() {
    }

    private AutoValue_CrashlyticsReport_FilesPayload$Builder(CrashlyticsReport$FilesPayload object) {
        List list;
        this.files = list = ((CrashlyticsReport$FilesPayload)object).getFiles();
        this.orgId = object = ((CrashlyticsReport$FilesPayload)object).getOrgId();
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload$Builder(CrashlyticsReport$FilesPayload crashlyticsReport$FilesPayload, AutoValue_CrashlyticsReport_FilesPayload$1 autoValue_CrashlyticsReport_FilesPayload$1) {
        this(crashlyticsReport$FilesPayload);
    }

    public CrashlyticsReport$FilesPayload build() {
        Object object = this.files;
        if (object != null) {
            String string2 = this.orgId;
            AutoValue_CrashlyticsReport_FilesPayload autoValue_CrashlyticsReport_FilesPayload = new AutoValue_CrashlyticsReport_FilesPayload((List)object, string2, null);
            return autoValue_CrashlyticsReport_FilesPayload;
        }
        object = new IllegalStateException("Missing required properties: files");
        throw object;
    }

    public CrashlyticsReport$FilesPayload$Builder setFiles(List object) {
        if (object != null) {
            this.files = object;
            return this;
        }
        object = new NullPointerException("Null files");
        throw object;
    }

    public CrashlyticsReport$FilesPayload$Builder setOrgId(String string2) {
        this.orgId = string2;
        return this;
    }
}

