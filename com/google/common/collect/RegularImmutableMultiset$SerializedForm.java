/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset$Builder;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import java.io.Serializable;

class RegularImmutableMultiset$SerializedForm
implements Serializable {
    private static final long serialVersionUID;
    final int[] counts;
    final Object[] elements;

    public RegularImmutableMultiset$SerializedForm(Multiset object) {
        int n3;
        int n4 = object.entrySet().size();
        Object object2 = new Object[n4];
        this.elements = object2;
        int[] nArray = new int[n4];
        this.counts = nArray;
        object = object.entrySet().iterator();
        n4 = 0;
        nArray = null;
        while ((n3 = object.hasNext()) != 0) {
            Object object3;
            object2 = (Multiset$Entry)object.next();
            Object[] objectArray = this.elements;
            objectArray[n4] = object3 = object2.getElement();
            objectArray = this.counts;
            n3 = object2.getCount();
            objectArray[n4] = n3;
            ++n4;
        }
    }

    public Object readResolve() {
        Object object;
        int n3;
        int n4 = this.elements.length;
        ImmutableMultiset$Builder immutableMultiset$Builder = new ImmutableMultiset$Builder(n4);
        for (n4 = 0; n4 < (n3 = ((Object[])(object = this.elements)).length); ++n4) {
            object = object[n4];
            int[] nArray = this.counts;
            n3 = nArray[n4];
            immutableMultiset$Builder.addCopies(object, n3);
        }
        return immutableMultiset$Builder.build();
    }
}

