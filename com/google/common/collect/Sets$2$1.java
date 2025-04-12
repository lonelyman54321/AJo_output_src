/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Sets$2;
import java.util.Iterator;
import java.util.Set;

class Sets$2$1
extends AbstractIterator {
    final Iterator itr;
    final /* synthetic */ Sets$2 this$0;

    public Sets$2$1(Sets$2 object) {
        this.this$0 = object;
        this.itr = object = ((Sets$2)object).val$set1.iterator();
    }

    public Object computeNext() {
        Iterator iterator;
        boolean bl2;
        while (bl2 = (iterator = this.itr).hasNext()) {
            Set set = this.this$0.val$set2;
            iterator = this.itr.next();
            boolean bl3 = set.contains(iterator);
            if (!bl3) continue;
            return iterator;
        }
        return this.endOfData();
    }
}

