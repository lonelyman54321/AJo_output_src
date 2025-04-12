/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

final class ArrayDoubleIterator
extends ks0_1 {
    private final double[] array;
    private int index;

    public ArrayDoubleIterator(double[] dArray) {
        Intrinsics.checkNotNullParameter(dArray, "array");
        this.array = dArray;
    }

    public boolean hasNext() {
        int n3 = this.index;
        double[] dArray = this.array;
        int n4 = dArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public double nextDouble() {
        int n3;
        double[] dArray;
        try {
            dArray = this.array;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            this.index = n3 = this.index + -1;
            String string2 = arrayIndexOutOfBoundsException.getMessage();
            NoSuchElementException noSuchElementException = new NoSuchElementException(string2);
            throw noSuchElementException;
        }
        n3 = this.index;
        int n4 = n3 + 1;
        this.index = n4;
        return dArray[n3];
    }
}

