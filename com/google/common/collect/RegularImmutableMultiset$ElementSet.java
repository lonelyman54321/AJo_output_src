/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.IndexedImmutableSet;
import com.google.common.collect.RegularImmutableMultiset;
import com.google.common.collect.RegularImmutableMultiset$1;

final class RegularImmutableMultiset$ElementSet
extends IndexedImmutableSet {
    final /* synthetic */ RegularImmutableMultiset this$0;

    private RegularImmutableMultiset$ElementSet(RegularImmutableMultiset regularImmutableMultiset) {
        this.this$0 = regularImmutableMultiset;
    }

    public /* synthetic */ RegularImmutableMultiset$ElementSet(RegularImmutableMultiset regularImmutableMultiset, RegularImmutableMultiset$1 regularImmutableMultiset$1) {
        this(regularImmutableMultiset);
    }

    public boolean contains(Object object) {
        return this.this$0.contains(object);
    }

    public Object get(int n3) {
        return this.this$0.contents.getKey(n3);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.this$0.contents.size();
    }
}

