/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

public final class SessionDetails {
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;
    private final long sessionStartTimestampUs;

    public SessionDetails(String string2, String string3, int n3, long l2) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        Intrinsics.checkNotNullParameter(string3, "firstSessionId");
        this.sessionId = string2;
        this.firstSessionId = string3;
        this.sessionIndex = n3;
        this.sessionStartTimestampUs = l2;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String string2, String object, int n3, long l2, int n4, Object object2) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = sessionDetails.sessionId;
        }
        if ((n7 = n4 & 2) != 0) {
            object = sessionDetails.firstSessionId;
        }
        object2 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            n3 = sessionDetails.sessionIndex;
        }
        int n10 = n3;
        n8 = n4 & 8;
        if (n8 != 0) {
            l2 = sessionDetails.sessionStartTimestampUs;
        }
        object = sessionDetails;
        return sessionDetails.copy(string2, (String)object2, n10, l2);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.firstSessionId;
    }

    public final int component3() {
        return this.sessionIndex;
    }

    public final long component4() {
        return this.sessionStartTimestampUs;
    }

    public final SessionDetails copy(String string2, String string3, int n3, long l2) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        Intrinsics.checkNotNullParameter(string3, "firstSessionId");
        SessionDetails sessionDetails = new SessionDetails(string2, string3, n3, l2);
        return sessionDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof SessionDetails;
        if (n3 == 0) {
            return false;
        }
        object = (SessionDetails)object;
        String string2 = this.sessionId;
        String string3 = ((SessionDetails)object).sessionId;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.firstSessionId;
        string3 = ((SessionDetails)object).firstSessionId;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.sessionIndex;
        int n4 = ((SessionDetails)object).sessionIndex;
        if (n3 != n4) {
            return false;
        }
        long l2 = this.sessionStartTimestampUs;
        long l3 = ((SessionDetails)object).sessionStartTimestampUs;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            return false;
        }
        return bl2;
    }

    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        int n3 = this.sessionId.hashCode() * 31;
        String string2 = this.firstSessionId;
        n3 = zy_2.b(n3, 31, string2);
        int n4 = this.sessionIndex;
        n3 = (n3 + n4) * 31;
        long l2 = this.sessionStartTimestampUs;
        long l3 = l2 >>> 32;
        n4 = (int)(l2 ^ l3);
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionDetails(sessionId=");
        String string2 = this.sessionId;
        stringBuilder.append(string2);
        stringBuilder.append(", firstSessionId=");
        string2 = this.firstSessionId;
        stringBuilder.append(string2);
        stringBuilder.append(", sessionIndex=");
        int n3 = this.sessionIndex;
        stringBuilder.append(n3);
        stringBuilder.append(", sessionStartTimestampUs=");
        long l2 = this.sessionStartTimestampUs;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

