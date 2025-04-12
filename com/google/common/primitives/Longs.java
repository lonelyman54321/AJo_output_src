/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs$AsciiDigits;
import com.google.common.primitives.Longs$LexicographicalComparator;
import com.google.common.primitives.Longs$LongArrayAsList;
import com.google.common.primitives.Longs$LongConverter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 0x4000000000000000L;

    private Longs() {
    }

    public static /* synthetic */ int access$000(long[] lArray, long l2, int n3, int n4) {
        return Longs.indexOf(lArray, l2, n3, n4);
    }

    public static /* synthetic */ int access$100(long[] lArray, long l2, int n3, int n4) {
        return Longs.lastIndexOf(lArray, l2, n3, n4);
    }

    public static List asList(long ... lArray) {
        int n3 = lArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        Longs$LongArrayAsList longs$LongArrayAsList = new Longs$LongArrayAsList(lArray);
        return longs$LongArrayAsList;
    }

    private static int checkNoOverflow(long l2) {
        int n3 = (int)l2;
        long l3 = n3;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        Preconditions.checkArgument(bl2, "the total number of elements (%s) in the arrays must fit in an int", l2);
        return n3;
    }

    public static int compare(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        int n3 = object < 0 ? -1 : (object > 0 ? 1 : 0);
        return n3;
    }

    public static long[] concat(long[] ... lArray) {
        int n3;
        long[] lArray2;
        int n4;
        int n7 = lArray.length;
        long l2 = 0L;
        for (n4 = 0; n4 < n7; ++n4) {
            lArray2 = lArray[n4];
            n3 = lArray2.length;
            long l3 = n3;
            l2 += l3;
        }
        n7 = Longs.checkNoOverflow(l2);
        long[] lArray3 = new long[n7];
        int n8 = lArray.length;
        n4 = 0;
        for (int i3 = 0; i3 < n8; ++i3) {
            lArray2 = lArray[i3];
            int n10 = lArray2.length;
            System.arraycopy(lArray2, 0, lArray3, n4, n10);
            n3 = lArray2.length;
            n4 += n3;
        }
        return lArray3;
    }

    public static long constrainToRange(long l2, long l3, long l4) {
        boolean bl2;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object <= 0) {
            object = 1;
            bl2 = true;
        } else {
            object = 0;
            bl2 = false;
        }
        Preconditions.checkArgument(bl2, "min (%s) must be less than or equal to max (%s)", l3, l4);
        return Math.min(Math.max(l2, l3), l4);
    }

    public static boolean contains(long[] lArray, long l2) {
        for (long l3 : lArray) {
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false) continue;
            return true;
        }
        return false;
    }

    public static long[] ensureCapacity(long[] lArray, int n3, int n4) {
        int n7 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Invalid minLength: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        if (n4 >= 0) {
            n7 = 1;
        }
        String string3 = "Invalid padding: %s";
        Preconditions.checkArgument(n7 != 0, string3, n4);
        n7 = lArray.length;
        if (n7 < n3) {
            lArray = Arrays.copyOf(lArray, n3 += n4);
        }
        return lArray;
    }

    public static long fromByteArray(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = 1;
        int n7 = 8;
        n3 = n3 >= n7 ? 1 : 0;
        int n8 = byArray.length;
        Preconditions.checkArgument(n3 != 0, "array too small: %s < %s", n8, n7);
        byte by2 = byArray[0];
        byte by4 = byArray[n4];
        byte by5 = byArray[2];
        byte by6 = byArray[3];
        byte by7 = byArray[4];
        byte by8 = byArray[5];
        byte by9 = byArray[6];
        byte by10 = byArray[7];
        return Longs.fromBytes(by2, by4, by5, by6, by7, by8, by9, by10);
    }

    public static long fromBytes(byte by2, byte by4, byte by5, byte by6, byte by7, byte by8, byte by9, byte by10) {
        long l2 = by2;
        long l3 = 255L;
        l2 = (l2 & l3) << 56;
        long l4 = ((long)by4 & l3) << 48 | l2;
        l2 = ((long)by5 & l3) << 40;
        l4 |= l2;
        long l7 = ((long)by6 & l3) << 32;
        l4 |= l7;
        l7 = ((long)by7 & l3) << 24;
        l4 |= l7;
        l7 = ((long)by8 & l3) << 16;
        l4 |= l7;
        l7 = ((long)by9 & l3) << 8;
        l4 |= l7;
        l7 = (long)by10 & l3;
        return l4 | l7;
    }

    public static int hashCode(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public static int indexOf(long[] lArray, long l2) {
        int n3 = lArray.length;
        return Longs.indexOf(lArray, l2, 0, n3);
    }

    private static int indexOf(long[] lArray, long l2, int n3, int n4) {
        while (n3 < n4) {
            long l3 = lArray[n3];
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int indexOf(long[] lArray, long[] lArray2) {
        block3: {
            Preconditions.checkNotNull(lArray, "array");
            String string2 = "target";
            Preconditions.checkNotNull(lArray2, string2);
            int n3 = lArray2.length;
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
            string2 = null;
            block0: while (true) {
                int n4 = lArray.length;
                int n7 = lArray2.length;
                if (n3 >= (n4 = n4 - n7 + 1)) break block3;
                for (n4 = 0; n4 < (n7 = lArray2.length); ++n4) {
                    n7 = n3 + n4;
                    long l2 = lArray[n7];
                    long l3 = lArray2[n4];
                    long l4 = l2 - l3;
                    Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object == false) continue;
                    ++n3;
                    continue block0;
                }
                break;
            }
            return n3;
        }
        return -1;
    }

    public static String join(String string2, long ... lArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        int n4 = lArray.length;
        if (n4 == 0) {
            return "";
        }
        int n7 = lArray.length * 10;
        StringBuilder stringBuilder = new StringBuilder(n7);
        long l2 = lArray[0];
        stringBuilder.append(l2);
        for (n7 = 1; n7 < (n3 = lArray.length); ++n7) {
            stringBuilder.append(string2);
            long l3 = lArray[n7];
            stringBuilder.append(l3);
        }
        return stringBuilder.toString();
    }

    public static int lastIndexOf(long[] lArray, long l2) {
        int n3 = lArray.length;
        return Longs.lastIndexOf(lArray, l2, 0, n3);
    }

    private static int lastIndexOf(long[] lArray, long l2, int n3, int n4) {
        n4 += -1;
        while (n4 >= n3) {
            long l3 = lArray[n4];
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                return n4;
            }
            n4 += -1;
        }
        return -1;
    }

    public static Comparator lexicographicalComparator() {
        return Longs$LexicographicalComparator.INSTANCE;
    }

    public static long max(long ... lArray) {
        int n3;
        boolean bl2 = lArray.length;
        bl2 = bl2 > false;
        Preconditions.checkArgument(bl2);
        long l2 = lArray[0];
        for (int i3 = 1; i3 < (n3 = lArray.length); ++i3) {
            long l3 = lArray[i3];
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object <= 0) continue;
            l2 = l3;
        }
        return l2;
    }

    public static long min(long ... lArray) {
        int n3;
        boolean bl2 = lArray.length;
        bl2 = bl2 > false;
        Preconditions.checkArgument(bl2);
        long l2 = lArray[0];
        for (int i3 = 1; i3 < (n3 = lArray.length); ++i3) {
            long l3 = lArray[i3];
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object >= 0) continue;
            l2 = l3;
        }
        return l2;
    }

    public static void reverse(long[] lArray) {
        Preconditions.checkNotNull(lArray);
        int n3 = lArray.length;
        Longs.reverse(lArray, 0, n3);
    }

    public static void reverse(long[] lArray, int n3, int n4) {
        Preconditions.checkNotNull(lArray);
        int n7 = lArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n4 += -1;
        while (n3 < n4) {
            long l2;
            long l3 = lArray[n3];
            lArray[n3] = l2 = lArray[n4];
            lArray[n4] = l3;
            ++n3;
            n4 += -1;
        }
    }

    public static void rotate(long[] lArray, int n3) {
        int n4 = lArray.length;
        Longs.rotate(lArray, n3, 0, n4);
    }

    public static void rotate(long[] lArray, int n3, int n4, int n7) {
        Preconditions.checkNotNull(lArray);
        int n8 = lArray.length;
        Preconditions.checkPositionIndexes(n4, n7, n8);
        n8 = lArray.length;
        int n10 = 1;
        if (n8 <= n10) {
            return;
        }
        n8 = n7 - n4;
        if ((n3 = -n3 % n8) < 0) {
            n3 += n8;
        }
        if ((n3 += n4) == n4) {
            return;
        }
        Longs.reverse(lArray, n4, n3);
        Longs.reverse(lArray, n3, n7);
        Longs.reverse(lArray, n4, n7);
    }

    public static void sortDescending(long[] lArray) {
        Preconditions.checkNotNull(lArray);
        int n3 = lArray.length;
        Longs.sortDescending(lArray, 0, n3);
    }

    public static void sortDescending(long[] lArray, int n3, int n4) {
        Preconditions.checkNotNull(lArray);
        int n7 = lArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        Arrays.sort(lArray, n3, n4);
        Longs.reverse(lArray, n3, n4);
    }

    public static Converter stringConverter() {
        return Longs$LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection objectArray) {
        int n3 = objectArray instanceof Longs$LongArrayAsList;
        if (n3 != 0) {
            return ((Longs$LongArrayAsList)objectArray).toLongArray();
        }
        objectArray = objectArray.toArray();
        n3 = objectArray.length;
        long[] lArray = new long[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            long l2;
            Number number = (Number)Preconditions.checkNotNull(objectArray[i3]);
            lArray[i3] = l2 = number.longValue();
        }
        return lArray;
    }

    public static byte[] toByteArray(long l2) {
        int n3 = 8;
        byte[] byArray = new byte[n3];
        for (int i3 = 7; i3 >= 0; i3 += -1) {
            byte by2;
            long l3 = 0xFFL & l2;
            int n4 = (int)l3;
            byArray[i3] = by2 = (byte)n4;
            l2 >>= n3;
        }
        return byArray;
    }

    public static Long tryParse(String string2) {
        return Longs.tryParse(string2, 10);
    }

    public static Long tryParse(String string2, int n3) {
        Object object = string2;
        int n4 = n3;
        String string3 = (String)Preconditions.checkNotNull(string2);
        int n7 = string3.isEmpty();
        if (n7 != 0) {
            return null;
        }
        n7 = 2;
        if (n3 >= n7 && n3 <= (n7 = 36)) {
            int n8;
            n7 = 0;
            string3 = null;
            int n10 = string2.charAt(0);
            if (n10 == (n8 = 45)) {
                n7 = 1;
            }
            if (n7 == (n10 = string2.length())) {
                return null;
            }
            n10 = n7 + 1;
            n8 = Longs$AsciiDigits.digit(((String)object).charAt(n7));
            if (n8 >= 0 && n8 < n4) {
                int n14;
                n8 = -n8;
                long l2 = n8;
                long l3 = n4;
                long l4 = Long.MIN_VALUE;
                long l7 = l4 / l3;
                while (n10 < (n14 = string2.length())) {
                    long l8;
                    n14 = n10 + 1;
                    if ((n10 = Longs$AsciiDigits.digit(((String)object).charAt(n10))) >= 0 && n10 < n4 && (l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) >= 0) {
                        long l12 = n10;
                        long l14 = l12 + l4;
                        long l15 = (l2 *= l3) - l14;
                        if ((n10 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1))) < 0) {
                            return null;
                        }
                        l2 -= l12;
                        n10 = n14;
                        continue;
                    }
                    return null;
                }
                if (n7 != 0) {
                    return l2;
                }
                Object object2 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                if (object2 == false) {
                    return null;
                }
                return -l2;
            }
            return null;
        }
        String string4 = hj0_0.a(n4, "radix must be between MIN_RADIX and MAX_RADIX but was ");
        object = new IllegalArgumentException(string4);
        throw object;
    }
}

