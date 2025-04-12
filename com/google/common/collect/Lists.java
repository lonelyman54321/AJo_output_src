/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.CartesianList;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists$1;
import com.google.common.collect.Lists$2;
import com.google.common.collect.Lists$AbstractListWrapper;
import com.google.common.collect.Lists$CharSequenceAsList;
import com.google.common.collect.Lists$OnePlusArrayList;
import com.google.common.collect.Lists$Partition;
import com.google.common.collect.Lists$RandomAccessPartition;
import com.google.common.collect.Lists$RandomAccessReverseList;
import com.google.common.collect.Lists$ReverseList;
import com.google.common.collect.Lists$StringAsImmutableList;
import com.google.common.collect.Lists$TransformingRandomAccessList;
import com.google.common.collect.Lists$TransformingSequentialList;
import com.google.common.collect.Lists$TwoPlusArrayList;
import com.google.common.primitives.Ints;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Lists {
    private Lists() {
    }

    public static boolean addAllImpl(List object, int n3, Iterable iterable) {
        boolean bl2;
        object = object.listIterator(n3);
        Iterator iterator = iterable.iterator();
        boolean bl3 = false;
        iterable = null;
        while (bl2 = iterator.hasNext()) {
            iterable = iterator.next();
            object.add(iterable);
            bl3 = true;
        }
        return bl3;
    }

    public static List asList(Object object, Object object2, Object[] objectArray) {
        Lists$TwoPlusArrayList lists$TwoPlusArrayList = new Lists$TwoPlusArrayList(object, object2, objectArray);
        return lists$TwoPlusArrayList;
    }

    public static List asList(Object object, Object[] objectArray) {
        Lists$OnePlusArrayList lists$OnePlusArrayList = new Lists$OnePlusArrayList(object, objectArray);
        return lists$OnePlusArrayList;
    }

    public static List cartesianProduct(List list) {
        return CartesianList.create(list);
    }

    public static List cartesianProduct(List ... listArray) {
        return Lists.cartesianProduct(Arrays.asList(listArray));
    }

    public static List cast(Iterable iterable) {
        return (List)iterable;
    }

    public static ImmutableList charactersOf(String string2) {
        string2 = (String)Preconditions.checkNotNull(string2);
        Lists$StringAsImmutableList lists$StringAsImmutableList = new Lists$StringAsImmutableList(string2);
        return lists$StringAsImmutableList;
    }

    public static List charactersOf(CharSequence charSequence) {
        charSequence = (CharSequence)Preconditions.checkNotNull(charSequence);
        Lists$CharSequenceAsList lists$CharSequenceAsList = new Lists$CharSequenceAsList(charSequence);
        return lists$CharSequenceAsList;
    }

    public static int computeArrayListCapacity(int n3) {
        CollectPreconditions.checkNonnegative(n3, "arraySize");
        long l2 = (long)n3 + (long)5;
        long l3 = n3 / 10;
        return Ints.saturatedCast(l2 + l3);
    }

    public static boolean equalsImpl(List object, Object iterator) {
        int n3;
        Object object2 = Preconditions.checkNotNull(object);
        boolean bl2 = true;
        if (iterator == object2) {
            return bl2;
        }
        int n4 = iterator instanceof List;
        if (n4 == 0) {
            return false;
        }
        iterator = (List)((Object)iterator);
        n4 = object.size();
        if (n4 != (n3 = iterator.size())) {
            return false;
        }
        n3 = object instanceof RandomAccess;
        if (n3 != 0 && (n3 = iterator instanceof RandomAccess) != 0) {
            for (n3 = 0; n3 < n4; ++n3) {
                Object e2;
                Object e5 = ((List)object).get(n3);
                boolean bl3 = Objects.equal(e5, e2 = ((List)((Object)iterator)).get(n3));
                if (bl3) continue;
                return false;
            }
            return bl2;
        }
        object = object.iterator();
        iterator = iterator.iterator();
        return Iterators.elementsEqual((Iterator)object, iterator);
    }

    public static int hashCodeImpl(List object) {
        int n3;
        object = object.iterator();
        int n4 = 1;
        while ((n3 = object.hasNext()) != 0) {
            Object e2 = object.next();
            n4 *= 31;
            if (e2 == null) {
                n3 = 0;
                e2 = null;
            } else {
                n3 = e2.hashCode();
            }
            n4 = ~(~(n4 + n3));
        }
        return n4;
    }

    public static int indexOfImpl(List object, Object object2) {
        boolean bl2 = object instanceof RandomAccess;
        if (bl2) {
            return Lists.indexOfRandomAccess((List)object, object2);
        }
        object = object.listIterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = Objects.equal(object2, e2);
            if (!bl2) continue;
            return object.previousIndex();
        }
        return -1;
    }

    private static int indexOfRandomAccess(List list, Object object) {
        int n3;
        int n4 = list.size();
        if (object == null) {
            for (n3 = 0; n3 < n4; ++n3) {
                object = list.get(n3);
                if (object != null) continue;
                return n3;
            }
        } else {
            while (n3 < n4) {
                Object e2 = list.get(n3);
                boolean bl2 = object.equals(e2);
                if (bl2) {
                    return n3;
                }
                ++n3;
            }
        }
        return -1;
    }

    public static int lastIndexOfImpl(List object, Object object2) {
        int n3 = object instanceof RandomAccess;
        if (n3 != 0) {
            return Lists.lastIndexOfRandomAccess((List)object, object2);
        }
        n3 = object.size();
        object = object.listIterator(n3);
        while ((n3 = (int)(object.hasPrevious() ? 1 : 0)) != 0) {
            Object e2 = object.previous();
            n3 = (int)(Objects.equal(object2, e2) ? 1 : 0);
            if (n3 == 0) continue;
            return object.nextIndex();
        }
        return -1;
    }

    private static int lastIndexOfRandomAccess(List list, Object object) {
        if (object == null) {
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Object e2 = list.get(i3);
                if (e2 != null) continue;
                return i3;
            }
        } else {
            for (int i8 = list.size() + -1; i8 >= 0; i8 += -1) {
                Object e5 = list.get(i8);
                boolean bl2 = object.equals(e5);
                if (!bl2) continue;
                return i8;
            }
        }
        return -1;
    }

    public static ListIterator listIteratorImpl(List list, int n3) {
        Lists$AbstractListWrapper lists$AbstractListWrapper = new Lists$AbstractListWrapper(list);
        return lists$AbstractListWrapper.listIterator(n3);
    }

    public static ArrayList newArrayList() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public static ArrayList newArrayList(Iterable object) {
        ArrayList arrayList;
        Preconditions.checkNotNull(object);
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            object = (Collection)object;
            arrayList = new ArrayList(object);
        } else {
            object = object.iterator();
            arrayList = Lists.newArrayList((Iterator)object);
        }
        return arrayList;
    }

    public static ArrayList newArrayList(Iterator iterator) {
        ArrayList arrayList = Lists.newArrayList();
        Iterators.addAll(arrayList, iterator);
        return arrayList;
    }

    public static ArrayList newArrayList(Object ... objectArray) {
        Preconditions.checkNotNull(objectArray);
        int n3 = Lists.computeArrayListCapacity(objectArray.length);
        ArrayList arrayList = new ArrayList(n3);
        Collections.addAll(arrayList, objectArray);
        return arrayList;
    }

    public static ArrayList newArrayListWithCapacity(int n3) {
        CollectPreconditions.checkNonnegative(n3, "initialArraySize");
        ArrayList arrayList = new ArrayList(n3);
        return arrayList;
    }

    public static ArrayList newArrayListWithExpectedSize(int n3) {
        n3 = Lists.computeArrayListCapacity(n3);
        ArrayList arrayList = new ArrayList(n3);
        return arrayList;
    }

    public static CopyOnWriteArrayList newCopyOnWriteArrayList() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        return copyOnWriteArrayList;
    }

    public static CopyOnWriteArrayList newCopyOnWriteArrayList(Iterable collection) {
        boolean bl2 = collection instanceof Collection;
        collection = bl2 ? (Collection)collection : Lists.newArrayList(collection);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(collection);
        return copyOnWriteArrayList;
    }

    public static LinkedList newLinkedList() {
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }

    public static LinkedList newLinkedList(Iterable iterable) {
        LinkedList linkedList = Lists.newLinkedList();
        Iterables.addAll(linkedList, iterable);
        return linkedList;
    }

    public static List partition(List list, int n3) {
        Lists$Partition lists$Partition;
        boolean bl2;
        Preconditions.checkNotNull(list);
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            lists$Partition = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = list instanceof RandomAccess;
        lists$Partition = bl2 ? new Lists$RandomAccessPartition(list, n3) : new Lists$Partition(list, n3);
        return lists$Partition;
    }

    public static List reverse(List list) {
        boolean bl2 = list instanceof ImmutableList;
        if (bl2) {
            return ((ImmutableList)list).reverse();
        }
        bl2 = list instanceof Lists$ReverseList;
        if (bl2) {
            return ((Lists$ReverseList)list).getForwardList();
        }
        bl2 = list instanceof RandomAccess;
        if (bl2) {
            Lists$RandomAccessReverseList lists$RandomAccessReverseList = new Lists$RandomAccessReverseList(list);
            return lists$RandomAccessReverseList;
        }
        Lists$ReverseList lists$ReverseList = new Lists$ReverseList(list);
        return lists$ReverseList;
    }

    public static List subListImpl(List list, int n3, int n4) {
        boolean bl2 = list instanceof RandomAccess;
        Lists$AbstractListWrapper lists$AbstractListWrapper = bl2 ? new Lists$1(list) : new Lists$2(list);
        return lists$AbstractListWrapper.subList(n3, n4);
    }

    public static List transform(List list, Function function) {
        boolean bl2 = list instanceof RandomAccess;
        AbstractList abstractList = bl2 ? new Lists$TransformingRandomAccessList(list, function) : new Lists$TransformingSequentialList(list, function);
        return abstractList;
    }
}

