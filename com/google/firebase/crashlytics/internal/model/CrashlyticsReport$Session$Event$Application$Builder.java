/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;
import java.util.List;

public abstract class CrashlyticsReport$Session$Event$Application$Builder {
    public abstract CrashlyticsReport$Session$Event$Application build();

    public abstract CrashlyticsReport$Session$Event$Application$Builder setAppProcessDetails(List var1);

    public abstract CrashlyticsReport$Session$Event$Application$Builder setBackground(Boolean var1);

    public abstract CrashlyticsReport$Session$Event$Application$Builder setCurrentProcessDetails(CrashlyticsReport$Session$Event$Application$ProcessDetails var1);

    public abstract CrashlyticsReport$Session$Event$Application$Builder setCustomAttributes(List var1);

    public abstract CrashlyticsReport$Session$Event$Application$Builder setExecution(CrashlyticsReport$Session$Event$Application$Execution var1);

    public abstract CrashlyticsReport$Session$Event$Application$Builder setInternalKeys(List var1);

    public abstract CrashlyticsReport$Session$Event$Application$Builder setUiOrientation(int var1);
}

