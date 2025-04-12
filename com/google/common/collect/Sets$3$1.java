/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Sets$3;
import java.util.Iterator;
import java.util.Set;

class Sets$3$1
extends AbstractIterator {
    final Iterator itr;
    final /* synthetic */ Sets$3 this$0;

    public Sets$3$1(Sets$3 object) {
        this.this$0 = object;
        this.itr = object = ((Sets$3)object).val$set1.iterator();
    }

    public Object computeNext() {
        Iterator iterator;
        boolean bl2;
        while (bl2 = (iterator = this.itr).hasNext()) {
            Set set = this.this$0.val$set2;
            iterator = this.itr.next();
            boolean bl3 = set.contains(iterator);
            if (bl3) continue;
            return iterator;
        }
        return this.endOfData();
    }
}

