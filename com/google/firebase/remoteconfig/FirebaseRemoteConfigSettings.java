/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder;

public class FirebaseRemoteConfigSettings {
    private final long fetchTimeoutInSeconds;
    private final long minimumFetchInterval;

    private FirebaseRemoteConfigSettings(FirebaseRemoteConfigSettings$Builder firebaseRemoteConfigSettings$Builder) {
        long l2;
        this.fetchTimeoutInSeconds = l2 = FirebaseRemoteConfigSettings$Builder.access$000(firebaseRemoteConfigSettings$Builder);
        this.minimumFetchInterval = l2 = FirebaseRemoteConfigSettings$Builder.access$100(firebaseRemoteConfigSettings$Builder);
    }

    public /* synthetic */ FirebaseRemoteConfigSettings(FirebaseRemoteConfigSettings$Builder firebaseRemoteConfigSettings$Builder, FirebaseRemoteConfigSettings$1 firebaseRemoteConfigSettings$1) {
        this(firebaseRemoteConfigSettings$Builder);
    }

    public long getFetchTimeoutInSeconds() {
        return this.fetchTimeoutInSeconds;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.minimumFetchInterval;
    }

    public FirebaseRemoteConfigSettings$Builder toBuilder() {
        FirebaseRemoteConfigSettings$Builder firebaseRemoteConfigSettings$Builder = new FirebaseRemoteConfigSettings$Builder();
        long l2 = this.getFetchTimeoutInSeconds();
        firebaseRemoteConfigSettings$Builder.setFetchTimeoutInSeconds(l2);
        l2 = this.getMinimumFetchIntervalInSeconds();
        firebaseRemoteConfigSettings$Builder.setMinimumFetchIntervalInSeconds(l2);
        return firebaseRemoteConfigSettings$Builder;
    }
}

