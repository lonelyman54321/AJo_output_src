/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.ParseRequest;
import com.google.common.primitives.UnsignedLongs$LexicographicalComparator;
import com.google.common.primitives.UnsignedLongs$ParseOverflowDetection;
import java.util.Arrays;
import java.util.Comparator;

public final class UnsignedLongs {
    public static final long MAX_VALUE = 255L;

    private UnsignedLongs() {
    }

    public static int compare(long l2, long l3) {
        l2 = UnsignedLongs.flip(l2);
        l3 = UnsignedLongs.flip(l3);
        return Longs.compare(l2, l3);
    }

    public static long decode(String string2) {
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
        return UnsignedLongs.parseUnsignedLong((String)object, n3);
    }

    public static long divide(long l2, long l3) {
        long l4;
        long l7;
        int n3;
        long l8 = 0L;
        long l12 = l3 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object < 0) {
            int n4 = UnsignedLongs.compare(l2, l3);
            if (n4 < 0) {
                return l8;
            }
            return 1L;
        }
        object = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
        if (object >= 0) {
            return l2 / l3;
        }
        int n7 = 1;
        if ((n3 = UnsignedLongs.compare(l2 -= (l7 = (l4 = (l2 >>> n7) / l3 << n7) * l3), l3)) < 0) {
            n7 = 0;
        }
        l2 = n7;
        return l4 + l2;
    }

    private static long flip(long l2) {
        return l2 ^ Long.MIN_VALUE;
    }

    public static String join(String string2, long ... lArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        int n4 = lArray.length;
        if (n4 == 0) {
            return "";
        }
        int n7 = lArray.length * 5;
        StringBuilder stringBuilder = new StringBuilder(n7);
        long l2 = lArray[0];
        String string3 = UnsignedLongs.toString(l2);
        stringBuilder.append(string3);
        for (n7 = 1; n7 < (n3 = lArray.length); ++n7) {
            stringBuilder.append(string2);
            long l3 = lArray[n7];
            String string4 = UnsignedLongs.toString(l3);
            stringBuilder.append(string4);
        }
        return stringBuilder.toString();
    }

    public static Comparator lexicographicalComparator() {
        return UnsignedLongs$LexicographicalComparator.INSTANCE;
    }

    public static long max(long ... lArray) {
        int n3;
        boolean bl2 = lArray.length;
        bl2 = bl2 > false;
        Preconditions.checkArgument(bl2);
        long l2 = UnsignedLongs.flip(lArray[0]);
        for (int i3 = 1; i3 < (n3 = lArray.length); ++i3) {
            long l3 = UnsignedLongs.flip(lArray[i3]);
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object <= 0) continue;
            l2 = l3;
        }
        return UnsignedLongs.flip(l2);
    }

    public static long min(long ... lArray) {
        int n3;
        boolean bl2 = lArray.length;
        bl2 = bl2 > false;
        Preconditions.checkArgument(bl2);
        long l2 = UnsignedLongs.flip(lArray[0]);
        for (int i3 = 1; i3 < (n3 = lArray.length); ++i3) {
            long l3 = UnsignedLongs.flip(lArray[i3]);
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object >= 0) continue;
            l2 = l3;
        }
        return UnsignedLongs.flip(l2);
    }

    public static long parseUnsignedLong(String string2) {
        return UnsignedLongs.parseUnsignedLong(string2, 10);
    }

    public static long parseUnsignedLong(String object, int n3) {
        Preconditions.checkNotNull(object);
        int n4 = ((String)object).length();
        if (n4 != 0) {
            n4 = 2;
            if (n3 >= n4 && n3 <= (n4 = 36)) {
                int n7;
                int[] nArray = UnsignedLongs$ParseOverflowDetection.maxSafeDigits;
                n4 = nArray[n3] + -1;
                long l2 = 0L;
                for (int i3 = 0; i3 < (n7 = ((String)object).length()); ++i3) {
                    int n8;
                    n7 = Character.digit(((String)object).charAt(i3), n3);
                    if (n7 != (n8 = -1)) {
                        if (i3 > n4 && (n8 = (int)(UnsignedLongs$ParseOverflowDetection.overflowInParse(l2, n7, n3) ? 1 : 0)) != 0) {
                            object = "Too large for unsigned long: ".concat((String)object);
                            NumberFormatException numberFormatException = new NumberFormatException((String)object);
                            throw numberFormatException;
                        }
                        long l3 = n3;
                        l2 *= l3;
                        long l4 = n7;
                        l2 += l4;
                        continue;
                    }
                    NumberFormatException numberFormatException = new NumberFormatException((String)object);
                    throw numberFormatException;
                }
                return l2;
            }
            String string2 = hj0_0.a(n3, "illegal radix: ");
            object = new NumberFormatException(string2);
            throw object;
        }
        object = new NumberFormatException("empty string");
        throw object;
    }

    public static long remainder(long l2, long l3) {
        long l4;
        long l7;
        long l8 = 0L;
        long l12 = l3 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object < 0) {
            int n3 = UnsignedLongs.compare(l2, l3);
            if (n3 < 0) {
                return l2;
            }
            return l2 - l3;
        }
        object = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
        if (object >= 0) {
            return l2 % l3;
        }
        object = 1;
        if ((object = (Object)UnsignedLongs.compare(l2 -= (l7 = ((l4 = (l2 >>> object) / l3) << object) * l3), l3)) < 0) {
            l3 = l8;
        }
        return l2 - l3;
    }

    public static void sort(long[] lArray) {
        Preconditions.checkNotNull(lArray);
        int n3 = lArray.length;
        UnsignedLongs.sort(lArray, 0, n3);
    }

    public static void sort(long[] lArray, int n3, int n4) {
        Preconditions.checkNotNull(lArray);
        int n7 = lArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        for (n7 = n3; n7 < n4; ++n7) {
            long l2;
            lArray[n7] = l2 = UnsignedLongs.flip(lArray[n7]);
        }
        Arrays.sort(lArray, n3, n4);
        while (n3 < n4) {
            long l3;
            lArray[n3] = l3 = UnsignedLongs.flip(lArray[n3]);
            ++n3;
        }
    }

    public static void sortDescending(long[] lArray) {
        Preconditions.checkNotNull(lArray);
        int n3 = lArray.length;
        UnsignedLongs.sortDescending(lArray, 0, n3);
    }

    public static void sortDescending(long[] lArray, int n3, int n4) {
        long l2;
        long l3;
        Preconditions.checkNotNull(lArray);
        int n7 = lArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n7 = n3;
        while (true) {
            l3 = Long.MAX_VALUE;
            if (n7 >= n4) break;
            l2 = lArray[n7];
            lArray[n7] = l3 ^= l2;
            ++n7;
        }
        Arrays.sort(lArray, n3, n4);
        while (n3 < n4) {
            lArray[n3] = l2 = lArray[n3] ^ l3;
            ++n3;
        }
    }

    public static String toString(long l2) {
        return UnsignedLongs.toString(l2, 10);
    }

    public static String toString(long l2, int n3) {
        int n4;
        int n7 = 2;
        int n8 = 1;
        n7 = n3 >= n7 && n3 <= (n7 = 36) ? 1 : 0;
        String string2 = "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX";
        Preconditions.checkArgument(n7 != 0, string2, n3);
        long l3 = 0L;
        n7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n7 == 0) {
            return "0";
        }
        if (n7 > 0) {
            return Long.toString(l2, n3);
        }
        n7 = 64;
        char[] cArray = new char[n7];
        int n10 = n3 + -1;
        int n14 = n3 & n10;
        if (n14 == 0) {
            long l4;
            n14 = Integer.numberOfTrailingZeros(n3);
            do {
                cArray[n7 += -1] = n8 = (int)Character.forDigit((int)l2 & n10, n3);
            } while ((n8 = (int)((l4 = (l2 >>>= n14) - l3) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0);
        } else {
            long l7;
            long l8;
            n7 = n3 & 1;
            if (n7 == 0) {
                l8 = l2 >>> n8;
                n10 = n3 >>> 1;
                l7 = n10;
                l8 /= l7;
            } else {
                l8 = n3;
                l8 = UnsignedLongs.divide(l2, l8);
            }
            l7 = n3;
            long l12 = l8 * l7;
            char c2 = Character.forDigit((int)(l2 -= l12), n3);
            n4 = 63;
            cArray[n4] = c2;
            while ((c2 = (char)(l8 == l3 ? 0 : (l8 < l3 ? -1 : 1))) > '\u0000') {
                l12 = l8 % l7;
                cArray[n4 += -1] = c2 = Character.forDigit((int)l12, n3);
                l8 /= l7;
            }
            n7 = n4;
        }
        n4 = 64 - n7;
        String string3 = new String(cArray, n7, n4);
        return string3;
    }
}

