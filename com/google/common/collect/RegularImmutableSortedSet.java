/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import com.google.common.collect.SortedIterables;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;

final class RegularImmutableSortedSet
extends ImmutableSortedSet {
    static final RegularImmutableSortedSet NATURAL_EMPTY_SET;
    final transient ImmutableList elements;

    static {
        RegularImmutableSortedSet regularImmutableSortedSet;
        ImmutableList immutableList = ImmutableList.of();
        Ordering ordering = Ordering.natural();
        NATURAL_EMPTY_SET = regularImmutableSortedSet = new RegularImmutableSortedSet(immutableList, ordering);
    }

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.elements = immutableList;
    }

    private int unsafeBinarySearch(Object object) {
        ImmutableList immutableList = this.elements;
        Comparator comparator = this.unsafeComparator();
        return Collections.binarySearch(immutableList, object, comparator);
    }

    public ImmutableList asList() {
        return this.elements;
    }

    public Object ceiling(Object object) {
        int n3;
        int n4 = this.tailIndex(object, true);
        if (n4 == (n3 = this.size())) {
            n4 = 0;
            object = null;
        } else {
            ImmutableList immutableList = this.elements;
            object = immutableList.get(n4);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean contains(Object object) {
        boolean bl2 = false;
        if (object == null) return bl2;
        try {
            int n3 = this.unsafeBinarySearch(object);
            if (n3 < 0) return bl2;
            return true;
        }
        catch (ClassCastException classCastException) {
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean containsAll(Collection iterator) {
        int bl2;
        Object object;
        int bl3 = iterator instanceof Multiset;
        if (bl3) {
            iterator = ((Multiset)((Object)iterator)).elementSet();
        }
        if ((bl3 = SortedIterables.hasSameComparator((Comparator)(object = this.comparator()), (Iterable)((Object)iterator))) == 0) return super.containsAll((Collection<?>)((Object)iterator));
        bl3 = iterator.size();
        if (bl3 <= (bl2 = 1)) {
            return super.containsAll((Collection<?>)((Object)iterator));
        }
        object = this.iterator();
        iterator = iterator.iterator();
        boolean bl4 = object.hasNext();
        if (!bl4) {
            return false;
        }
        Object e2 = iterator.next();
        Object e5 = object.next();
        try {
            while (true) {
                int n3;
                if ((n3 = this.unsafeCompare(e5, e2)) < 0) {
                    boolean bl5 = object.hasNext();
                    if (!bl5) {
                        return false;
                    }
                    e5 = object.next();
                    continue;
                }
                if (n3 == 0) {
                    bl4 = iterator.hasNext();
                    if (!bl4) {
                        return bl2 != 0;
                    }
                    e2 = iterator.next();
                    continue;
                }
                if (n3 > 0) break;
            }
            return false;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public int copyIntoArray(Object[] objectArray, int n3) {
        return this.elements.copyIntoArray(objectArray, n3);
    }

    public ImmutableSortedSet createDescendingSet() {
        Object object = Collections.reverseOrder(this.comparator);
        boolean bl2 = this.isEmpty();
        if (bl2) {
            object = ImmutableSortedSet.emptySet(object);
        } else {
            ImmutableList immutableList = this.elements.reverse();
            RegularImmutableSortedSet regularImmutableSortedSet = new RegularImmutableSortedSet(immutableList, (Comparator)object);
            object = regularImmutableSortedSet;
        }
        return object;
    }

    public UnmodifiableIterator descendingIterator() {
        return this.elements.reverse().iterator();
    }

    public boolean equals(Object iterator) {
        int n3;
        boolean bl2 = true;
        if (iterator == this) {
            return bl2;
        }
        int n4 = iterator instanceof Set;
        if (n4 == 0) {
            return false;
        }
        iterator = (Set)((Object)iterator);
        n4 = this.size();
        if (n4 != (n3 = iterator.size())) {
            return false;
        }
        n4 = (int)(this.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return bl2;
        }
        Object object = this.comparator;
        n4 = (int)(SortedIterables.hasSameComparator((Comparator)object, (Iterable)((Object)iterator)) ? 1 : 0);
        if (n4 != 0) {
            block12: {
                iterator = iterator.iterator();
                try {
                    object = this.iterator();
                }
                catch (ClassCastException | NoSuchElementException runtimeException) {
                    return false;
                }
                while (true) {
                    n3 = (int)(object.hasNext() ? 1 : 0);
                    if (n3 == 0) break block12;
                    Object e2 = object.next();
                    Object e5 = iterator.next();
                    if (e5 == null) break;
                    if ((n3 = this.unsafeCompare(e2, e5)) == 0) continue;
                    break;
                }
                return false;
            }
            return bl2;
        }
        return this.containsAll((Collection)((Object)iterator));
    }

    public Object first() {
        boolean bl2 = this.isEmpty();
        if (!bl2) {
            return this.elements.get(0);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public Object floor(Object object) {
        int n3 = 1;
        int n4 = this.headIndex(object, n3 != 0) - n3;
        if (n4 == (n3 = -1)) {
            n4 = 0;
            object = null;
        } else {
            ImmutableList immutableList = this.elements;
            object = immutableList.get(n4);
        }
        return object;
    }

    public RegularImmutableSortedSet getSubSet(int n3, int n4) {
        int n7;
        if (n3 == 0 && n4 == (n7 = this.size())) {
            return this;
        }
        if (n3 < n4) {
            ImmutableList immutableList = this.elements.subList(n3, n4);
            Comparator comparator = this.comparator;
            RegularImmutableSortedSet regularImmutableSortedSet = new RegularImmutableSortedSet(immutableList, comparator);
            return regularImmutableSortedSet;
        }
        return ImmutableSortedSet.emptySet(this.comparator);
    }

    public int headIndex(Object object, boolean bl2) {
        Comparator comparator;
        ImmutableList immutableList = this.elements;
        int n3 = Collections.binarySearch(immutableList, object = Preconditions.checkNotNull(object), comparator = this.comparator());
        if (n3 >= 0) {
            if (bl2) {
                ++n3;
            }
            return n3;
        }
        return ~n3;
    }

    public ImmutableSortedSet headSetImpl(Object object, boolean bl2) {
        int n3 = this.headIndex(object, bl2);
        return this.getSubSet(0, n3);
    }

    public Object higher(Object object) {
        int n3;
        ImmutableList immutableList = null;
        int n4 = this.tailIndex(object, false);
        if (n4 == (n3 = this.size())) {
            n4 = 0;
            object = null;
        } else {
            immutableList = this.elements;
            object = immutableList.get(n4);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int indexOf(Object object) {
        ImmutableList immutableList;
        int n3 = -1;
        if (object == null) {
            return n3;
        }
        try {
            immutableList = this.elements;
        }
        catch (ClassCastException classCastException) {
            return n3;
        }
        Comparator comparator = this.unsafeComparator();
        int n4 = Collections.binarySearch(immutableList, object, comparator);
        if (n4 < 0) return n3;
        return n4;
    }

    public Object[] internalArray() {
        return this.elements.internalArray();
    }

    public int internalArrayEnd() {
        return this.elements.internalArrayEnd();
    }

    public int internalArrayStart() {
        return this.elements.internalArrayStart();
    }

    public boolean isPartialView() {
        return this.elements.isPartialView();
    }

    public UnmodifiableIterator iterator() {
        return this.elements.iterator();
    }

    public Object last() {
        boolean bl2 = this.isEmpty();
        if (!bl2) {
            ImmutableList immutableList = this.elements;
            int n3 = this.size() + -1;
            return immutableList.get(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public Object lower(Object object) {
        int n3;
        ImmutableList immutableList = null;
        int n4 = this.headIndex(object, false) + -1;
        if (n4 == (n3 = -1)) {
            n4 = 0;
            object = null;
        } else {
            immutableList = this.elements;
            object = immutableList.get(n4);
        }
        return object;
    }

    public int size() {
        return this.elements.size();
    }

    public ImmutableSortedSet subSetImpl(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.tailSetImpl(object, bl2).headSetImpl(object2, bl3);
    }

    public int tailIndex(Object object, boolean bl2) {
        Comparator comparator;
        ImmutableList immutableList = this.elements;
        int n3 = Collections.binarySearch(immutableList, object = Preconditions.checkNotNull(object), comparator = this.comparator());
        if (n3 >= 0) {
            if (!bl2) {
                ++n3;
            }
            return n3;
        }
        return ~n3;
    }

    public ImmutableSortedSet tailSetImpl(Object object, boolean bl2) {
        int n3 = this.tailIndex(object, bl2);
        int n4 = this.size();
        return this.getSubSet(n3, n4);
    }

    public Comparator unsafeComparator() {
        return this.comparator;
    }
}

