/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.Chars;
import java.util.Comparator;

final class Chars$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ Chars$LexicographicalComparator[] $VALUES;
    public static final /* enum */ Chars$LexicographicalComparator INSTANCE;

    private static /* synthetic */ Chars$LexicographicalComparator[] $values() {
        Chars$LexicographicalComparator chars$LexicographicalComparator = INSTANCE;
        Chars$LexicographicalComparator[] chars$LexicographicalComparatorArray = new Chars$LexicographicalComparator[]{chars$LexicographicalComparator};
        return chars$LexicographicalComparatorArray;
    }

    static {
        Chars$LexicographicalComparator chars$LexicographicalComparator;
        INSTANCE = chars$LexicographicalComparator = new Chars$LexicographicalComparator("INSTANCE", 0);
        $VALUES = Chars$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Chars$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static Chars$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(Chars$LexicographicalComparator.class, string2);
    }

    public static Chars$LexicographicalComparator[] values() {
        return (Chars$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(char[] cArray, char[] cArray2) {
        int n3 = cArray.length;
        int n4 = cArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            int n7 = cArray[n4];
            char c2 = cArray2[n4];
            if ((n7 = Chars.compare((char)n7, c2)) == 0) continue;
            return n7;
        }
        int n8 = cArray.length;
        int n10 = cArray2.length;
        return n8 - n10;
    }

    public String toString() {
        return "Chars.lexicographicalComparator()";
    }
}

