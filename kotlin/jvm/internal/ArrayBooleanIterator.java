/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

final class ArrayBooleanIterator
extends bz_2 {
    private final boolean[] array;
    private int index;

    public ArrayBooleanIterator(boolean[] blArray) {
        Intrinsics.checkNotNullParameter(blArray, "array");
        this.array = blArray;
    }

    public boolean hasNext() {
        int n3 = this.index;
        boolean[] blArray = this.array;
        int n4 = blArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean nextBoolean() {
        int n3;
        boolean[] blArray;
        try {
            blArray = this.array;
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
        return blArray[n3];
    }
}

