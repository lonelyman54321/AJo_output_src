/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AllEqualOrdering;
import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.CompoundOrdering;
import com.google.common.collect.ExplicitOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.LexicographicalOrdering;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.NullsFirstOrdering;
import com.google.common.collect.NullsLastOrdering;
import com.google.common.collect.Ordering$ArbitraryOrderingHolder;
import com.google.common.collect.ReverseOrdering;
import com.google.common.collect.TopKSelector;
import com.google.common.collect.UsingToStringOrdering;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class Ordering
implements Comparator {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = 255;

    public static Ordering allEqual() {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering arbitrary() {
        return Ordering$ArbitraryOrderingHolder.ARBITRARY_ORDERING;
    }

    public static Ordering compound(Iterable iterable) {
        CompoundOrdering compoundOrdering = new CompoundOrdering(iterable);
        return compoundOrdering;
    }

    public static Ordering explicit(Object object, Object ... objectArray) {
        return Ordering.explicit(Lists.asList(object, objectArray));
    }

    public static Ordering explicit(List list) {
        ExplicitOrdering explicitOrdering = new ExplicitOrdering(list);
        return explicitOrdering;
    }

    public static Ordering from(Ordering ordering) {
        return (Ordering)Preconditions.checkNotNull(ordering);
    }

    public static Ordering from(Comparator comparator) {
        boolean bl2 = comparator instanceof Ordering;
        if (bl2) {
            comparator = (Ordering)comparator;
        } else {
            ComparatorOrdering comparatorOrdering = new ComparatorOrdering(comparator);
            comparator = comparatorOrdering;
        }
        return comparator;
    }

    public static Ordering natural() {
        return NaturalOrdering.INSTANCE;
    }

    public static Ordering usingToString() {
        return UsingToStringOrdering.INSTANCE;
    }

    public int binarySearch(List list, Object object) {
        return Collections.binarySearch(list, object, this);
    }

    public abstract int compare(Object var1, Object var2);

    public Ordering compound(Comparator comparator) {
        comparator = (Comparator)Preconditions.checkNotNull(comparator);
        CompoundOrdering compoundOrdering = new CompoundOrdering(this, comparator);
        return compoundOrdering;
    }

    public List greatestOf(Iterable iterable, int n3) {
        return this.reverse().leastOf(iterable, n3);
    }

    public List greatestOf(Iterator iterator, int n3) {
        return this.reverse().leastOf(iterator, n3);
    }

    public ImmutableList immutableSortedCopy(Iterable iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable object) {
        int n3 = (object = object.iterator()).hasNext();
        if (n3 != 0) {
            boolean bl2;
            Object e2 = object.next();
            while (bl2 = object.hasNext()) {
                Object e5 = object.next();
                n3 = this.compare(e2, e5);
                if (n3 > 0) {
                    return false;
                }
                e2 = e5;
            }
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable object) {
        int n3 = (object = object.iterator()).hasNext();
        if (n3 != 0) {
            boolean bl2;
            Object e2 = object.next();
            while (bl2 = object.hasNext()) {
                Object e5 = object.next();
                n3 = this.compare(e2, e5);
                if (n3 >= 0) {
                    return false;
                }
                e2 = e5;
            }
        }
        return true;
    }

    public List leastOf(Iterable objectArray, int n3) {
        int n4 = objectArray instanceof Collection;
        if (n4 != 0) {
            long l2;
            long l3;
            Iterable iterable = objectArray;
            iterable = (Collection)objectArray;
            int n7 = iterable.size();
            long l4 = n7;
            long l7 = l4 - (l3 = (long)n3 * (l2 = (long)2));
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0) {
                objectArray = iterable.toArray();
                Arrays.sort(objectArray, this);
                n4 = objectArray.length;
                if (n4 > n3) {
                    objectArray = Arrays.copyOf(objectArray, n3);
                }
                return Collections.unmodifiableList(Arrays.asList(objectArray));
            }
        }
        objectArray = objectArray.iterator();
        return this.leastOf((Iterator)objectArray, n3);
    }

    public List leastOf(Iterator object, int n3) {
        int n4;
        Preconditions.checkNotNull(object);
        String string2 = "k";
        CollectPreconditions.checkNonnegative(n3, string2);
        if (n3 != 0 && (n4 = object.hasNext()) != 0) {
            n4 = -1 >>> 2;
            if (n3 >= n4) {
                object = Lists.newArrayList((Iterator)object);
                Collections.sort(object, this);
                n4 = ((ArrayList)object).size();
                if (n4 > n3) {
                    n4 = ((ArrayList)object).size();
                    List list = ((ArrayList)object).subList(n3, n4);
                    list.clear();
                }
                ((ArrayList)object).trimToSize();
                return Collections.unmodifiableList(object);
            }
            TopKSelector topKSelector = TopKSelector.least(n3, this);
            topKSelector.offerAll((Iterator)object);
            return topKSelector.topK();
        }
        return Collections.emptyList();
    }

    public Ordering lexicographical() {
        LexicographicalOrdering lexicographicalOrdering = new LexicographicalOrdering(this);
        return lexicographicalOrdering;
    }

    public Object max(Iterable object) {
        object = object.iterator();
        return this.max((Iterator)object);
    }

    public Object max(Object object, Object object2) {
        int n3 = this.compare(object, object2);
        if (n3 < 0) {
            object = object2;
        }
        return object;
    }

    public Object max(Object object, Object object2, Object object3, Object ... objectArray) {
        object = this.max(object, object2);
        object = this.max(object, object3);
        int n3 = objectArray.length;
        object3 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object4 = objectArray[i3];
            object = this.max(object, object4);
        }
        return object;
    }

    public Object max(Iterator iterator) {
        boolean bl2;
        Object object = iterator.next();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            object = this.max(object, e2);
        }
        return object;
    }

    public Object min(Iterable object) {
        object = object.iterator();
        return this.min((Iterator)object);
    }

    public Object min(Object object, Object object2) {
        int n3 = this.compare(object, object2);
        if (n3 > 0) {
            object = object2;
        }
        return object;
    }

    public Object min(Object object, Object object2, Object object3, Object ... objectArray) {
        object = this.min(object, object2);
        object = this.min(object, object3);
        int n3 = objectArray.length;
        object3 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object4 = objectArray[i3];
            object = this.min(object, object4);
        }
        return object;
    }

    public Object min(Iterator iterator) {
        boolean bl2;
        Object object = iterator.next();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            object = this.min(object, e2);
        }
        return object;
    }

    public Ordering nullsFirst() {
        NullsFirstOrdering nullsFirstOrdering = new NullsFirstOrdering(this);
        return nullsFirstOrdering;
    }

    public Ordering nullsLast() {
        NullsLastOrdering nullsLastOrdering = new NullsLastOrdering(this);
        return nullsLastOrdering;
    }

    public Ordering onKeys() {
        Function function = Maps.keyFunction();
        return this.onResultOf(function);
    }

    public Ordering onResultOf(Function function) {
        ByFunctionOrdering byFunctionOrdering = new ByFunctionOrdering(function, this);
        return byFunctionOrdering;
    }

    public Ordering reverse() {
        ReverseOrdering reverseOrdering = new ReverseOrdering(this);
        return reverseOrdering;
    }

    public List sortedCopy(Iterable objectArray) {
        objectArray = Iterables.toArray((Iterable)objectArray);
        Arrays.sort(objectArray, this);
        return Lists.newArrayList(Arrays.asList(objectArray));
    }
}

