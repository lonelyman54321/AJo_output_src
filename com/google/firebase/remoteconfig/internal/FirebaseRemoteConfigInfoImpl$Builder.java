/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl$1;

public class FirebaseRemoteConfigInfoImpl$Builder {
    private FirebaseRemoteConfigSettings builderConfigSettings;
    private int builderLastFetchStatus;
    private long builderLastSuccessfulFetchTimeInMillis;

    private FirebaseRemoteConfigInfoImpl$Builder() {
    }

    public /* synthetic */ FirebaseRemoteConfigInfoImpl$Builder(FirebaseRemoteConfigInfoImpl$1 firebaseRemoteConfigInfoImpl$1) {
        this();
    }

    public FirebaseRemoteConfigInfoImpl build() {
        long l2 = this.builderLastSuccessfulFetchTimeInMillis;
        int n3 = this.builderLastFetchStatus;
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettings = this.builderConfigSettings;
        FirebaseRemoteConfigInfoImpl firebaseRemoteConfigInfoImpl = new FirebaseRemoteConfigInfoImpl(l2, n3, firebaseRemoteConfigSettings, null);
        return firebaseRemoteConfigInfoImpl;
    }

    public FirebaseRemoteConfigInfoImpl$Builder withConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.builderConfigSettings = firebaseRemoteConfigSettings;
        return this;
    }

    public FirebaseRemoteConfigInfoImpl$Builder withLastFetchStatus(int n3) {
        this.builderLastFetchStatus = n3;
        return this;
    }

    public FirebaseRemoteConfigInfoImpl$Builder withLastSuccessfulFetchTimeInMillis(long l2) {
        this.builderLastSuccessfulFetchTimeInMillis = l2;
        return this;
    }
}

