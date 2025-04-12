/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder;

public abstract class CrashlyticsReport$Session$Event$Application$ProcessDetails {
    public static CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder builder() {
        AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder autoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder = new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder();
        return autoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder;
    }

    public abstract int getImportance();

    public abstract int getPid();

    public abstract String getProcessName();

    public abstract boolean isDefaultProcess();
}

