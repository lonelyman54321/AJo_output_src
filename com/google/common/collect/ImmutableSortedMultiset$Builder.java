/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableMultiset$Builder;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.RegularImmutableSortedMultiset;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.math.IntMath;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class ImmutableSortedMultiset$Builder
extends ImmutableMultiset$Builder {
    private final Comparator comparator;
    private int[] counts;
    Object[] elements;
    private boolean forceCopyElements;
    private int length;

    public ImmutableSortedMultiset$Builder(Comparator object) {
        super(true);
        object = (Comparator)Preconditions.checkNotNull(object);
        this.comparator = object;
        int n3 = 4;
        Object[] objectArray = new Object[n3];
        this.elements = objectArray;
        object = new int[n3];
        this.counts = (int[])object;
    }

    private void dedupAndCoalesce(boolean n3) {
        Object object;
        Object object2;
        Object object3;
        int n4;
        int n7;
        int n8 = this.length;
        if (n8 == 0) {
            return;
        }
        Object[] objectArray = Arrays.copyOf(this.elements, n8);
        Comparator comparator = this.comparator;
        Arrays.sort(objectArray, comparator);
        int n10 = 1;
        int n14 = 1;
        for (n7 = 1; n7 < (n4 = objectArray.length); ++n7) {
            object3 = this.comparator;
            object2 = n14 + -1;
            object = objectArray[object2];
            Object object4 = objectArray[n7];
            n4 = object3.compare(object, object4);
            if (n4 >= 0) continue;
            objectArray[n14] = object3 = objectArray[n7];
            ++n14;
        }
        n7 = this.length;
        n4 = 0;
        object3 = null;
        Arrays.fill(objectArray, n14, n7, null);
        if (n3 != 0 && (n3 = n14 * 4) > (n4 = (n7 = this.length) * 3)) {
            n3 = n7 / 2 + n10;
            n3 = IntMath.saturatedAdd(n7, n3);
            objectArray = Arrays.copyOf(objectArray, n3);
        }
        n3 = objectArray.length;
        int[] nArray = new int[n3];
        n10 = 0;
        comparator = null;
        for (n7 = 0; n7 < (n4 = this.length); ++n7) {
            int n15;
            object3 = this.elements[n7];
            object = this.comparator;
            n4 = Arrays.binarySearch(objectArray, 0, n14, object3, object);
            object = this.counts;
            object2 = object[n7];
            nArray[n4] = object2 >= 0 ? (n15 = nArray[n4] + object2) : (object2 ^= 0xFFFFFFFF);
        }
        this.elements = objectArray;
        this.counts = nArray;
        this.length = n14;
    }

    private void dedupAndCoalesceAndDeleteEmpty() {
        int n3;
        this.dedupAndCoalesce(false);
        int[] nArray = null;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.length); ++i3) {
            Object object;
            int[] nArray2 = this.counts;
            int n7 = nArray2[i3];
            if (n7 <= 0) continue;
            Object[] objectArray = this.elements;
            objectArray[n4] = object = objectArray[i3];
            nArray2[n4] = n7;
            ++n4;
        }
        Arrays.fill(this.elements, n4, n3, null);
        nArray = this.counts;
        n3 = this.length;
        Arrays.fill(nArray, n4, n3, 0);
        this.length = n4;
    }

    private void maintenance() {
        int n3 = this.length;
        Object[] objectArray = this.elements;
        int n4 = objectArray.length;
        if (n3 == n4) {
            n3 = 1;
            this.dedupAndCoalesce(n3 != 0);
        } else {
            n3 = (int)(this.forceCopyElements ? 1 : 0);
            if (n3 != 0) {
                n3 = objectArray.length;
                Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
                this.elements = objectArray2;
            }
        }
        this.forceCopyElements = false;
    }

    public ImmutableSortedMultiset$Builder add(Object object) {
        return this.addCopies(object, 1);
    }

    public ImmutableSortedMultiset$Builder add(Object ... objectArray) {
        for (Object object : objectArray) {
            this.add(object);
        }
        return this;
    }

    public ImmutableSortedMultiset$Builder addAll(Iterable iterator) {
        int n3 = iterator instanceof Multiset;
        if (n3 != 0) {
            iterator = ((Multiset)((Object)iterator)).entrySet().iterator();
            while ((n3 = iterator.hasNext()) != 0) {
                Multiset$Entry multiset$Entry = (Multiset$Entry)iterator.next();
                Object object = multiset$Entry.getElement();
                n3 = multiset$Entry.getCount();
                this.addCopies(object, n3);
            }
        } else {
            iterator = iterator.iterator();
            while ((n3 = iterator.hasNext()) != 0) {
                Object e2 = iterator.next();
                this.add(e2);
            }
        }
        return this;
    }

    public ImmutableSortedMultiset$Builder addAll(Iterator iterator) {
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            this.add(e2);
        }
        return this;
    }

    public ImmutableSortedMultiset$Builder addCopies(Object object, int n3) {
        Preconditions.checkNotNull(object);
        Object[] objectArray = "occurrences";
        CollectPreconditions.checkNonnegative(n3, (String)objectArray);
        if (n3 == 0) {
            return this;
        }
        this.maintenance();
        objectArray = this.elements;
        int n4 = this.length;
        objectArray[n4] = object;
        this.counts[n4] = n3;
        this.length = ++n4;
        return this;
    }

    public ImmutableSortedMultiset build() {
        int n3;
        this.dedupAndCoalesceAndDeleteEmpty();
        int n4 = this.length;
        if (n4 == 0) {
            return ImmutableSortedMultiset.emptyMultiset(this.comparator);
        }
        Object object = this.comparator;
        Object object2 = this.elements;
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet)ImmutableSortedSet.construct((Comparator)object, n4, object2);
        int n7 = this.length;
        int n8 = 1;
        object = new long[n7 += n8];
        int n10 = 0;
        while (n10 < (n3 = this.length)) {
            n3 = n10 + 1;
            reference var9_9 = object[n10];
            int[] nArray = this.counts;
            long l2 = nArray[n10];
            object[n3] = var9_9 += l2;
            n10 = n3;
        }
        this.forceCopyElements = n8;
        n10 = this.length;
        object2 = new RegularImmutableSortedMultiset(regularImmutableSortedSet, (long[])object, 0, n10);
        return object2;
    }

    public ImmutableSortedMultiset$Builder setCount(Object object, int n3) {
        Preconditions.checkNotNull(object);
        CollectPreconditions.checkNonnegative(n3, "count");
        this.maintenance();
        Object[] objectArray = this.elements;
        int n4 = this.length;
        objectArray[n4] = object;
        object = this.counts;
        object[n4] = n3 ^= 0xFFFFFFFF;
        this.length = ++n4;
        return this;
    }
}

