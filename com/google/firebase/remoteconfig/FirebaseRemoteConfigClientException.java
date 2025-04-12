/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code;

public class FirebaseRemoteConfigClientException
extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(String string2) {
        super(string2);
    }

    public FirebaseRemoteConfigClientException(String string2, FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code) {
        super(string2, firebaseRemoteConfigException$Code);
    }

    public FirebaseRemoteConfigClientException(String string2, Throwable throwable) {
        super(string2, throwable);
    }

    public FirebaseRemoteConfigClientException(String string2, Throwable throwable, FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code) {
        super(string2, throwable, firebaseRemoteConfigException$Code);
    }
}

