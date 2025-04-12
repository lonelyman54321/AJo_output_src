/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets$PowerSet$1;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class Sets$PowerSet
extends AbstractSet {
    final ImmutableMap inputSet;

    /*
     * WARNING - void declaration
     */
    public Sets$PowerSet(Set object) {
        void var2_5;
        int bl2 = object.size();
        int n3 = 30;
        if (bl2 <= n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        int n4 = object.size();
        Preconditions.checkArgument((boolean)var2_5, "Too many elements to create power set: %s > 30", n4);
        this.inputSet = object = Maps.indexMap((Collection)object);
    }

    public boolean contains(Object object) {
        boolean bl2 = object instanceof Set;
        if (bl2) {
            object = (Set)object;
            return this.inputSet.keySet().containsAll((Collection<?>)object);
        }
        return false;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Sets$PowerSet;
        if (bl2) {
            object = (Sets$PowerSet)object;
            ImmutableSet immutableSet = this.inputSet.keySet();
            object = ((Sets$PowerSet)object).inputSet.keySet();
            return immutableSet.equals(object);
        }
        return super.equals(object);
    }

    public int hashCode() {
        int n3 = this.inputSet.keySet().hashCode();
        int n4 = this.inputSet.size() + -1;
        return n3 << n4;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        int n3 = this.size();
        Sets$PowerSet$1 sets$PowerSet$1 = new Sets$PowerSet$1(this, n3);
        return sets$PowerSet$1;
    }

    public int size() {
        int n3 = this.inputSet.size();
        return 1 << n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("powerSet(");
        ImmutableMap immutableMap = this.inputSet;
        stringBuilder.append(immutableMap);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

