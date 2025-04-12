/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashBiMap$View;
import com.google.common.collect.Hashing;
import com.google.common.collect.NullnessCasts;

final class HashBiMap$ValueSet
extends HashBiMap$View {
    final /* synthetic */ HashBiMap this$0;

    public HashBiMap$ValueSet(HashBiMap hashBiMap) {
        this.this$0 = hashBiMap;
        super(hashBiMap);
    }

    public boolean contains(Object object) {
        return this.this$0.containsValue(object);
    }

    public Object forEntry(int n3) {
        return NullnessCasts.uncheckedCastNullableTToT(this.this$0.values[n3]);
    }

    public boolean remove(Object object) {
        int n3;
        HashBiMap hashBiMap = this.this$0;
        int n4 = Hashing.smearedHash(object);
        int n7 = hashBiMap.findEntryByValue(object, n4);
        if (n7 != (n3 = -1)) {
            this.this$0.removeEntryValueHashKnown(n7, n4);
            return true;
        }
        return false;
    }
}

