/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.DataCollectionStatus;
import kotlin.jvm.internal.Intrinsics;

public final class SessionInfo {
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(String string2, String string3, int n3, long l2, DataCollectionStatus dataCollectionStatus, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        Intrinsics.checkNotNullParameter(string3, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(string4, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(string5, "firebaseAuthenticationToken");
        this.sessionId = string2;
        this.firstSessionId = string3;
        this.sessionIndex = n3;
        this.eventTimestampUs = l2;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = string4;
        this.firebaseAuthenticationToken = string5;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String string2, String string3, int n3, long l2, DataCollectionStatus dataCollectionStatus, String string4, String string5, int n4, Object object) {
        SessionInfo sessionInfo2 = sessionInfo;
        int n7 = n4 & 1;
        String string6 = n7 != 0 ? sessionInfo.sessionId : string2;
        int n8 = n4 & 2;
        String string7 = n8 != 0 ? sessionInfo2.firstSessionId : string3;
        int n10 = n4 & 4;
        n10 = n10 != 0 ? sessionInfo2.sessionIndex : n3;
        int n14 = n4 & 8;
        long l3 = n14 != 0 ? sessionInfo2.eventTimestampUs : l2;
        int n15 = n4 & 0x10;
        DataCollectionStatus dataCollectionStatus2 = n15 != 0 ? sessionInfo2.dataCollectionStatus : dataCollectionStatus;
        int n16 = n4 & 0x20;
        String string8 = n16 != 0 ? sessionInfo2.firebaseInstallationId : string4;
        int n17 = n4 & 0x40;
        String string9 = n17 != 0 ? sessionInfo2.firebaseAuthenticationToken : string5;
        string2 = string6;
        string3 = string7;
        n3 = n10;
        l2 = l3;
        dataCollectionStatus = dataCollectionStatus2;
        string4 = string8;
        string5 = string9;
        return sessionInfo.copy(string6, string7, n10, l3, dataCollectionStatus2, string8, string9);
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
        return this.eventTimestampUs;
    }

    public final DataCollectionStatus component5() {
        return this.dataCollectionStatus;
    }

    public final String component6() {
        return this.firebaseInstallationId;
    }

    public final String component7() {
        return this.firebaseAuthenticationToken;
    }

    public final SessionInfo copy(String string2, String string3, int n3, long l2, DataCollectionStatus dataCollectionStatus, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        Intrinsics.checkNotNullParameter(string3, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(string4, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(string5, "firebaseAuthenticationToken");
        SessionInfo sessionInfo = new SessionInfo(string2, string3, n3, l2, dataCollectionStatus, string4, string5);
        return sessionInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof SessionInfo;
        if (n3 == 0) {
            return false;
        }
        object = (SessionInfo)object;
        Object object2 = this.sessionId;
        Object object3 = ((SessionInfo)object).sessionId;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.firstSessionId;
        object3 = ((SessionInfo)object).firstSessionId;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.sessionIndex;
        int n4 = ((SessionInfo)object).sessionIndex;
        if (n3 != n4) {
            return false;
        }
        long l2 = this.eventTimestampUs;
        long l3 = ((SessionInfo)object).eventTimestampUs;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        object2 = this.dataCollectionStatus;
        object3 = ((SessionInfo)object).dataCollectionStatus;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.firebaseInstallationId;
        object3 = ((SessionInfo)object).firebaseInstallationId;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.firebaseAuthenticationToken;
        object = ((SessionInfo)object).firebaseAuthenticationToken;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
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

    public int hashCode() {
        int n3 = this.sessionId.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.firstSessionId;
        n3 = zy_2.b(n3, n4, string2);
        int n7 = this.sessionIndex;
        n3 = (n3 + n7) * 31;
        long l2 = this.eventTimestampUs;
        long l3 = l2 >>> 32;
        int n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        n7 = (this.dataCollectionStatus.hashCode() + n3) * 31;
        String string3 = this.firebaseInstallationId;
        n3 = zy_2.b(n7, n4, string3);
        return this.firebaseAuthenticationToken.hashCode() + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionInfo(sessionId=");
        Object object = this.sessionId;
        stringBuilder.append((String)object);
        stringBuilder.append(", firstSessionId=");
        object = this.firstSessionId;
        stringBuilder.append((String)object);
        stringBuilder.append(", sessionIndex=");
        int n3 = this.sessionIndex;
        stringBuilder.append(n3);
        stringBuilder.append(", eventTimestampUs=");
        long l2 = this.eventTimestampUs;
        stringBuilder.append(l2);
        stringBuilder.append(", dataCollectionStatus=");
        object = this.dataCollectionStatus;
        stringBuilder.append(object);
        stringBuilder.append(", firebaseInstallationId=");
        object = this.firebaseInstallationId;
        stringBuilder.append((String)object);
        stringBuilder.append(", firebaseAuthenticationToken=");
        object = this.firebaseAuthenticationToken;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

