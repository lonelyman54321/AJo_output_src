/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.api;

import kotlin.jvm.internal.Intrinsics;

public final class SessionSubscriber$SessionDetails {
    private final String sessionId;

    public SessionSubscriber$SessionDetails(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        this.sessionId = string2;
    }

    public static /* synthetic */ SessionSubscriber$SessionDetails copy$default(SessionSubscriber$SessionDetails sessionSubscriber$SessionDetails, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = sessionSubscriber$SessionDetails.sessionId;
        }
        return sessionSubscriber$SessionDetails.copy(string2);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final SessionSubscriber$SessionDetails copy(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        SessionSubscriber$SessionDetails sessionSubscriber$SessionDetails = new SessionSubscriber$SessionDetails(string2);
        return sessionSubscriber$SessionDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SessionSubscriber$SessionDetails;
        if (!bl3) {
            return false;
        }
        object = (SessionSubscriber$SessionDetails)object;
        String string2 = this.sessionId;
        object = ((SessionSubscriber$SessionDetails)object).sessionId;
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
        return this.sessionId.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionDetails(sessionId=");
        String string2 = this.sessionId;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

