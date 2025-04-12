/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder;

public abstract class CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant {
    public static CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder builder() {
        AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder autoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder = new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder();
        return autoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder;
    }

    public abstract String getRolloutId();

    public abstract String getVariantId();
}

