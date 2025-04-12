/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal;
import java.util.List;

public abstract class CrashlyticsReport$Session$Event$Application$Execution$Builder {
    public abstract CrashlyticsReport$Session$Event$Application$Execution build();

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Builder setAppExitInfo(CrashlyticsReport$ApplicationExitInfo var1);

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Builder setBinaries(List var1);

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Builder setException(CrashlyticsReport$Session$Event$Application$Execution$Exception var1);

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Builder setSignal(CrashlyticsReport$Session$Event$Application$Execution$Signal var1);

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Builder setThreads(List var1);
}

