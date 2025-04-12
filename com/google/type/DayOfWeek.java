/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.type.DayOfWeek$1;
import com.google.type.DayOfWeek$DayOfWeekVerifier;

public final class DayOfWeek
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ DayOfWeek[] $VALUES;
    public static final /* enum */ DayOfWeek DAY_OF_WEEK_UNSPECIFIED;
    public static final int DAY_OF_WEEK_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ DayOfWeek FRIDAY;
    public static final int FRIDAY_VALUE = 5;
    public static final /* enum */ DayOfWeek MONDAY;
    public static final int MONDAY_VALUE = 1;
    public static final /* enum */ DayOfWeek SATURDAY;
    public static final int SATURDAY_VALUE = 6;
    public static final /* enum */ DayOfWeek SUNDAY;
    public static final int SUNDAY_VALUE = 7;
    public static final /* enum */ DayOfWeek THURSDAY;
    public static final int THURSDAY_VALUE = 4;
    public static final /* enum */ DayOfWeek TUESDAY;
    public static final int TUESDAY_VALUE = 2;
    public static final /* enum */ DayOfWeek UNRECOGNIZED;
    public static final /* enum */ DayOfWeek WEDNESDAY;
    public static final int WEDNESDAY_VALUE = 3;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        DayOfWeek dayOfWeek;
        DayOfWeek dayOfWeek2;
        DayOfWeek dayOfWeek3;
        DayOfWeek dayOfWeek4;
        DayOfWeek dayOfWeek5;
        DayOfWeek dayOfWeek6;
        DayOfWeek dayOfWeek7;
        DayOfWeek dayOfWeek8;
        Object object = new DayOfWeek("DAY_OF_WEEK_UNSPECIFIED", 0, 0);
        DAY_OF_WEEK_UNSPECIFIED = object;
        int n3 = 1;
        MONDAY = dayOfWeek8 = new DayOfWeek("MONDAY", n3, n3);
        int n4 = 2;
        TUESDAY = dayOfWeek7 = new DayOfWeek("TUESDAY", n4, n4);
        int n7 = 3;
        WEDNESDAY = dayOfWeek6 = new DayOfWeek("WEDNESDAY", n7, n7);
        int n8 = 4;
        THURSDAY = dayOfWeek5 = new DayOfWeek("THURSDAY", n8, n8);
        int n10 = 5;
        FRIDAY = dayOfWeek4 = new DayOfWeek("FRIDAY", n10, n10);
        int n14 = 6;
        SATURDAY = dayOfWeek3 = new DayOfWeek("SATURDAY", n14, n14);
        n14 = 7;
        SUNDAY = dayOfWeek2 = new DayOfWeek("SUNDAY", n14, n14);
        n14 = 8;
        UNRECOGNIZED = dayOfWeek = new DayOfWeek("UNRECOGNIZED", n14, -1);
        DayOfWeek[] dayOfWeekArray = new DayOfWeek[9];
        dayOfWeekArray[0] = object;
        dayOfWeekArray[n3] = dayOfWeek8;
        dayOfWeekArray[n4] = dayOfWeek7;
        dayOfWeekArray[n7] = dayOfWeek6;
        dayOfWeekArray[4] = dayOfWeek5;
        dayOfWeekArray[5] = dayOfWeek4;
        dayOfWeekArray[6] = dayOfWeek3;
        dayOfWeekArray[7] = dayOfWeek2;
        dayOfWeekArray[n14] = dayOfWeek;
        $VALUES = dayOfWeekArray;
        internalValueMap = object = new DayOfWeek$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DayOfWeek() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static DayOfWeek forNumber(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 7: {
                return SUNDAY;
            }
            case 6: {
                return SATURDAY;
            }
            case 5: {
                return FRIDAY;
            }
            case 4: {
                return THURSDAY;
            }
            case 3: {
                return WEDNESDAY;
            }
            case 2: {
                return TUESDAY;
            }
            case 1: {
                return MONDAY;
            }
            case 0: 
        }
        return DAY_OF_WEEK_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return DayOfWeek$DayOfWeekVerifier.INSTANCE;
    }

    public static DayOfWeek valueOf(int n3) {
        return DayOfWeek.forNumber(n3);
    }

    public static DayOfWeek valueOf(String string2) {
        return Enum.valueOf(DayOfWeek.class, string2);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[])$VALUES.clone();
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

