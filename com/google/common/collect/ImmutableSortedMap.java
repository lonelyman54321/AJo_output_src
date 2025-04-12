/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedMap$1EntrySet;
import com.google.common.collect.ImmutableSortedMap$Builder;
import com.google.common.collect.ImmutableSortedMap$SerializedForm;
import com.google.common.collect.ImmutableSortedMapFauxverideShim;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.RegularImmutableSortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;

public final class ImmutableSortedMap
extends ImmutableSortedMapFauxverideShim
implements NavigableMap {
    private static final ImmutableSortedMap NATURAL_EMPTY_MAP;
    private static final Comparator NATURAL_ORDER;
    private static final long serialVersionUID;
    private transient ImmutableSortedMap descendingMap;
    private final transient RegularImmutableSortedSet keySet;
    private final transient ImmutableList valueList;

    static {
        ImmutableSortedMap immutableSortedMap;
        NATURAL_ORDER = Ordering.natural();
        RegularImmutableSortedSet regularImmutableSortedSet = ImmutableSortedSet.emptySet(Ordering.natural());
        ImmutableList immutableList = ImmutableList.of();
        NATURAL_EMPTY_MAP = immutableSortedMap = new ImmutableSortedMap(regularImmutableSortedSet, immutableList);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList, ImmutableSortedMap immutableSortedMap) {
        this.keySet = regularImmutableSortedSet;
        this.valueList = immutableList;
        this.descendingMap = immutableSortedMap;
    }

    public static /* synthetic */ int a(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return ImmutableSortedMap.lambda$fromEntries$0(comparator, entry, entry2);
    }

    public static /* synthetic */ ImmutableSortedMap access$000(Comparator comparator, Object object, Object object2) {
        return ImmutableSortedMap.of(comparator, object, object2);
    }

    public static /* synthetic */ RegularImmutableSortedSet access$100(ImmutableSortedMap immutableSortedMap) {
        return immutableSortedMap.keySet;
    }

    public static /* synthetic */ ImmutableList access$200(ImmutableSortedMap immutableSortedMap) {
        return immutableSortedMap.valueList;
    }

    public static ImmutableSortedMap copyOf(Iterable iterable) {
        Ordering ordering = (Ordering)NATURAL_ORDER;
        return ImmutableSortedMap.copyOf(iterable, (Comparator)ordering);
    }

    public static ImmutableSortedMap copyOf(Iterable iterable, Comparator comparator) {
        return ImmutableSortedMap.fromEntries((Comparator)Preconditions.checkNotNull(comparator), false, iterable);
    }

    public static ImmutableSortedMap copyOf(Map map2) {
        Ordering ordering = (Ordering)NATURAL_ORDER;
        return ImmutableSortedMap.copyOfInternal(map2, ordering);
    }

    public static ImmutableSortedMap copyOf(Map map2, Comparator comparator) {
        comparator = (Comparator)Preconditions.checkNotNull(comparator);
        return ImmutableSortedMap.copyOfInternal(map2, comparator);
    }

    private static ImmutableSortedMap copyOfInternal(Map object, Comparator comparator) {
        Object object2;
        boolean bl2 = object instanceof SortedMap;
        boolean bl3 = false;
        if (bl2) {
            object2 = object;
            object2 = ((SortedMap)object).comparator();
            if (object2 == null) {
                object2 = NATURAL_ORDER;
                if (comparator == object2) {
                    bl3 = true;
                }
            } else {
                bl3 = comparator.equals(object2);
            }
        }
        if (bl3 && (bl2 = object instanceof ImmutableSortedMap)) {
            object2 = object;
            object2 = (ImmutableSortedMap)object;
            boolean bl4 = ((ImmutableSortedMap)object2).isPartialView();
            if (!bl4) {
                return object2;
            }
        }
        object = object.entrySet();
        return ImmutableSortedMap.fromEntries(comparator, bl3, (Iterable)object);
    }

    public static ImmutableSortedMap copyOfSorted(SortedMap object) {
        boolean bl2;
        Comparator comparator = object.comparator();
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        if (bl2 = object instanceof ImmutableSortedMap) {
            SortedMap sortedMap = object;
            sortedMap = (ImmutableSortedMap)object;
            boolean bl3 = ((ImmutableSortedMap)sortedMap).isPartialView();
            if (!bl3) {
                return sortedMap;
            }
        }
        object = object.entrySet();
        return ImmutableSortedMap.fromEntries(comparator, true, (Iterable)object);
    }

    public static ImmutableSortedMap emptyMap(Comparator object) {
        Object object2 = Ordering.natural();
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return ImmutableSortedMap.of();
        }
        object = ImmutableSortedSet.emptySet((Comparator)object);
        ImmutableList immutableList = ImmutableList.of();
        object2 = new ImmutableSortedMap((RegularImmutableSortedSet)object, immutableList);
        return object2;
    }

    private static ImmutableSortedMap fromEntries(Comparator comparator, boolean bl2, Iterable entryArray) {
        Object[] objectArray = ImmutableMap.EMPTY_ENTRY_ARRAY;
        entryArray = (Map.Entry[])Iterables.toArray((Iterable)entryArray, objectArray);
        int n3 = entryArray.length;
        return ImmutableSortedMap.fromEntries(comparator, bl2, entryArray, n3);
    }

    private static ImmutableSortedMap fromEntries(Comparator object, boolean n3, Map.Entry[] object2, int n4) {
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                Object object3;
                Object[] objectArray = new Object[n4];
                Object[] objectArray2 = new Object[n4];
                if (n3 != 0) {
                    for (int i3 = 0; i3 < n4; ++i3) {
                        object3 = object2[i3];
                        Objects.requireNonNull(object3);
                        object3 = (Map.Entry)object3;
                        Object k2 = object3.getKey();
                        object3 = object3.getValue();
                        CollectPreconditions.checkEntryNotNull(k2, object3);
                        objectArray[i3] = k2;
                        objectArray2[i3] = object3;
                    }
                } else {
                    object3 = new bf1_1((Comparator)object);
                    Arrays.sort(object2, 0, n4, object3);
                    object3 = object2[0];
                    Objects.requireNonNull(object3);
                    object3 = (Map.Entry)object3;
                    Object k3 = object3.getKey();
                    objectArray[0] = k3;
                    objectArray2[0] = object3 = object3.getValue();
                    Object object4 = objectArray[0];
                    CollectPreconditions.checkEntryNotNull(object4, object3);
                    for (n3 = 1; n3 < n4; ++n3) {
                        int n8 = n3 + -1;
                        object4 = object2[n8];
                        Objects.requireNonNull(object4);
                        object4 = (Map.Entry)object4;
                        Map.Entry entry = object2[n3];
                        Objects.requireNonNull(entry);
                        Object k4 = entry.getKey();
                        Object object5 = entry.getValue();
                        CollectPreconditions.checkEntryNotNull(k4, object5);
                        objectArray[n3] = k4;
                        objectArray2[n3] = object5;
                        boolean bl2 = object.compare(k3, k4);
                        if (bl2) {
                            bl2 = true;
                        } else {
                            bl2 = false;
                            k3 = null;
                        }
                        object5 = "key";
                        ImmutableMap.checkNoConflict(bl2, object5, object4, entry);
                        k3 = k4;
                    }
                }
                ImmutableList immutableList = ImmutableList.asImmutableList(objectArray);
                object2 = new RegularImmutableSortedSet(immutableList, (Comparator)object);
                object = ImmutableList.asImmutableList(objectArray2);
                object3 = new ImmutableSortedMap((RegularImmutableSortedSet)object2, (ImmutableList)object);
                return object3;
            }
            Object entry = object2[0];
            Objects.requireNonNull(entry);
            entry = (Map.Entry)entry;
            object2 = entry.getKey();
            entry = entry.getValue();
            return ImmutableSortedMap.of((Comparator)object, object2, entry);
        }
        return ImmutableSortedMap.emptyMap((Comparator)object);
    }

    private static ImmutableSortedMap fromEntries(Map.Entry ... entryArray) {
        Ordering ordering = Ordering.natural();
        int n3 = entryArray.length;
        return ImmutableSortedMap.fromEntries(ordering, false, entryArray, n3);
    }

    private ImmutableSortedMap getSubMap(int n3, int n4) {
        int n7;
        if (n3 == 0 && n4 == (n7 = this.size())) {
            return this;
        }
        if (n3 == n4) {
            return ImmutableSortedMap.emptyMap(this.comparator());
        }
        RegularImmutableSortedSet regularImmutableSortedSet = this.keySet.getSubSet(n3, n4);
        ImmutableList immutableList = this.valueList.subList(n3, n4);
        ImmutableSortedMap immutableSortedMap = new ImmutableSortedMap(regularImmutableSortedSet, immutableList);
        return immutableSortedMap;
    }

    private static /* synthetic */ int lambda$fromEntries$0(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        entry = entry.getKey();
        entry2 = entry2.getKey();
        return comparator.compare(entry, entry2);
    }

    public static ImmutableSortedMap$Builder naturalOrder() {
        Ordering ordering = Ordering.natural();
        ImmutableSortedMap$Builder immutableSortedMap$Builder = new ImmutableSortedMap$Builder(ordering);
        return immutableSortedMap$Builder;
    }

    public static ImmutableSortedMap of() {
        return NATURAL_EMPTY_MAP;
    }

    public static ImmutableSortedMap of(Comparable comparable, Object object) {
        return ImmutableSortedMap.of(Ordering.natural(), comparable, object);
    }

    public static ImmutableSortedMap of(Comparable object, Object object2, Comparable entryArray, Object object3) {
        object = ImmutableMap.entryOf(object, object2);
        object2 = ImmutableMap.entryOf(entryArray, object3);
        entryArray = new Map.Entry[]{object, object2};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    public static ImmutableSortedMap of(Comparable object, Object object2, Comparable object3, Object entryArray, Comparable comparable, Object object4) {
        object = ImmutableMap.entryOf(object, object2);
        object2 = ImmutableMap.entryOf(object3, entryArray);
        object3 = ImmutableMap.entryOf(comparable, object4);
        entryArray = new Map.Entry[]{object, object2, object3};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    public static ImmutableSortedMap of(Comparable object, Object object2, Comparable object3, Object object4, Comparable entryArray, Object object5, Comparable comparable, Object object6) {
        object = ImmutableMap.entryOf(object, object2);
        object2 = ImmutableMap.entryOf(object3, object4);
        object3 = ImmutableMap.entryOf(entryArray, object5);
        object4 = ImmutableMap.entryOf(comparable, object6);
        entryArray = new Map.Entry[]{object, object2, object3, object4};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    public static ImmutableSortedMap of(Comparable object, Object object2, Comparable object3, Object object4, Comparable object5, Object entryArray, Comparable comparable, Object object6, Comparable comparable2, Object object7) {
        object = ImmutableMap.entryOf(object, object2);
        object2 = ImmutableMap.entryOf(object3, object4);
        object3 = ImmutableMap.entryOf(object5, entryArray);
        object4 = ImmutableMap.entryOf(comparable, object6);
        object5 = ImmutableMap.entryOf(comparable2, object7);
        entryArray = new Map.Entry[]{object, object2, object3, object4, object5};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    public static ImmutableSortedMap of(Comparable object, Object object2, Comparable object3, Object object4, Comparable object5, Object object6, Comparable entryArray, Object object7, Comparable comparable, Object object8, Comparable comparable2, Object object9) {
        object = ImmutableMap.entryOf(object, object2);
        object2 = ImmutableMap.entryOf(object3, object4);
        object3 = ImmutableMap.entryOf(object5, object6);
        object4 = ImmutableMap.entryOf(entryArray, object7);
        object5 = ImmutableMap.entryOf(comparable, object8);
        object6 = ImmutableMap.entryOf(comparable2, object9);
        entryArray = new Map.Entry[]{object, object2, object3, object4, object5, object6};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    public static ImmutableSortedMap of(Comparable object, Object object2, Comparable object3, Object object4, Comparable object5, Object object6, Comparable object7, Object entryArray, Comparable comparable, Object object8, Comparable comparable2, Object object9, Comparable comparable3, Object object10) {
        object = ImmutableMap.entryOf(object, object2);
        object2 = ImmutableMap.entryOf(object3, object4);
        object3 = ImmutableMap.entryOf(object5, object6);
        object4 = ImmutableMap.entryOf(object7, entryArray);
        object5 = ImmutableMap.entryOf(comparable, object8);
        object6 = ImmutableMap.entryOf(comparable2, object9);
        object7 = ImmutableMap.entryOf(comparable3, object10);
        entryArray = new Map.Entry[]{object, object2, object3, object4, object5, object6, object7};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    public static ImmutableSortedMap of(Comparable object, Object object2, Comparable object3, Object object4, Comparable object5, Object object6, Comparable object7, Object object8, Comparable entryArray, Object object9, Comparable comparable, Object object10, Comparable comparable2, Object object11, Comparable comparable3, Object object12) {
        object = ImmutableMap.entryOf(object, object2);
        object2 = ImmutableMap.entryOf(object3, object4);
        object3 = ImmutableMap.entryOf(object5, object6);
        object4 = ImmutableMap.entryOf(object7, object8);
        object5 = ImmutableMap.entryOf(entryArray, object9);
        object6 = ImmutableMap.entryOf(comparable, object10);
        object7 = ImmutableMap.entryOf(comparable2, object11);
        object8 = ImmutableMap.entryOf(comparable3, object12);
        entryArray = new Map.Entry[]{object, object2, object3, object4, object5, object6, object7, object8};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    public static ImmutableSortedMap of(Comparable comparable, Object object, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4, Comparable comparable5, Object object5, Comparable comparable6, Object object6, Comparable comparable7, Object object7, Comparable comparable8, Object object8, Comparable comparable9, Object object9) {
        Map.Entry entry = ImmutableMap.entryOf(comparable, object);
        Map.Entry entry2 = ImmutableMap.entryOf(comparable2, object2);
        Map.Entry entry3 = ImmutableMap.entryOf(comparable3, object3);
        Map.Entry entry4 = ImmutableMap.entryOf(comparable4, object4);
        Map.Entry entry5 = ImmutableMap.entryOf(comparable5, object5);
        Map.Entry entry6 = ImmutableMap.entryOf(comparable6, object6);
        Map.Entry entry7 = ImmutableMap.entryOf(comparable7, object7);
        Map.Entry entry8 = ImmutableMap.entryOf(comparable8, object8);
        Map.Entry entry9 = ImmutableMap.entryOf(comparable9, object9);
        Map.Entry[] entryArray = new Map.Entry[]{entry, entry2, entry3, entry4, entry5, entry6, entry7, entry8, entry9};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    public static ImmutableSortedMap of(Comparable comparable, Object object, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4, Comparable comparable5, Object object5, Comparable comparable6, Object object6, Comparable comparable7, Object object7, Comparable comparable8, Object object8, Comparable comparable9, Object object9, Comparable comparable10, Object object10) {
        Map.Entry entry = ImmutableMap.entryOf(comparable, object);
        Map.Entry entry2 = ImmutableMap.entryOf(comparable2, object2);
        Map.Entry entry3 = ImmutableMap.entryOf(comparable3, object3);
        Map.Entry entry4 = ImmutableMap.entryOf(comparable4, object4);
        Map.Entry entry5 = ImmutableMap.entryOf(comparable5, object5);
        Map.Entry entry6 = ImmutableMap.entryOf(comparable6, object6);
        Map.Entry entry7 = ImmutableMap.entryOf(comparable7, object7);
        Map.Entry entry8 = ImmutableMap.entryOf(comparable8, object8);
        Map.Entry entry9 = ImmutableMap.entryOf(comparable9, object9);
        Map.Entry entry10 = ImmutableMap.entryOf(comparable10, object10);
        Map.Entry[] entryArray = new Map.Entry[]{entry, entry2, entry3, entry4, entry5, entry6, entry7, entry8, entry9, entry10};
        return ImmutableSortedMap.fromEntries(entryArray);
    }

    private static ImmutableSortedMap of(Comparator object, Object object2, Object object3) {
        object2 = ImmutableList.of(object2);
        object = (Comparator)Preconditions.checkNotNull(object);
        RegularImmutableSortedSet regularImmutableSortedSet = new RegularImmutableSortedSet((ImmutableList)object2, (Comparator)object);
        object = ImmutableList.of(object3);
        ImmutableSortedMap immutableSortedMap = new ImmutableSortedMap(regularImmutableSortedSet, (ImmutableList)object);
        return immutableSortedMap;
    }

    public static ImmutableSortedMap$Builder orderedBy(Comparator comparator) {
        ImmutableSortedMap$Builder immutableSortedMap$Builder = new ImmutableSortedMap$Builder(comparator);
        return immutableSortedMap$Builder;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    public static ImmutableSortedMap$Builder reverseOrder() {
        Ordering ordering = Ordering.natural().reverse();
        ImmutableSortedMap$Builder immutableSortedMap$Builder = new ImmutableSortedMap$Builder(ordering);
        return immutableSortedMap$Builder;
    }

    public Map.Entry ceilingEntry(Object object) {
        return this.tailMap(object, true).firstEntry();
    }

    public Object ceilingKey(Object object) {
        return Maps.keyOrNull(this.ceilingEntry(object));
    }

    public Comparator comparator() {
        return ((ImmutableSortedSet)this.keySet()).comparator();
    }

    public ImmutableSet createEntrySet() {
        boolean bl2 = this.isEmpty();
        ImmutableSet immutableSet = bl2 ? ImmutableSet.of() : new ImmutableSortedMap$1EntrySet(this);
        return immutableSet;
    }

    public ImmutableSet createKeySet() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public ImmutableCollection createValues() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public ImmutableSortedSet descendingKeySet() {
        return this.keySet.descendingSet();
    }

    public ImmutableSortedMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.descendingMap;
        if (immutableSortedMap == null) {
            boolean bl2 = this.isEmpty();
            if (bl2) {
                return ImmutableSortedMap.emptyMap(Ordering.from(this.comparator()).reverse());
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet)this.keySet.descendingSet();
            ImmutableList immutableList = this.valueList.reverse();
            immutableSortedMap = new ImmutableSortedMap(regularImmutableSortedSet, immutableList, this);
        }
        return immutableSortedMap;
    }

    public ImmutableSet entrySet() {
        return super.entrySet();
    }

    public Map.Entry firstEntry() {
        Map.Entry entry;
        boolean bl2 = this.isEmpty();
        if (bl2) {
            bl2 = false;
            entry = null;
        } else {
            entry = (Map.Entry)this.entrySet().asList().get(0);
        }
        return entry;
    }

    public Object firstKey() {
        return ((ImmutableSortedSet)this.keySet()).first();
    }

    public Map.Entry floorEntry(Object object) {
        return this.headMap(object, true).lastEntry();
    }

    public Object floorKey(Object object) {
        return Maps.keyOrNull(this.floorEntry(object));
    }

    public Object get(Object object) {
        int n3;
        ImmutableCollection immutableCollection = this.keySet;
        int n4 = ((RegularImmutableSortedSet)immutableCollection).indexOf(object);
        if (n4 == (n3 = -1)) {
            n4 = 0;
            object = null;
        } else {
            immutableCollection = this.valueList;
            object = immutableCollection.get(n4);
        }
        return object;
    }

    public ImmutableSortedMap headMap(Object object) {
        return this.headMap(object, false);
    }

    public ImmutableSortedMap headMap(Object object, boolean bl2) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.keySet;
        object = Preconditions.checkNotNull(object);
        int n3 = regularImmutableSortedSet.headIndex(object, bl2);
        return this.getSubMap(0, n3);
    }

    public Map.Entry higherEntry(Object object) {
        return this.tailMap(object, false).firstEntry();
    }

    public Object higherKey(Object object) {
        return Maps.keyOrNull(this.higherEntry(object));
    }

    public boolean isPartialView() {
        ImmutableCollection immutableCollection = this.keySet;
        boolean bl2 = ((RegularImmutableSortedSet)immutableCollection).isPartialView();
        if (!bl2 && !(bl2 = (immutableCollection = this.valueList).isPartialView())) {
            bl2 = false;
            immutableCollection = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public ImmutableSortedSet keySet() {
        return this.keySet;
    }

    public Map.Entry lastEntry() {
        Object object;
        boolean bl2 = this.isEmpty();
        if (bl2) {
            bl2 = false;
            object = null;
        } else {
            object = this.entrySet().asList();
            int n3 = this.size() + -1;
            object = (Map.Entry)object.get(n3);
        }
        return object;
    }

    public Object lastKey() {
        return ((ImmutableSortedSet)this.keySet()).last();
    }

    public Map.Entry lowerEntry(Object object) {
        return this.headMap(object, false).lastEntry();
    }

    public Object lowerKey(Object object) {
        return Maps.keyOrNull(this.lowerEntry(object));
    }

    public ImmutableSortedSet navigableKeySet() {
        return this.keySet;
    }

    public final Map.Entry pollFirstEntry() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final Map.Entry pollLastEntry() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int size() {
        return this.valueList.size();
    }

    public ImmutableSortedMap subMap(Object object, Object object2) {
        return this.subMap(object, true, object2, false);
    }

    /*
     * WARNING - void declaration
     */
    public ImmutableSortedMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        void var6_9;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        Comparator comparator = this.comparator();
        int bl4 = comparator.compare(object, object2);
        if (bl4 <= 0) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
            comparator = null;
        }
        Preconditions.checkArgument((boolean)var6_9, "expected fromKey <= toKey but %s > %s", object, object2);
        return this.headMap(object2, bl3).tailMap(object, bl2);
    }

    public ImmutableSortedMap tailMap(Object object) {
        return this.tailMap(object, true);
    }

    public ImmutableSortedMap tailMap(Object object, boolean bl2) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.keySet;
        object = Preconditions.checkNotNull(object);
        int n3 = regularImmutableSortedSet.tailIndex(object, bl2);
        int n4 = this.size();
        return this.getSubMap(n3, n4);
    }

    public ImmutableCollection values() {
        return this.valueList;
    }

    public Object writeReplace() {
        ImmutableSortedMap$SerializedForm immutableSortedMap$SerializedForm = new ImmutableSortedMap$SerializedForm(this);
        return immutableSortedMap$SerializedForm;
    }
}

