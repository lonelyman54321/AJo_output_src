/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;

public abstract class CrashlyticsReport$Session$Event$RolloutAssignment {
    public static CrashlyticsReport$Session$Event$RolloutAssignment$Builder builder() {
        AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$Builder autoValue_CrashlyticsReport_Session_Event_RolloutAssignment$Builder = new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$Builder();
        return autoValue_CrashlyticsReport_Session_Event_RolloutAssignment$Builder;
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant getRolloutVariant();

    public abstract long getTemplateVersion();
}

