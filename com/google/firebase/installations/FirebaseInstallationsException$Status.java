/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

public final class FirebaseInstallationsException$Status
extends Enum {
    private static final /* synthetic */ FirebaseInstallationsException$Status[] $VALUES;
    public static final /* enum */ FirebaseInstallationsException$Status BAD_CONFIG;
    public static final /* enum */ FirebaseInstallationsException$Status TOO_MANY_REQUESTS;
    public static final /* enum */ FirebaseInstallationsException$Status UNAVAILABLE;

    private static /* synthetic */ FirebaseInstallationsException$Status[] $values() {
        FirebaseInstallationsException$Status firebaseInstallationsException$Status = BAD_CONFIG;
        firebaseInstallationsException$Status = UNAVAILABLE;
        firebaseInstallationsException$Status = TOO_MANY_REQUESTS;
        FirebaseInstallationsException$Status[] firebaseInstallationsException$StatusArray = new FirebaseInstallationsException$Status[]{firebaseInstallationsException$Status, firebaseInstallationsException$Status, firebaseInstallationsException$Status};
        return firebaseInstallationsException$StatusArray;
    }

    static {
        FirebaseInstallationsException$Status firebaseInstallationsException$Status;
        BAD_CONFIG = firebaseInstallationsException$Status = new FirebaseInstallationsException$Status("BAD_CONFIG", 0);
        UNAVAILABLE = firebaseInstallationsException$Status = new FirebaseInstallationsException$Status("UNAVAILABLE", 1);
        TOO_MANY_REQUESTS = firebaseInstallationsException$Status = new FirebaseInstallationsException$Status("TOO_MANY_REQUESTS", 2);
        $VALUES = FirebaseInstallationsException$Status.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FirebaseInstallationsException$Status() {
        void var2_-1;
        void var1_-1;
    }

    public static FirebaseInstallationsException$Status valueOf(String string2) {
        return Enum.valueOf(FirebaseInstallationsException$Status.class, string2);
    }

    public static FirebaseInstallationsException$Status[] values() {
        return (FirebaseInstallationsException$Status[])$VALUES.clone();
    }
}

