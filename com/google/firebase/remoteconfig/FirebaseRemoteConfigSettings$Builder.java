/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

public class FirebaseRemoteConfigSettings$Builder {
    private long fetchTimeoutInSeconds = 60;
    private long minimumFetchInterval;

    public FirebaseRemoteConfigSettings$Builder() {
        long l2;
        this.minimumFetchInterval = l2 = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;
    }

    public static /* synthetic */ long access$000(FirebaseRemoteConfigSettings$Builder firebaseRemoteConfigSettings$Builder) {
        return firebaseRemoteConfigSettings$Builder.fetchTimeoutInSeconds;
    }

    public static /* synthetic */ long access$100(FirebaseRemoteConfigSettings$Builder firebaseRemoteConfigSettings$Builder) {
        return firebaseRemoteConfigSettings$Builder.minimumFetchInterval;
    }

    public FirebaseRemoteConfigSettings build() {
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettings = new FirebaseRemoteConfigSettings(this, null);
        return firebaseRemoteConfigSettings;
    }

    public long getFetchTimeoutInSeconds() {
        return this.fetchTimeoutInSeconds;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.minimumFetchInterval;
    }

    public FirebaseRemoteConfigSettings$Builder setFetchTimeoutInSeconds(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            this.fetchTimeoutInSeconds = l2;
            return this;
        }
        Object object2 = l2;
        Object[] objectArray = new Object[]{object2};
        object2 = String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
        throw illegalArgumentException;
    }

    public FirebaseRemoteConfigSettings$Builder setMinimumFetchIntervalInSeconds(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            this.minimumFetchInterval = l2;
            return this;
        }
        String string2 = Ov2.a(l2, "Minimum interval between fetches has to be a non-negative number. ", " is an invalid argument");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

