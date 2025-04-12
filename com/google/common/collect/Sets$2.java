/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Sets$2$1;
import com.google.common.collect.Sets$SetView;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

class Sets$2
extends Sets$SetView {
    final /* synthetic */ Set val$set1;
    final /* synthetic */ Set val$set2;

    public Sets$2(Set set, Set set2) {
        this.val$set1 = set;
        this.val$set2 = set2;
        super(null);
    }

    public boolean contains(Object object) {
        boolean bl2;
        Set set = this.val$set1;
        boolean bl3 = set.contains(object);
        if (bl3 && (bl2 = (set = this.val$set2).contains(object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean containsAll(Collection collection) {
        boolean bl2;
        Set set = this.val$set1;
        boolean bl3 = set.containsAll(collection);
        if (bl3 && (bl2 = (set = this.val$set2).containsAll(collection))) {
            bl2 = true;
        } else {
            bl2 = false;
            collection = null;
        }
        return bl2;
    }

    public boolean isEmpty() {
        Set set = this.val$set2;
        Set set2 = this.val$set1;
        return Collections.disjoint(set, set2);
    }

    public UnmodifiableIterator iterator() {
        Sets$2$1 sets$2$1 = new Sets$2$1(this);
        return sets$2$1;
    }

    public int size() {
        boolean bl2;
        Iterator iterator = this.val$set1.iterator();
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            Set set = this.val$set2;
            Object e2 = iterator.next();
            bl2 = set.contains(e2);
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }
}

