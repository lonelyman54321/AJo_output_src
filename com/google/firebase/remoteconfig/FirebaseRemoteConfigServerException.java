/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code;

public class FirebaseRemoteConfigServerException
extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int n3, String string2) {
        super(string2);
        this.httpStatusCode = n3;
    }

    public FirebaseRemoteConfigServerException(int n3, String string2, FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code) {
        super(string2, firebaseRemoteConfigException$Code);
        this.httpStatusCode = n3;
    }

    public FirebaseRemoteConfigServerException(int n3, String string2, Throwable throwable) {
        super(string2, throwable);
        this.httpStatusCode = n3;
    }

    public FirebaseRemoteConfigServerException(int n3, String string2, Throwable throwable, FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code) {
        super(string2, throwable, firebaseRemoteConfigException$Code);
        this.httpStatusCode = n3;
    }

    public FirebaseRemoteConfigServerException(String string2, FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code) {
        super(string2, firebaseRemoteConfigException$Code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(String string2, Throwable throwable, FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code) {
        super(string2, throwable, firebaseRemoteConfigException$Code);
        this.httpStatusCode = -1;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }
}

