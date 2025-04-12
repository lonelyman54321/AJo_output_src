/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.interop;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

public interface FirebaseRemoteConfigInterop {
    public void registerRolloutsStateSubscriber(String var1, RolloutsStateSubscriber var2);
}

