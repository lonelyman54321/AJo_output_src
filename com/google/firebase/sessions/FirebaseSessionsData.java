/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

public final class FirebaseSessionsData {
    private final String sessionId;

    public FirebaseSessionsData(String string2) {
        this.sessionId = string2;
    }

    public static /* synthetic */ FirebaseSessionsData copy$default(FirebaseSessionsData firebaseSessionsData, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = firebaseSessionsData.sessionId;
        }
        return firebaseSessionsData.copy(string2);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final FirebaseSessionsData copy(String string2) {
        FirebaseSessionsData firebaseSessionsData = new FirebaseSessionsData(string2);
        return firebaseSessionsData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FirebaseSessionsData;
        if (!bl3) {
            return false;
        }
        object = (FirebaseSessionsData)object;
        String string2 = this.sessionId;
        object = ((FirebaseSessionsData)object).sessionId;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.sessionId;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FirebaseSessionsData(sessionId=");
        String string2 = this.sessionId;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

