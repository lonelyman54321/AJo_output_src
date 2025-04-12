/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

final class ArrayFloatIterator
extends ds0_2 {
    private final float[] array;
    private int index;

    public ArrayFloatIterator(float[] fArray) {
        Intrinsics.checkNotNullParameter(fArray, "array");
        this.array = fArray;
    }

    public boolean hasNext() {
        int n3 = this.index;
        float[] fArray = this.array;
        int n4 = fArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public float nextFloat() {
        int n3;
        float[] fArray;
        try {
            fArray = this.array;
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
        return fArray[n3];
    }
}

