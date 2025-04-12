/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

final class ArrayIterator
implements Iterator,
KMappedMarker {
    private final Object[] array;
    private int index;

    public ArrayIterator(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        this.array = objectArray;
    }

    public final Object[] getArray() {
        return this.array;
    }

    public boolean hasNext() {
        int n3 = this.index;
        Object[] objectArray = this.array;
        int n4 = objectArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public Object next() {
        int n3;
        Object[] objectArray;
        try {
            objectArray = this.array;
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
        return objectArray[n3];
    }

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

