/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableCollection$Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder$DuplicateKey;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.RegularImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class ImmutableMap$Builder {
    Object[] alternatingKeysAndValues;
    ImmutableMap$Builder$DuplicateKey duplicateKey;
    boolean entriesUsed;
    int size;
    Comparator valueComparator;

    public ImmutableMap$Builder() {
        this(4);
    }

    public ImmutableMap$Builder(int n3) {
        Object[] objectArray = new Object[n3 * 2];
        this.alternatingKeysAndValues = objectArray;
        this.size = 0;
        this.entriesUsed = false;
    }

    private ImmutableMap build(boolean bl2) {
        ImmutableMap$Builder$DuplicateKey immutableMap$Builder$DuplicateKey;
        Object object;
        if (bl2 && (object = this.duplicateKey) != null) {
            throw ((ImmutableMap$Builder$DuplicateKey)object).exception();
        }
        int n3 = this.size;
        Object[] objectArray = this.valueComparator;
        int n4 = 1;
        if (objectArray == null) {
            objectArray = this.alternatingKeysAndValues;
        } else {
            int n7;
            boolean bl3 = this.entriesUsed;
            if (bl3) {
                objectArray = this.alternatingKeysAndValues;
                n7 = n3 * 2;
                objectArray = Arrays.copyOf(objectArray, n7);
                this.alternatingKeysAndValues = objectArray;
            }
            objectArray = this.alternatingKeysAndValues;
            if (!bl2) {
                Object[] objectArray2;
                int n8;
                n7 = this.size;
                if ((n7 = (objectArray = this.lastEntryForEachKey(objectArray, n7)).length) < (n8 = (objectArray2 = this.alternatingKeysAndValues).length)) {
                    n3 = objectArray.length >>> n4;
                }
            }
            Comparator comparator = this.valueComparator;
            ImmutableMap$Builder.sortEntries(objectArray, n3, comparator);
        }
        this.entriesUsed = n4;
        object = RegularImmutableMap.create(n3, objectArray, this);
        if (bl2 && (immutableMap$Builder$DuplicateKey = this.duplicateKey) != null) {
            throw immutableMap$Builder$DuplicateKey.exception();
        }
        return object;
    }

    private void ensureCapacity(int n3) {
        Object[] objectArray = this.alternatingKeysAndValues;
        int n4 = objectArray.length;
        if ((n3 *= 2) > n4) {
            n4 = objectArray.length;
            n3 = ImmutableCollection$Builder.expandedCapacity(n4, n3);
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            this.alternatingKeysAndValues = objectArray2;
            n3 = 0;
            objectArray2 = null;
            this.entriesUsed = false;
        }
    }

    private Object[] lastEntryForEachKey(Object[] objectArray, int n3) {
        int n4;
        Object object;
        int n7;
        int n8;
        Object[] objectArray2 = new HashSet();
        BitSet bitSet = new BitSet();
        for (n8 = n3 + -1; n8 >= 0; n8 += -1) {
            n7 = n8 * 2;
            object = objectArray[n7];
            Objects.requireNonNull(object);
            n7 = (int)(objectArray2.add(object) ? 1 : 0);
            if (n7 != 0) continue;
            bitSet.set(n8);
        }
        int n10 = bitSet.isEmpty();
        if (n10 != 0) {
            return objectArray;
        }
        n10 = bitSet.cardinality();
        n10 = (n3 - n10) * 2;
        objectArray2 = new Object[n10];
        n8 = 0;
        n7 = 0;
        object = null;
        while (n8 < (n4 = n3 * 2)) {
            n4 = n8 >>> 1;
            if ((n4 = (int)(bitSet.get(n4) ? 1 : 0)) != 0) {
                n8 += 2;
                continue;
            }
            n4 = n7 + 1;
            int n14 = n8 + 1;
            Object object2 = objectArray[n8];
            Objects.requireNonNull(object2);
            objectArray2[n7] = object2;
            n7 += 2;
            n8 += 2;
            Object object3 = objectArray[n14];
            Objects.requireNonNull(object3);
            objectArray2[n4] = object3;
        }
        return objectArray2;
    }

    public static void sortEntries(Object[] objectArray, int n3, Comparator comparator) {
        Map.Entry[] entryArray = new Map.Entry[n3];
        int n4 = 0;
        Function function = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            AbstractMap.SimpleImmutableEntry<Object, Object> simpleImmutableEntry;
            int n7 = i3 * 2;
            Object object = objectArray[n7];
            Objects.requireNonNull(object);
            Object object2 = objectArray[++n7];
            Objects.requireNonNull(object2);
            entryArray[i3] = simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry<Object, Object>(object, object2);
        }
        comparator = Ordering.from(comparator);
        function = Maps.valueFunction();
        comparator = ((Ordering)comparator).onResultOf(function);
        Arrays.sort(entryArray, 0, n3, comparator);
        while (n4 < n3) {
            int n8 = n4 * 2;
            function = entryArray[n4].getKey();
            objectArray[n8] = function;
            function = entryArray[n4].getValue();
            objectArray[++n8] = function;
            ++n4;
        }
    }

    public ImmutableMap build() {
        return this.buildOrThrow();
    }

    public ImmutableMap buildKeepingLast() {
        return this.build(false);
    }

    public ImmutableMap buildOrThrow() {
        return this.build(true);
    }

    public ImmutableMap$Builder combine(ImmutableMap$Builder immutableMap$Builder) {
        Preconditions.checkNotNull(immutableMap$Builder);
        int n3 = this.size;
        int n4 = immutableMap$Builder.size;
        this.ensureCapacity(n3 += n4);
        Object[] objectArray = immutableMap$Builder.alternatingKeysAndValues;
        Object[] objectArray2 = this.alternatingKeysAndValues;
        int n7 = this.size * 2;
        int n8 = immutableMap$Builder.size * 2;
        System.arraycopy(objectArray, 0, objectArray2, n7, n8);
        n3 = this.size;
        int n10 = immutableMap$Builder.size;
        this.size = n3 += n10;
        return this;
    }

    public ImmutableMap$Builder orderEntriesByValue(Comparator comparator) {
        boolean bl2;
        Comparator comparator2 = this.valueComparator;
        if (comparator2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            comparator2 = null;
        }
        Preconditions.checkState(bl2, "valueComparator was already set");
        this.valueComparator = comparator = (Comparator)Preconditions.checkNotNull(comparator, "valueComparator");
        return this;
    }

    public ImmutableMap$Builder put(Object object, Object object2) {
        int n3 = this.size + 1;
        this.ensureCapacity(n3);
        CollectPreconditions.checkEntryNotNull(object, object2);
        Object[] objectArray = this.alternatingKeysAndValues;
        int n4 = this.size;
        int n7 = n4 * 2;
        objectArray[n7] = object;
        int n8 = n4 * 2 + 1;
        objectArray[n8] = object2;
        this.size = ++n4;
        return this;
    }

    public ImmutableMap$Builder put(Map.Entry entry) {
        Object k2 = entry.getKey();
        entry = entry.getValue();
        return this.put(k2, entry);
    }

    public ImmutableMap$Builder putAll(Iterable object) {
        int n3 = object instanceof Collection;
        if (n3 != 0) {
            n3 = this.size;
            Iterable iterable = object;
            iterable = (Collection)object;
            int n4 = iterable.size() + n3;
            this.ensureCapacity(n4);
        }
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Map.Entry entry = (Map.Entry)object.next();
            this.put(entry);
        }
        return this;
    }

    public ImmutableMap$Builder putAll(Map object) {
        object = object.entrySet();
        return this.putAll((Iterable)object);
    }
}

