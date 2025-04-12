/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

public final class FirebaseRemoteConfigException$Code
extends Enum {
    private static final /* synthetic */ FirebaseRemoteConfigException$Code[] $VALUES;
    public static final /* enum */ FirebaseRemoteConfigException$Code CONFIG_UPDATE_MESSAGE_INVALID;
    public static final /* enum */ FirebaseRemoteConfigException$Code CONFIG_UPDATE_NOT_FETCHED;
    public static final /* enum */ FirebaseRemoteConfigException$Code CONFIG_UPDATE_STREAM_ERROR;
    public static final /* enum */ FirebaseRemoteConfigException$Code CONFIG_UPDATE_UNAVAILABLE;
    public static final /* enum */ FirebaseRemoteConfigException$Code UNKNOWN;
    private final int value;

    private static /* synthetic */ FirebaseRemoteConfigException$Code[] $values() {
        FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code = UNKNOWN;
        firebaseRemoteConfigException$Code = CONFIG_UPDATE_STREAM_ERROR;
        firebaseRemoteConfigException$Code = CONFIG_UPDATE_MESSAGE_INVALID;
        firebaseRemoteConfigException$Code = CONFIG_UPDATE_NOT_FETCHED;
        firebaseRemoteConfigException$Code = CONFIG_UPDATE_UNAVAILABLE;
        FirebaseRemoteConfigException$Code[] firebaseRemoteConfigException$CodeArray = new FirebaseRemoteConfigException$Code[]{firebaseRemoteConfigException$Code, firebaseRemoteConfigException$Code, firebaseRemoteConfigException$Code, firebaseRemoteConfigException$Code, firebaseRemoteConfigException$Code};
        return firebaseRemoteConfigException$CodeArray;
    }

    static {
        FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code;
        UNKNOWN = firebaseRemoteConfigException$Code = new FirebaseRemoteConfigException$Code("UNKNOWN", 0, 0);
        int n3 = 1;
        CONFIG_UPDATE_STREAM_ERROR = firebaseRemoteConfigException$Code = new FirebaseRemoteConfigException$Code("CONFIG_UPDATE_STREAM_ERROR", n3, n3);
        n3 = 2;
        CONFIG_UPDATE_MESSAGE_INVALID = firebaseRemoteConfigException$Code = new FirebaseRemoteConfigException$Code("CONFIG_UPDATE_MESSAGE_INVALID", n3, n3);
        n3 = 3;
        CONFIG_UPDATE_NOT_FETCHED = firebaseRemoteConfigException$Code = new FirebaseRemoteConfigException$Code("CONFIG_UPDATE_NOT_FETCHED", n3, n3);
        n3 = 4;
        CONFIG_UPDATE_UNAVAILABLE = firebaseRemoteConfigException$Code = new FirebaseRemoteConfigException$Code("CONFIG_UPDATE_UNAVAILABLE", n3, n3);
        $VALUES = FirebaseRemoteConfigException$Code.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FirebaseRemoteConfigException$Code() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static FirebaseRemoteConfigException$Code valueOf(String string2) {
        return Enum.valueOf(FirebaseRemoteConfigException$Code.class, string2);
    }

    public static FirebaseRemoteConfigException$Code[] values() {
        return (FirebaseRemoteConfigException$Code[])$VALUES.clone();
    }

    public int value() {
        return this.value;
    }
}

