/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Iterables$1;
import com.google.common.collect.Iterables$2;
import com.google.common.collect.Iterables$3;
import com.google.common.collect.Iterables$4;
import com.google.common.collect.Iterables$5;
import com.google.common.collect.Iterables$6;
import com.google.common.collect.Iterables$7;
import com.google.common.collect.Iterables$8;
import com.google.common.collect.Iterables$9;
import com.google.common.collect.Iterables$UnmodifiableIterable;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.ObjectArrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

public final class Iterables {
    private Iterables() {
    }

    public static boolean addAll(Collection collection, Iterable object) {
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            object = (Collection)object;
            return collection.addAll(object);
        }
        object = ((Iterable)Preconditions.checkNotNull(object)).iterator();
        return Iterators.addAll(collection, (Iterator)object);
    }

    public static boolean all(Iterable iterable, Predicate predicate) {
        return Iterators.all(iterable.iterator(), predicate);
    }

    public static boolean any(Iterable iterable, Predicate predicate) {
        return Iterators.any(iterable.iterator(), predicate);
    }

    private static Collection castOrCopyToCollection(Iterable collection) {
        boolean bl2 = collection instanceof Collection;
        collection = bl2 ? (Collection)collection : Lists.newArrayList(collection.iterator());
        return collection;
    }

    public static Iterable concat(Iterable iterable) {
        return FluentIterable.concat(iterable);
    }

    public static Iterable concat(Iterable iterable, Iterable iterable2) {
        return FluentIterable.concat(iterable, iterable2);
    }

    public static Iterable concat(Iterable iterable, Iterable iterable2, Iterable iterable3) {
        return FluentIterable.concat(iterable, iterable2, iterable3);
    }

    public static Iterable concat(Iterable iterable, Iterable iterable2, Iterable iterable3, Iterable iterable4) {
        return FluentIterable.concat(iterable, iterable2, iterable3, iterable4);
    }

    public static Iterable concat(Iterable ... iterableArray) {
        return FluentIterable.concat(iterableArray);
    }

    public static Iterable consumingIterable(Iterable iterable) {
        Preconditions.checkNotNull(iterable);
        Iterables$8 iterables$8 = new Iterables$8(iterable);
        return iterables$8;
    }

    public static boolean contains(Iterable iterable, Object object) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            return Collections2.safeContains((Collection)iterable, object);
        }
        return Iterators.contains(iterable.iterator(), object);
    }

    public static Iterable cycle(Iterable iterable) {
        Preconditions.checkNotNull(iterable);
        Iterables$1 iterables$1 = new Iterables$1(iterable);
        return iterables$1;
    }

    public static Iterable cycle(Object ... objectArray) {
        return Iterables.cycle(Lists.newArrayList(objectArray));
    }

    public static boolean elementsEqual(Iterable object, Iterable object2) {
        int n3 = object instanceof Collection;
        if (n3 != 0 && (n3 = object2 instanceof Collection) != 0) {
            int n4;
            Object object3 = object;
            object3 = (Collection)object;
            Object object4 = object2;
            object4 = (Collection)object2;
            n3 = object3.size();
            if (n3 != (n4 = object4.size())) {
                return false;
            }
        }
        object = object.iterator();
        object2 = object2.iterator();
        return Iterators.elementsEqual((Iterator)object, (Iterator)object2);
    }

    public static Iterable filter(Iterable iterable, Predicate predicate) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(predicate);
        Iterables$4 iterables$4 = new Iterables$4(iterable, predicate);
        return iterables$4;
    }

    public static Iterable filter(Iterable iterable, Class object) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(object);
        object = Predicates.instanceOf((Class)object);
        return Iterables.filter(iterable, (Predicate)object);
    }

    public static Object find(Iterable iterable, Predicate predicate) {
        return Iterators.find(iterable.iterator(), predicate);
    }

    public static Object find(Iterable iterable, Predicate predicate, Object object) {
        return Iterators.find(iterable.iterator(), predicate, object);
    }

    public static int frequency(Iterable iterable, Object object) {
        boolean bl2 = iterable instanceof Multiset;
        if (bl2) {
            return ((Multiset)iterable).count(object);
        }
        bl2 = iterable instanceof Set;
        if (bl2) {
            return (int)(((Set)iterable).contains(object) ? 1 : 0);
        }
        return Iterators.frequency(iterable.iterator(), object);
    }

    public static Object get(Iterable object, int n3) {
        Preconditions.checkNotNull(object);
        boolean bl2 = object instanceof List;
        object = bl2 ? ((List)object).get(n3) : Iterators.get(object.iterator(), n3);
        return object;
    }

    public static Object get(Iterable object, int n3, Object object2) {
        Preconditions.checkNotNull(object);
        Iterators.checkNonnegative(n3);
        int n4 = object instanceof List;
        if (n4 != 0) {
            n4 = (object = Lists.cast((Iterable)object)).size();
            if (n3 < n4) {
                object2 = object.get(n3);
            }
            return object2;
        }
        object = object.iterator();
        Iterators.advance((Iterator)object, n3);
        return Iterators.getNext((Iterator)object, object2);
    }

    public static Object getFirst(Iterable iterable, Object object) {
        return Iterators.getNext(iterable.iterator(), object);
    }

    public static Object getLast(Iterable object) {
        boolean bl2 = object instanceof List;
        if (bl2) {
            bl2 = (object = (List)object).isEmpty();
            if (!bl2) {
                return Iterables.getLastInNonemptyList((List)object);
            }
            object = new NoSuchElementException();
            throw object;
        }
        return Iterators.getLast(object.iterator());
    }

    public static Object getLast(Iterable iterable, Object object) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            Iterable iterable2 = iterable;
            iterable2 = (Collection)iterable;
            bl2 = iterable2.isEmpty();
            if (bl2) {
                return object;
            }
            bl2 = iterable instanceof List;
            if (bl2) {
                return Iterables.getLastInNonemptyList(Lists.cast(iterable));
            }
        }
        return Iterators.getLast(iterable.iterator(), object);
    }

    private static Object getLastInNonemptyList(List list) {
        return on_2.d(1, list);
    }

    public static Object getOnlyElement(Iterable iterable) {
        return Iterators.getOnlyElement(iterable.iterator());
    }

    public static Object getOnlyElement(Iterable iterable, Object object) {
        return Iterators.getOnlyElement(iterable.iterator(), object);
    }

    public static int indexOf(Iterable iterable, Predicate predicate) {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static boolean isEmpty(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            return ((Collection)iterable).isEmpty();
        }
        return iterable.iterator().hasNext() ^ true;
    }

    public static Iterable limit(Iterable iterable, int n3) {
        Iterables$7 iterables$7;
        boolean bl2;
        Preconditions.checkNotNull(iterable);
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            iterables$7 = null;
        }
        Preconditions.checkArgument(bl2, "limit is negative");
        iterables$7 = new Iterables$7(iterable, n3);
        return iterables$7;
    }

    public static Iterable mergeSorted(Iterable iterable, Comparator comparator) {
        Preconditions.checkNotNull(iterable, "iterables");
        Preconditions.checkNotNull(comparator, "comparator");
        Iterables$9 iterables$9 = new Iterables$9(iterable, comparator);
        iterable = new Iterables$UnmodifiableIterable(iterables$9, null);
        return iterable;
    }

    public static Iterable paddedPartition(Iterable iterable, int n3) {
        Iterables$3 iterables$3;
        boolean bl2;
        Preconditions.checkNotNull(iterable);
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            iterables$3 = null;
        }
        Preconditions.checkArgument(bl2);
        iterables$3 = new Iterables$3(iterable, n3);
        return iterables$3;
    }

    public static Iterable partition(Iterable iterable, int n3) {
        Iterables$2 iterables$2;
        boolean bl2;
        Preconditions.checkNotNull(iterable);
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            iterables$2 = null;
        }
        Preconditions.checkArgument(bl2);
        iterables$2 = new Iterables$2(iterable, n3);
        return iterables$2;
    }

    public static boolean removeAll(Iterable object, Collection collection) {
        boolean bl2;
        boolean bl3 = object instanceof Collection;
        if (bl3) {
            object = (Collection)object;
            collection = (Collection)Preconditions.checkNotNull(collection);
            bl2 = object.removeAll(collection);
        } else {
            object = object.iterator();
            bl2 = Iterators.removeAll((Iterator)object, collection);
        }
        return bl2;
    }

    public static Object removeFirstMatching(Iterable object, Predicate predicate) {
        boolean bl2;
        Preconditions.checkNotNull(predicate);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            boolean bl3 = predicate.apply(e2);
            if (!bl3) continue;
            object.remove();
            return e2;
        }
        return null;
    }

    public static boolean removeIf(Iterable iterable, Predicate predicate) {
        boolean bl2 = iterable instanceof RandomAccess;
        if (bl2 && (bl2 = iterable instanceof List)) {
            iterable = (List)iterable;
            predicate = (Predicate)Preconditions.checkNotNull(predicate);
            return Iterables.removeIfFromRandomAccessList((List)iterable, predicate);
        }
        return Iterators.removeIf(iterable.iterator(), predicate);
    }

    private static boolean removeIfFromRandomAccessList(List list, Predicate predicate) {
        boolean bl2 = false;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n7 = list.size();
            boolean bl3 = true;
            if (n3 >= n7) break;
            Object e2 = list.get(n3);
            boolean bl4 = predicate.apply(e2);
            if (!bl4) {
                if (n3 > n4) {
                    try {
                        list.set(n4, e2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        Iterables.slowRemoveIfForRemainingElements(list, predicate, n4, n3);
                        return bl3;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        Iterables.slowRemoveIfForRemainingElements(list, predicate, n4, n3);
                        return bl3;
                    }
                }
                ++n4;
            }
            ++n3;
        }
        int n8 = list.size();
        list = list.subList(n4, n8);
        list.clear();
        if (n3 != n4) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean retainAll(Iterable object, Collection collection) {
        boolean bl2;
        boolean bl3 = object instanceof Collection;
        if (bl3) {
            object = (Collection)object;
            collection = (Collection)Preconditions.checkNotNull(collection);
            bl2 = object.retainAll(collection);
        } else {
            object = object.iterator();
            bl2 = Iterators.retainAll((Iterator)object, collection);
        }
        return bl2;
    }

    public static int size(Iterable object) {
        int n3;
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            object = (Collection)object;
            n3 = object.size();
        } else {
            object = object.iterator();
            n3 = Iterators.size((Iterator)object);
        }
        return n3;
    }

    public static Iterable skip(Iterable iterable, int n3) {
        Iterables$6 iterables$6;
        boolean bl2;
        Preconditions.checkNotNull(iterable);
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            iterables$6 = null;
        }
        Preconditions.checkArgument(bl2, "number to skip cannot be negative");
        iterables$6 = new Iterables$6(iterable, n3);
        return iterables$6;
    }

    private static void slowRemoveIfForRemainingElements(List list, Predicate predicate, int n3, int n4) {
        for (int i3 = list.size() + -1; i3 > n4; i3 += -1) {
            Object e2 = list.get(i3);
            boolean bl2 = predicate.apply(e2);
            if (!bl2) continue;
            list.remove(i3);
        }
        n4 += -1;
        while (n4 >= n3) {
            list.remove(n4);
            n4 += -1;
        }
    }

    public static Object[] toArray(Iterable iterable) {
        return Iterables.castOrCopyToCollection(iterable).toArray();
    }

    public static Object[] toArray(Iterable iterable, Class objectArray) {
        objectArray = ObjectArrays.newArray((Class)objectArray, 0);
        return Iterables.toArray(iterable, objectArray);
    }

    public static Object[] toArray(Iterable iterable, Object[] objectArray) {
        return Iterables.castOrCopyToCollection(iterable).toArray(objectArray);
    }

    public static String toString(Iterable iterable) {
        return Iterators.toString(iterable.iterator());
    }

    public static Iterable transform(Iterable iterable, Function function) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        Iterables$5 iterables$5 = new Iterables$5(iterable, function);
        return iterables$5;
    }

    public static Optional tryFind(Iterable iterable, Predicate predicate) {
        return Iterators.tryFind(iterable.iterator(), predicate);
    }

    public static Iterable unmodifiableIterable(ImmutableCollection immutableCollection) {
        return (Iterable)Preconditions.checkNotNull(immutableCollection);
    }

    public static Iterable unmodifiableIterable(Iterable iterable) {
        Preconditions.checkNotNull(iterable);
        boolean bl2 = iterable instanceof Iterables$UnmodifiableIterable;
        if (!bl2 && !(bl2 = iterable instanceof ImmutableCollection)) {
            Iterables$UnmodifiableIterable iterables$UnmodifiableIterable = new Iterables$UnmodifiableIterable(iterable, null);
            return iterables$UnmodifiableIterable;
        }
        return iterable;
    }
}

