/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState
extends CrashlyticsReport$Session$Event$RolloutsState {
    private final List rolloutAssignments;

    private AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List list) {
        this.rolloutAssignments = list;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List list, AutoValue_CrashlyticsReport_Session_Event_RolloutsState$1 autoValue_CrashlyticsReport_Session_Event_RolloutsState$1) {
        this(list);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof CrashlyticsReport$Session$Event$RolloutsState;
        if (bl2) {
            object = (CrashlyticsReport$Session$Event$RolloutsState)object;
            List list = this.rolloutAssignments;
            object = ((CrashlyticsReport$Session$Event$RolloutsState)object).getRolloutAssignments();
            return list.equals(object);
        }
        return false;
    }

    public List getRolloutAssignments() {
        return this.rolloutAssignments;
    }

    public int hashCode() {
        return this.rolloutAssignments.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RolloutsState{rolloutAssignments=");
        List list = this.rolloutAssignments;
        stringBuilder.append(list);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

