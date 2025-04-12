/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;
import java.util.List;

public abstract class CrashlyticsReport$Session$Event$Application {
    public static CrashlyticsReport$Session$Event$Application$Builder builder() {
        AutoValue_CrashlyticsReport_Session_Event_Application$Builder autoValue_CrashlyticsReport_Session_Event_Application$Builder = new AutoValue_CrashlyticsReport_Session_Event_Application$Builder();
        return autoValue_CrashlyticsReport_Session_Event_Application$Builder;
    }

    public abstract List getAppProcessDetails();

    public abstract Boolean getBackground();

    public abstract CrashlyticsReport$Session$Event$Application$ProcessDetails getCurrentProcessDetails();

    public abstract List getCustomAttributes();

    public abstract CrashlyticsReport$Session$Event$Application$Execution getExecution();

    public abstract List getInternalKeys();

    public abstract int getUiOrientation();

    public abstract CrashlyticsReport$Session$Event$Application$Builder toBuilder();
}

