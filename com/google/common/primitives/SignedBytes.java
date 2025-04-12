/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.SignedBytes$LexicographicalComparator;
import java.util.Arrays;
import java.util.Comparator;

public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    private SignedBytes() {
    }

    public static byte checkedCast(long l2) {
        byte by2 = (byte)l2;
        long l3 = by2;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        Preconditions.checkArgument(bl2, "Out of range: %s", l2);
        return by2;
    }

    public static int compare(byte by2, byte by4) {
        return by2 - by4;
    }

    public static String join(String string2, byte ... byArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        int n4 = byArray.length;
        if (n4 == 0) {
            return "";
        }
        int n7 = byArray.length * 5;
        StringBuilder stringBuilder = new StringBuilder(n7);
        n7 = byArray[0];
        stringBuilder.append(n7);
        for (n7 = 1; n7 < (n3 = byArray.length); ++n7) {
            stringBuilder.append(string2);
            n3 = byArray[n7];
            stringBuilder.append(n3);
        }
        return stringBuilder.toString();
    }

    public static Comparator lexicographicalComparator() {
        return SignedBytes$LexicographicalComparator.INSTANCE;
    }

    public static byte max(byte ... byArray) {
        int n3 = byArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = byArray[0];
        for (int i3 = 1; i3 < (n4 = byArray.length); ++i3) {
            n4 = byArray[i3];
            if (n4 <= n3) continue;
            n3 = n4;
        }
        return (byte)n3;
    }

    public static byte min(byte ... byArray) {
        int n3 = byArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = byArray[0];
        for (int i3 = 1; i3 < (n4 = byArray.length); ++i3) {
            n4 = byArray[i3];
            if (n4 >= n3) continue;
            n3 = n4;
        }
        return (byte)n3;
    }

    public static byte saturatedCast(long l2) {
        long l3 = 127;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return 127;
        }
        l3 = -128;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return -128;
        }
        return (byte)l2;
    }

    public static void sortDescending(byte[] byArray) {
        Preconditions.checkNotNull(byArray);
        int n3 = byArray.length;
        SignedBytes.sortDescending(byArray, 0, n3);
    }

    public static void sortDescending(byte[] byArray, int n3, int n4) {
        Preconditions.checkNotNull(byArray);
        int n7 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        Arrays.sort(byArray, n3, n4);
        Bytes.reverse(byArray, n3, n4);
    }
}

