/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.Booleans;
import java.util.Comparator;

final class Booleans$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ Booleans$LexicographicalComparator[] $VALUES;
    public static final /* enum */ Booleans$LexicographicalComparator INSTANCE;

    private static /* synthetic */ Booleans$LexicographicalComparator[] $values() {
        Booleans$LexicographicalComparator booleans$LexicographicalComparator = INSTANCE;
        Booleans$LexicographicalComparator[] booleans$LexicographicalComparatorArray = new Booleans$LexicographicalComparator[]{booleans$LexicographicalComparator};
        return booleans$LexicographicalComparatorArray;
    }

    static {
        Booleans$LexicographicalComparator booleans$LexicographicalComparator;
        INSTANCE = booleans$LexicographicalComparator = new Booleans$LexicographicalComparator("INSTANCE", 0);
        $VALUES = Booleans$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Booleans$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static Booleans$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(Booleans$LexicographicalComparator.class, string2);
    }

    public static Booleans$LexicographicalComparator[] values() {
        return (Booleans$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(boolean[] blArray, boolean[] blArray2) {
        int n3 = blArray.length;
        int n4 = blArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            int n7 = blArray[n4];
            boolean bl2 = blArray2[n4];
            if ((n7 = Booleans.compare(n7 != 0, bl2)) == 0) continue;
            return n7;
        }
        int n8 = blArray.length;
        int n10 = blArray2.length;
        return n8 - n10;
    }

    public String toString() {
        return "Booleans.lexicographicalComparator()";
    }
}

