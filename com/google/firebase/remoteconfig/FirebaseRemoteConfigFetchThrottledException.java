/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

public class FirebaseRemoteConfigFetchThrottledException
extends FirebaseRemoteConfigException {
    private final long throttleEndTimeMillis;

    public FirebaseRemoteConfigFetchThrottledException(long l2) {
        this("Fetch was throttled.", l2);
    }

    public FirebaseRemoteConfigFetchThrottledException(String string2, long l2) {
        super(string2);
        this.throttleEndTimeMillis = l2;
    }

    public long getThrottleEndTimeMillis() {
        return this.throttleEndTimeMillis;
    }
}

