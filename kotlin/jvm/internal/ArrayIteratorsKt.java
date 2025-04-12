/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.ArrayBooleanIterator;
import kotlin.jvm.internal.ArrayByteIterator;
import kotlin.jvm.internal.ArrayCharIterator;
import kotlin.jvm.internal.ArrayDoubleIterator;
import kotlin.jvm.internal.ArrayFloatIterator;
import kotlin.jvm.internal.ArrayIntIterator;
import kotlin.jvm.internal.ArrayLongIterator;
import kotlin.jvm.internal.ArrayShortIterator;
import kotlin.jvm.internal.Intrinsics;

public final class ArrayIteratorsKt {
    public static final mi1_2 iterator(int[] nArray) {
        Intrinsics.checkNotNullParameter(nArray, "array");
        ArrayIntIterator arrayIntIterator = new ArrayIntIterator(nArray);
        return arrayIntIterator;
    }

    public static final bz_2 iterator(boolean[] blArray) {
        Intrinsics.checkNotNullParameter(blArray, "array");
        ArrayBooleanIterator arrayBooleanIterator = new ArrayBooleanIterator(blArray);
        return arrayBooleanIterator;
    }

    public static final db1_1 iterator(long[] lArray) {
        Intrinsics.checkNotNullParameter(lArray, "array");
        ArrayLongIterator arrayLongIterator = new ArrayLongIterator(lArray);
        return arrayLongIterator;
    }

    public static final ds0_2 iterator(float[] fArray) {
        Intrinsics.checkNotNullParameter(fArray, "array");
        ArrayFloatIterator arrayFloatIterator = new ArrayFloatIterator(fArray);
        return arrayFloatIterator;
    }

    public static final gs_2 iterator(char[] cArray) {
        Intrinsics.checkNotNullParameter(cArray, "array");
        ArrayCharIterator arrayCharIterator = new ArrayCharIterator(cArray);
        return arrayCharIterator;
    }

    public static final ks0_1 iterator(double[] dArray) {
        Intrinsics.checkNotNullParameter(dArray, "array");
        ArrayDoubleIterator arrayDoubleIterator = new ArrayDoubleIterator(dArray);
        return arrayDoubleIterator;
    }

    public static final m43_0 iterator(short[] sArray) {
        Intrinsics.checkNotNullParameter(sArray, "array");
        ArrayShortIterator arrayShortIterator = new ArrayShortIterator(sArray);
        return arrayShortIterator;
    }

    public static final sf_1 iterator(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "array");
        ArrayByteIterator arrayByteIterator = new ArrayByteIterator(byArray);
        return arrayByteIterator;
    }
}

