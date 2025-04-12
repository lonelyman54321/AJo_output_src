/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Bytes$ByteArrayAsList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Bytes {
    private Bytes() {
    }

    public static /* synthetic */ int access$000(byte[] byArray, byte by2, int n3, int n4) {
        return Bytes.indexOf(byArray, by2, n3, n4);
    }

    public static /* synthetic */ int access$100(byte[] byArray, byte by2, int n3, int n4) {
        return Bytes.lastIndexOf(byArray, by2, n3, n4);
    }

    public static List asList(byte ... byArray) {
        int n3 = byArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        Bytes$ByteArrayAsList bytes$ByteArrayAsList = new Bytes$ByteArrayAsList(byArray);
        return bytes$ByteArrayAsList;
    }

    public static byte[] concat(byte[] ... byArray) {
        int n3;
        byte[] byArray2;
        int n4;
        int n7 = byArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            byArray2 = byArray[n4];
            n3 = byArray2.length;
            n8 += n3;
        }
        byte[] byArray3 = new byte[n8];
        n4 = byArray.length;
        n3 = 0;
        byArray2 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            byte[] byArray4 = byArray[n8];
            int n10 = byArray4.length;
            System.arraycopy(byArray4, 0, byArray3, n3, n10);
            int n14 = byArray4.length;
            n3 += n14;
        }
        return byArray3;
    }

    public static boolean contains(byte[] byArray, byte by2) {
        for (byte by4 : byArray) {
            if (by4 != by2) continue;
            return true;
        }
        return false;
    }

    public static byte[] ensureCapacity(byte[] byArray, int n3, int n4) {
        int n7 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Invalid minLength: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        if (n4 >= 0) {
            n7 = 1;
        }
        String string3 = "Invalid padding: %s";
        Preconditions.checkArgument(n7 != 0, string3, n4);
        n7 = byArray.length;
        if (n7 < n3) {
            byArray = Arrays.copyOf(byArray, n3 += n4);
        }
        return byArray;
    }

    public static int hashCode(byte by2) {
        return by2;
    }

    public static int indexOf(byte[] byArray, byte by2) {
        int n3 = byArray.length;
        return Bytes.indexOf(byArray, by2, 0, n3);
    }

    private static int indexOf(byte[] byArray, byte by2, int n3, int n4) {
        while (n3 < n4) {
            byte by4 = byArray[n3];
            if (by4 == by2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int indexOf(byte[] byArray, byte[] byArray2) {
        block3: {
            Preconditions.checkNotNull(byArray, "array");
            String string2 = "target";
            Preconditions.checkNotNull(byArray2, string2);
            int n3 = byArray2.length;
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
            string2 = null;
            block0: while (true) {
                int n4 = byArray.length;
                int n7 = byArray2.length;
                if (n3 >= (n4 = n4 - n7 + 1)) break block3;
                for (n4 = 0; n4 < (n7 = byArray2.length); ++n4) {
                    n7 = n3 + n4;
                    byte by2 = byArray2[n4];
                    if ((n7 = byArray[n7]) == by2) continue;
                    ++n3;
                    continue block0;
                }
                break;
            }
            return n3;
        }
        return -1;
    }

    public static int lastIndexOf(byte[] byArray, byte by2) {
        int n3 = byArray.length;
        return Bytes.lastIndexOf(byArray, by2, 0, n3);
    }

    private static int lastIndexOf(byte[] byArray, byte by2, int n3, int n4) {
        n4 += -1;
        while (n4 >= n3) {
            byte by4 = byArray[n4];
            if (by4 == by2) {
                return n4;
            }
            n4 += -1;
        }
        return -1;
    }

    public static void reverse(byte[] byArray) {
        Preconditions.checkNotNull(byArray);
        int n3 = byArray.length;
        Bytes.reverse(byArray, 0, n3);
    }

    public static void reverse(byte[] byArray, int n3, int n4) {
        Preconditions.checkNotNull(byArray);
        int n7 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n4 += -1;
        while (n3 < n4) {
            byte by2;
            n7 = byArray[n3];
            byArray[n3] = by2 = byArray[n4];
            byArray[n4] = n7;
            ++n3;
            n4 += -1;
        }
    }

    public static void rotate(byte[] byArray, int n3) {
        int n4 = byArray.length;
        Bytes.rotate(byArray, n3, 0, n4);
    }

    public static void rotate(byte[] byArray, int n3, int n4, int n7) {
        Preconditions.checkNotNull(byArray);
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n4, n7, n8);
        n8 = byArray.length;
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
        Bytes.reverse(byArray, n4, n3);
        Bytes.reverse(byArray, n3, n7);
        Bytes.reverse(byArray, n4, n7);
    }

    public static byte[] toArray(Collection objectArray) {
        int n3 = objectArray instanceof Bytes$ByteArrayAsList;
        if (n3 != 0) {
            return ((Bytes$ByteArrayAsList)objectArray).toByteArray();
        }
        objectArray = objectArray.toArray();
        n3 = objectArray.length;
        byte[] byArray = new byte[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by2;
            Number number = (Number)Preconditions.checkNotNull(objectArray[i3]);
            byArray[i3] = by2 = number.byteValue();
        }
        return byArray;
    }
}

