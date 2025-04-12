/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import java.util.Comparator;

final class Booleans$BooleanComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ Booleans$BooleanComparator[] $VALUES;
    public static final /* enum */ Booleans$BooleanComparator FALSE_FIRST;
    public static final /* enum */ Booleans$BooleanComparator TRUE_FIRST;
    private final String toString;
    private final int trueValue;

    private static /* synthetic */ Booleans$BooleanComparator[] $values() {
        Booleans$BooleanComparator booleans$BooleanComparator = TRUE_FIRST;
        booleans$BooleanComparator = FALSE_FIRST;
        Booleans$BooleanComparator[] booleans$BooleanComparatorArray = new Booleans$BooleanComparator[]{booleans$BooleanComparator, booleans$BooleanComparator};
        return booleans$BooleanComparatorArray;
    }

    static {
        Booleans$BooleanComparator booleans$BooleanComparator;
        int n3 = 1;
        TRUE_FIRST = booleans$BooleanComparator = new Booleans$BooleanComparator("TRUE_FIRST", 0, n3, "Booleans.trueFirst()");
        FALSE_FIRST = booleans$BooleanComparator = new Booleans$BooleanComparator("FALSE_FIRST", n3, -1, "Booleans.falseFirst()");
        $VALUES = Booleans$BooleanComparator.$values();
    }

    /*
     * WARNING - void declaration
     */
    private Booleans$BooleanComparator() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.trueValue = var3_2;
        this.toString = var4_1;
    }

    public static Booleans$BooleanComparator valueOf(String string2) {
        return Enum.valueOf(Booleans$BooleanComparator.class, string2);
    }

    public static Booleans$BooleanComparator[] values() {
        return (Booleans$BooleanComparator[])$VALUES.clone();
    }

    public int compare(Boolean bl2, Boolean bl3) {
        int n3 = bl2.booleanValue();
        int n4 = 0;
        if (n3 != 0) {
            n3 = this.trueValue;
        } else {
            n3 = 0;
            bl2 = null;
        }
        boolean bl4 = bl3;
        if (bl4) {
            n4 = this.trueValue;
        }
        return n4 - n3;
    }

    public String toString() {
        return this.toString;
    }
}

