/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Maps$DescendingMap;
import com.google.common.collect.Maps$EntrySet;
import java.util.Iterator;
import java.util.Map;

class Maps$DescendingMap$1EntrySetImpl
extends Maps$EntrySet {
    final /* synthetic */ Maps$DescendingMap this$0;

    public Maps$DescendingMap$1EntrySetImpl(Maps$DescendingMap maps$DescendingMap) {
        this.this$0 = maps$DescendingMap;
    }

    public Iterator iterator() {
        return this.this$0.entryIterator();
    }

    public Map map() {
        return this.this$0;
    }
}

