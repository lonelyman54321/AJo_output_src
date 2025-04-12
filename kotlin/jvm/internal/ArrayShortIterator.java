/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

final class ArrayShortIterator
extends m43_0 {
    private final short[] array;
    private int index;

    public ArrayShortIterator(short[] sArray) {
        Intrinsics.checkNotNullParameter(sArray, "array");
        this.array = sArray;
    }

    public boolean hasNext() {
        int n3 = this.index;
        short[] sArray = this.array;
        int n4 = sArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public short nextShort() {
        int n3;
        short[] sArray;
        try {
            sArray = this.array;
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
        return sArray[n3];
    }
}

