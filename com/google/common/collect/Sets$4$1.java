/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Sets$4;
import java.util.Iterator;
import java.util.Set;

class Sets$4$1
extends AbstractIterator {
    final /* synthetic */ Sets$4 this$0;
    final /* synthetic */ Iterator val$itr1;
    final /* synthetic */ Iterator val$itr2;

    public Sets$4$1(Sets$4 sets$4, Iterator iterator, Iterator iterator2) {
        this.this$0 = sets$4;
        this.val$itr1 = iterator;
        this.val$itr2 = iterator2;
    }

    public Object computeNext() {
        boolean bl2;
        Set set;
        Iterator iterator;
        boolean bl3;
        while (bl3 = (iterator = this.val$itr1).hasNext()) {
            set = this.this$0.val$set2;
            iterator = this.val$itr1.next();
            bl2 = set.contains(iterator);
            if (bl2) continue;
            return iterator;
        }
        while (bl3 = (iterator = this.val$itr2).hasNext()) {
            set = this.this$0.val$set1;
            iterator = this.val$itr2.next();
            bl2 = set.contains(iterator);
            if (bl2) continue;
            return iterator;
        }
        return this.endOfData();
    }
}

