/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE;
    private final Long fixedTimeMs;
    private final TimeZone fixedTimeZone;

    static {
        TimeSource timeSource;
        SYSTEM_TIME_SOURCE = timeSource = new TimeSource(null, null);
    }

    private TimeSource(Long l2, TimeZone timeZone) {
        this.fixedTimeMs = l2;
        this.fixedTimeZone = timeZone;
    }

    public static TimeSource fixed(long l2) {
        Long l3 = l2;
        TimeSource timeSource = new TimeSource(l3, null);
        return timeSource;
    }

    public static TimeSource fixed(long l2, TimeZone timeZone) {
        Long l3 = l2;
        TimeSource timeSource = new TimeSource(l3, timeZone);
        return timeSource;
    }

    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    public Calendar now() {
        TimeZone timeZone = this.fixedTimeZone;
        return this.now(timeZone);
    }

    public Calendar now(TimeZone cloneable) {
        cloneable = cloneable == null ? Calendar.getInstance() : Calendar.getInstance((TimeZone)cloneable);
        Long l2 = this.fixedTimeMs;
        if (l2 != null) {
            long l3 = l2;
            ((Calendar)cloneable).setTimeInMillis(l3);
        }
        return cloneable;
    }
}

