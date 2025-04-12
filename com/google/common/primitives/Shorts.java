/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Shorts$LexicographicalComparator;
import com.google.common.primitives.Shorts$ShortArrayAsList;
import com.google.common.primitives.Shorts$ShortConverter;
import com.google.common.primitives.ShortsMethodsForWeb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Shorts
extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    private Shorts() {
    }

    public static /* synthetic */ int access$000(short[] sArray, short s7, int n3, int n4) {
        return Shorts.indexOf(sArray, s7, n3, n4);
    }

    public static /* synthetic */ int access$100(short[] sArray, short s7, int n3, int n4) {
        return Shorts.lastIndexOf(sArray, s7, n3, n4);
    }

    public static List asList(short ... sArray) {
        int n3 = sArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        Shorts$ShortArrayAsList shorts$ShortArrayAsList = new Shorts$ShortArrayAsList(sArray);
        return shorts$ShortArrayAsList;
    }

    public static short checkedCast(long l2) {
        short s7 = (short)l2;
        long l3 = s7;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        Preconditions.checkArgument(bl2, "Out of range: %s", l2);
        return s7;
    }

    public static int compare(short s7, short s8) {
        return s7 - s8;
    }

    public static short[] concat(short[] ... sArray) {
        int n3;
        short[] sArray2;
        int n4;
        int n7 = sArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            sArray2 = sArray[n4];
            n3 = sArray2.length;
            n8 += n3;
        }
        short[] sArray3 = new short[n8];
        n4 = sArray.length;
        n3 = 0;
        sArray2 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            short[] sArray4 = sArray[n8];
            int n10 = sArray4.length;
            System.arraycopy(sArray4, 0, sArray3, n3, n10);
            int n14 = sArray4.length;
            n3 += n14;
        }
        return sArray3;
    }

    public static short constrainToRange(short s7, short s8, short s10) {
        boolean bl2 = s8 <= s10;
        String string2 = "min (%s) must be less than or equal to max (%s)";
        Preconditions.checkArgument(bl2, string2, (int)s8, (int)s10);
        if (s7 < s8) {
            s7 = s8;
        } else if (s7 >= s10) {
            s7 = s10;
        }
        return s7;
    }

    public static boolean contains(short[] sArray, short s7) {
        for (short s8 : sArray) {
            if (s8 != s7) continue;
            return true;
        }
        return false;
    }

    public static short[] ensureCapacity(short[] sArray, int n3, int n4) {
        int n7 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Invalid minLength: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        if (n4 >= 0) {
            n7 = 1;
        }
        String string3 = "Invalid padding: %s";
        Preconditions.checkArgument(n7 != 0, string3, n4);
        n7 = sArray.length;
        if (n7 < n3) {
            sArray = Arrays.copyOf(sArray, n3 += n4);
        }
        return sArray;
    }

    public static short fromByteArray(byte[] byArray) {
        byte by2 = byArray.length;
        int n3 = 1;
        byte by4 = 2;
        by2 = by2 >= by4 ? (byte)1 : 0;
        int n4 = byArray.length;
        Preconditions.checkArgument(by2 != 0, "array too small: %s < %s", n4, (int)by4);
        by2 = byArray[0];
        byte by5 = byArray[n3];
        return Shorts.fromBytes(by2, by5);
    }

    public static short fromBytes(byte by2, byte by4) {
        by2 = (byte)(by2 << 8);
        by4 = (byte)(by4 & 0xFF);
        return (short)(by2 | by4);
    }

    public static int hashCode(short s7) {
        return s7;
    }

    public static int indexOf(short[] sArray, short s7) {
        int n3 = sArray.length;
        return Shorts.indexOf(sArray, s7, 0, n3);
    }

    private static int indexOf(short[] sArray, short s7, int n3, int n4) {
        while (n3 < n4) {
            short s8 = sArray[n3];
            if (s8 == s7) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int indexOf(short[] sArray, short[] sArray2) {
        block3: {
            Preconditions.checkNotNull(sArray, "array");
            String string2 = "target";
            Preconditions.checkNotNull(sArray2, string2);
            int n3 = sArray2.length;
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
            string2 = null;
            block0: while (true) {
                int n4 = sArray.length;
                int n7 = sArray2.length;
                if (n3 >= (n4 = n4 - n7 + 1)) break block3;
                for (n4 = 0; n4 < (n7 = sArray2.length); ++n4) {
                    n7 = n3 + n4;
                    short s7 = sArray2[n4];
                    if ((n7 = sArray[n7]) == s7) continue;
                    ++n3;
                    continue block0;
                }
                break;
            }
            return n3;
        }
        return -1;
    }

    public static String join(String string2, short ... sArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        int n4 = sArray.length;
        if (n4 == 0) {
            return "";
        }
        int n7 = sArray.length * 6;
        StringBuilder stringBuilder = new StringBuilder(n7);
        n7 = sArray[0];
        stringBuilder.append(n7);
        for (n7 = 1; n7 < (n3 = sArray.length); ++n7) {
            stringBuilder.append(string2);
            n3 = sArray[n7];
            stringBuilder.append(n3);
        }
        return stringBuilder.toString();
    }

    public static int lastIndexOf(short[] sArray, short s7) {
        int n3 = sArray.length;
        return Shorts.lastIndexOf(sArray, s7, 0, n3);
    }

    private static int lastIndexOf(short[] sArray, short s7, int n3, int n4) {
        n4 += -1;
        while (n4 >= n3) {
            short s8 = sArray[n4];
            if (s8 == s7) {
                return n4;
            }
            n4 += -1;
        }
        return -1;
    }

    public static Comparator lexicographicalComparator() {
        return Shorts$LexicographicalComparator.INSTANCE;
    }

    public static short max(short ... sArray) {
        int n3 = sArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = sArray[0];
        for (int i3 = 1; i3 < (n4 = sArray.length); ++i3) {
            n4 = sArray[i3];
            if (n4 <= n3) continue;
            n3 = n4;
        }
        return (short)n3;
    }

    public static short min(short ... sArray) {
        int n3 = sArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = sArray[0];
        for (int i3 = 1; i3 < (n4 = sArray.length); ++i3) {
            n4 = sArray[i3];
            if (n4 >= n3) continue;
            n3 = n4;
        }
        return (short)n3;
    }

    public static void reverse(short[] sArray) {
        Preconditions.checkNotNull(sArray);
        int n3 = sArray.length;
        Shorts.reverse(sArray, 0, n3);
    }

    public static void reverse(short[] sArray, int n3, int n4) {
        Preconditions.checkNotNull(sArray);
        int n7 = sArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n4 += -1;
        while (n3 < n4) {
            short s7;
            n7 = sArray[n3];
            sArray[n3] = s7 = sArray[n4];
            sArray[n4] = n7;
            ++n3;
            n4 += -1;
        }
    }

    public static void rotate(short[] sArray, int n3) {
        int n4 = sArray.length;
        Shorts.rotate(sArray, n3, 0, n4);
    }

    public static void rotate(short[] sArray, int n3, int n4, int n7) {
        Preconditions.checkNotNull(sArray);
        int n8 = sArray.length;
        Preconditions.checkPositionIndexes(n4, n7, n8);
        n8 = sArray.length;
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
        Shorts.reverse(sArray, n4, n3);
        Shorts.reverse(sArray, n3, n7);
        Shorts.reverse(sArray, n4, n7);
    }

    public static short saturatedCast(long l2) {
        long l3 = 32767L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return Short.MAX_VALUE;
        }
        l3 = -32768L;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return Short.MIN_VALUE;
        }
        return (short)l2;
    }

    public static void sortDescending(short[] sArray) {
        Preconditions.checkNotNull(sArray);
        int n3 = sArray.length;
        Shorts.sortDescending(sArray, 0, n3);
    }

    public static void sortDescending(short[] sArray, int n3, int n4) {
        Preconditions.checkNotNull(sArray);
        int n7 = sArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        Arrays.sort(sArray, n3, n4);
        Shorts.reverse(sArray, n3, n4);
    }

    public static Converter stringConverter() {
        return Shorts$ShortConverter.INSTANCE;
    }

    public static short[] toArray(Collection objectArray) {
        int n3 = objectArray instanceof Shorts$ShortArrayAsList;
        if (n3 != 0) {
            return ((Shorts$ShortArrayAsList)objectArray).toShortArray();
        }
        objectArray = objectArray.toArray();
        n3 = objectArray.length;
        short[] sArray = new short[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            short s7;
            Number number = (Number)Preconditions.checkNotNull(objectArray[i3]);
            sArray[i3] = s7 = number.shortValue();
        }
        return sArray;
    }

    public static byte[] toByteArray(short s7) {
        byte by2 = (byte)(s7 >> 8);
        s7 = (byte)s7;
        byte[] byArray = new byte[]{by2, s7};
        return byArray;
    }
}

