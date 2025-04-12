/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap$EntrySet;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

class RegularImmutableMap$EntrySet$1
extends ImmutableList {
    final /* synthetic */ RegularImmutableMap$EntrySet this$0;

    public RegularImmutableMap$EntrySet$1(RegularImmutableMap$EntrySet regularImmutableMap$EntrySet) {
        this.this$0 = regularImmutableMap$EntrySet;
    }

    public Map.Entry get(int n3) {
        int n4 = RegularImmutableMap$EntrySet.access$000(this.this$0);
        Preconditions.checkElementIndex(n3, n4);
        Object object = RegularImmutableMap$EntrySet.access$100(this.this$0);
        int n7 = RegularImmutableMap$EntrySet.access$200(this.this$0) + (n3 *= 2);
        object = object[n7];
        Objects.requireNonNull(object);
        Object object2 = RegularImmutableMap$EntrySet.access$100(this.this$0);
        int n8 = RegularImmutableMap$EntrySet.access$200(this.this$0) ^ 1;
        Object object3 = object2[n3 += n8];
        Objects.requireNonNull(object3);
        object2 = new AbstractMap.SimpleImmutableEntry(object, object3);
        return object2;
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return RegularImmutableMap$EntrySet.access$000(this.this$0);
    }
}

