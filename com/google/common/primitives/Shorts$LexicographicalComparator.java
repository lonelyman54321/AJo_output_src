/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.Shorts;
import java.util.Comparator;

final class Shorts$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ Shorts$LexicographicalComparator[] $VALUES;
    public static final /* enum */ Shorts$LexicographicalComparator INSTANCE;

    private static /* synthetic */ Shorts$LexicographicalComparator[] $values() {
        Shorts$LexicographicalComparator shorts$LexicographicalComparator = INSTANCE;
        Shorts$LexicographicalComparator[] shorts$LexicographicalComparatorArray = new Shorts$LexicographicalComparator[]{shorts$LexicographicalComparator};
        return shorts$LexicographicalComparatorArray;
    }

    static {
        Shorts$LexicographicalComparator shorts$LexicographicalComparator;
        INSTANCE = shorts$LexicographicalComparator = new Shorts$LexicographicalComparator("INSTANCE", 0);
        $VALUES = Shorts$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Shorts$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static Shorts$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(Shorts$LexicographicalComparator.class, string2);
    }

    public static Shorts$LexicographicalComparator[] values() {
        return (Shorts$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(short[] sArray, short[] sArray2) {
        int n3 = sArray.length;
        int n4 = sArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            int n7 = sArray[n4];
            short s7 = sArray2[n4];
            if ((n7 = Shorts.compare((short)n7, s7)) == 0) continue;
            return n7;
        }
        int n8 = sArray.length;
        int n10 = sArray2.length;
        return n8 - n10;
    }

    public String toString() {
        return "Shorts.lexicographicalComparator()";
    }
}

