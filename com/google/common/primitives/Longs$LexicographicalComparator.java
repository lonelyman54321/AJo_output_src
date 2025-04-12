/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.Longs;
import java.util.Comparator;

final class Longs$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ Longs$LexicographicalComparator[] $VALUES;
    public static final /* enum */ Longs$LexicographicalComparator INSTANCE;

    private static /* synthetic */ Longs$LexicographicalComparator[] $values() {
        Longs$LexicographicalComparator longs$LexicographicalComparator = INSTANCE;
        Longs$LexicographicalComparator[] longs$LexicographicalComparatorArray = new Longs$LexicographicalComparator[]{longs$LexicographicalComparator};
        return longs$LexicographicalComparatorArray;
    }

    static {
        Longs$LexicographicalComparator longs$LexicographicalComparator;
        INSTANCE = longs$LexicographicalComparator = new Longs$LexicographicalComparator("INSTANCE", 0);
        $VALUES = Longs$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Longs$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static Longs$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(Longs$LexicographicalComparator.class, string2);
    }

    public static Longs$LexicographicalComparator[] values() {
        return (Longs$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(long[] lArray, long[] lArray2) {
        int n3 = lArray.length;
        int n4 = lArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            long l2 = lArray[n4];
            long l3 = lArray2[n4];
            int n7 = Longs.compare(l2, l3);
            if (n7 == 0) continue;
            return n7;
        }
        int n8 = lArray.length;
        int n10 = lArray2.length;
        return n8 - n10;
    }

    public String toString() {
        return "Longs.lexicographicalComparator()";
    }
}

