/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import java.util.List;

public abstract class CrashlyticsReport$FilesPayload$Builder {
    public abstract CrashlyticsReport$FilesPayload build();

    public abstract CrashlyticsReport$FilesPayload$Builder setFiles(List var1);

    public abstract CrashlyticsReport$FilesPayload$Builder setOrgId(String var1);
}

