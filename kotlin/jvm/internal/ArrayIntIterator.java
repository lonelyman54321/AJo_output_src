/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

final class ArrayIntIterator
extends mi1_2 {
    private final int[] array;
    private int index;

    public ArrayIntIterator(int[] nArray) {
        Intrinsics.checkNotNullParameter(nArray, "array");
        this.array = nArray;
    }

    public boolean hasNext() {
        int n3 = this.index;
        int[] nArray = this.array;
        int n4 = nArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public int nextInt() {
        int n3;
        int[] nArray;
        try {
            nArray = this.array;
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
        return nArray[n3];
    }
}

