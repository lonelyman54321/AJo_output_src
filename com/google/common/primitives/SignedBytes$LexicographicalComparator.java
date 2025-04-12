/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.SignedBytes;
import java.util.Comparator;

final class SignedBytes$LexicographicalComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ SignedBytes$LexicographicalComparator[] $VALUES;
    public static final /* enum */ SignedBytes$LexicographicalComparator INSTANCE;

    private static /* synthetic */ SignedBytes$LexicographicalComparator[] $values() {
        SignedBytes$LexicographicalComparator signedBytes$LexicographicalComparator = INSTANCE;
        SignedBytes$LexicographicalComparator[] signedBytes$LexicographicalComparatorArray = new SignedBytes$LexicographicalComparator[]{signedBytes$LexicographicalComparator};
        return signedBytes$LexicographicalComparatorArray;
    }

    static {
        SignedBytes$LexicographicalComparator signedBytes$LexicographicalComparator;
        INSTANCE = signedBytes$LexicographicalComparator = new SignedBytes$LexicographicalComparator("INSTANCE", 0);
        $VALUES = SignedBytes$LexicographicalComparator.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SignedBytes$LexicographicalComparator() {
        void var2_-1;
        void var1_-1;
    }

    public static SignedBytes$LexicographicalComparator valueOf(String string2) {
        return Enum.valueOf(SignedBytes$LexicographicalComparator.class, string2);
    }

    public static SignedBytes$LexicographicalComparator[] values() {
        return (SignedBytes$LexicographicalComparator[])$VALUES.clone();
    }

    public int compare(byte[] byArray, byte[] byArray2) {
        int n3 = byArray.length;
        int n4 = byArray2.length;
        n3 = Math.min(n3, n4);
        for (n4 = 0; n4 < n3; ++n4) {
            int n7 = byArray[n4];
            byte by2 = byArray2[n4];
            if ((n7 = SignedBytes.compare((byte)n7, by2)) == 0) continue;
            return n7;
        }
        int n8 = byArray.length;
        int n10 = byArray2.length;
        return n8 - n10;
    }

    public String toString() {
        return "SignedBytes.lexicographicalComparator()";
    }
}

