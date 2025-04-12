/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Maps;
import com.google.common.collect.Maps$EntrySet;
import com.google.common.collect.Multimaps$AsMap;
import com.google.common.collect.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Multimaps$AsMap$EntrySet
extends Maps$EntrySet {
    final /* synthetic */ Multimaps$AsMap this$0;

    public Multimaps$AsMap$EntrySet(Multimaps$AsMap multimaps$AsMap) {
        this.this$0 = multimaps$AsMap;
    }

    public static /* synthetic */ Collection a(Multimaps$AsMap$EntrySet multimaps$AsMap$EntrySet, Object object) {
        return multimaps$AsMap$EntrySet.lambda$iterator$0(object);
    }

    private /* synthetic */ Collection lambda$iterator$0(Object object) {
        return Multimaps$AsMap.access$200(this.this$0).get(object);
    }

    public Iterator iterator() {
        Set set = Multimaps$AsMap.access$200(this.this$0).keySet();
        e e2 = new e(this);
        return Maps.asMapEntryIterator(set, e2);
    }

    public Map map() {
        return this.this$0;
    }

    public boolean remove(Object object) {
        boolean bl2 = this.contains(object);
        if (!bl2) {
            return false;
        }
        object = (Map.Entry)object;
        Objects.requireNonNull(object);
        object = (Map.Entry)object;
        Multimaps$AsMap multimaps$AsMap = this.this$0;
        object = object.getKey();
        multimaps$AsMap.removeValuesForKey(object);
        return true;
    }
}

