/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Multimaps$MapMultimap$1;
import com.google.common.collect.NullnessCasts;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

class Multimaps$MapMultimap$1$1
implements Iterator {
    int i;
    final /* synthetic */ Multimaps$MapMultimap$1 this$1;

    public Multimaps$MapMultimap$1$1(Multimaps$MapMultimap$1 var1_1) {
        this.this$1 = var1_1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean hasNext() {
        int n3 = this.i;
        if (n3 != 0) return 0 != 0;
        Object object = this.this$1;
        Map map2 = ((Multimaps$MapMultimap$1)object).this$0.map;
        object = ((Multimaps$MapMultimap$1)object).val$key;
        n3 = map2.containsKey(object);
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    public Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            this.i = n3 = this.i + 1;
            Object object = this.this$1;
            Map map2 = ((Multimaps$MapMultimap$1)object).this$0.map;
            object = ((Multimaps$MapMultimap$1)object).val$key;
            return NullnessCasts.uncheckedCastNullableTToT(map2.get(object));
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        Map map2;
        int n3 = this.i;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
            map2 = null;
        }
        CollectPreconditions.checkRemove(n4 != 0);
        this.i = -1;
        Object object = this.this$1;
        map2 = ((Multimaps$MapMultimap$1)object).this$0.map;
        object = ((Multimaps$MapMultimap$1)object).val$key;
        map2.remove(object);
    }
}

