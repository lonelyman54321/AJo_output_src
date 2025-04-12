/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets$5$1;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class Sets$5
extends AbstractSet {
    final /* synthetic */ ImmutableMap val$index;
    final /* synthetic */ int val$size;

    public Sets$5(int n3, ImmutableMap immutableMap) {
        this.val$size = n3;
        this.val$index = immutableMap;
    }

    public boolean contains(Object object) {
        ImmutableSet immutableSet;
        boolean bl2;
        int n3;
        int n4 = object instanceof Set;
        boolean bl3 = false;
        if (n4 != 0 && (n4 = (object = (Set)object).size()) == (n3 = this.val$size) && (bl2 = (immutableSet = this.val$index.keySet()).containsAll((Collection<?>)object))) {
            bl3 = true;
        }
        return bl3;
    }

    public Iterator iterator() {
        Sets$5$1 sets$5$1 = new Sets$5$1(this);
        return sets$5$1;
    }

    public int size() {
        int n3 = this.val$index.size();
        int n4 = this.val$size;
        return IntMath.binomial(n3, n4);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Sets.combinations(");
        ImmutableSet immutableSet = this.val$index.keySet();
        stringBuilder.append(immutableSet);
        stringBuilder.append(", ");
        return g30.a(this.val$size, ")", stringBuilder);
    }
}

