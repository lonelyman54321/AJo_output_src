/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMap$1EntrySet;
import java.util.AbstractMap;
import java.util.Map;

class ImmutableSortedMap$1EntrySet$1
extends ImmutableList {
    final /* synthetic */ ImmutableSortedMap$1EntrySet this$1;

    public ImmutableSortedMap$1EntrySet$1(ImmutableSortedMap$1EntrySet entrySet) {
        this.this$1 = entrySet;
    }

    public Map.Entry get(int n3) {
        Object e2 = ImmutableSortedMap.access$100(this.this$1.this$0).asList().get(n3);
        Object e5 = ImmutableSortedMap.access$200(this.this$1.this$0).get(n3);
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(e2, e5);
        return simpleImmutableEntry;
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.this$1.this$0.size();
    }
}

