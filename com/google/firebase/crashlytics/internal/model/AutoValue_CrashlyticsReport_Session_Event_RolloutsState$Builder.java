/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState$Builder;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState$Builder
extends CrashlyticsReport$Session$Event$RolloutsState$Builder {
    private List rolloutAssignments;

    public CrashlyticsReport$Session$Event$RolloutsState build() {
        Object object = this.rolloutAssignments;
        if (object != null) {
            AutoValue_CrashlyticsReport_Session_Event_RolloutsState autoValue_CrashlyticsReport_Session_Event_RolloutsState = new AutoValue_CrashlyticsReport_Session_Event_RolloutsState((List)object, null);
            return autoValue_CrashlyticsReport_Session_Event_RolloutsState;
        }
        object = new IllegalStateException("Missing required properties: rolloutAssignments");
        throw object;
    }

    public CrashlyticsReport$Session$Event$RolloutsState$Builder setRolloutAssignments(List object) {
        if (object != null) {
            this.rolloutAssignments = object;
            return this;
        }
        object = new NullPointerException("Null rolloutAssignments");
        throw object;
    }
}

