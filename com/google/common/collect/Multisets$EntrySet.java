/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Sets$ImprovedAbstractSet;

abstract class Multisets$EntrySet
extends Sets$ImprovedAbstractSet {
    public void clear() {
        this.multiset().clear();
    }

    public boolean contains(Object object) {
        int n3 = object instanceof Multiset$Entry;
        boolean bl2 = false;
        if (n3 != 0) {
            int n4;
            Object object2;
            n3 = (object = (Multiset$Entry)object).getCount();
            if (n3 <= 0) {
                return false;
            }
            Multiset multiset = this.multiset();
            n3 = multiset.count(object2 = object.getElement());
            if (n3 == (n4 = object.getCount())) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public abstract Multiset multiset();

    public boolean remove(Object object) {
        boolean bl2 = object instanceof Multiset$Entry;
        if (bl2) {
            object = (Multiset$Entry)object;
            Object object2 = object.getElement();
            int n3 = object.getCount();
            if (n3 != 0) {
                return this.multiset().setCount(object2, n3, 0);
            }
        }
        return false;
    }
}

