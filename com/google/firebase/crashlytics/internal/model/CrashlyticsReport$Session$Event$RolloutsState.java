/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState$Builder;
import java.util.List;

public abstract class CrashlyticsReport$Session$Event$RolloutsState {
    public static CrashlyticsReport$Session$Event$RolloutsState$Builder builder() {
        AutoValue_CrashlyticsReport_Session_Event_RolloutsState$Builder autoValue_CrashlyticsReport_Session_Event_RolloutsState$Builder = new AutoValue_CrashlyticsReport_Session_Event_RolloutsState$Builder();
        return autoValue_CrashlyticsReport_Session_Event_RolloutsState$Builder;
    }

    public abstract List getRolloutAssignments();
}

