/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code;

public class FirebaseRemoteConfigException
extends FirebaseException {
    private final FirebaseRemoteConfigException$Code code;

    public FirebaseRemoteConfigException(String object) {
        super((String)object);
        object = FirebaseRemoteConfigException$Code.UNKNOWN;
        this.code = object;
    }

    public FirebaseRemoteConfigException(String string2, FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code) {
        super(string2);
        this.code = firebaseRemoteConfigException$Code;
    }

    public FirebaseRemoteConfigException(String object, Throwable throwable) {
        super((String)object, throwable);
        object = FirebaseRemoteConfigException$Code.UNKNOWN;
        this.code = object;
    }

    public FirebaseRemoteConfigException(String string2, Throwable throwable, FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code) {
        super(string2, throwable);
        this.code = firebaseRemoteConfigException$Code;
    }

    public FirebaseRemoteConfigException$Code getCode() {
        return this.code;
    }
}

