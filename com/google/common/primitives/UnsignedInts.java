/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.ParseRequest;
import com.google.common.primitives.UnsignedInts$LexicographicalComparator;
import java.util.Arrays;
import java.util.Comparator;

public final class UnsignedInts {
    static final long INT_MASK = 0xFFFFFFFFL;

    private UnsignedInts() {
    }

    /*
     * WARNING - void declaration
     */
    public static int checkedCast(long l2) {
        void var2_4;
        int bl2 = 32;
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
        return (int)l2;
    }

    public static int compare(int n3, int n4) {
        n3 = UnsignedInts.flip(n3);
        n4 = UnsignedInts.flip(n4);
        return Ints.compare(n3, n4);
    }

    public static int decode(String string2) {
        Object object;
        ParseRequest parseRequest = ParseRequest.fromString(string2);
        try {
            object = parseRequest.rawValue;
        }
        catch (NumberFormatException numberFormatException) {
            string2 = kp1_0.c("Error parsing value: ", string2);
            object = new NumberFormatException(string2);
            ((Throwable)object).initCause(numberFormatException);
            throw object;
        }
        int n3 = parseRequest.radix;
        return UnsignedInts.parseUnsignedInt((String)object, n3);
    }

    public static int divide(int n3, int n4) {
        long l2 = UnsignedInts.toLong(n3);
        long l3 = UnsignedInts.toLong(n4);
        return (int)(l2 / l3);
    }

    public static int flip(int n3) {
        return n3 ^ -1 << -1;
    }

    public static String join(String string2, int ... nArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        int n4 = nArray.length;
        if (n4 == 0) {
            return "";
        }
        int n7 = nArray.length * 5;
        StringBuilder stringBuilder = new StringBuilder(n7);
        String string3 = UnsignedInts.toString(nArray[0]);
        stringBuilder.append(string3);
        for (n7 = 1; n7 < (n3 = nArray.length); ++n7) {
            stringBuilder.append(string2);
            n3 = nArray[n7];
            String string4 = UnsignedInts.toString(n3);
            stringBuilder.append(string4);
        }
        return stringBuilder.toString();
    }

    public static Comparator lexicographicalComparator() {
        return UnsignedInts$LexicographicalComparator.INSTANCE;
    }

    public static int max(int ... nArray) {
        int n3 = nArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = UnsignedInts.flip(nArray[0]);
        for (int i3 = 1; i3 < (n4 = nArray.length); ++i3) {
            n4 = UnsignedInts.flip(nArray[i3]);
            if (n4 <= n3) continue;
            n3 = n4;
        }
        return UnsignedInts.flip(n3);
    }

    public static int min(int ... nArray) {
        int n3 = nArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = UnsignedInts.flip(nArray[0]);
        for (int i3 = 1; i3 < (n4 = nArray.length); ++i3) {
            n4 = UnsignedInts.flip(nArray[i3]);
            if (n4 >= n3) continue;
            n3 = n4;
        }
        return UnsignedInts.flip(n3);
    }

    public static int parseUnsignedInt(String string2) {
        return UnsignedInts.parseUnsignedInt(string2, 10);
    }

    public static int parseUnsignedInt(String string2, int n3) {
        Preconditions.checkNotNull(string2);
        long l2 = Long.parseLong(string2, n3);
        long l3 = 0xFFFFFFFFL & l2;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 == false) {
            return (int)l2;
        }
        StringBuilder stringBuilder = new StringBuilder("Input ");
        stringBuilder.append(string2);
        stringBuilder.append(" in base ");
        stringBuilder.append(n3);
        stringBuilder.append(" is not in the range of an unsigned integer");
        string2 = stringBuilder.toString();
        NumberFormatException numberFormatException = new NumberFormatException(string2);
        throw numberFormatException;
    }

    public static int remainder(int n3, int n4) {
        long l2 = UnsignedInts.toLong(n3);
        long l3 = UnsignedInts.toLong(n4);
        return (int)(l2 % l3);
    }

    public static int saturatedCast(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            return 0;
        }
        l3 = 0x100000000L;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0) {
            return -1;
        }
        return (int)l2;
    }

    public static void sort(int[] nArray) {
        Preconditions.checkNotNull(nArray);
        int n3 = nArray.length;
        UnsignedInts.sort(nArray, 0, n3);
    }

    public static void sort(int[] nArray, int n3, int n4) {
        Preconditions.checkNotNull(nArray);
        int n7 = nArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        for (n7 = n3; n7 < n4; ++n7) {
            int n8;
            nArray[n7] = n8 = UnsignedInts.flip(nArray[n7]);
        }
        Arrays.sort(nArray, n3, n4);
        while (n3 < n4) {
            nArray[n3] = n7 = UnsignedInts.flip(nArray[n3]);
            ++n3;
        }
    }

    public static void sortDescending(int[] nArray) {
        Preconditions.checkNotNull(nArray);
        int n3 = nArray.length;
        UnsignedInts.sortDescending(nArray, 0, n3);
    }

    public static void sortDescending(int[] nArray, int n3, int n4) {
        int n7;
        Preconditions.checkNotNull(nArray);
        int n8 = nArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n8);
        n8 = n3;
        while (true) {
            n7 = -1 >>> 1;
            if (n8 >= n4) break;
            int n10 = nArray[n8];
            nArray[n8] = n7 ^= n10;
            ++n8;
        }
        Arrays.sort(nArray, n3, n4);
        while (n3 < n4) {
            nArray[n3] = n8 = nArray[n3] ^ n7;
            ++n3;
        }
    }

    public static long toLong(int n3) {
        return (long)n3 & 0xFFFFFFFFL;
    }

    public static String toString(int n3) {
        return UnsignedInts.toString(n3, 10);
    }

    public static String toString(int n3, int n4) {
        return Long.toString((long)n3 & 0xFFFFFFFFL, n4);
    }
}

