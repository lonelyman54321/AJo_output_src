/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import kotlin.jvm.internal.Intrinsics;

public final class FirebaseInstallationId {
    private final String authToken;
    private final String fid;

    public FirebaseInstallationId(String string2, String string3) {
        this.fid = string2;
        this.authToken = string3;
    }

    public static /* synthetic */ FirebaseInstallationId copy$default(FirebaseInstallationId firebaseInstallationId, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = firebaseInstallationId.fid;
        }
        if ((n3 &= 2) != 0) {
            string3 = firebaseInstallationId.authToken;
        }
        return firebaseInstallationId.copy(string2, string3);
    }

    public final String component1() {
        return this.fid;
    }

    public final String component2() {
        return this.authToken;
    }

    public final FirebaseInstallationId copy(String string2, String string3) {
        FirebaseInstallationId firebaseInstallationId = new FirebaseInstallationId(string2, string3);
        return firebaseInstallationId;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FirebaseInstallationId;
        if (!bl3) {
            return false;
        }
        object = (FirebaseInstallationId)object;
        String string2 = this.fid;
        String string3 = ((FirebaseInstallationId)object).fid;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.authToken;
        object = ((FirebaseInstallationId)object).authToken;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getFid() {
        return this.fid;
    }

    public int hashCode() {
        int n3;
        String string2 = this.fid;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.authToken;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FirebaseInstallationId(fid=");
        String string2 = this.fid;
        stringBuilder.append(string2);
        stringBuilder.append(", authToken=");
        string2 = this.authToken;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

