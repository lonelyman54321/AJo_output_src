/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableEnumSet$1;
import com.google.common.collect.ImmutableEnumSet$EnumSerializedForm;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

final class ImmutableEnumSet
extends ImmutableSet {
    private final transient EnumSet delegate;
    private transient int hashCode;

    private ImmutableEnumSet(EnumSet enumSet) {
        this.delegate = enumSet;
    }

    public /* synthetic */ ImmutableEnumSet(EnumSet enumSet, ImmutableEnumSet$1 immutableEnumSet$1) {
        this(enumSet);
    }

    public static ImmutableSet asImmutable(EnumSet enumSet) {
        int n3 = enumSet.size();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                ImmutableEnumSet immutableEnumSet = new ImmutableEnumSet(enumSet);
                return immutableEnumSet;
            }
            return ImmutableSet.of((Enum)Iterables.getOnlyElement(enumSet));
        }
        return ImmutableSet.of();
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    public boolean contains(Object object) {
        return this.delegate.contains(object);
    }

    public boolean containsAll(Collection collection) {
        boolean bl2 = collection instanceof ImmutableEnumSet;
        if (bl2) {
            collection = ((ImmutableEnumSet)collection).delegate;
        }
        return this.delegate.containsAll(collection);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof ImmutableEnumSet;
        if (bl2) {
            object = ((ImmutableEnumSet)object).delegate;
        }
        return ((Object)this.delegate).equals(object);
    }

    public int hashCode() {
        int n3 = this.hashCode;
        if (n3 == 0) {
            EnumSet enumSet = this.delegate;
            this.hashCode = n3 = ((Object)enumSet).hashCode();
        }
        return n3;
    }

    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public UnmodifiableIterator iterator() {
        return Iterators.unmodifiableIterator(this.delegate.iterator());
    }

    public int size() {
        return this.delegate.size();
    }

    public String toString() {
        return ((Object)this.delegate).toString();
    }

    public Object writeReplace() {
        EnumSet enumSet = this.delegate;
        ImmutableEnumSet$EnumSerializedForm immutableEnumSet$EnumSerializedForm = new ImmutableEnumSet$EnumSerializedForm(enumSet);
        return immutableEnumSet$EnumSerializedForm;
    }
}

