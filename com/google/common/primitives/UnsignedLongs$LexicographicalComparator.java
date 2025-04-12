/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.UnsignedLongs;
import java.util.Comparator;

final class UnsignedLongs$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ UnsignedLongs$LexicographicalComparator[] $VALUES;
    public static final /* enum */ UnsignedLongs$LexicographicalComparator INSTANCE;

    private static /* synthetic */ UnsignedLongs$LexicographicalComparator[] $values() {
        UnsignedLongs$LexicographicalComparator unsignedLongs$LexicographicalComparator = INSTANCE;
        UnsignedLongs$LexicographicalComparator[] unsignedLongs$LexicographicalComparatorArray = new UnsignedLongs$LexicographicalComparator[]{unsignedLongs$LexicographicalComparator};
        return unsignedLongs$LexicographicalComparatorArray;
    }

    static {
        UnsignedLongs$LexicographicalComparator unsignedLongs$LexicographicalComparator;
        INSTANCE = unsignedLongs$LexicographicalComparator = new UnsignedLongs$LexicographicalComparator("INSTANCE", 0);
        $VALUES = UnsignedLongs$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UnsignedLongs$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static UnsignedLongs$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(UnsignedLongs$LexicographicalComparator.class, string2);
    }

    public static UnsignedLongs$LexicographicalComparator[] values() {
        return (UnsignedLongs$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(long[] lArray, long[] lArray2) {
        int n3 = lArray.length;
        int n4 = lArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            long l2 = lArray[n4];
            long l3 = lArray2[n4];
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) continue;
            return UnsignedLongs.compare(l2, l3);
        }
        int n7 = lArray.length;
        int n8 = lArray2.length;
        return n7 - n8;
    }

    public String toString() {
        return "UnsignedLongs.lexicographicalComparator()";
    }
}

