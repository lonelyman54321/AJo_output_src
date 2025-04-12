/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multimaps$MapMultimap;
import com.google.common.collect.Multimaps$MapMultimap$1$1;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import java.util.Iterator;
import java.util.Map;

class Multimaps$MapMultimap$1
extends Sets$ImprovedAbstractSet {
    final /* synthetic */ Multimaps$MapMultimap this$0;
    final /* synthetic */ Object val$key;

    public Multimaps$MapMultimap$1(Multimaps$MapMultimap multimaps$MapMultimap, Object object) {
        this.this$0 = multimaps$MapMultimap;
        this.val$key = object;
    }

    public Iterator iterator() {
        Multimaps$MapMultimap$1$1 multimaps$MapMultimap$1$1 = new Multimaps$MapMultimap$1$1(this);
        return multimaps$MapMultimap$1$1;
    }

    public int size() {
        Map map2 = this.this$0.map;
        Object object = this.val$key;
        return (int)(map2.containsKey(object) ? 1 : 0);
    }
}

