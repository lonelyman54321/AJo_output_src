/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.UnsignedInts;
import java.util.Comparator;

final class UnsignedInts$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ UnsignedInts$LexicographicalComparator[] $VALUES;
    public static final /* enum */ UnsignedInts$LexicographicalComparator INSTANCE;

    private static /* synthetic */ UnsignedInts$LexicographicalComparator[] $values() {
        UnsignedInts$LexicographicalComparator unsignedInts$LexicographicalComparator = INSTANCE;
        UnsignedInts$LexicographicalComparator[] unsignedInts$LexicographicalComparatorArray = new UnsignedInts$LexicographicalComparator[]{unsignedInts$LexicographicalComparator};
        return unsignedInts$LexicographicalComparatorArray;
    }

    static {
        UnsignedInts$LexicographicalComparator unsignedInts$LexicographicalComparator;
        INSTANCE = unsignedInts$LexicographicalComparator = new UnsignedInts$LexicographicalComparator("INSTANCE", 0);
        $VALUES = UnsignedInts$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UnsignedInts$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static UnsignedInts$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(UnsignedInts$LexicographicalComparator.class, string2);
    }

    public static UnsignedInts$LexicographicalComparator[] values() {
        return (UnsignedInts$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(int[] nArray, int[] nArray2) {
        int n3 = nArray.length;
        int n4 = nArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            int n7 = nArray[n4];
            int n8 = nArray2[n4];
            if (n7 == n8) continue;
            return UnsignedInts.compare(n7, n8);
        }
        int n10 = nArray.length;
        int n14 = nArray2.length;
        return n10 - n14;
    }

    public String toString() {
        return "UnsignedInts.lexicographicalComparator()";
    }
}

