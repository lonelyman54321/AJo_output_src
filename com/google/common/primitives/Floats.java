/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats$FloatArrayAsList;
import com.google.common.primitives.Floats$FloatConverter;
import com.google.common.primitives.Floats$LexicographicalComparator;
import com.google.common.primitives.FloatsMethodsForWeb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;

public final class Floats
extends FloatsMethodsForWeb {
    public static final int BYTES = 4;

    private Floats() {
    }

    public static /* synthetic */ int access$000(float[] fArray, float f5, int n3, int n4) {
        return Floats.indexOf(fArray, f5, n3, n4);
    }

    public static /* synthetic */ int access$100(float[] fArray, float f5, int n3, int n4) {
        return Floats.lastIndexOf(fArray, f5, n3, n4);
    }

    public static List asList(float ... fArray) {
        int n3 = fArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        Floats$FloatArrayAsList floats$FloatArrayAsList = new Floats$FloatArrayAsList(fArray);
        return floats$FloatArrayAsList;
    }

    public static int compare(float f5, float f6) {
        return Float.compare(f5, f6);
    }

    public static float[] concat(float[] ... fArray) {
        int n3;
        float[] fArray2;
        int n4;
        int n7 = fArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            fArray2 = fArray[n4];
            n3 = fArray2.length;
            n8 += n3;
        }
        float[] fArray3 = new float[n8];
        n4 = fArray.length;
        n3 = 0;
        fArray2 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            float[] fArray4 = fArray[n8];
            int n10 = fArray4.length;
            System.arraycopy(fArray4, 0, fArray3, n3, n10);
            int n14 = fArray4.length;
            n3 += n14;
        }
        return fArray3;
    }

    public static float constrainToRange(float f5, float f6, float f7) {
        Object object = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1);
        if (object <= 0) {
            return Math.min(Math.max(f5, f6), f7);
        }
        Object object2 = Float.valueOf(f6);
        Float f8 = Float.valueOf(f7);
        Object[] objectArray = new Object[]{object2, f8};
        object2 = Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
        throw illegalArgumentException;
    }

    public static boolean contains(float[] fArray, float f5) {
        for (float f6 : fArray) {
            float f7 = f6 - f5;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object != false) continue;
            return true;
        }
        return false;
    }

    public static float[] ensureCapacity(float[] fArray, int n3, int n4) {
        int n7 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Invalid minLength: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        if (n4 >= 0) {
            n7 = 1;
        }
        String string3 = "Invalid padding: %s";
        Preconditions.checkArgument(n7 != 0, string3, n4);
        n7 = fArray.length;
        if (n7 < n3) {
            fArray = Arrays.copyOf(fArray, n3 += n4);
        }
        return fArray;
    }

    public static int hashCode(float f5) {
        return Float.valueOf(f5).hashCode();
    }

    public static int indexOf(float[] fArray, float f5) {
        int n3 = fArray.length;
        return Floats.indexOf(fArray, f5, 0, n3);
    }

    private static int indexOf(float[] fArray, float f5, int n3, int n4) {
        while (n3 < n4) {
            float f6 = fArray[n3];
            float f7 = f6 - f5;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object == false) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int indexOf(float[] fArray, float[] fArray2) {
        block3: {
            Preconditions.checkNotNull(fArray, "array");
            String string2 = "target";
            Preconditions.checkNotNull(fArray2, string2);
            int n3 = fArray2.length;
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
            string2 = null;
            block0: while (true) {
                int n4 = fArray.length;
                int n7 = fArray2.length;
                if (n3 >= (n4 = n4 - n7 + 1)) break block3;
                for (n4 = 0; n4 < (n7 = fArray2.length); ++n4) {
                    n7 = n3 + n4;
                    float f5 = fArray[n7];
                    float f6 = fArray2[n4];
                    float f7 = f5 - f6;
                    if ((n7 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) == 0) continue;
                    ++n3;
                    continue block0;
                }
                break;
            }
            return n3;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isFinite(float f5) {
        void var3_7;
        float f6 = -1.0f / 0.0f;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            int n3 = 2139095040;
            f6 = 1.0f / 0.0f;
            float f8 = f5 - f6;
            Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                return (boolean)var3_7;
            }
        }
        boolean bl2 = false;
        return (boolean)var3_7;
    }

    public static String join(String string2, float ... fArray) {
        int n3;
        Preconditions.checkNotNull(string2);
        int n4 = fArray.length;
        if (n4 == 0) {
            return "";
        }
        int n7 = fArray.length * 12;
        StringBuilder stringBuilder = new StringBuilder(n7);
        float f5 = fArray[0];
        stringBuilder.append(f5);
        f5 = Float.MIN_VALUE;
        for (n7 = 1; n7 < (n3 = fArray.length); ++n7) {
            stringBuilder.append(string2);
            float f6 = fArray[n7];
            stringBuilder.append(f6);
        }
        return stringBuilder.toString();
    }

    public static int lastIndexOf(float[] fArray, float f5) {
        int n3 = fArray.length;
        return Floats.lastIndexOf(fArray, f5, 0, n3);
    }

    private static int lastIndexOf(float[] fArray, float f5, int n3, int n4) {
        n4 += -1;
        while (n4 >= n3) {
            float f6 = fArray[n4];
            float f7 = f6 - f5;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object == false) {
                return n4;
            }
            n4 += -1;
        }
        return -1;
    }

    public static Comparator lexicographicalComparator() {
        return Floats$LexicographicalComparator.INSTANCE;
    }

    public static float max(float ... fArray) {
        float f5;
        boolean bl2 = fArray.length;
        int n3 = 0;
        float f6 = 0.0f;
        int n4 = 1;
        if (bl2 > false) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
        }
        Preconditions.checkArgument(bl2);
        f5 = fArray[0];
        while (n4 < (n3 = fArray.length)) {
            f6 = fArray[n4];
            f5 = Math.max(f5, f6);
            ++n4;
        }
        return f5;
    }

    public static float min(float ... fArray) {
        float f5;
        boolean bl2 = fArray.length;
        int n3 = 0;
        float f6 = 0.0f;
        int n4 = 1;
        if (bl2 > false) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
        }
        Preconditions.checkArgument(bl2);
        f5 = fArray[0];
        while (n4 < (n3 = fArray.length)) {
            f6 = fArray[n4];
            f5 = Math.min(f5, f6);
            ++n4;
        }
        return f5;
    }

    public static void reverse(float[] fArray) {
        Preconditions.checkNotNull(fArray);
        int n3 = fArray.length;
        Floats.reverse(fArray, 0, n3);
    }

    public static void reverse(float[] fArray, int n3, int n4) {
        Preconditions.checkNotNull(fArray);
        int n7 = fArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n4 += -1;
        while (n3 < n4) {
            float f5;
            float f6 = fArray[n3];
            fArray[n3] = f5 = fArray[n4];
            fArray[n4] = f6;
            ++n3;
            n4 += -1;
        }
    }

    public static void rotate(float[] fArray, int n3) {
        int n4 = fArray.length;
        Floats.rotate(fArray, n3, 0, n4);
    }

    public static void rotate(float[] fArray, int n3, int n4, int n7) {
        Preconditions.checkNotNull(fArray);
        int n8 = fArray.length;
        Preconditions.checkPositionIndexes(n4, n7, n8);
        n8 = fArray.length;
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
        Floats.reverse(fArray, n4, n3);
        Floats.reverse(fArray, n3, n7);
        Floats.reverse(fArray, n4, n7);
    }

    public static void sortDescending(float[] fArray) {
        Preconditions.checkNotNull(fArray);
        int n3 = fArray.length;
        Floats.sortDescending(fArray, 0, n3);
    }

    public static void sortDescending(float[] fArray, int n3, int n4) {
        Preconditions.checkNotNull(fArray);
        int n7 = fArray.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        Arrays.sort(fArray, n3, n4);
        Floats.reverse(fArray, n3, n4);
    }

    public static Converter stringConverter() {
        return Floats$FloatConverter.INSTANCE;
    }

    public static float[] toArray(Collection objectArray) {
        int n3 = objectArray instanceof Floats$FloatArrayAsList;
        if (n3 != 0) {
            return ((Floats$FloatArrayAsList)objectArray).toFloatArray();
        }
        objectArray = objectArray.toArray();
        n3 = objectArray.length;
        float[] fArray = new float[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5;
            Number number = (Number)Preconditions.checkNotNull(objectArray[i3]);
            fArray[i3] = f5 = number.floatValue();
        }
        return fArray;
    }

    public static Float tryParse(String string2) {
        Matcher matcher = Doubles.FLOATING_POINT_PATTERN.matcher(string2);
        boolean bl2 = matcher.matches();
        if (bl2) {
            float f5;
            try {
                f5 = Float.parseFloat(string2);
            }
            catch (NumberFormatException numberFormatException) {}
            return Float.valueOf(f5);
        }
        return null;
    }
}

