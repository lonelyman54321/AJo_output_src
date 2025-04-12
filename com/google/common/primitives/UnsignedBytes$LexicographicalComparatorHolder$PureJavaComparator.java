/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;

final class UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] $VALUES;
    public static final /* enum */ UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator INSTANCE;

    private static /* synthetic */ UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] $values() {
        UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator unsignedBytes$LexicographicalComparatorHolder$PureJavaComparator = INSTANCE;
        UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] unsignedBytes$LexicographicalComparatorHolder$PureJavaComparatorArray = new UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[]{unsignedBytes$LexicographicalComparatorHolder$PureJavaComparator};
        return unsignedBytes$LexicographicalComparatorHolder$PureJavaComparatorArray;
    }

    static {
        UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator unsignedBytes$LexicographicalComparatorHolder$PureJavaComparator;
        INSTANCE = unsignedBytes$LexicographicalComparatorHolder$PureJavaComparator = new UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator("INSTANCE", 0);
        $VALUES = UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator valueOf(String string2) {
        return Enum.valueOf(UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator.class, string2);
    }

    public static UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] values() {
        return (UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[])$VALUES.clone();
    }

    public int compare(byte[] byArray, byte[] byArray2) {
        int n3 = byArray.length;
        int n4 = byArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            int n7 = byArray[n4];
            byte by2 = byArray2[n4];
            if ((n7 = UnsignedBytes.compare((byte)n7, by2)) == 0) continue;
            return n7;
        }
        int n8 = byArray.length;
        int n10 = byArray2.length;
        return n8 - n10;
    }

    public String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}

