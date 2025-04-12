/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

final class ArrayCharIterator
extends gs_2 {
    private final char[] array;
    private int index;

    public ArrayCharIterator(char[] cArray) {
        Intrinsics.checkNotNullParameter(cArray, "array");
        this.array = cArray;
    }

    public boolean hasNext() {
        int n3 = this.index;
        char[] cArray = this.array;
        int n4 = cArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public char nextChar() {
        int n3;
        char[] cArray;
        try {
            cArray = this.array;
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
        return cArray[n3];
    }
}

