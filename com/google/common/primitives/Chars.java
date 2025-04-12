/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Chars$CharArrayAsList;
import com.google.common.primitives.Chars$LexicographicalComparator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Chars {
    public static final int BYTES = 2;

    private Chars() {
    }

    public static /* synthetic */ int access$000(char[] cArray, char c2, int n3, int n4) {
        return Chars.indexOf(cArray, c2, n3, n4);
    }

    public static /* synthetic */ int access$100(char[] cArray, char c2, int n3, int n4) {
        return Chars.lastIndexOf(cArray, c2, n3, n4);
    }

    public static List asList(char ... cArray) {
        int n3 = cArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        Chars$CharArrayAsList chars$CharArrayAsList = new Chars$CharArrayAsList(cArray);
        return chars$CharArrayAsList;
    }

    public static char checkedCast(long l2) {
        char c2 = (char)l2;
        long l3 = c2;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        Preconditions.checkArgument(bl2, "Out of range: %s", l2);
        return c2;
    }

    public static int compare(char c2, char c3) {
        return c2 - c3;
    }

    public static char[] concat(char[] ... cArray) {
        int n3;
        char[] cArray2;
        int n4;
        int n7 = cArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            cArray2 = cArray[n4];
            n3 = cArray2.length;
            n8 += n3;
        }
        char[] cArray3 = new char[n8];
        n4 = cArray.length;
        n3 = 0;
        cArray2 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            char[] cArray4 = cArray[n8];
            int n10 = cArray4.length;
            System.arraycopy(cArray4, 0, cArray3, n3, n10);
            int n14 = cArray4.length;
            n3 += n14;
        }
        return cArray3;
    }

    public static char constrainToRange(char c2, char c3, char c5) {
        boolean bl2 = c3 <= c5;
        String string2 = "min (%s) must be less than or equal to max (%s)";
        Preconditions.checkArgument(bl2, string2, c3, c5);
        if (c2 < c3) {
            c2 = c3;
        } else if (c2 >= c5) {
            c2 = c5;
        }
        return c2;
    }

    public static boolean contains(char[] cArray, char c2) {
        for (char c3 : cArray) {
            if (c3 != c2) continue;
            return true;
        }
        return false;
    }

    public static char[] ensureCapacity(char[] cArray, int n3, int n4) {
        int n7 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Invalid minLength: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        if (n4 >= 0) {
            n7 = 1;
        }
        String string3 = "Invalid padding: %s";
        Preconditions.checkArgument(n7 != 0, string3, n4);
        n7 = cArray.length;
        if (n7 < n3) {
            cArray = Arrays.copyOf(cArray, n3 += n4);
        }
        return cArray;
    }

    public static char fromByteArray(byte[] byArray) {
        byte by2 = byArray.length;
        int n3 = 1;
        byte by4 = 2;
        by2 = by2 >= by4 ? (byte)1 : 0;
        int n4 = byArray.length;
        Preconditions.checkArgument(by2 != 0, "array too small: %s < %s", n4, (int)by4);
        by2 = byArray[0];
        byte by5 = byArray[n3];
        return Chars.fromBytes(by2, by5);
    }

    public static char fromBytes(byte by2, byte by4) {
        by2 = (byte)(by2 << 8);
        by4 = (byte)(by4 & 0xFF);
        return (char)(by2 | by4);
    }

    public static int hashCode(char c2) {
        return c2;
    }

    public static int indexOf(char[] cArray, char c2) {
        int n3 = cArray.length;
        return Chars.indexOf(cArray, c2, 0, n3);
    }

    private static int indexOf(char[] cArray, char c2, int n3, int n4) {
        while (n3 < n4) {
            char c3 = cArray[n3];
            if (c3 == c2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int indexOf(char[] cArray, char[] cArray2) {
        block3: {
            Preconditions.checkNotNull(cArray, "array");
            String string2 = "target";
            Preconditions.checkNotNull(cArray2, string2);
            int n3 = cArray2.length;
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
            string2 = null;
            block0: while (true) {
                int n4 = cArray.length;
                int n7 = cArray2.length;
                if (n3 >= (n4 = n4 - n7 + 1)) break block3;
                for (n4 = 0; n4 < (n7 = cArray2.length); ++n4) {
                    n7 = n3 + n4;
                    char c2 = cArray2[n4];
                    if ((n7 = cArray[n7]) == c2) continue;
                    ++n3;
                    continue block0;
                }
                break;
            }
            return n3;
        }
        return -1;
    }

    public static String join(String string2, char ... cArray) {
        Preconditions.checkNotNull(string2);
        int n3 = cArray.length;
        if (n3 == 0) {
            return "";
        }
        int n4 = string2.length();
        int c2 = (n3 + -1) * n4 + n3;
        StringBuilder stringBuilder = new StringBuilder(c2);
        n4 = cArray[0];
        stringBuilder.append((char)n4);
        for (n4 = 1; n4 < n3; ++n4) {
            stringBuilder.append(string2);
            char c3 = cArray[n4];
            stringBuilder.append(c3);
        }
        return stringBuilder.toString();
    }

    public static int lastIndexOf(char[] cArray, char c2) {
        int n3 = cArray.length;
        return Chars.lastIndexOf(cArray, c2, 0, n3);
    }

    private static int lastIndexOf(char[] cArray, char c2, int n3, int n4) {
        n4 += -1;
        while (n4 >= n3) {
            char c3 = cArray[n4];
            if (c3 == c2) {
                return n4;
            }
            n4 += -1;
        }
        return -1;
    }

    public static Comparator lexicographicalComparator() {
        return Chars$LexicographicalComparator.INSTANCE;
    }

    public static char max(char ... cArray) {
        int n3 = cArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = cArray[0];
        for (int i3 = 1; i3 < (n4 = cArray.length); ++i3) {
            n4 = cArray[i3];
            if (n4 <= n3) continue;
            n3 = n4;
        }
        return (char)n3;
    }

    public static char min(char ... cArray) {
        int n3 = cArray.length;
        int n4 = 0;
        n3 = n3 > 0 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = cArray[0];
        for (int i3 = 1; i3 < (n4 = cArray.length); ++i3) {
            n4 = cArray[i3];
            if (n4 >= n3) continue;
            n3 = n4;
        }
        return (char)n3;
    }

    public static void reverse(char[] cArray) {
        Preconditions.checkNotNull(cArray);
        int n3 = cArray.length;
        Chars.reverse(cArray, 0, n3);
    }

    public static void reverse(char[] cArray, int n3, int n4) {
        Preconditions.checkNotNull(cArray);
        int n7 = cArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n4 += -1;
        while (n3 < n4) {
            char c2;
            n7 = cArray[n3];
            cArray[n3] = c2 = cArray[n4];
            cArray[n4] = n7;
            ++n3;
            n4 += -1;
        }
    }

    public static void rotate(char[] cArray, int n3) {
        int n4 = cArray.length;
        Chars.rotate(cArray, n3, 0, n4);
    }

    public static void rotate(char[] cArray, int n3, int n4, int n7) {
        Preconditions.checkNotNull(cArray);
        int n8 = cArray.length;
        Preconditions.checkPositionIndexes(n4, n7, n8);
        n8 = cArray.length;
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
        Chars.reverse(cArray, n4, n3);
        Chars.reverse(cArray, n3, n7);
        Chars.reverse(cArray, n4, n7);
    }

    public static char saturatedCast(long l2) {
        long l3 = (char)-1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return (char)-1;
        }
        l3 = 0L;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return '\u0000';
        }
        return (char)l2;
    }

    public static void sortDescending(char[] cArray) {
        Preconditions.checkNotNull(cArray);
        int n3 = cArray.length;
        Chars.sortDescending(cArray, 0, n3);
    }

    public static void sortDescending(char[] cArray, int n3, int n4) {
        Preconditions.checkNotNull(cArray);
        int n7 = cArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        Arrays.sort(cArray, n3, n4);
        Chars.reverse(cArray, n3, n4);
    }

    public static char[] toArray(Collection objectArray) {
        int n3 = objectArray instanceof Chars$CharArrayAsList;
        if (n3 != 0) {
            return ((Chars$CharArrayAsList)objectArray).toCharArray();
        }
        objectArray = objectArray.toArray();
        n3 = objectArray.length;
        char[] cArray = new char[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2;
            Character c3 = (Character)Preconditions.checkNotNull(objectArray[i3]);
            cArray[i3] = c2 = c3.charValue();
        }
        return cArray;
    }

    public static byte[] toByteArray(char c2) {
        byte by2 = (byte)(c2 >> 8);
        c2 = c2;
        byte[] byArray = new byte[]{by2, c2};
        return byArray;
    }
}

