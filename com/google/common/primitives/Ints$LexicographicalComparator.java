/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.Ints;
import java.util.Comparator;

final class Ints$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ Ints$LexicographicalComparator[] $VALUES;
    public static final /* enum */ Ints$LexicographicalComparator INSTANCE;

    private static /* synthetic */ Ints$LexicographicalComparator[] $values() {
        Ints$LexicographicalComparator ints$LexicographicalComparator = INSTANCE;
        Ints$LexicographicalComparator[] ints$LexicographicalComparatorArray = new Ints$LexicographicalComparator[]{ints$LexicographicalComparator};
        return ints$LexicographicalComparatorArray;
    }

    static {
        Ints$LexicographicalComparator ints$LexicographicalComparator;
        INSTANCE = ints$LexicographicalComparator = new Ints$LexicographicalComparator("INSTANCE", 0);
        $VALUES = Ints$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ints$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static Ints$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(Ints$LexicographicalComparator.class, string2);
    }

    public static Ints$LexicographicalComparator[] values() {
        return (Ints$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(int[] nArray, int[] nArray2) {
        int n3 = nArray.length;
        int n4 = nArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            int n7 = nArray[n4];
            int n8 = nArray2[n4];
            if ((n7 = Ints.compare(n7, n8)) == 0) continue;
            return n7;
        }
        int n10 = nArray.length;
        int n14 = nArray2.length;
        return n10 - n14;
    }

    public String toString() {
        return "Ints.lexicographicalComparator()";
    }
}

