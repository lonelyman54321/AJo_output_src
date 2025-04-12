/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators$1;
import com.google.common.collect.Iterators$10;
import com.google.common.collect.Iterators$11;
import com.google.common.collect.Iterators$2;
import com.google.common.collect.Iterators$3;
import com.google.common.collect.Iterators$4;
import com.google.common.collect.Iterators$5;
import com.google.common.collect.Iterators$6;
import com.google.common.collect.Iterators$7;
import com.google.common.collect.Iterators$8;
import com.google.common.collect.Iterators$9;
import com.google.common.collect.Iterators$ArrayItr;
import com.google.common.collect.Iterators$ConcatenatedIterator;
import com.google.common.collect.Iterators$EmptyModifiableIterator;
import com.google.common.collect.Iterators$MergingIterator;
import com.google.common.collect.Iterators$PeekingImpl;
import com.google.common.collect.Lists;
import com.google.common.collect.PeekingIterator;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class Iterators {
    private Iterators() {
    }

    public static boolean addAll(Collection collection, Iterator iterator) {
        boolean bl2;
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(iterator);
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            bl2 = collection.add(e2);
            bl3 |= bl2;
        }
        return bl3;
    }

    public static int advance(Iterator iterator, int n3) {
        int n4;
        Preconditions.checkNotNull(iterator);
        boolean bl2 = n3 >= 0;
        String string2 = "numberToAdvance must be nonnegative";
        Preconditions.checkArgument(bl2, string2);
        for (n4 = 0; n4 < n3 && (bl2 = iterator.hasNext()); ++n4) {
            iterator.next();
        }
        return n4;
    }

    public static boolean all(Iterator iterator, Predicate predicate) {
        boolean bl2;
        Preconditions.checkNotNull(predicate);
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            bl2 = predicate.apply(e2);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public static boolean any(Iterator iterator, Predicate predicate) {
        int n3;
        int n4 = Iterators.indexOf(iterator, predicate);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            iterator = null;
        }
        return n4 != 0;
    }

    public static Enumeration asEnumeration(Iterator iterator) {
        Preconditions.checkNotNull(iterator);
        Iterators$11 iterators$11 = new Iterators$11(iterator);
        return iterators$11;
    }

    public static ListIterator cast(Iterator iterator) {
        return (ListIterator)iterator;
    }

    public static void checkNonnegative(int n3) {
        if (n3 >= 0) {
            return;
        }
        String string2 = Gj0.b(n3, "position (", ") must not be negative");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static void clear(Iterator iterator) {
        boolean bl2;
        Preconditions.checkNotNull(iterator);
        while (bl2 = iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static Iterator concat(Iterator iterator) {
        Iterators$ConcatenatedIterator iterators$ConcatenatedIterator = new Iterators$ConcatenatedIterator(iterator);
        return iterators$ConcatenatedIterator;
    }

    public static Iterator concat(Iterator iterator, Iterator iterator2) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(iterator2);
        Iterator[] iteratorArray = new Iterator[]{iterator, iterator2};
        return Iterators.concat(Iterators.consumingForArray(iteratorArray));
    }

    public static Iterator concat(Iterator iterator, Iterator iterator2, Iterator iterator3) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(iterator2);
        Preconditions.checkNotNull(iterator3);
        Iterator[] iteratorArray = new Iterator[]{iterator, iterator2, iterator3};
        return Iterators.concat(Iterators.consumingForArray(iteratorArray));
    }

    public static Iterator concat(Iterator iterator, Iterator iterator2, Iterator iterator3, Iterator iterator4) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(iterator2);
        Preconditions.checkNotNull(iterator3);
        Preconditions.checkNotNull(iterator4);
        Iterator[] iteratorArray = new Iterator[]{iterator, iterator2, iterator3, iterator4};
        return Iterators.concat(Iterators.consumingForArray(iteratorArray));
    }

    public static Iterator concat(Iterator ... iteratorArray) {
        int n3 = iteratorArray.length;
        return Iterators.concatNoDefensiveCopy(Arrays.copyOf(iteratorArray, n3));
    }

    public static Iterator concatNoDefensiveCopy(Iterator ... iteratorArray) {
        for (Iterator iterator : (Iterator[])Preconditions.checkNotNull(iteratorArray)) {
            Preconditions.checkNotNull(iterator);
        }
        return Iterators.concat(Iterators.consumingForArray(iteratorArray));
    }

    private static Iterator consumingForArray(Iterator ... iteratorArray) {
        Iterators$3 iterators$3 = new Iterators$3(iteratorArray);
        return iterators$3;
    }

    public static Iterator consumingIterator(Iterator iterator) {
        Preconditions.checkNotNull(iterator);
        Iterators$8 iterators$8 = new Iterators$8(iterator);
        return iterators$8;
    }

    public static boolean contains(Iterator iterator, Object object) {
        boolean bl2 = true;
        if (object == null) {
            boolean bl3;
            while (bl3 = iterator.hasNext()) {
                object = iterator.next();
                if (object != null) continue;
                return bl2;
            }
        } else {
            boolean bl4;
            while (bl4 = iterator.hasNext()) {
                Object e2 = iterator.next();
                bl4 = object.equals(e2);
                if (!bl4) continue;
                return bl2;
            }
        }
        return false;
    }

    public static Iterator cycle(Iterable iterable) {
        Preconditions.checkNotNull(iterable);
        Iterators$2 iterators$2 = new Iterators$2(iterable);
        return iterators$2;
    }

    public static Iterator cycle(Object ... objectArray) {
        return Iterators.cycle(Lists.newArrayList(objectArray));
    }

    public static boolean elementsEqual(Iterator iterator, Iterator iterator2) {
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            Object e2;
            bl2 = iterator2.hasNext();
            if (!bl2) {
                return false;
            }
            Object e5 = iterator.next();
            bl2 = Objects.equal(e5, e2 = iterator2.next());
            if (bl2) continue;
            return false;
        }
        return iterator2.hasNext() ^ true;
    }

    public static UnmodifiableIterator emptyIterator() {
        return Iterators.emptyListIterator();
    }

    public static UnmodifiableListIterator emptyListIterator() {
        return Iterators$ArrayItr.EMPTY;
    }

    public static Iterator emptyModifiableIterator() {
        return Iterators$EmptyModifiableIterator.INSTANCE;
    }

    public static UnmodifiableIterator filter(Iterator iterator, Predicate predicate) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        Iterators$5 iterators$5 = new Iterators$5(iterator, predicate);
        return iterators$5;
    }

    public static UnmodifiableIterator filter(Iterator iterator, Class object) {
        object = Predicates.instanceOf((Class)object);
        return Iterators.filter(iterator, (Predicate)object);
    }

    public static Object find(Iterator object, Predicate predicate) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(predicate);
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            boolean bl3 = predicate.apply(e2);
            if (!bl3) continue;
            return e2;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public static Object find(Iterator iterator, Predicate predicate, Object object) {
        boolean bl2;
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            boolean bl3 = predicate.apply(e2);
            if (!bl3) continue;
            return e2;
        }
        return object;
    }

    public static UnmodifiableIterator forArray(Object ... objectArray) {
        int n3 = objectArray.length;
        return Iterators.forArray(objectArray, 0, n3, 0);
    }

    public static UnmodifiableListIterator forArray(Object[] objectArray, int n3, int n4, int n7) {
        Iterators$ArrayItr iterators$ArrayItr;
        int n8;
        if (n4 >= 0) {
            n8 = 1;
        } else {
            n8 = 0;
            iterators$ArrayItr = null;
        }
        Preconditions.checkArgument(n8 != 0);
        n8 = n3 + n4;
        int n10 = objectArray.length;
        Preconditions.checkPositionIndexes(n3, n8, n10);
        Preconditions.checkPositionIndex(n7, n4);
        if (n4 == 0) {
            return Iterators.emptyListIterator();
        }
        iterators$ArrayItr = new Iterators$ArrayItr(objectArray, n3, n4, n7);
        return iterators$ArrayItr;
    }

    public static UnmodifiableIterator forEnumeration(Enumeration enumeration) {
        Preconditions.checkNotNull(enumeration);
        Iterators$10 iterators$10 = new Iterators$10(enumeration);
        return iterators$10;
    }

    public static int frequency(Iterator iterator, Object object) {
        boolean bl2;
        int n3 = 0;
        while (bl2 = Iterators.contains(iterator, object)) {
            ++n3;
        }
        return n3;
    }

    public static Object get(Iterator object, int n3) {
        Iterators.checkNonnegative(n3);
        int n4 = Iterators.advance((Iterator)object, n3);
        boolean bl2 = object.hasNext();
        if (bl2) {
            return object.next();
        }
        String string2 = z41.a("position (", ") must be less than the number of elements that remained (", ")", n3, n4);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public static Object get(Iterator iterator, int n3, Object object) {
        Iterators.checkNonnegative(n3);
        Iterators.advance(iterator, n3);
        return Iterators.getNext(iterator, object);
    }

    public static Object getLast(Iterator iterator) {
        Object e2;
        boolean bl2;
        do {
            e2 = iterator.next();
        } while (bl2 = iterator.hasNext());
        return e2;
    }

    public static Object getLast(Iterator iterator, Object object) {
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            object = Iterators.getLast(iterator);
        }
        return object;
    }

    public static Object getNext(Iterator iterator, Object object) {
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            object = iterator.next();
        }
        return object;
    }

    public static Object getOnlyElement(Iterator object) {
        int n3;
        Object object2 = object.next();
        boolean bl2 = object.hasNext();
        if (!bl2) {
            return object2;
        }
        String string2 = "expected one element but was: <";
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(object2);
        object2 = null;
        for (int i3 = 0; i3 < (n3 = 4) && (n3 = (int)(object.hasNext() ? 1 : 0)) != 0; ++i3) {
            stringBuilder.append(", ");
            string2 = object.next();
            stringBuilder.append((Object)string2);
        }
        boolean bl3 = object.hasNext();
        if (bl3) {
            object = ", ...";
            stringBuilder.append((String)object);
        }
        stringBuilder.append('>');
        object2 = stringBuilder.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static Object getOnlyElement(Iterator iterator, Object object) {
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            object = Iterators.getOnlyElement(iterator);
        }
        return object;
    }

    public static int indexOf(Iterator iterator, Predicate predicate) {
        boolean bl2;
        Preconditions.checkNotNull(predicate, "predicate");
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            bl2 = predicate.apply(e2);
            if (bl2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static Iterator limit(Iterator iterator, int n3) {
        Iterators$7 iterators$7;
        boolean bl2;
        Preconditions.checkNotNull(iterator);
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            iterators$7 = null;
        }
        Preconditions.checkArgument(bl2, "limit is negative");
        iterators$7 = new Iterators$7(n3, iterator);
        return iterators$7;
    }

    public static UnmodifiableIterator mergeSorted(Iterable iterable, Comparator comparator) {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        Iterators$MergingIterator iterators$MergingIterator = new Iterators$MergingIterator(iterable, comparator);
        return iterators$MergingIterator;
    }

    public static UnmodifiableIterator paddedPartition(Iterator iterator, int n3) {
        return Iterators.partitionImpl(iterator, n3, true);
    }

    public static UnmodifiableIterator partition(Iterator iterator, int n3) {
        return Iterators.partitionImpl(iterator, n3, false);
    }

    private static UnmodifiableIterator partitionImpl(Iterator iterator, int n3, boolean bl2) {
        Iterators$4 iterators$4;
        boolean bl3;
        Preconditions.checkNotNull(iterator);
        if (n3 > 0) {
            bl3 = true;
        } else {
            bl3 = false;
            iterators$4 = null;
        }
        Preconditions.checkArgument(bl3);
        iterators$4 = new Iterators$4(iterator, n3, bl2);
        return iterators$4;
    }

    public static PeekingIterator peekingIterator(PeekingIterator peekingIterator) {
        return (PeekingIterator)Preconditions.checkNotNull(peekingIterator);
    }

    public static PeekingIterator peekingIterator(Iterator iterator) {
        boolean bl2 = iterator instanceof Iterators$PeekingImpl;
        if (bl2) {
            return (Iterators$PeekingImpl)iterator;
        }
        Iterators$PeekingImpl iterators$PeekingImpl = new Iterators$PeekingImpl(iterator);
        return iterators$PeekingImpl;
    }

    public static Object pollNext(Iterator iterator) {
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            Object e2 = iterator.next();
            iterator.remove();
            return e2;
        }
        return null;
    }

    public static boolean removeAll(Iterator iterator, Collection collection) {
        boolean bl2;
        Preconditions.checkNotNull(collection);
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            bl2 = collection.contains(e2);
            if (!bl2) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public static boolean removeIf(Iterator iterator, Predicate predicate) {
        boolean bl2;
        Preconditions.checkNotNull(predicate);
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            bl2 = predicate.apply(e2);
            if (!bl2) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public static boolean retainAll(Iterator iterator, Collection collection) {
        boolean bl2;
        Preconditions.checkNotNull(collection);
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            bl2 = collection.contains(e2);
            if (bl2) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public static UnmodifiableIterator singletonIterator(Object object) {
        Iterators$9 iterators$9 = new Iterators$9(object);
        return iterators$9;
    }

    public static int size(Iterator iterator) {
        boolean bl2;
        long l2 = 0L;
        while (bl2 = iterator.hasNext()) {
            iterator.next();
            long l3 = 1L;
            l2 += l3;
        }
        return Ints.saturatedCast(l2);
    }

    public static Object[] toArray(Iterator iterator, Class clazz) {
        return Iterables.toArray((Iterable)Lists.newArrayList(iterator), clazz);
    }

    public static String toString(Iterator iterator) {
        boolean bl2;
        String string2 = "[";
        StringBuilder stringBuilder = new StringBuilder(string2);
        boolean bl3 = true;
        while (bl2 = iterator.hasNext()) {
            if (!bl3) {
                string2 = ", ";
                stringBuilder.append(string2);
            }
            string2 = iterator.next();
            stringBuilder.append((Object)string2);
            bl3 = false;
            string2 = null;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public static Iterator transform(Iterator iterator, Function function) {
        Preconditions.checkNotNull(function);
        Iterators$6 iterators$6 = new Iterators$6(iterator, function);
        return iterators$6;
    }

    public static Optional tryFind(Iterator iterator, Predicate predicate) {
        boolean bl2;
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            boolean bl3 = predicate.apply(e2);
            if (!bl3) continue;
            return Optional.of(e2);
        }
        return Optional.absent();
    }

    public static UnmodifiableIterator unmodifiableIterator(UnmodifiableIterator unmodifiableIterator) {
        return (UnmodifiableIterator)Preconditions.checkNotNull(unmodifiableIterator);
    }

    public static UnmodifiableIterator unmodifiableIterator(Iterator iterator) {
        Preconditions.checkNotNull(iterator);
        boolean bl2 = iterator instanceof UnmodifiableIterator;
        if (bl2) {
            return (UnmodifiableIterator)iterator;
        }
        Iterators$1 iterators$1 = new Iterators$1(iterator);
        return iterators$1;
    }
}

