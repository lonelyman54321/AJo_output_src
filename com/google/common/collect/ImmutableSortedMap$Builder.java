/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableCollection$Builder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ImmutableSortedMap$Builder
extends ImmutableMap$Builder {
    private final Comparator comparator;
    private transient Object[] keys;
    private transient Object[] values;

    public ImmutableSortedMap$Builder(Comparator comparator) {
        this(comparator, 4);
    }

    private ImmutableSortedMap$Builder(Comparator objectArray, int n3) {
        objectArray = (Comparator)Preconditions.checkNotNull(objectArray);
        this.comparator = objectArray;
        objectArray = new Object[n3];
        this.keys = objectArray;
        objectArray = new Object[n3];
        this.values = objectArray;
    }

    private void ensureCapacity(int n3) {
        Object[] objectArray = this.keys;
        int n4 = objectArray.length;
        if (n3 > n4) {
            int n7 = objectArray.length;
            n3 = ImmutableCollection$Builder.expandedCapacity(n7, n3);
            this.keys = objectArray = Arrays.copyOf(this.keys, n3);
            objectArray = this.values;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            this.values = objectArray2;
        }
    }

    public ImmutableSortedMap build() {
        return this.buildOrThrow();
    }

    public final ImmutableSortedMap buildKeepingLast() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        throw unsupportedOperationException;
    }

    public ImmutableSortedMap buildOrThrow() {
        int n3 = this.size;
        if (n3 != 0) {
            Object object = null;
            int n4 = 1;
            if (n3 != n4) {
                Object object2;
                Object object3;
                int n7;
                Object object4 = Arrays.copyOf(this.keys, n3);
                Object object5 = this.comparator;
                Arrays.sort(object4, object5);
                n4 = this.size;
                object5 = new Object[n4];
                for (int i3 = 0; i3 < (n7 = this.size); ++i3) {
                    Object object6;
                    int n8;
                    Object object7;
                    if (i3 > 0 && (n7 = (object3 = this.comparator).compare(object7 = object4[n8 = i3 + -1], object6 = object4[i3])) == 0) {
                        object3 = new StringBuilder("keys required to be distinct but compared as equal: ");
                        object2 = object4[n8];
                        ((StringBuilder)object3).append(object2);
                        ((StringBuilder)object3).append(" and ");
                        object4 = object4[i3];
                        ((StringBuilder)object3).append(object4);
                        object4 = ((StringBuilder)object3).toString();
                        object5 = new IllegalArgumentException((String)object4);
                        throw object5;
                    }
                    object3 = this.keys[i3];
                    Objects.requireNonNull(object3);
                    object2 = this.comparator;
                    n7 = Arrays.binarySearch(object4, object3, object2);
                    object2 = this.values[i3];
                    Objects.requireNonNull(object2);
                    object5[n7] = object2;
                }
                object4 = ImmutableList.asImmutableList(object4);
                object2 = this.comparator;
                object3 = new RegularImmutableSortedSet((ImmutableList)object4, (Comparator)object2);
                object4 = ImmutableList.asImmutableList(object5);
                object = new ImmutableSortedMap((RegularImmutableSortedSet)object3, (ImmutableList)object4);
                return object;
            }
            Comparator comparator = this.comparator;
            Object object8 = this.keys[0];
            Objects.requireNonNull(object8);
            object = this.values[0];
            Objects.requireNonNull(object);
            return ImmutableSortedMap.access$000(comparator, object8, object);
        }
        return ImmutableSortedMap.emptyMap(this.comparator);
    }

    public ImmutableSortedMap$Builder combine(ImmutableSortedMap$Builder immutableSortedMap$Builder) {
        int n3 = this.size;
        int n4 = immutableSortedMap$Builder.size;
        this.ensureCapacity(n3 += n4);
        Object[] objectArray = immutableSortedMap$Builder.keys;
        Object[] objectArray2 = this.keys;
        int n7 = this.size;
        int n8 = immutableSortedMap$Builder.size;
        System.arraycopy(objectArray, 0, objectArray2, n7, n8);
        objectArray = immutableSortedMap$Builder.values;
        objectArray2 = this.values;
        n7 = this.size;
        n8 = immutableSortedMap$Builder.size;
        System.arraycopy(objectArray, 0, objectArray2, n7, n8);
        n3 = this.size;
        int n10 = immutableSortedMap$Builder.size;
        this.size = n3 += n10;
        return this;
    }

    public final ImmutableSortedMap$Builder orderEntriesByValue(Comparator object) {
        object = new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        throw object;
    }

    public ImmutableSortedMap$Builder put(Object object, Object object2) {
        int n3 = this.size + 1;
        this.ensureCapacity(n3);
        CollectPreconditions.checkEntryNotNull(object, object2);
        Object[] objectArray = this.keys;
        int n4 = this.size;
        objectArray[n4] = object;
        this.values[n4] = object2;
        this.size = ++n4;
        return this;
    }

    public ImmutableSortedMap$Builder put(Map.Entry entry) {
        super.put(entry);
        return this;
    }

    public ImmutableSortedMap$Builder putAll(Iterable iterable) {
        super.putAll(iterable);
        return this;
    }

    public ImmutableSortedMap$Builder putAll(Map map2) {
        super.putAll(map2);
        return this;
    }
}

