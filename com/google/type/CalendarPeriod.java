/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.type.CalendarPeriod$1;
import com.google.type.CalendarPeriod$CalendarPeriodVerifier;

public final class CalendarPeriod
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ CalendarPeriod[] $VALUES;
    public static final /* enum */ CalendarPeriod CALENDAR_PERIOD_UNSPECIFIED;
    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ CalendarPeriod DAY;
    public static final int DAY_VALUE = 1;
    public static final /* enum */ CalendarPeriod FORTNIGHT;
    public static final int FORTNIGHT_VALUE = 3;
    public static final /* enum */ CalendarPeriod HALF;
    public static final int HALF_VALUE = 6;
    public static final /* enum */ CalendarPeriod MONTH;
    public static final int MONTH_VALUE = 4;
    public static final /* enum */ CalendarPeriod QUARTER;
    public static final int QUARTER_VALUE = 5;
    public static final /* enum */ CalendarPeriod UNRECOGNIZED;
    public static final /* enum */ CalendarPeriod WEEK;
    public static final int WEEK_VALUE = 2;
    public static final /* enum */ CalendarPeriod YEAR;
    public static final int YEAR_VALUE = 7;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        CalendarPeriod calendarPeriod;
        CalendarPeriod calendarPeriod2;
        CalendarPeriod calendarPeriod3;
        CalendarPeriod calendarPeriod4;
        CalendarPeriod calendarPeriod5;
        CalendarPeriod calendarPeriod6;
        CalendarPeriod calendarPeriod7;
        CalendarPeriod calendarPeriod8;
        Object object = new CalendarPeriod("CALENDAR_PERIOD_UNSPECIFIED", 0, 0);
        CALENDAR_PERIOD_UNSPECIFIED = object;
        int n3 = 1;
        DAY = calendarPeriod8 = new CalendarPeriod("DAY", n3, n3);
        int n4 = 2;
        WEEK = calendarPeriod7 = new CalendarPeriod("WEEK", n4, n4);
        int n7 = 3;
        FORTNIGHT = calendarPeriod6 = new CalendarPeriod("FORTNIGHT", n7, n7);
        int n8 = 4;
        MONTH = calendarPeriod5 = new CalendarPeriod("MONTH", n8, n8);
        int n10 = 5;
        QUARTER = calendarPeriod4 = new CalendarPeriod("QUARTER", n10, n10);
        int n14 = 6;
        HALF = calendarPeriod3 = new CalendarPeriod("HALF", n14, n14);
        n14 = 7;
        YEAR = calendarPeriod2 = new CalendarPeriod("YEAR", n14, n14);
        n14 = 8;
        UNRECOGNIZED = calendarPeriod = new CalendarPeriod("UNRECOGNIZED", n14, -1);
        CalendarPeriod[] calendarPeriodArray = new CalendarPeriod[9];
        calendarPeriodArray[0] = object;
        calendarPeriodArray[n3] = calendarPeriod8;
        calendarPeriodArray[n4] = calendarPeriod7;
        calendarPeriodArray[n7] = calendarPeriod6;
        calendarPeriodArray[4] = calendarPeriod5;
        calendarPeriodArray[5] = calendarPeriod4;
        calendarPeriodArray[6] = calendarPeriod3;
        calendarPeriodArray[7] = calendarPeriod2;
        calendarPeriodArray[n14] = calendarPeriod;
        $VALUES = calendarPeriodArray;
        internalValueMap = object = new CalendarPeriod$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CalendarPeriod() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static CalendarPeriod forNumber(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 7: {
                return YEAR;
            }
            case 6: {
                return HALF;
            }
            case 5: {
                return QUARTER;
            }
            case 4: {
                return MONTH;
            }
            case 3: {
                return FORTNIGHT;
            }
            case 2: {
                return WEEK;
            }
            case 1: {
                return DAY;
            }
            case 0: 
        }
        return CALENDAR_PERIOD_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return CalendarPeriod$CalendarPeriodVerifier.INSTANCE;
    }

    public static CalendarPeriod valueOf(int n3) {
        return CalendarPeriod.forNumber(n3);
    }

    public static CalendarPeriod valueOf(String string2) {
        return Enum.valueOf(CalendarPeriod.class, string2);
    }

    public static CalendarPeriod[] values() {
        return (CalendarPeriod[])$VALUES.clone();
    }

    public final int getNumber() {
        Object object = UNRECOGNIZED;
        if (this != object) {
            return this.value;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

