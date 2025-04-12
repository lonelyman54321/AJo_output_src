/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.session;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SessionData {
    private final long affiseSessionCount;
    private final long lifetimeSessionCount;

    public SessionData() {
        this(0L, 0L, 3, null);
    }

    public SessionData(long l2, long l3) {
        this.lifetimeSessionCount = l2;
        this.affiseSessionCount = l3;
    }

    public /* synthetic */ SessionData(long l2, long l3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        long l4 = 0L;
        if (n4 != 0) {
            l2 = l4;
        }
        if ((n3 &= 2) != 0) {
            l3 = l4;
        }
        this(l2, l3);
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, long l2, long l3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            l2 = sessionData.lifetimeSessionCount;
        }
        if ((n3 &= 2) != 0) {
            l3 = sessionData.affiseSessionCount;
        }
        return sessionData.copy(l2, l3);
    }

    public final long component1() {
        return this.lifetimeSessionCount;
    }

    public final long component2() {
        return this.affiseSessionCount;
    }

    public final SessionData copy(long l2, long l3) {
        SessionData sessionData = new SessionData(l2, l3);
        return sessionData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof SessionData;
        if (!object2) {
            return false;
        }
        object = (SessionData)object;
        long l2 = this.lifetimeSessionCount;
        long l3 = ((SessionData)object).lifetimeSessionCount;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.affiseSessionCount;
        l3 = ((SessionData)object).affiseSessionCount;
        long l7 = l2 - l3;
        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3 != false) {
            return false;
        }
        return bl2;
    }

    public final long getAffiseSessionCount() {
        return this.affiseSessionCount;
    }

    public final long getLifetimeSessionCount() {
        return this.lifetimeSessionCount;
    }

    public int hashCode() {
        long l2 = this.lifetimeSessionCount;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = this.affiseSessionCount;
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        return n4 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionData(lifetimeSessionCount=");
        long l2 = this.lifetimeSessionCount;
        stringBuilder.append(l2);
        stringBuilder.append(", affiseSessionCount=");
        l2 = this.affiseSessionCount;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

