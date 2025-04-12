/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableList$Itr;
import com.google.common.collect.ImmutableList$ReverseImmutableList;
import com.google.common.collect.ImmutableList$SerializedForm;
import com.google.common.collect.ImmutableList$SubList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class ImmutableList
extends ImmutableCollection
implements List,
RandomAccess {
    private static final UnmodifiableListIterator EMPTY_ITR;

    static {
        ImmutableList immutableList = RegularImmutableList.EMPTY;
        ImmutableList$Itr immutableList$Itr = new ImmutableList$Itr(immutableList, 0);
        EMPTY_ITR = immutableList$Itr;
    }

    public static ImmutableList asImmutableList(Object[] objectArray) {
        int n3 = objectArray.length;
        return ImmutableList.asImmutableList(objectArray, n3);
    }

    public static ImmutableList asImmutableList(Object[] objectArray, int n3) {
        if (n3 == 0) {
            return ImmutableList.of();
        }
        RegularImmutableList regularImmutableList = new RegularImmutableList(objectArray, n3);
        return regularImmutableList;
    }

    public static ImmutableList$Builder builder() {
        ImmutableList$Builder immutableList$Builder = new ImmutableList$Builder();
        return immutableList$Builder;
    }

    public static ImmutableList$Builder builderWithExpectedSize(int n3) {
        CollectPreconditions.checkNonnegative(n3, "expectedSize");
        ImmutableList$Builder immutableList$Builder = new ImmutableList$Builder(n3);
        return immutableList$Builder;
    }

    private static ImmutableList construct(Object ... objectArray) {
        return ImmutableList.asImmutableList(ObjectArrays.checkElementsNotNull(objectArray));
    }

    public static ImmutableList copyOf(Iterable iterable) {
        Preconditions.checkNotNull(iterable);
        boolean bl2 = iterable instanceof Collection;
        iterable = bl2 ? ImmutableList.copyOf((Collection)iterable) : ImmutableList.copyOf(iterable.iterator());
        return iterable;
    }

    public static ImmutableList copyOf(Collection collection) {
        boolean bl2 = collection instanceof ImmutableCollection;
        if (bl2) {
            bl2 = ((ImmutableCollection)(collection = ((ImmutableCollection)collection).asList())).isPartialView();
            if (bl2) {
                collection = ImmutableList.asImmutableList(((ImmutableCollection)collection).toArray());
            }
            return collection;
        }
        return ImmutableList.construct(collection.toArray());
    }

    public static ImmutableList copyOf(Iterator iterator) {
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            return ImmutableList.of();
        }
        Object e2 = iterator.next();
        boolean bl3 = iterator.hasNext();
        if (!bl3) {
            return ImmutableList.of(e2);
        }
        ImmutableList$Builder immutableList$Builder = new ImmutableList$Builder();
        return ((ImmutableList$Builder)((ImmutableList$Builder)immutableList$Builder.add(e2)).addAll(iterator)).build();
    }

    public static ImmutableList copyOf(Object[] object) {
        int n3 = ((Object[])object).length;
        object = n3 == 0 ? ImmutableList.of() : ImmutableList.construct((Object[])object.clone());
        return object;
    }

    public static ImmutableList of() {
        return RegularImmutableList.EMPTY;
    }

    public static ImmutableList of(Object object) {
        Object[] objectArray = new Object[]{object};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2) {
        Object[] objectArray = new Object[]{object, object2};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3) {
        Object[] objectArray = new Object[]{object, object2, object3};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4) {
        Object[] objectArray = new Object[]{object, object2, object3, object4};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4, Object object5) {
        Object[] objectArray = new Object[]{object, object2, object3, object4, object5};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        Object[] objectArray = new Object[]{object, object2, object3, object4, object5, object6};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        Object[] objectArray = new Object[]{object, object2, object3, object4, object5, object6, object7};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        Object[] objectArray = new Object[]{object, object2, object3, object4, object5, object6, object7, object8};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        Object[] objectArray = new Object[]{object, object2, object3, object4, object5, object6, object7, object8, object9};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        Object[] objectArray = new Object[]{object, object2, object3, object4, object5, object6, object7, object8, object9, object10};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        Object[] objectArray = new Object[]{object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11};
        return ImmutableList.construct(objectArray);
    }

    public static ImmutableList of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object ... objectArray) {
        Object[] objectArray2;
        Object[] objectArray3 = objectArray;
        int n3 = objectArray.length;
        int n4 = 0x7FFFFFF3;
        int n7 = 1;
        if (n3 <= n4) {
            n3 = 1;
        } else {
            n3 = 0;
            objectArray2 = null;
        }
        Preconditions.checkArgument(n3 != 0, "the total number of elements must fit in an int");
        n3 = objectArray3.length;
        n4 = 12;
        objectArray2 = new Object[n3 + n4];
        objectArray2[0] = object;
        objectArray2[n7] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        n7 = objectArray3.length;
        System.arraycopy(objectArray3, 0, objectArray2, n4, n7);
        return ImmutableList.construct(objectArray2);
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    public static ImmutableList sortedCopyOf(Iterable objectArray) {
        Object[] objectArray2 = new Comparable[]{};
        objectArray = (Comparable[])Iterables.toArray((Iterable)objectArray, objectArray2);
        ObjectArrays.checkElementsNotNull(objectArray);
        Arrays.sort(objectArray);
        return ImmutableList.asImmutableList(objectArray);
    }

    public static ImmutableList sortedCopyOf(Comparator comparator, Iterable objectArray) {
        Preconditions.checkNotNull(comparator);
        objectArray = Iterables.toArray((Iterable)objectArray);
        ObjectArrays.checkElementsNotNull(objectArray);
        Arrays.sort(objectArray, comparator);
        return ImmutableList.asImmutableList(objectArray);
    }

    public final void add(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final ImmutableList asList() {
        return this;
    }

    public boolean contains(Object object) {
        int n3 = this.indexOf(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public int copyIntoArray(Object[] objectArray, int n3) {
        int n4 = this.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = n3 + i3;
            Object e2 = this.get(i3);
            objectArray[n7] = e2;
        }
        return n3 + n4;
    }

    public boolean equals(Object object) {
        return Lists.equalsImpl(this, object);
    }

    public int hashCode() {
        int n3 = this.size();
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object e2 = this.get(i3);
            int n7 = e2.hashCode() + (n4 *= 31);
            n4 = ~(~n7);
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object == null ? -1 : Lists.indexOfImpl(this, object);
        return n3;
    }

    public UnmodifiableIterator iterator() {
        return this.listIterator();
    }

    public int lastIndexOf(Object object) {
        int n3 = object == null ? -1 : Lists.lastIndexOfImpl(this, object);
        return n3;
    }

    public UnmodifiableListIterator listIterator() {
        return this.listIterator(0);
    }

    public UnmodifiableListIterator listIterator(int n3) {
        int n4 = this.size();
        Preconditions.checkPositionIndex(n3, n4);
        n4 = (int)(this.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return EMPTY_ITR;
        }
        ImmutableList$Itr immutableList$Itr = new ImmutableList$Itr(this, n3);
        return immutableList$Itr;
    }

    public final Object remove(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public ImmutableList reverse() {
        int n3;
        int n4 = this.size();
        ImmutableList immutableList = n4 <= (n3 = 1) ? this : new ImmutableList$ReverseImmutableList(this);
        return immutableList;
    }

    public final Object set(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public ImmutableList subList(int n3, int n4) {
        int n7 = this.size();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        n7 = n4 - n3;
        int n8 = this.size();
        if (n7 == n8) {
            return this;
        }
        if (n7 == 0) {
            return ImmutableList.of();
        }
        return this.subListUnchecked(n3, n4);
    }

    public ImmutableList subListUnchecked(int n3, int n4) {
        ImmutableList$SubList immutableList$SubList = new ImmutableList$SubList(this, n3, n4 -= n3);
        return immutableList$SubList;
    }

    public Object writeReplace() {
        Object[] objectArray = this.toArray();
        ImmutableList$SerializedForm immutableList$SerializedForm = new ImmutableList$SerializedForm(objectArray);
        return immutableList$SerializedForm;
    }
}

