/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans$BooleanArrayAsList;
import com.google.common.primitives.Booleans$BooleanComparator;
import com.google.common.primitives.Booleans$LexicographicalComparator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Booleans {
    private Booleans() {
    }

    public static /* synthetic */ int access$000(boolean[] blArray, boolean bl2, int n3, int n4) {
        return Booleans.indexOf(blArray, bl2, n3, n4);
    }

    public static /* synthetic */ int access$100(boolean[] blArray, boolean bl2, int n3, int n4) {
        return Booleans.lastIndexOf(blArray, bl2, n3, n4);
    }

    public static List asList(boolean ... blArray) {
        int n3 = blArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        Booleans$BooleanArrayAsList booleans$BooleanArrayAsList = new Booleans$BooleanArrayAsList(blArray);
        return booleans$BooleanArrayAsList;
    }

    public static int compare(boolean n3, boolean n4) {
        n3 = n3 == n4 ? 0 : (n3 != 0 ? 1 : -1);
        return n3;
    }

    public static boolean[] concat(boolean[] ... blArray) {
        int n3;
        boolean[] blArray2;
        int n4;
        int n7 = blArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            blArray2 = blArray[n4];
            n3 = blArray2.length;
            n8 += n3;
        }
        boolean[] blArray3 = new boolean[n8];
        n4 = blArray.length;
        n3 = 0;
        blArray2 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            boolean[] blArray4 = blArray[n8];
            int n10 = blArray4.length;
            System.arraycopy(blArray4, 0, blArray3, n3, n10);
            int n14 = blArray4.length;
            n3 += n14;
        }
        return blArray3;
    }

    public static boolean contains(boolean[] blArray, boolean bl2) {
        for (boolean bl3 : blArray) {
            if (bl3 != bl2) continue;
            return true;
        }
        return false;
    }

    public static int countTrue(boolean ... blArray) {
        int n3 = blArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2 = blArray[i3];
            if (!bl2) continue;
            ++n4;
        }
        return n4;
    }

    public static boolean[] ensureCapacity(boolean[] blArray, int n3, int n4) {
        int n7 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Invalid minLength: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        if (n4 >= 0) {
            n7 = 1;
        }
        String string3 = "Invalid padding: %s";
        Preconditions.checkArgument(n7 != 0, string3, n4);
        n7 = blArray.length;
        if (n7 < n3) {
            blArray = Arrays.copyOf(blArray, n3 += n4);
        }
        return blArray;
    }

    public static Comparator falseFirst() {
        return Booleans$BooleanComparator.FALSE_FIRST;
    }

    /*
     * WARNING - void declaration
     */
    public static int hashCode(boolean bl2) {
        void var0_3;
        if (bl2) {
            int n3 = 1231;
        } else {
            int n4 = 1237;
        }
        return (int)var0_3;
    }

    public static int indexOf(boolean[] blArray, boolean bl2) {
        int n3 = blArray.length;
        return Booleans.indexOf(blArray, bl2, 0, n3);
    }

    private static int indexOf(boolean[] blArray, boolean bl2, int n3, int n4) {
        while (n3 < n4) {
            boolean bl3 = blArray[n3];
            if (bl3 == bl2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int indexOf(boolean[] blArray, boolean[] blArray2) {
        block3: {
            Preconditions.checkNotNull(blArray, "array");
            String string2 = "target";
            Preconditions.checkNotNull(blArray2, string2);
            int n3 = blArray2.length;
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
            string2 = null;
            block0: while (true) {
                int n4 = blArray.length;
                int n7 = blArray2.length;
                if (n3 >= (n4 = n4 - n7 + 1)) break block3;
                for (n4 = 0; n4 < (n7 = blArray2.length); ++n4) {
                    n7 = n3 + n4;
                    int n8 = blArray2[n4];
                    if ((n7 = blArray[n7]) == n8) continue;
                    ++n3;
                    continue block0;
                }
                break;
            }
            return n3;
        }
        return -1;
    }

    public static String join(String string2, boolean ... blArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        int n4 = blArray.length;
        if (n4 == 0) {
            return "";
        }
        int n7 = blArray.length * 7;
        StringBuilder stringBuilder = new StringBuilder(n7);
        n7 = blArray[0];
        stringBuilder.append(n7 != 0);
        for (n7 = 1; n7 < (n3 = blArray.length); ++n7) {
            stringBuilder.append(string2);
            n3 = blArray[n7];
            stringBuilder.append(n3 != 0);
        }
        return stringBuilder.toString();
    }

    public static int lastIndexOf(boolean[] blArray, boolean bl2) {
        int n3 = blArray.length;
        return Booleans.lastIndexOf(blArray, bl2, 0, n3);
    }

    private static int lastIndexOf(boolean[] blArray, boolean bl2, int n3, int n4) {
        n4 += -1;
        while (n4 >= n3) {
            boolean bl3 = blArray[n4];
            if (bl3 == bl2) {
                return n4;
            }
            n4 += -1;
        }
        return -1;
    }

    public static Comparator lexicographicalComparator() {
        return Booleans$LexicographicalComparator.INSTANCE;
    }

    public static void reverse(boolean[] blArray) {
        Preconditions.checkNotNull(blArray);
        int n3 = blArray.length;
        Booleans.reverse(blArray, 0, n3);
    }

    public static void reverse(boolean[] blArray, int n3, int n4) {
        Preconditions.checkNotNull(blArray);
        int n7 = blArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n4 += -1;
        while (n3 < n4) {
            boolean bl2;
            n7 = blArray[n3];
            blArray[n3] = bl2 = blArray[n4];
            blArray[n4] = n7;
            ++n3;
            n4 += -1;
        }
    }

    public static void rotate(boolean[] blArray, int n3) {
        int n4 = blArray.length;
        Booleans.rotate(blArray, n3, 0, n4);
    }

    public static void rotate(boolean[] blArray, int n3, int n4, int n7) {
        Preconditions.checkNotNull(blArray);
        int n8 = blArray.length;
        Preconditions.checkPositionIndexes(n4, n7, n8);
        n8 = blArray.length;
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
        Booleans.reverse(blArray, n4, n3);
        Booleans.reverse(blArray, n3, n7);
        Booleans.reverse(blArray, n4, n7);
    }

    public static boolean[] toArray(Collection objectArray) {
        int n3 = objectArray instanceof Booleans$BooleanArrayAsList;
        if (n3 != 0) {
            return ((Booleans$BooleanArrayAsList)objectArray).toBooleanArray();
        }
        objectArray = objectArray.toArray();
        n3 = objectArray.length;
        boolean[] blArray = new boolean[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Boolean bl3 = (Boolean)Preconditions.checkNotNull(objectArray[i3]);
            blArray[i3] = bl2 = bl3.booleanValue();
        }
        return blArray;
    }

    public static Comparator trueFirst() {
        return Booleans$BooleanComparator.TRUE_FIRST;
    }
}

