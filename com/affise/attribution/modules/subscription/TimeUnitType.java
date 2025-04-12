/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.TimeUnitType$Companion;

public final class TimeUnitType
extends Enum {
    private static final /* synthetic */ TimeUnitType[] $VALUES;
    public static final TimeUnitType$Companion Companion;
    public static final /* enum */ TimeUnitType DAY;
    public static final /* enum */ TimeUnitType MONTH;
    public static final /* enum */ TimeUnitType WEEK;
    public static final /* enum */ TimeUnitType YEAR;
    private final String value;

    private static final /* synthetic */ TimeUnitType[] $values() {
        TimeUnitType timeUnitType = DAY;
        timeUnitType = WEEK;
        timeUnitType = MONTH;
        timeUnitType = YEAR;
        TimeUnitType[] timeUnitTypeArray = new TimeUnitType[]{timeUnitType, timeUnitType, timeUnitType, timeUnitType};
        return timeUnitTypeArray;
    }

    static {
        Object object;
        DAY = object = new TimeUnitType("DAY", 0, "day");
        WEEK = object = new TimeUnitType("WEEK", 1, "week");
        MONTH = object = new TimeUnitType("MONTH", 2, "month");
        YEAR = object = new TimeUnitType("YEAR", 3, "year");
        $VALUES = TimeUnitType.$values();
        object = new TimeUnitType$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TimeUnitType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final TimeUnitType from(String string2) {
        return Companion.from(string2);
    }

    public static TimeUnitType valueOf(String string2) {
        return Enum.valueOf(TimeUnitType.class, string2);
    }

    public static TimeUnitType[] values() {
        return (TimeUnitType[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

