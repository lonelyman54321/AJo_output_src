/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap$KeysSerializedForm;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;

class ImmutableMultimap$Keys
extends ImmutableMultiset {
    final /* synthetic */ ImmutableMultimap this$0;

    public ImmutableMultimap$Keys(ImmutableMultimap immutableMultimap) {
        this.this$0 = immutableMultimap;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use KeysSerializedForm");
        throw object;
    }

    public boolean contains(Object object) {
        return this.this$0.containsKey(object);
    }

    public int count(Object object) {
        int n3;
        ImmutableMap immutableMap = this.this$0.map;
        if ((object = (Collection)immutableMap.get(object)) == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.size();
        }
        return n3;
    }

    public ImmutableSet elementSet() {
        return this.this$0.keySet();
    }

    public Multiset$Entry getEntry(int n3) {
        Map.Entry entry = (Map.Entry)this.this$0.map.entrySet().asList().get(n3);
        Object k2 = entry.getKey();
        n3 = ((Collection)entry.getValue()).size();
        return Multisets.immutableEntry(k2, n3);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.this$0.size();
    }

    public Object writeReplace() {
        ImmutableMultimap immutableMultimap = this.this$0;
        ImmutableMultimap$KeysSerializedForm immutableMultimap$KeysSerializedForm = new ImmutableMultimap$KeysSerializedForm(immutableMultimap);
        return immutableMultimap$KeysSerializedForm;
    }
}

