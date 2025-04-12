/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.Set;

final class AutoValue_RolloutsState
extends RolloutsState {
    private final Set rolloutAssignments;

    public AutoValue_RolloutsState(Set object) {
        if (object != null) {
            this.rolloutAssignments = object;
            return;
        }
        object = new NullPointerException("Null rolloutAssignments");
        throw object;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof RolloutsState;
        if (bl2) {
            object = (RolloutsState)object;
            Set set = this.rolloutAssignments;
            object = ((RolloutsState)object).getRolloutAssignments();
            return set.equals(object);
        }
        return false;
    }

    public Set getRolloutAssignments() {
        return this.rolloutAssignments;
    }

    public int hashCode() {
        return this.rolloutAssignments.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RolloutsState{rolloutAssignments=");
        Set set = this.rolloutAssignments;
        stringBuilder.append(set);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

