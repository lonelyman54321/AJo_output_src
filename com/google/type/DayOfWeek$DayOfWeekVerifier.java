/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.Internal$EnumVerifier;
import com.google.type.DayOfWeek;

final class DayOfWeek$DayOfWeekVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        DayOfWeek$DayOfWeekVerifier dayOfWeek$DayOfWeekVerifier = new DayOfWeek$DayOfWeekVerifier();
        INSTANCE = dayOfWeek$DayOfWeekVerifier;
    }

    private DayOfWeek$DayOfWeekVerifier() {
    }

    public boolean isInRange(int n3) {
        DayOfWeek dayOfWeek = DayOfWeek.forNumber(n3);
        if (dayOfWeek != null) {
            n3 = 1;
        } else {
            n3 = 0;
            dayOfWeek = null;
        }
        return n3 != 0;
    }
}

