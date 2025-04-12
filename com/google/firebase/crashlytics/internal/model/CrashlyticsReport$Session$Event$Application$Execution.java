/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal;
import java.util.List;

public abstract class CrashlyticsReport$Session$Event$Application$Execution {
    public static CrashlyticsReport$Session$Event$Application$Execution$Builder builder() {
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder autoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder();
        return autoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder;
    }

    public abstract CrashlyticsReport$ApplicationExitInfo getAppExitInfo();

    public abstract List getBinaries();

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Exception getException();

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Signal getSignal();

    public abstract List getThreads();
}

