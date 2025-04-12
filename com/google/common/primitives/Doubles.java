/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.primitives.Doubles$DoubleArrayAsList;
import com.google.common.primitives.Doubles$DoubleConverter;
import com.google.common.primitives.Doubles$LexicographicalComparator;
import com.google.common.primitives.DoublesMethodsForWeb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Doubles
extends DoublesMethodsForWeb {
    public static final int BYTES = 8;
    static final Pattern FLOATING_POINT_PATTERN = Doubles.fpPattern();

    private Doubles() {
    }

    public static /* synthetic */ int access$000(double[] dArray, double d2, int n3, int n4) {
        return Doubles.indexOf(dArray, d2, n3, n4);
    }

    public static /* synthetic */ int access$100(double[] dArray, double d2, int n3, int n4) {
        return Doubles.lastIndexOf(dArray, d2, n3, n4);
    }

    public static List asList(double ... dArray) {
        int n3 = dArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        Doubles$DoubleArrayAsList doubles$DoubleArrayAsList = new Doubles$DoubleArrayAsList(dArray);
        return doubles$DoubleArrayAsList;
    }

    public static int compare(double d2, double d5) {
        return Double.compare(d2, d5);
    }

    public static double[] concat(double[] ... dArray) {
        int n3;
        double[] dArray2;
        int n4;
        int n7 = dArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            dArray2 = dArray[n4];
            n3 = dArray2.length;
            n8 += n3;
        }
        double[] dArray3 = new double[n8];
        n4 = dArray.length;
        n3 = 0;
        dArray2 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            double[] dArray4 = dArray[n8];
            int n10 = dArray4.length;
            System.arraycopy(dArray4, 0, dArray3, n3, n10);
            int n14 = dArray4.length;
            n3 += n14;
        }
        return dArray3;
    }

    public static double constrainToRange(double d2, double d5, double d7) {
        Object object = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1);
        if (object <= 0) {
            return Math.min(Math.max(d2, d5), d7);
        }
        Object object2 = d5;
        Double d9 = d7;
        Object[] objectArray = new Object[]{object2, d9};
        object2 = Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
        throw illegalArgumentException;
    }

    public static boolean contains(double[] dArray, double d2) {
        for (double d5 : dArray) {
            double d7 = d5 - d2;
            Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object != false) continue;
            return true;
        }
        return false;
    }

    public static double[] ensureCapacity(double[] dArray, int n3, int n4) {
        int n7 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Invalid minLength: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        if (n4 >= 0) {
            n7 = 1;
        }
        String string3 = "Invalid padding: %s";
        Preconditions.checkArgument(n7 != 0, string3, n4);
        n7 = dArray.length;
        if (n7 < n3) {
            dArray = Arrays.copyOf(dArray, n3 += n4);
        }
        return dArray;
    }

    private static Pattern fpPattern() {
        return Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }

    public static int hashCode(double d2) {
        return Double.valueOf(d2).hashCode();
    }

    public static int indexOf(double[] dArray, double d2) {
        int n3 = dArray.length;
        return Doubles.indexOf(dArray, d2, 0, n3);
    }

    private static int indexOf(double[] dArray, double d2, int n3, int n4) {
        while (n3 < n4) {
            double d5 = dArray[n3];
            double d7 = d5 - d2;
            Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object == false) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int indexOf(double[] dArray, double[] dArray2) {
        block3: {
            Preconditions.checkNotNull(dArray, "array");
            String string2 = "target";
            Preconditions.checkNotNull(dArray2, string2);
            int n3 = dArray2.length;
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
            string2 = null;
            block0: while (true) {
                int n4 = dArray.length;
                int n7 = dArray2.length;
                if (n3 >= (n4 = n4 - n7 + 1)) break block3;
                for (n4 = 0; n4 < (n7 = dArray2.length); ++n4) {
                    n7 = n3 + n4;
                    double d2 = dArray[n7];
                    double d5 = dArray2[n4];
                    double d7 = d2 - d5;
                    Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
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

    public static boolean isFinite(double d2) {
        double d5;
        double d7 = -1.0 / 0.0;
        double d9 = d7 - d2;
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        boolean bl2 = object < 0 && (object = (d5 = d2 - (d7 = 1.0 / 0.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) < 0;
        return bl2;
    }

    public static String join(String string2, double ... dArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        int n4 = dArray.length;
        if (n4 == 0) {
            return "";
        }
        int n7 = dArray.length * 12;
        StringBuilder stringBuilder = new StringBuilder(n7);
        double d2 = dArray[0];
        stringBuilder.append(d2);
        for (n7 = 1; n7 < (n3 = dArray.length); ++n7) {
            stringBuilder.append(string2);
            double d5 = dArray[n7];
            stringBuilder.append(d5);
        }
        return stringBuilder.toString();
    }

    public static int lastIndexOf(double[] dArray, double d2) {
        int n3 = dArray.length;
        return Doubles.lastIndexOf(dArray, d2, 0, n3);
    }

    private static int lastIndexOf(double[] dArray, double d2, int n3, int n4) {
        n4 += -1;
        while (n4 >= n3) {
            double d5 = dArray[n4];
            double d7 = d5 - d2;
            Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object == false) {
                return n4;
            }
            n4 += -1;
        }
        return -1;
    }

    public static Comparator lexicographicalComparator() {
        return Doubles$LexicographicalComparator.INSTANCE;
    }

    public static double max(double ... dArray) {
        int n3;
        boolean bl2 = dArray.length;
        bl2 = bl2 > false;
        Preconditions.checkArgument(bl2);
        double d2 = dArray[0];
        for (int i3 = 1; i3 < (n3 = dArray.length); ++i3) {
            double d5 = dArray[i3];
            d2 = Math.max(d2, d5);
        }
        return d2;
    }

    public static double min(double ... dArray) {
        int n3;
        boolean bl2 = dArray.length;
        bl2 = bl2 > false;
        Preconditions.checkArgument(bl2);
        double d2 = dArray[0];
        for (int i3 = 1; i3 < (n3 = dArray.length); ++i3) {
            double d5 = dArray[i3];
            d2 = Math.min(d2, d5);
        }
        return d2;
    }

    public static void reverse(double[] dArray) {
        Preconditions.checkNotNull(dArray);
        int n3 = dArray.length;
        Doubles.reverse(dArray, 0, n3);
    }

    public static void reverse(double[] dArray, int n3, int n4) {
        Preconditions.checkNotNull(dArray);
        int n7 = dArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n4 += -1;
        while (n3 < n4) {
            double d2;
            double d5 = dArray[n3];
            dArray[n3] = d2 = dArray[n4];
            dArray[n4] = d5;
            ++n3;
            n4 += -1;
        }
    }

    public static void rotate(double[] dArray, int n3) {
        int n4 = dArray.length;
        Doubles.rotate(dArray, n3, 0, n4);
    }

    public static void rotate(double[] dArray, int n3, int n4, int n7) {
        Preconditions.checkNotNull(dArray);
        int n8 = dArray.length;
        Preconditions.checkPositionIndexes(n4, n7, n8);
        n8 = dArray.length;
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
        Doubles.reverse(dArray, n4, n3);
        Doubles.reverse(dArray, n3, n7);
        Doubles.reverse(dArray, n4, n7);
    }

    public static void sortDescending(double[] dArray) {
        Preconditions.checkNotNull(dArray);
        int n3 = dArray.length;
        Doubles.sortDescending(dArray, 0, n3);
    }

    public static void sortDescending(double[] dArray, int n3, int n4) {
        Preconditions.checkNotNull(dArray);
        int n7 = dArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        Arrays.sort(dArray, n3, n4);
        Doubles.reverse(dArray, n3, n4);
    }

    public static Converter stringConverter() {
        return Doubles$DoubleConverter.INSTANCE;
    }

    public static double[] toArray(Collection objectArray) {
        int n3 = objectArray instanceof Doubles$DoubleArrayAsList;
        if (n3 != 0) {
            return ((Doubles$DoubleArrayAsList)objectArray).toDoubleArray();
        }
        objectArray = objectArray.toArray();
        n3 = objectArray.length;
        double[] dArray = new double[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            double d2;
            Number number = (Number)Preconditions.checkNotNull(objectArray[i3]);
            dArray[i3] = d2 = number.doubleValue();
        }
        return dArray;
    }

    public static Double tryParse(String string2) {
        Matcher matcher = FLOATING_POINT_PATTERN.matcher(string2);
        boolean bl2 = matcher.matches();
        if (bl2) {
            double d2;
            try {
                d2 = Double.parseDouble(string2);
            }
            catch (NumberFormatException numberFormatException) {}
            return d2;
        }
        return null;
    }
}

