/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

final class ArrayByteIterator
extends sf_1 {
    private final byte[] array;
    private int index;

    public ArrayByteIterator(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "array");
        this.array = byArray;
    }

    public boolean hasNext() {
        int n3 = this.index;
        byte[] byArray = this.array;
        int n4 = byArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public byte nextByte() {
        int n3;
        byte[] byArray;
        try {
            byArray = this.array;
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
        return byArray[n3];
    }
}

