/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Map;

class Maps$8
extends UnmodifiableIterator {
    final /* synthetic */ Iterator val$entryIterator;

    public Maps$8(Iterator iterator) {
        this.val$entryIterator = iterator;
    }

    public boolean hasNext() {
        return this.val$entryIterator.hasNext();
    }

    public Map.Entry next() {
        return Maps.unmodifiableEntry((Map.Entry)this.val$entryIterator.next());
    }
}

