/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractBiMap;
import com.google.common.collect.AbstractBiMap$BiMapEntry;
import java.util.Iterator;
import java.util.Map;

class AbstractBiMap$1
implements Iterator {
    Map.Entry entry;
    final /* synthetic */ AbstractBiMap this$0;
    final /* synthetic */ Iterator val$iterator;

    public AbstractBiMap$1(AbstractBiMap abstractBiMap, Iterator iterator) {
        this.this$0 = abstractBiMap;
        this.val$iterator = iterator;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public Map.Entry next() {
        Map.Entry entry;
        this.entry = entry = (Map.Entry)this.val$iterator.next();
        AbstractBiMap abstractBiMap = this.this$0;
        AbstractBiMap$BiMapEntry abstractBiMap$BiMapEntry = new AbstractBiMap$BiMapEntry(abstractBiMap, entry);
        return abstractBiMap$BiMapEntry;
    }

    public void remove() {
        Object object = this.entry;
        if (object != null) {
            object = object.getValue();
            this.val$iterator.remove();
            AbstractBiMap.access$600(this.this$0, object);
            this.entry = null;
            return;
        }
        object = new IllegalStateException("no calls to next() since the last call to remove()");
        throw object;
    }
}

