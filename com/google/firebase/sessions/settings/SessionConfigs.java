/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.Intrinsics;

public final class SessionConfigs {
    private final Integer cacheDuration;
    private final Long cacheUpdatedTime;
    private final Boolean sessionEnabled;
    private final Integer sessionRestartTimeout;
    private final Double sessionSamplingRate;

    public SessionConfigs(Boolean bl2, Double d2, Integer n3, Integer n4, Long l2) {
        this.sessionEnabled = bl2;
        this.sessionSamplingRate = d2;
        this.sessionRestartTimeout = n3;
        this.cacheDuration = n4;
        this.cacheUpdatedTime = l2;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bl2, Double object, Integer constable, Integer object2, Long number, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = sessionConfigs.sessionEnabled;
        }
        if ((n4 = n3 & 2) != 0) {
            object = sessionConfigs.sessionSamplingRate;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            constable = sessionConfigs.sessionRestartTimeout;
        }
        Integer n8 = constable;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = sessionConfigs.cacheDuration;
        }
        Integer n10 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            number = sessionConfigs.cacheUpdatedTime;
        }
        Long l2 = number;
        object = sessionConfigs;
        constable = bl2;
        object2 = object3;
        number = n8;
        object3 = l2;
        return sessionConfigs.copy(bl2, (Double)object2, n8, n10, l2);
    }

    public final Boolean component1() {
        return this.sessionEnabled;
    }

    public final Double component2() {
        return this.sessionSamplingRate;
    }

    public final Integer component3() {
        return this.sessionRestartTimeout;
    }

    public final Integer component4() {
        return this.cacheDuration;
    }

    public final Long component5() {
        return this.cacheUpdatedTime;
    }

    public final SessionConfigs copy(Boolean bl2, Double d2, Integer n3, Integer n4, Long l2) {
        SessionConfigs sessionConfigs = new SessionConfigs(bl2, d2, n3, n4, l2);
        return sessionConfigs;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SessionConfigs;
        if (!bl3) {
            return false;
        }
        object = (SessionConfigs)object;
        Comparable<Boolean> comparable = this.sessionEnabled;
        Comparable<Boolean> comparable2 = ((SessionConfigs)object).sessionEnabled;
        bl3 = Intrinsics.areEqual(comparable, comparable2);
        if (!bl3) {
            return false;
        }
        comparable = this.sessionSamplingRate;
        comparable2 = ((SessionConfigs)object).sessionSamplingRate;
        bl3 = Intrinsics.areEqual(comparable, comparable2);
        if (!bl3) {
            return false;
        }
        comparable = this.sessionRestartTimeout;
        comparable2 = ((SessionConfigs)object).sessionRestartTimeout;
        bl3 = Intrinsics.areEqual(comparable, comparable2);
        if (!bl3) {
            return false;
        }
        comparable = this.cacheDuration;
        comparable2 = ((SessionConfigs)object).cacheDuration;
        bl3 = Intrinsics.areEqual(comparable, comparable2);
        if (!bl3) {
            return false;
        }
        comparable = this.cacheUpdatedTime;
        object = ((SessionConfigs)object).cacheUpdatedTime;
        boolean bl4 = Intrinsics.areEqual(comparable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.sessionEnabled;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Number number = this.sessionSamplingRate;
        if (number == null) {
            n3 = 0;
            number = null;
        } else {
            n3 = number.hashCode();
        }
        n4 = (n4 + n3) * 31;
        number = this.sessionRestartTimeout;
        if (number == null) {
            n3 = 0;
            number = null;
        } else {
            n3 = number.hashCode();
        }
        n4 = (n4 + n3) * 31;
        number = this.cacheDuration;
        if (number == null) {
            n3 = 0;
            number = null;
        } else {
            n3 = number.hashCode();
        }
        n4 = (n4 + n3) * 31;
        number = this.cacheUpdatedTime;
        if (number != null) {
            n7 = number.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionConfigs(sessionEnabled=");
        Comparable<Boolean> comparable = this.sessionEnabled;
        stringBuilder.append(comparable);
        stringBuilder.append(", sessionSamplingRate=");
        comparable = this.sessionSamplingRate;
        stringBuilder.append(comparable);
        stringBuilder.append(", sessionRestartTimeout=");
        comparable = this.sessionRestartTimeout;
        stringBuilder.append(comparable);
        stringBuilder.append(", cacheDuration=");
        comparable = this.cacheDuration;
        stringBuilder.append(comparable);
        stringBuilder.append(", cacheUpdatedTime=");
        comparable = this.cacheUpdatedTime;
        stringBuilder.append(comparable);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

