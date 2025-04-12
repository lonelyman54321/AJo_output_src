/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import java.util.Comparator;

final class Doubles$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ Doubles$LexicographicalComparator[] $VALUES;
    public static final /* enum */ Doubles$LexicographicalComparator INSTANCE;

    private static /* synthetic */ Doubles$LexicographicalComparator[] $values() {
        Doubles$LexicographicalComparator doubles$LexicographicalComparator = INSTANCE;
        Doubles$LexicographicalComparator[] doubles$LexicographicalComparatorArray = new Doubles$LexicographicalComparator[]{doubles$LexicographicalComparator};
        return doubles$LexicographicalComparatorArray;
    }

    static {
        Doubles$LexicographicalComparator doubles$LexicographicalComparator;
        INSTANCE = doubles$LexicographicalComparator = new Doubles$LexicographicalComparator("INSTANCE", 0);
        $VALUES = Doubles$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Doubles$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static Doubles$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(Doubles$LexicographicalComparator.class, string2);
    }

    public static Doubles$LexicographicalComparator[] values() {
        return (Doubles$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(double[] dArray, double[] dArray2) {
        int n3 = dArray.length;
        int n4 = dArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            double d2 = dArray[n4];
            double d5 = dArray2[n4];
            int n7 = Double.compare(d2, d5);
            if (n7 == 0) continue;
            return n7;
        }
        int n8 = dArray.length;
        int n10 = dArray2.length;
        return n8 - n10;
    }

    public String toString() {
        return "Doubles.lexicographicalComparator()";
    }
}

