/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$SerializedForm;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Platform;
import com.google.common.collect.UnmodifiableIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

public abstract class ImmutableCollection
extends AbstractCollection
implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    public final boolean add(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean addAll(Collection object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public ImmutableList asList() {
        boolean bl2 = this.isEmpty();
        ImmutableList immutableList = bl2 ? ImmutableList.of() : ImmutableList.asImmutableList(this.toArray());
        return immutableList;
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public abstract boolean contains(Object var1);

    public int copyIntoArray(Object[] objectArray, int n3) {
        boolean bl2;
        UnmodifiableIterator unmodifiableIterator = this.iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            Object e2 = unmodifiableIterator.next();
            int n4 = n3 + 1;
            objectArray[n3] = e2;
            n3 = n4;
        }
        return n3;
    }

    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int internalArrayStart() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public abstract boolean isPartialView();

    public abstract UnmodifiableIterator iterator();

    public final boolean remove(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean removeAll(Collection object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean retainAll(Collection object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final Object[] toArray() {
        Object[] objectArray = EMPTY_ARRAY;
        return this.toArray(objectArray);
    }

    public final Object[] toArray(Object[] objectArray) {
        Preconditions.checkNotNull(objectArray);
        int n3 = this.size();
        int n4 = objectArray.length;
        if (n4 < n3) {
            Object[] objectArray2 = this.internalArray();
            if (objectArray2 != null) {
                n3 = this.internalArrayStart();
                int n7 = this.internalArrayEnd();
                return Platform.copy(objectArray2, n3, n7, objectArray);
            }
            objectArray = ObjectArrays.newArray(objectArray, n3);
        } else {
            n4 = objectArray.length;
            if (n4 > n3) {
                n4 = 0;
                Object var4_5 = null;
                objectArray[n3] = null;
            }
        }
        this.copyIntoArray(objectArray, 0);
        return objectArray;
    }

    public Object writeReplace() {
        Object[] objectArray = this.toArray();
        ImmutableList$SerializedForm immutableList$SerializedForm = new ImmutableList$SerializedForm(objectArray);
        return immutableList$SerializedForm;
    }
}

