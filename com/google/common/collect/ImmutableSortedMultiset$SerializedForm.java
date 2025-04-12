/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableSortedMultiset$Builder;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.SortedMultiset;
import java.io.Serializable;
import java.util.Comparator;

final class ImmutableSortedMultiset$SerializedForm
implements Serializable {
    final Comparator comparator;
    final int[] counts;
    final Object[] elements;

    public ImmutableSortedMultiset$SerializedForm(SortedMultiset object) {
        int n3;
        Object object2 = object.comparator();
        this.comparator = object2;
        int n4 = object.entrySet().size();
        Object object3 = new Object[n4];
        this.elements = object3;
        object2 = new int[n4];
        this.counts = (int[])object2;
        object = object.entrySet().iterator();
        n4 = 0;
        object2 = null;
        while ((n3 = object.hasNext()) != 0) {
            Object object4;
            object3 = (Multiset$Entry)object.next();
            Object[] objectArray = this.elements;
            objectArray[n4] = object4 = object3.getElement();
            objectArray = this.counts;
            n3 = object3.getCount();
            objectArray[n4] = n3;
            ++n4;
        }
    }

    public Object readResolve() {
        Object[] objectArray = this.elements;
        int n3 = objectArray.length;
        Comparator comparator = this.comparator;
        ImmutableSortedMultiset$Builder immutableSortedMultiset$Builder = new ImmutableSortedMultiset$Builder(comparator);
        comparator = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = this.elements[i3];
            int[] nArray = this.counts;
            int n4 = nArray[i3];
            immutableSortedMultiset$Builder.addCopies(object, n4);
        }
        return immutableSortedMultiset$Builder.build();
    }
}

