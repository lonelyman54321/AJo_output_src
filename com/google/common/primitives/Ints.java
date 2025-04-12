/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints$IntArrayAsList;
import com.google.common.primitives.Ints$IntConverter;
import com.google.common.primitives.Ints$LexicographicalComparator;
import com.google.common.primitives.IntsMethodsForWeb;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Ints
extends IntsMethodsForWeb {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 0x40000000;

    private Ints() {
    }

    public static /* synthetic */ int access$000(int[] nArray, int n3, int n4, int n7) {
        return Ints.indexOf(nArray, n3, n4, n7);
    }

    public static /* synthetic */ int access$100(int[] nArray, int n3, int n4, int n7) {
        return Ints.lastIndexOf(nArray, n3, n4, n7);
    }

    public static List asList(int ... nArray) {
        int n3 = nArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        Ints$IntArrayAsList ints$IntArrayAsList = new Ints$IntArrayAsList(nArray);
        return ints$IntArrayAsList;
    }

    public static int checkedCast(long l2) {
        int n3 = (int)l2;
        long l3 = n3;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        Preconditions.checkArgument(bl2, "Out of range: %s", l2);
        return n3;
    }

    public static int compare(int n3, int n4) {
        n3 = n3 < n4 ? -1 : (n3 > n4 ? 1 : 0);
        return n3;
    }

    public static int[] concat(int[] ... nArray) {
        int n3;
        int[] nArray2;
        int n4;
        int n7 = nArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            nArray2 = nArray[n4];
            n3 = nArray2.length;
            n8 += n3;
        }
        int[] nArray3 = new int[n8];
        n4 = nArray.length;
        n3 = 0;
        nArray2 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            int[] nArray4 = nArray[n8];
            int n10 = nArray4.length;
            System.arraycopy(nArray4, 0, nArray3, n3, n10);
            int n14 = nArray4.length;
            n3 += n14;
        }
        return nArray3;
    }

    public static int constrainToRange(int n3, int n4, int n7) {
        boolean bl2 = n4 <= n7;
        Preconditions.checkArgument(bl2, "min (%s) must be less than or equal to max (%s)", n4, n7);
        return Math.min(Math.max(n3, n4), n7);
    }

    public static boolean contains(int[] nArray, int n3) {
        for (int n4 : nArray) {
            if (n4 != n3) continue;
            return true;
        }
        return false;
    }

    public static int[] ensureCapacity(int[] nArray, int n3, int n4) {
        int n7 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Invalid minLength: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        if (n4 >= 0) {
            n7 = 1;
        }
        String string3 = "Invalid padding: %s";
        Preconditions.checkArgument(n7 != 0, string3, n4);
        n7 = nArray.length;
        if (n7 < n3) {
            nArray = Arrays.copyOf(nArray, n3 += n4);
        }
        return nArray;
    }

    public static int fromByteArray(byte[] byArray) {
        byte by2 = byArray.length;
        byte by4 = 0;
        byte by5 = 1;
        byte by6 = 4;
        by2 = by2 >= by6 ? (byte)1 : 0;
        int n3 = byArray.length;
        Preconditions.checkArgument(by2 != 0, "array too small: %s < %s", n3, (int)by6);
        by2 = byArray[0];
        by4 = byArray[by5];
        by5 = byArray[2];
        byte by7 = byArray[3];
        return Ints.fromBytes(by2, by4, by5, by7);
    }

    public static int fromBytes(byte by2, byte by4, byte by5, byte by6) {
        by2 = (byte)(by2 << 24);
        by4 = (byte)((by4 & 0xFF) << 16);
        by2 = (byte)(by2 | by4);
        by4 = (byte)((by5 & 0xFF) << 8);
        by2 = (byte)(by2 | by4);
        by4 = (byte)(by6 & 0xFF);
        return by2 | by4;
    }

    public static int hashCode(int n3) {
        return n3;
    }

    public static int indexOf(int[] nArray, int n3) {
        int n4 = nArray.length;
        return Ints.indexOf(nArray, n3, 0, n4);
    }

    private static int indexOf(int[] nArray, int n3, int n4, int n7) {
        while (n4 < n7) {
            int n8 = nArray[n4];
            if (n8 == n3) {
                return n4;
            }
            ++n4;
        }
        return -1;
    }

    public static int indexOf(int[] nArray, int[] nArray2) {
        block3: {
            Preconditions.checkNotNull(nArray, "array");
            String string2 = "target";
            Preconditions.checkNotNull(nArray2, string2);
            int n3 = nArray2.length;
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
            string2 = null;
            block0: while (true) {
                int n4 = nArray.length;
                int n7 = nArray2.length;
                if (n3 >= (n4 = n4 - n7 + 1)) break block3;
                for (n4 = 0; n4 < (n7 = nArray2.length); ++n4) {
                    n7 = n3 + n4;
                    int n8 = nArray2[n4];
                    if ((n7 = nArray[n7]) == n8) continue;
                    ++n3;
                    continue block0;
                }
                break;
            }
            return n3;
        }
        return -1;
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
        n7 = nArray[0];
        stringBuilder.append(n7);
        for (n7 = 1; n7 < (n3 = nArray.length); ++n7) {
            stringBuilder.append(string2);
            n3 = nArray[n7];
            stringBuilder.append(n3);
        }
        return stringBuilder.toString();
    }

    public static int lastIndexOf(int[] nArray, int n3) {
        int n4 = nArray.length;
        return Ints.lastIndexOf(nArray, n3, 0, n4);
    }

    private static int lastIndexOf(int[] nArray, int n3, int n4, int n7) {
        n7 += -1;
        while (n7 >= n4) {
            int n8 = nArray[n7];
            if (n8 == n3) {
                return n7;
            }
            n7 += -1;
        }
        return -1;
    }

    public static Comparator lexicographicalComparator() {
        return Ints$LexicographicalComparator.INSTANCE;
    }

    public static int max(int ... nArray) {
        int n3 = nArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = nArray[0];
        for (int i3 = 1; i3 < (n4 = nArray.length); ++i3) {
            n4 = nArray[i3];
            if (n4 <= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    public static int min(int ... nArray) {
        int n3 = nArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = nArray[0];
        for (int i3 = 1; i3 < (n4 = nArray.length); ++i3) {
            n4 = nArray[i3];
            if (n4 >= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    public static void reverse(int[] nArray) {
        Preconditions.checkNotNull(nArray);
        int n3 = nArray.length;
        Ints.reverse(nArray, 0, n3);
    }

    public static void reverse(int[] nArray, int n3, int n4) {
        Preconditions.checkNotNull(nArray);
        int n7 = nArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n4 += -1;
        while (n3 < n4) {
            int n8;
            n7 = nArray[n3];
            nArray[n3] = n8 = nArray[n4];
            nArray[n4] = n7;
            ++n3;
            n4 += -1;
        }
    }

    public static void rotate(int[] nArray, int n3) {
        int n4 = nArray.length;
        Ints.rotate(nArray, n3, 0, n4);
    }

    public static void rotate(int[] nArray, int n3, int n4, int n7) {
        Preconditions.checkNotNull(nArray);
        int n8 = nArray.length;
        Preconditions.checkPositionIndexes(n4, n7, n8);
        n8 = nArray.length;
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
        Ints.reverse(nArray, n4, n3);
        Ints.reverse(nArray, n3, n7);
        Ints.reverse(nArray, n4, n7);
    }

    public static int saturatedCast(long l2) {
        long l3 = Integer.MAX_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return -1 >>> 1;
        }
        l3 = 0x80000000L;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return -1 << -1;
        }
        return (int)l2;
    }

    public static void sortDescending(int[] nArray) {
        Preconditions.checkNotNull(nArray);
        int n3 = nArray.length;
        Ints.sortDescending(nArray, 0, n3);
    }

    public static void sortDescending(int[] nArray, int n3, int n4) {
        Preconditions.checkNotNull(nArray);
        int n7 = nArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        Arrays.sort(nArray, n3, n4);
        Ints.reverse(nArray, n3, n4);
    }

    public static Converter stringConverter() {
        return Ints$IntConverter.INSTANCE;
    }

    public static int[] toArray(Collection objectArray) {
        int n3 = objectArray instanceof Ints$IntArrayAsList;
        if (n3 != 0) {
            return ((Ints$IntArrayAsList)objectArray).toIntArray();
        }
        objectArray = objectArray.toArray();
        n3 = objectArray.length;
        int[] nArray = new int[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Number number = (Number)Preconditions.checkNotNull(objectArray[i3]);
            nArray[i3] = n4 = number.intValue();
        }
        return nArray;
    }

    public static byte[] toByteArray(int n3) {
        byte by2 = (byte)(n3 >> 24);
        byte by4 = (byte)(n3 >> 16);
        byte by5 = (byte)(n3 >> 8);
        n3 = (byte)n3;
        byte[] byArray = new byte[]{by2, by4, by5, n3};
        return byArray;
    }

    public static Integer tryParse(String string2) {
        return Ints.tryParse(string2, 10);
    }

    public static Integer tryParse(String object, int n3) {
        long l2;
        long l3;
        long l4;
        if ((object = Longs.tryParse((String)object, n3)) != null && (n3 = (int)((l4 = (l3 = ((Long)object).longValue()) - (l2 = (long)((Long)object).intValue())) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0) {
            return ((Long)object).intValue();
        }
        return null;
    }
}

