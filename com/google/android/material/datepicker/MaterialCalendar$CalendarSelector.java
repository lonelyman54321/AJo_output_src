/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

final class MaterialCalendar$CalendarSelector
extends Enum {
    private static final /* synthetic */ MaterialCalendar$CalendarSelector[] $VALUES;
    public static final /* enum */ MaterialCalendar$CalendarSelector DAY;
    public static final /* enum */ MaterialCalendar$CalendarSelector YEAR;

    static {
        MaterialCalendar$CalendarSelector materialCalendar$CalendarSelector;
        MaterialCalendar$CalendarSelector materialCalendar$CalendarSelector2;
        DAY = materialCalendar$CalendarSelector2 = new MaterialCalendar$CalendarSelector("DAY", 0);
        int n3 = 1;
        YEAR = materialCalendar$CalendarSelector = new MaterialCalendar$CalendarSelector("YEAR", n3);
        MaterialCalendar$CalendarSelector[] materialCalendar$CalendarSelectorArray = new MaterialCalendar$CalendarSelector[2];
        materialCalendar$CalendarSelectorArray[0] = materialCalendar$CalendarSelector2;
        materialCalendar$CalendarSelectorArray[n3] = materialCalendar$CalendarSelector;
        $VALUES = materialCalendar$CalendarSelectorArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MaterialCalendar$CalendarSelector() {
        void var2_-1;
        void var1_-1;
    }

    public static MaterialCalendar$CalendarSelector valueOf(String string2) {
        return Enum.valueOf(MaterialCalendar$CalendarSelector.class, string2);
    }

    public static MaterialCalendar$CalendarSelector[] values() {
        return (MaterialCalendar$CalendarSelector[])$VALUES.clone();
    }
}

