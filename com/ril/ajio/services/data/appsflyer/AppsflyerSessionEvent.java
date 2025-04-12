/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.appsflyer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AppsflyerSessionEvent {
    private final Long eventDurationInSec;
    private final Boolean isEnabled;

    public AppsflyerSessionEvent() {
        this(null, null, 3, null);
    }

    public AppsflyerSessionEvent(Boolean bl2, Long l2) {
        this.isEnabled = bl2;
        this.eventDurationInSec = l2;
    }

    public /* synthetic */ AppsflyerSessionEvent(Boolean bl2, Long l2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n3 &= 2) != 0) {
            l2 = null;
        }
        this(bl2, l2);
    }

    public static /* synthetic */ AppsflyerSessionEvent copy$default(AppsflyerSessionEvent appsflyerSessionEvent, Boolean bl2, Long l2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = appsflyerSessionEvent.isEnabled;
        }
        if ((n3 &= 2) != 0) {
            l2 = appsflyerSessionEvent.eventDurationInSec;
        }
        return appsflyerSessionEvent.copy(bl2, l2);
    }

    public final Boolean component1() {
        return this.isEnabled;
    }

    public final Long component2() {
        return this.eventDurationInSec;
    }

    public final AppsflyerSessionEvent copy(Boolean bl2, Long l2) {
        AppsflyerSessionEvent appsflyerSessionEvent = new AppsflyerSessionEvent(bl2, l2);
        return appsflyerSessionEvent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AppsflyerSessionEvent;
        if (!bl3) {
            return false;
        }
        object = (AppsflyerSessionEvent)object;
        Comparable<Boolean> comparable = this.isEnabled;
        Boolean bl4 = ((AppsflyerSessionEvent)object).isEnabled;
        bl3 = Intrinsics.areEqual(comparable, bl4);
        if (!bl3) {
            return false;
        }
        comparable = this.eventDurationInSec;
        object = ((AppsflyerSessionEvent)object).eventDurationInSec;
        boolean bl5 = Intrinsics.areEqual(comparable, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Long getEventDurationInSec() {
        return this.eventDurationInSec;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.isEnabled;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        Long l2 = this.eventDurationInSec;
        if (l2 != null) {
            n4 = ((Object)l2).hashCode();
        }
        return n3 + n4;
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        Boolean bl2 = this.isEnabled;
        Long l2 = this.eventDurationInSec;
        StringBuilder stringBuilder = new StringBuilder("AppsflyerSessionEvent(isEnabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", eventDurationInSec=");
        stringBuilder.append(l2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

