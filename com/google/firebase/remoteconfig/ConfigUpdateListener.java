/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

public interface ConfigUpdateListener {
    public void onError(FirebaseRemoteConfigException var1);

    public void onUpdate(ConfigUpdate var1);
}

