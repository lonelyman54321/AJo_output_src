/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;

public interface RolloutsStateSubscriber {
    public void onRolloutsStateChanged(RolloutsState var1);
}

