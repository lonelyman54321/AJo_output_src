/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Collections2$FilteredCollection;
import com.google.common.collect.Collections2$OrderedPermutationCollection;
import com.google.common.collect.Collections2$PermutationCollection;
import com.google.common.collect.Collections2$TransformedCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class Collections2 {
    private Collections2() {
    }

    public static /* synthetic */ boolean access$000(List list, List list2) {
        return Collections2.isPermutation(list, list2);
    }

    public static boolean containsAllImpl(Collection collection, Collection object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = collection.contains(e2);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    private static ObjectCountHashMap counts(Collection object) {
        boolean bl2;
        ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            int n3 = objectCountHashMap.get(e2) + 1;
            objectCountHashMap.put(e2, n3);
        }
        return objectCountHashMap;
    }

    public static Collection filter(Collection collection, Predicate predicate) {
        boolean bl2 = collection instanceof Collections2$FilteredCollection;
        if (bl2) {
            return ((Collections2$FilteredCollection)collection).createCombined(predicate);
        }
        collection = (Collection)Preconditions.checkNotNull(collection);
        predicate = (Predicate)Preconditions.checkNotNull(predicate);
        Collections2$FilteredCollection collections2$FilteredCollection = new Collections2$FilteredCollection(collection, predicate);
        return collections2$FilteredCollection;
    }

    private static boolean isPermutation(List list, List list2) {
        int n3;
        int n4;
        int n7 = list.size();
        if (n7 != (n4 = list2.size())) {
            return false;
        }
        ObjectCountHashMap objectCountHashMap = Collections2.counts(list);
        ObjectCountHashMap objectCountHashMap2 = Collections2.counts(list2);
        int n8 = list.size();
        if (n8 != (n3 = list2.size())) {
            return false;
        }
        list2 = null;
        for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
            Object object;
            int n10;
            n8 = objectCountHashMap.getValue(n3);
            if (n8 == (n10 = objectCountHashMap2.get(object = objectCountHashMap.getKey(n3)))) continue;
            return false;
        }
        return true;
    }

    public static StringBuilder newStringBuilderForCollection(int n3) {
        CollectPreconditions.checkNonnegative(n3, "size");
        n3 = (int)Math.min((long)n3 * (long)8, 0x40000000L);
        StringBuilder stringBuilder = new StringBuilder(n3);
        return stringBuilder;
    }

    public static Collection orderedPermutations(Iterable iterable) {
        Ordering ordering = Ordering.natural();
        return Collections2.orderedPermutations(iterable, ordering);
    }

    public static Collection orderedPermutations(Iterable iterable, Comparator comparator) {
        Collections2$OrderedPermutationCollection collections2$OrderedPermutationCollection = new Collections2$OrderedPermutationCollection(iterable, comparator);
        return collections2$OrderedPermutationCollection;
    }

    public static Collection permutations(Collection collection) {
        collection = ImmutableList.copyOf(collection);
        Collections2$PermutationCollection collections2$PermutationCollection = new Collections2$PermutationCollection((ImmutableList)collection);
        return collections2$PermutationCollection;
    }

    public static boolean safeContains(Collection collection, Object object) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public static boolean safeRemove(Collection collection, Object object) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.remove(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public static String toStringImpl(Collection collection) {
        boolean bl2;
        int n3 = collection.size();
        StringBuilder stringBuilder = Collections2.newStringBuilderForCollection(n3);
        char c2 = '[';
        stringBuilder.append(c2);
        Iterator iterator = collection.iterator();
        boolean bl3 = true;
        while (bl2 = iterator.hasNext()) {
            String string2;
            Object e2 = iterator.next();
            if (!bl3) {
                string2 = ", ";
                stringBuilder.append(string2);
            }
            if (e2 == collection) {
                string2 = "(this Collection)";
                stringBuilder.append(string2);
            } else {
                stringBuilder.append(e2);
            }
            bl3 = false;
            string2 = null;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public static Collection transform(Collection collection, Function function) {
        Collections2$TransformedCollection collections2$TransformedCollection = new Collections2$TransformedCollection(collection, function);
        return collections2$TransformedCollection;
    }
}

