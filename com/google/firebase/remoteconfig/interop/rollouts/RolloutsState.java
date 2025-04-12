/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutsState;
import java.util.Set;

public abstract class RolloutsState {
    public static RolloutsState create(Set set) {
        AutoValue_RolloutsState autoValue_RolloutsState = new AutoValue_RolloutsState(set);
        return autoValue_RolloutsState;
    }

    public abstract Set getRolloutAssignments();
}

