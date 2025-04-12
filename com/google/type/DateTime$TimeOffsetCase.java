/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

public final class DateTime$TimeOffsetCase
extends Enum {
    private static final /* synthetic */ DateTime$TimeOffsetCase[] $VALUES;
    public static final /* enum */ DateTime$TimeOffsetCase TIMEOFFSET_NOT_SET;
    public static final /* enum */ DateTime$TimeOffsetCase TIME_ZONE;
    public static final /* enum */ DateTime$TimeOffsetCase UTC_OFFSET;
    private final int value;

    static {
        DateTime$TimeOffsetCase dateTime$TimeOffsetCase;
        DateTime$TimeOffsetCase dateTime$TimeOffsetCase2;
        DateTime$TimeOffsetCase dateTime$TimeOffsetCase3;
        UTC_OFFSET = dateTime$TimeOffsetCase3 = new DateTime$TimeOffsetCase("UTC_OFFSET", 0, 8);
        int n3 = 1;
        TIME_ZONE = dateTime$TimeOffsetCase2 = new DateTime$TimeOffsetCase("TIME_ZONE", n3, 9);
        int n4 = 2;
        TIMEOFFSET_NOT_SET = dateTime$TimeOffsetCase = new DateTime$TimeOffsetCase("TIMEOFFSET_NOT_SET", n4, 0);
        DateTime$TimeOffsetCase[] dateTime$TimeOffsetCaseArray = new DateTime$TimeOffsetCase[3];
        dateTime$TimeOffsetCaseArray[0] = dateTime$TimeOffsetCase3;
        dateTime$TimeOffsetCaseArray[n3] = dateTime$TimeOffsetCase2;
        dateTime$TimeOffsetCaseArray[n4] = dateTime$TimeOffsetCase;
        $VALUES = dateTime$TimeOffsetCaseArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DateTime$TimeOffsetCase() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static DateTime$TimeOffsetCase forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 8;
            if (n3 != n4) {
                n4 = 9;
                if (n3 != n4) {
                    return null;
                }
                return TIME_ZONE;
            }
            return UTC_OFFSET;
        }
        return TIMEOFFSET_NOT_SET;
    }

    public static DateTime$TimeOffsetCase valueOf(int n3) {
        return DateTime$TimeOffsetCase.forNumber(n3);
    }

    public static DateTime$TimeOffsetCase valueOf(String string2) {
        return Enum.valueOf(DateTime$TimeOffsetCase.class, string2);
    }

    public static DateTime$TimeOffsetCase[] values() {
        return (DateTime$TimeOffsetCase[])$VALUES.clone();
    }

    public int getNumber() {
        return this.value;
    }
}

