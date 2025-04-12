/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder;
import com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator;
import java.util.Arrays;
import java.util.Comparator;

public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    private UnsignedBytes() {
    }

    /*
     * WARNING - void declaration
     */
    public static byte checkedCast(long l2) {
        void var2_4;
        int bl2 = 8;
        long l3 = l2 >> bl2;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        Preconditions.checkArgument((boolean)var2_4, "out of range: %s", l2);
        return (byte)l2;
    }

    public static int compare(byte by2, byte by4) {
        by2 = (byte)UnsignedBytes.toInt(by2);
        by4 = (byte)UnsignedBytes.toInt(by4);
        return by2 - by4;
    }

    private static byte flip(byte by2) {
        return (byte)(by2 ^ 0x80);
    }

    public static String join(String string2, byte ... byArray) {
        Preconditions.checkNotNull(string2);
        int n3 = byArray.length;
        if (n3 == 0) {
            return "";
        }
        int n4 = byArray.length;
        byte by2 = (string2.length() + 3) * n4;
        StringBuilder stringBuilder = new StringBuilder(by2);
        n4 = UnsignedBytes.toInt(byArray[0]);
        stringBuilder.append(n4);
        for (n4 = 1; n4 < (by2 = byArray.length); ++n4) {
            stringBuilder.append(string2);
            by2 = byArray[n4];
            String string3 = UnsignedBytes.toString(by2);
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    public static Comparator lexicographicalComparator() {
        return UnsignedBytes$LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    public static Comparator lexicographicalComparatorJavaImpl() {
        return UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator.INSTANCE;
    }

    public static byte max(byte ... byArray) {
        int n3 = byArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = UnsignedBytes.toInt(byArray[0]);
        for (int i3 = 1; i3 < (n4 = byArray.length); ++i3) {
            n4 = UnsignedBytes.toInt(byArray[i3]);
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
        n3 = UnsignedBytes.toInt(byArray[0]);
        for (int i3 = 1; i3 < (n4 = byArray.length); ++i3) {
            n4 = UnsignedBytes.toInt(byArray[i3]);
            if (n4 >= n3) continue;
            n3 = n4;
        }
        return (byte)n3;
    }

    public static byte parseUnsignedByte(String string2) {
        return UnsignedBytes.parseUnsignedByte(string2, 10);
    }

    public static byte parseUnsignedByte(String string2, int n3) {
        int n4 = Integer.parseInt(string2 = (String)Preconditions.checkNotNull(string2), n3);
        n3 = n4 >> 8;
        if (n3 == 0) {
            return (byte)n4;
        }
        string2 = hj0_0.a(n4, "out of range: ");
        NumberFormatException numberFormatException = new NumberFormatException(string2);
        throw numberFormatException;
    }

    public static byte saturatedCast(long l2) {
        byte by2 = -1;
        int n3 = UnsignedBytes.toInt(by2);
        long l3 = n3;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return by2;
        }
        long l7 = 0L;
        long l8 = l2 - l7;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 < 0) {
            return 0;
        }
        return (byte)l2;
    }

    public static void sort(byte[] byArray) {
        Preconditions.checkNotNull(byArray);
        int n3 = byArray.length;
        UnsignedBytes.sort(byArray, 0, n3);
    }

    public static void sort(byte[] byArray, int n3, int n4) {
        Preconditions.checkNotNull(byArray);
        int n7 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        for (n7 = n3; n7 < n4; ++n7) {
            byte by2;
            byArray[n7] = by2 = UnsignedBytes.flip(byArray[n7]);
        }
        Arrays.sort(byArray, n3, n4);
        while (n3 < n4) {
            byArray[n3] = n7 = (int)UnsignedBytes.flip(byArray[n3]);
            ++n3;
        }
    }

    public static void sortDescending(byte[] byArray) {
        Preconditions.checkNotNull(byArray);
        int n3 = byArray.length;
        UnsignedBytes.sortDescending(byArray, 0, n3);
    }

    public static void sortDescending(byte[] byArray, int n3, int n4) {
        Preconditions.checkNotNull(byArray);
        int n7 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        for (n7 = n3; n7 < n4; ++n7) {
            byte by2;
            byArray[n7] = by2 = (byte)(byArray[n7] ^ 0x7F);
        }
        Arrays.sort(byArray, n3, n4);
        while (n3 < n4) {
            byArray[n3] = n7 = (int)((byte)(byArray[n3] ^ 0x7F));
            ++n3;
        }
    }

    public static int toInt(byte by2) {
        return by2 & 0xFF;
    }

    public static String toString(byte by2) {
        return UnsignedBytes.toString(by2, 10);
    }

    public static String toString(byte by2, int n3) {
        int n4 = 2;
        n4 = n3 >= n4 && n3 <= (n4 = 36) ? 1 : 0;
        Preconditions.checkArgument(n4 != 0, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", n3);
        return Integer.toString(UnsignedBytes.toInt(by2), n3);
    }
}

