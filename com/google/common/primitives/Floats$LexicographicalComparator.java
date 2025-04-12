/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import java.util.Comparator;

final class Floats$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ Floats$LexicographicalComparator[] $VALUES;
    public static final /* enum */ Floats$LexicographicalComparator INSTANCE;

    private static /* synthetic */ Floats$LexicographicalComparator[] $values() {
        Floats$LexicographicalComparator floats$LexicographicalComparator = INSTANCE;
        Floats$LexicographicalComparator[] floats$LexicographicalComparatorArray = new Floats$LexicographicalComparator[]{floats$LexicographicalComparator};
        return floats$LexicographicalComparatorArray;
    }

    static {
        Floats$LexicographicalComparator floats$LexicographicalComparator;
        INSTANCE = floats$LexicographicalComparator = new Floats$LexicographicalComparator("INSTANCE", 0);
        $VALUES = Floats$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Floats$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static Floats$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(Floats$LexicographicalComparator.class, string2);
    }

    public static Floats$LexicographicalComparator[] values() {
        return (Floats$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(float[] fArray, float[] fArray2) {
        int n3 = fArray.length;
        int n4 = fArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            float f5 = fArray[n4];
            float f6 = fArray2[n4];
            int n7 = Float.compare(f5, f6);
            if (n7 == 0) continue;
            return n7;
        }
        int n8 = fArray.length;
        int n10 = fArray2.length;
        return n8 - n10;
    }

    public String toString() {
        return "Floats.lexicographicalComparator()";
    }
}

