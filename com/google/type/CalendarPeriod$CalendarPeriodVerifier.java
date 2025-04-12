/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.Internal$EnumVerifier;
import com.google.type.CalendarPeriod;

final class CalendarPeriod$CalendarPeriodVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        CalendarPeriod$CalendarPeriodVerifier calendarPeriod$CalendarPeriodVerifier = new CalendarPeriod$CalendarPeriodVerifier();
        INSTANCE = calendarPeriod$CalendarPeriodVerifier;
    }

    private CalendarPeriod$CalendarPeriodVerifier() {
    }

    public boolean isInRange(int n3) {
        CalendarPeriod calendarPeriod = CalendarPeriod.forNumber(n3);
        if (calendarPeriod != null) {
            n3 = 1;
        } else {
            n3 = 0;
            calendarPeriod = null;
        }
        return n3 != 0;
    }
}

