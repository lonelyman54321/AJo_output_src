/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.BiMap;
import com.google.common.collect.BoundType;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.ImmutableEnumMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Iterators;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps$1;
import com.google.common.collect.Maps$10;
import com.google.common.collect.Maps$11;
import com.google.common.collect.Maps$12;
import com.google.common.collect.Maps$13;
import com.google.common.collect.Maps$2;
import com.google.common.collect.Maps$3;
import com.google.common.collect.Maps$4;
import com.google.common.collect.Maps$5;
import com.google.common.collect.Maps$6;
import com.google.common.collect.Maps$7;
import com.google.common.collect.Maps$8;
import com.google.common.collect.Maps$9;
import com.google.common.collect.Maps$AbstractFilteredMap;
import com.google.common.collect.Maps$AsMapView;
import com.google.common.collect.Maps$BiMapConverter;
import com.google.common.collect.Maps$EntryFunction;
import com.google.common.collect.Maps$EntryTransformer;
import com.google.common.collect.Maps$FilteredEntryBiMap;
import com.google.common.collect.Maps$FilteredEntryMap;
import com.google.common.collect.Maps$FilteredEntryNavigableMap;
import com.google.common.collect.Maps$FilteredEntrySortedMap;
import com.google.common.collect.Maps$FilteredKeyMap;
import com.google.common.collect.Maps$MapDifferenceImpl;
import com.google.common.collect.Maps$NavigableAsMapView;
import com.google.common.collect.Maps$SortedAsMapView;
import com.google.common.collect.Maps$SortedMapDifferenceImpl;
import com.google.common.collect.Maps$TransformedEntriesMap;
import com.google.common.collect.Maps$TransformedEntriesNavigableMap;
import com.google.common.collect.Maps$TransformedEntriesSortedMap;
import com.google.common.collect.Maps$UnmodifiableBiMap;
import com.google.common.collect.Maps$UnmodifiableEntrySet;
import com.google.common.collect.Maps$UnmodifiableNavigableMap;
import com.google.common.collect.Maps$ValueDifferenceImpl;
import com.google.common.collect.NullnessCasts;
import com.google.common.collect.Ordering;
import com.google.common.collect.Range;
import com.google.common.collect.SortedMapDifference;
import com.google.common.collect.Synchronized;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class Maps {
    private Maps() {
    }

    public static /* synthetic */ Map access$100(Map map2) {
        return Maps.unmodifiableMap(map2);
    }

    public static /* synthetic */ Set access$200(Set set) {
        return Maps.removeOnlySet(set);
    }

    public static /* synthetic */ SortedSet access$300(SortedSet sortedSet) {
        return Maps.removeOnlySortedSet(sortedSet);
    }

    public static /* synthetic */ NavigableSet access$400(NavigableSet navigableSet) {
        return Maps.removeOnlyNavigableSet(navigableSet);
    }

    public static /* synthetic */ Map.Entry access$800(Map.Entry entry) {
        return Maps.unmodifiableOrNull(entry);
    }

    public static Converter asConverter(BiMap biMap) {
        Maps$BiMapConverter maps$BiMapConverter = new Maps$BiMapConverter(biMap);
        return maps$BiMapConverter;
    }

    public static Function asEntryToEntryFunction(Maps$EntryTransformer maps$EntryTransformer) {
        Preconditions.checkNotNull(maps$EntryTransformer);
        Maps$13 maps$13 = new Maps$13(maps$EntryTransformer);
        return maps$13;
    }

    public static Function asEntryToValueFunction(Maps$EntryTransformer maps$EntryTransformer) {
        Preconditions.checkNotNull(maps$EntryTransformer);
        Maps$11 maps$11 = new Maps$11(maps$EntryTransformer);
        return maps$11;
    }

    public static Maps$EntryTransformer asEntryTransformer(Function function) {
        Preconditions.checkNotNull(function);
        Maps$9 maps$9 = new Maps$9(function);
        return maps$9;
    }

    public static Map asMap(Set set, Function function) {
        Maps$AsMapView maps$AsMapView = new Maps$AsMapView(set, function);
        return maps$AsMapView;
    }

    public static NavigableMap asMap(NavigableSet navigableSet, Function function) {
        Maps$NavigableAsMapView maps$NavigableAsMapView = new Maps$NavigableAsMapView(navigableSet, function);
        return maps$NavigableAsMapView;
    }

    public static SortedMap asMap(SortedSet sortedSet, Function function) {
        Maps$SortedAsMapView maps$SortedAsMapView = new Maps$SortedAsMapView(sortedSet, function);
        return maps$SortedAsMapView;
    }

    public static Iterator asMapEntryIterator(Set object, Function function) {
        object = object.iterator();
        Maps$3 maps$3 = new Maps$3((Iterator)object, function);
        return maps$3;
    }

    public static Function asValueToValueFunction(Maps$EntryTransformer maps$EntryTransformer, Object object) {
        Preconditions.checkNotNull(maps$EntryTransformer);
        Maps$10 maps$10 = new Maps$10(maps$EntryTransformer, object);
        return maps$10;
    }

    public static int capacity(int n3) {
        int n4 = 3;
        if (n3 < n4) {
            CollectPreconditions.checkNonnegative(n3, "expectedSize");
            return n3 + 1;
        }
        n4 = 0x40000000;
        if (n3 < n4) {
            return (int)Math.ceil((double)n3 / 0.75);
        }
        return -1 >>> 1;
    }

    public static boolean containsEntryImpl(Collection collection, Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (!bl2) {
            return false;
        }
        object = Maps.unmodifiableEntry((Map.Entry)object);
        return collection.contains(object);
    }

    public static boolean containsKeyImpl(Map map2, Object object) {
        return Iterators.contains(Maps.keyIterator(map2.entrySet().iterator()), object);
    }

    public static boolean containsValueImpl(Map map2, Object object) {
        return Iterators.contains(Maps.valueIterator(map2.entrySet().iterator()), object);
    }

    public static MapDifference difference(Map map2, Map map3) {
        boolean bl2 = map2 instanceof SortedMap;
        if (bl2) {
            return Maps.difference((SortedMap)map2, map3);
        }
        Equivalence equivalence = Equivalence.equals();
        return Maps.difference(map2, map3, equivalence);
    }

    public static MapDifference difference(Map object, Map map2, Equivalence equivalence) {
        Preconditions.checkNotNull(equivalence);
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMap3 = Maps.newLinkedHashMap();
        LinkedHashMap linkedHashMap4 = Maps.newLinkedHashMap();
        Maps.doDifference((Map)object, map2, equivalence, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        object = new Maps$MapDifferenceImpl(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        return object;
    }

    public static SortedMapDifference difference(SortedMap object, Map map2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(map2);
        Object object2 = Maps.orNaturalOrder(object.comparator());
        TreeMap treeMap = Maps.newTreeMap((Comparator)object2);
        TreeMap treeMap2 = Maps.newTreeMap((Comparator)object2);
        treeMap2.putAll(map2);
        TreeMap treeMap3 = Maps.newTreeMap((Comparator)object2);
        object2 = Maps.newTreeMap((Comparator)object2);
        Equivalence equivalence = Equivalence.equals();
        Maps.doDifference((Map)object, map2, equivalence, treeMap, treeMap2, treeMap3, (Map)object2);
        object = new Maps$SortedMapDifferenceImpl(treeMap, treeMap2, treeMap3, (SortedMap)object2);
        return object;
    }

    private static void doDifference(Map object, Map map2, Equivalence equivalence, Map map3, Map map4, Map map5, Map map6) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object k2 = object2.getKey();
            object2 = object2.getValue();
            boolean bl3 = map2.containsKey(k2);
            if (bl3) {
                Object object3 = NullnessCasts.uncheckedCastNullableTToT(map4.remove(k2));
                boolean bl4 = equivalence.equivalent(object2, object3);
                if (bl4) {
                    map5.put(k2, object2);
                    continue;
                }
                object2 = Maps$ValueDifferenceImpl.create(object2, object3);
                map6.put(k2, object2);
                continue;
            }
            map3.put(k2, object2);
        }
    }

    public static boolean equalsImpl(Map object, Object set) {
        if (object == set) {
            return true;
        }
        boolean bl2 = set instanceof Map;
        if (bl2) {
            set = (Map)((Object)set);
            object = object.entrySet();
            set = set.entrySet();
            return object.equals(set);
        }
        return false;
    }

    public static BiMap filterEntries(BiMap biMap, Predicate predicate) {
        Preconditions.checkNotNull(biMap);
        Preconditions.checkNotNull(predicate);
        boolean bl2 = biMap instanceof Maps$FilteredEntryBiMap;
        if (bl2) {
            biMap = Maps.filterFiltered((Maps$FilteredEntryBiMap)biMap, predicate);
        } else {
            Maps$FilteredEntryBiMap maps$FilteredEntryBiMap = new Maps$FilteredEntryBiMap(biMap, predicate);
            biMap = maps$FilteredEntryBiMap;
        }
        return biMap;
    }

    public static Map filterEntries(Map map2, Predicate predicate) {
        Preconditions.checkNotNull(predicate);
        boolean bl2 = map2 instanceof Maps$AbstractFilteredMap;
        if (bl2) {
            map2 = Maps.filterFiltered((Maps$AbstractFilteredMap)map2, predicate);
        } else {
            map2 = (Map)Preconditions.checkNotNull(map2);
            Maps$FilteredEntryMap maps$FilteredEntryMap = new Maps$FilteredEntryMap(map2, predicate);
            map2 = maps$FilteredEntryMap;
        }
        return map2;
    }

    public static NavigableMap filterEntries(NavigableMap navigableMap, Predicate predicate) {
        Preconditions.checkNotNull(predicate);
        boolean bl2 = navigableMap instanceof Maps$FilteredEntryNavigableMap;
        if (bl2) {
            navigableMap = Maps.filterFiltered((Maps$FilteredEntryNavigableMap)navigableMap, predicate);
        } else {
            navigableMap = (NavigableMap)Preconditions.checkNotNull(navigableMap);
            Maps$FilteredEntryNavigableMap maps$FilteredEntryNavigableMap = new Maps$FilteredEntryNavigableMap(navigableMap, predicate);
            navigableMap = maps$FilteredEntryNavigableMap;
        }
        return navigableMap;
    }

    public static SortedMap filterEntries(SortedMap sortedMap, Predicate predicate) {
        Preconditions.checkNotNull(predicate);
        boolean bl2 = sortedMap instanceof Maps$FilteredEntrySortedMap;
        if (bl2) {
            sortedMap = Maps.filterFiltered((Maps$FilteredEntrySortedMap)sortedMap, predicate);
        } else {
            sortedMap = (SortedMap)Preconditions.checkNotNull(sortedMap);
            Maps$FilteredEntrySortedMap maps$FilteredEntrySortedMap = new Maps$FilteredEntrySortedMap(sortedMap, predicate);
            sortedMap = maps$FilteredEntrySortedMap;
        }
        return sortedMap;
    }

    private static BiMap filterFiltered(Maps$FilteredEntryBiMap biMap, Predicate predicate) {
        predicate = Predicates.and(biMap.predicate, predicate);
        biMap = biMap.unfiltered();
        Maps$FilteredEntryBiMap maps$FilteredEntryBiMap = new Maps$FilteredEntryBiMap(biMap, predicate);
        return maps$FilteredEntryBiMap;
    }

    private static Map filterFiltered(Maps$AbstractFilteredMap object, Predicate predicate) {
        Map map2 = ((Maps$AbstractFilteredMap)object).unfiltered;
        object = Predicates.and(((Maps$AbstractFilteredMap)object).predicate, predicate);
        Maps$FilteredEntryMap maps$FilteredEntryMap = new Maps$FilteredEntryMap(map2, (Predicate)object);
        return maps$FilteredEntryMap;
    }

    private static NavigableMap filterFiltered(Maps$FilteredEntryNavigableMap navigableMap, Predicate predicate) {
        predicate = Predicates.and(Maps$FilteredEntryNavigableMap.access$500(navigableMap), predicate);
        navigableMap = Maps$FilteredEntryNavigableMap.access$600(navigableMap);
        Maps$FilteredEntryNavigableMap maps$FilteredEntryNavigableMap = new Maps$FilteredEntryNavigableMap(navigableMap, predicate);
        return maps$FilteredEntryNavigableMap;
    }

    private static SortedMap filterFiltered(Maps$FilteredEntrySortedMap sortedMap, Predicate predicate) {
        predicate = Predicates.and(sortedMap.predicate, predicate);
        sortedMap = sortedMap.sortedMap();
        Maps$FilteredEntrySortedMap maps$FilteredEntrySortedMap = new Maps$FilteredEntrySortedMap(sortedMap, predicate);
        return maps$FilteredEntrySortedMap;
    }

    public static BiMap filterKeys(BiMap biMap, Predicate predicate) {
        Preconditions.checkNotNull(predicate);
        predicate = Maps.keyPredicateOnEntries(predicate);
        return Maps.filterEntries(biMap, predicate);
    }

    public static Map filterKeys(Map map2, Predicate predicate) {
        Preconditions.checkNotNull(predicate);
        Predicate predicate2 = Maps.keyPredicateOnEntries(predicate);
        boolean bl2 = map2 instanceof Maps$AbstractFilteredMap;
        if (bl2) {
            map2 = Maps.filterFiltered((Maps$AbstractFilteredMap)map2, predicate2);
        } else {
            map2 = (Map)Preconditions.checkNotNull(map2);
            Maps$FilteredKeyMap maps$FilteredKeyMap = new Maps$FilteredKeyMap(map2, predicate, predicate2);
            map2 = maps$FilteredKeyMap;
        }
        return map2;
    }

    public static NavigableMap filterKeys(NavigableMap navigableMap, Predicate predicate) {
        predicate = Maps.keyPredicateOnEntries(predicate);
        return Maps.filterEntries(navigableMap, predicate);
    }

    public static SortedMap filterKeys(SortedMap sortedMap, Predicate predicate) {
        predicate = Maps.keyPredicateOnEntries(predicate);
        return Maps.filterEntries(sortedMap, predicate);
    }

    public static BiMap filterValues(BiMap biMap, Predicate predicate) {
        predicate = Maps.valuePredicateOnEntries(predicate);
        return Maps.filterEntries(biMap, predicate);
    }

    public static Map filterValues(Map map2, Predicate predicate) {
        predicate = Maps.valuePredicateOnEntries(predicate);
        return Maps.filterEntries(map2, predicate);
    }

    public static NavigableMap filterValues(NavigableMap navigableMap, Predicate predicate) {
        predicate = Maps.valuePredicateOnEntries(predicate);
        return Maps.filterEntries(navigableMap, predicate);
    }

    public static SortedMap filterValues(SortedMap sortedMap, Predicate predicate) {
        predicate = Maps.valuePredicateOnEntries(predicate);
        return Maps.filterEntries(sortedMap, predicate);
    }

    public static ImmutableMap fromProperties(Properties properties) {
        boolean bl2;
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        Enumeration<?> enumeration = properties.propertyNames();
        while (bl2 = enumeration.hasMoreElements()) {
            Object object = enumeration.nextElement();
            Objects.requireNonNull(object);
            object = (String)object;
            String string2 = properties.getProperty((String)object);
            Objects.requireNonNull(string2);
            immutableMap$Builder.put(object, string2);
        }
        return immutableMap$Builder.buildOrThrow();
    }

    public static Map.Entry immutableEntry(Object object, Object object2) {
        ImmutableEntry immutableEntry = new ImmutableEntry(object, object2);
        return immutableEntry;
    }

    public static ImmutableMap immutableEnumMap(Map object) {
        boolean bl2 = object instanceof ImmutableEnumMap;
        if (bl2) {
            return (ImmutableEnumMap)object;
        }
        bl2 = (object = object.entrySet().iterator()).hasNext();
        if (!bl2) {
            return ImmutableMap.of();
        }
        Object object2 = (Map.Entry)object.next();
        Enum enum_ = (Enum)object2.getKey();
        object2 = object2.getValue();
        CollectPreconditions.checkEntryNotNull(enum_, object2);
        object2 = Collections.singletonMap(enum_, object2);
        EnumMap<Enum, Object> enumMap = new EnumMap<Enum, Object>((Map<Enum, Object>)object2);
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            enum_ = (Enum)object2.getKey();
            object2 = object2.getValue();
            CollectPreconditions.checkEntryNotNull(enum_, object2);
            enumMap.put(enum_, object2);
        }
        return ImmutableEnumMap.asImmutable(enumMap);
    }

    public static ImmutableMap indexMap(Collection object) {
        boolean bl2;
        int n3 = object.size();
        ImmutableMap$Builder immutableMap$Builder = new ImmutableMap$Builder(n3);
        object = object.iterator();
        n3 = 0;
        Integer n4 = null;
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            int n7 = n3 + 1;
            n4 = n3;
            immutableMap$Builder.put(e2, n4);
            n3 = n7;
        }
        return immutableMap$Builder.buildOrThrow();
    }

    public static Function keyFunction() {
        return Maps$EntryFunction.KEY;
    }

    public static Iterator keyIterator(Iterator iterator) {
        Maps$1 maps$1 = new Maps$1(iterator);
        return maps$1;
    }

    public static Object keyOrNull(Map.Entry entry) {
        entry = entry == null ? null : entry.getKey();
        return entry;
    }

    public static Predicate keyPredicateOnEntries(Predicate predicate) {
        Function function = Maps.keyFunction();
        return Predicates.compose(predicate, function);
    }

    public static ConcurrentMap newConcurrentMap() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        return concurrentHashMap;
    }

    public static EnumMap newEnumMap(Class clazz) {
        clazz = (Class)Preconditions.checkNotNull(clazz);
        EnumMap enumMap = new EnumMap(clazz);
        return enumMap;
    }

    public static EnumMap newEnumMap(Map map2) {
        EnumMap enumMap = new EnumMap(map2);
        return enumMap;
    }

    public static HashMap newHashMap() {
        HashMap hashMap = new HashMap();
        return hashMap;
    }

    public static HashMap newHashMap(Map map2) {
        HashMap hashMap = new HashMap(map2);
        return hashMap;
    }

    public static HashMap newHashMapWithExpectedSize(int n3) {
        n3 = Maps.capacity(n3);
        HashMap hashMap = new HashMap(n3);
        return hashMap;
    }

    public static IdentityHashMap newIdentityHashMap() {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        return identityHashMap;
    }

    public static LinkedHashMap newLinkedHashMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return linkedHashMap;
    }

    public static LinkedHashMap newLinkedHashMap(Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        return linkedHashMap;
    }

    public static LinkedHashMap newLinkedHashMapWithExpectedSize(int n3) {
        n3 = Maps.capacity(n3);
        LinkedHashMap linkedHashMap = new LinkedHashMap(n3);
        return linkedHashMap;
    }

    public static TreeMap newTreeMap() {
        TreeMap treeMap = new TreeMap();
        return treeMap;
    }

    public static TreeMap newTreeMap(Comparator comparator) {
        TreeMap treeMap = new TreeMap(comparator);
        return treeMap;
    }

    public static TreeMap newTreeMap(SortedMap sortedMap) {
        TreeMap treeMap = new TreeMap(sortedMap);
        return treeMap;
    }

    public static Comparator orNaturalOrder(Comparator comparator) {
        if (comparator != null) {
            return comparator;
        }
        return Ordering.natural();
    }

    public static void putAllImpl(Map map2, Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            entry = entry.getValue();
            map2.put(k2, entry);
        }
    }

    public static boolean removeEntryImpl(Collection collection, Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (!bl2) {
            return false;
        }
        object = Maps.unmodifiableEntry((Map.Entry)object);
        return collection.remove(object);
    }

    private static NavigableSet removeOnlyNavigableSet(NavigableSet navigableSet) {
        Maps$6 maps$6 = new Maps$6(navigableSet);
        return maps$6;
    }

    private static Set removeOnlySet(Set set) {
        Maps$4 maps$4 = new Maps$4(set);
        return maps$4;
    }

    private static SortedSet removeOnlySortedSet(SortedSet sortedSet) {
        Maps$5 maps$5 = new Maps$5(sortedSet);
        return maps$5;
    }

    public static boolean safeContainsKey(Map map2, Object object) {
        Preconditions.checkNotNull(map2);
        try {
            return map2.containsKey(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public static Object safeGet(Map map2, Object object) {
        Preconditions.checkNotNull(map2);
        try {
            return map2.get(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return null;
        }
    }

    public static Object safeRemove(Map map2, Object object) {
        Preconditions.checkNotNull(map2);
        try {
            return map2.remove(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return null;
        }
    }

    public static NavigableMap subMap(NavigableMap navigableMap, Range object) {
        Object object2;
        int n3;
        Object object3;
        Comparator comparator = navigableMap.comparator();
        boolean bl2 = false;
        if (comparator != null && (comparator = navigableMap.comparator()) != (object3 = Ordering.natural()) && (n3 = object.hasLowerBound()) && (n3 = object.hasUpperBound())) {
            comparator = navigableMap.comparator();
            n3 = comparator.compare(object3 = object.lowerEndpoint(), object2 = object.upperEndpoint());
            if (n3 <= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                comparator = null;
            }
            object3 = "map is using a custom comparator which is inconsistent with the natural ordering.";
            Preconditions.checkArgument(n3 != 0, object3);
        }
        if ((n3 = object.hasLowerBound()) && (n3 = object.hasUpperBound())) {
            boolean bl3;
            comparator = object.lowerEndpoint();
            object3 = object.lowerBoundType();
            if (object3 == (object2 = BoundType.CLOSED)) {
                bl3 = true;
            } else {
                bl3 = false;
                object3 = null;
            }
            Comparable comparable = object.upperEndpoint();
            object = object.upperBoundType();
            if (object == object2) {
                bl2 = true;
            }
            return navigableMap.subMap(comparator, bl3, comparable, bl2);
        }
        n3 = object.hasLowerBound();
        if (n3) {
            comparator = object.lowerEndpoint();
            if ((object = object.lowerBoundType()) == (object3 = BoundType.CLOSED)) {
                bl2 = true;
            }
            return navigableMap.tailMap(comparator, bl2);
        }
        n3 = object.hasUpperBound();
        if (n3) {
            comparator = object.upperEndpoint();
            if ((object = object.upperBoundType()) == (object3 = BoundType.CLOSED)) {
                bl2 = true;
            }
            return navigableMap.headMap(comparator, bl2);
        }
        return (NavigableMap)Preconditions.checkNotNull(navigableMap);
    }

    public static BiMap synchronizedBiMap(BiMap biMap) {
        return Synchronized.biMap(biMap, null);
    }

    public static NavigableMap synchronizedNavigableMap(NavigableMap navigableMap) {
        return Synchronized.navigableMap(navigableMap);
    }

    public static ImmutableMap toMap(Iterable iterable, Function function) {
        return Maps.toMap(iterable.iterator(), function);
    }

    public static ImmutableMap toMap(Iterator iterator, Function function) {
        boolean bl2;
        Preconditions.checkNotNull(function);
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            Object object = function.apply(e2);
            immutableMap$Builder.put(e2, object);
        }
        return immutableMap$Builder.buildKeepingLast();
    }

    public static String toStringImpl(Map object) {
        boolean bl2;
        int n3 = object.size();
        StringBuilder stringBuilder = Collections2.newStringBuilderForCollection(n3);
        stringBuilder.append('{');
        object = object.entrySet().iterator();
        boolean bl3 = true;
        while (bl2 = object.hasNext()) {
            String string2;
            Map.Entry entry = (Map.Entry)object.next();
            if (!bl3) {
                string2 = ", ";
                stringBuilder.append(string2);
            }
            string2 = entry.getKey();
            stringBuilder.append((Object)string2);
            stringBuilder.append('=');
            string2 = entry.getValue();
            stringBuilder.append((Object)string2);
            bl3 = false;
            string2 = null;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static Map transformEntries(Map map2, Maps$EntryTransformer maps$EntryTransformer) {
        Maps$TransformedEntriesMap maps$TransformedEntriesMap = new Maps$TransformedEntriesMap(map2, maps$EntryTransformer);
        return maps$TransformedEntriesMap;
    }

    public static NavigableMap transformEntries(NavigableMap navigableMap, Maps$EntryTransformer maps$EntryTransformer) {
        Maps$TransformedEntriesNavigableMap maps$TransformedEntriesNavigableMap = new Maps$TransformedEntriesNavigableMap(navigableMap, maps$EntryTransformer);
        return maps$TransformedEntriesNavigableMap;
    }

    public static SortedMap transformEntries(SortedMap sortedMap, Maps$EntryTransformer maps$EntryTransformer) {
        Maps$TransformedEntriesSortedMap maps$TransformedEntriesSortedMap = new Maps$TransformedEntriesSortedMap(sortedMap, maps$EntryTransformer);
        return maps$TransformedEntriesSortedMap;
    }

    public static Map.Entry transformEntry(Maps$EntryTransformer maps$EntryTransformer, Map.Entry entry) {
        Preconditions.checkNotNull(maps$EntryTransformer);
        Preconditions.checkNotNull(entry);
        Maps$12 maps$12 = new Maps$12(entry, maps$EntryTransformer);
        return maps$12;
    }

    public static Map transformValues(Map map2, Function object) {
        object = Maps.asEntryTransformer((Function)object);
        return Maps.transformEntries(map2, (Maps$EntryTransformer)object);
    }

    public static NavigableMap transformValues(NavigableMap navigableMap, Function object) {
        object = Maps.asEntryTransformer((Function)object);
        return Maps.transformEntries(navigableMap, (Maps$EntryTransformer)object);
    }

    public static SortedMap transformValues(SortedMap sortedMap, Function object) {
        object = Maps.asEntryTransformer((Function)object);
        return Maps.transformEntries(sortedMap, (Maps$EntryTransformer)object);
    }

    public static ImmutableMap uniqueIndex(Iterable object, Function function) {
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            Iterator iterator = object.iterator();
            object = ImmutableMap.builderWithExpectedSize(((Collection)object).size());
            return Maps.uniqueIndex(iterator, function, (ImmutableMap$Builder)object);
        }
        return Maps.uniqueIndex(object.iterator(), function);
    }

    public static ImmutableMap uniqueIndex(Iterator iterator, Function function) {
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        return Maps.uniqueIndex(iterator, function, immutableMap$Builder);
    }

    private static ImmutableMap uniqueIndex(Iterator iterator, Function object, ImmutableMap$Builder object2) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            Object object3 = object.apply(e2);
            ((ImmutableMap$Builder)object2).put(object3, e2);
        }
        try {
            return ((ImmutableMap$Builder)object2).buildOrThrow();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object2 = new StringBuilder();
            String string2 = illegalArgumentException.getMessage();
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(". To index multiple values under a key, use Multimaps.index.");
            string2 = ((StringBuilder)object2).toString();
            object = new IllegalArgumentException(string2);
            throw object;
        }
    }

    public static BiMap unmodifiableBiMap(BiMap biMap) {
        Maps$UnmodifiableBiMap maps$UnmodifiableBiMap = new Maps$UnmodifiableBiMap(biMap, null);
        return maps$UnmodifiableBiMap;
    }

    public static Map.Entry unmodifiableEntry(Map.Entry entry) {
        Preconditions.checkNotNull(entry);
        Maps$7 maps$7 = new Maps$7(entry);
        return maps$7;
    }

    public static UnmodifiableIterator unmodifiableEntryIterator(Iterator iterator) {
        Maps$8 maps$8 = new Maps$8(iterator);
        return maps$8;
    }

    public static Set unmodifiableEntrySet(Set set) {
        set = Collections.unmodifiableSet(set);
        Maps$UnmodifiableEntrySet maps$UnmodifiableEntrySet = new Maps$UnmodifiableEntrySet(set);
        return maps$UnmodifiableEntrySet;
    }

    private static Map unmodifiableMap(Map map2) {
        boolean bl2 = map2 instanceof SortedMap;
        if (bl2) {
            return Collections.unmodifiableSortedMap((SortedMap)map2);
        }
        return Collections.unmodifiableMap(map2);
    }

    public static NavigableMap unmodifiableNavigableMap(NavigableMap navigableMap) {
        Preconditions.checkNotNull(navigableMap);
        boolean bl2 = navigableMap instanceof Maps$UnmodifiableNavigableMap;
        if (bl2) {
            return navigableMap;
        }
        Maps$UnmodifiableNavigableMap maps$UnmodifiableNavigableMap = new Maps$UnmodifiableNavigableMap(navigableMap);
        return maps$UnmodifiableNavigableMap;
    }

    private static Map.Entry unmodifiableOrNull(Map.Entry entry) {
        entry = entry == null ? null : Maps.unmodifiableEntry(entry);
        return entry;
    }

    public static Function valueFunction() {
        return Maps$EntryFunction.VALUE;
    }

    public static Iterator valueIterator(Iterator iterator) {
        Maps$2 maps$2 = new Maps$2(iterator);
        return maps$2;
    }

    public static Object valueOrNull(Map.Entry entry) {
        entry = entry == null ? null : entry.getValue();
        return entry;
    }

    public static Predicate valuePredicateOnEntries(Predicate predicate) {
        Function function = Maps.valueFunction();
        return Predicates.compose(predicate, function);
    }
}

