/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl$1;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl$Builder;

public class FirebaseRemoteConfigInfoImpl
implements FirebaseRemoteConfigInfo {
    private final FirebaseRemoteConfigSettings configSettings;
    private final int lastFetchStatus;
    private final long lastSuccessfulFetchTimeInMillis;

    private FirebaseRemoteConfigInfoImpl(long l2, int n3, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.lastSuccessfulFetchTimeInMillis = l2;
        this.lastFetchStatus = n3;
        this.configSettings = firebaseRemoteConfigSettings;
    }

    public /* synthetic */ FirebaseRemoteConfigInfoImpl(long l2, int n3, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings, FirebaseRemoteConfigInfoImpl$1 firebaseRemoteConfigInfoImpl$1) {
        this(l2, n3, firebaseRemoteConfigSettings);
    }

    public static FirebaseRemoteConfigInfoImpl$Builder newBuilder() {
        FirebaseRemoteConfigInfoImpl$Builder firebaseRemoteConfigInfoImpl$Builder = new FirebaseRemoteConfigInfoImpl$Builder(null);
        return firebaseRemoteConfigInfoImpl$Builder;
    }

    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    public long getFetchTimeMillis() {
        return this.lastSuccessfulFetchTimeInMillis;
    }

    public int getLastFetchStatus() {
        return this.lastFetchStatus;
    }
}

