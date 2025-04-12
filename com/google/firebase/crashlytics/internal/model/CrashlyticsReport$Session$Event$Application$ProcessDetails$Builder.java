/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;

public abstract class CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder {
    public abstract CrashlyticsReport$Session$Event$Application$ProcessDetails build();

    public abstract CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder setDefaultProcess(boolean var1);

    public abstract CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder setImportance(int var1);

    public abstract CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder setPid(int var1);

    public abstract CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder setProcessName(String var1);
}

