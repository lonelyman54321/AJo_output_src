/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashBiMap$EntryForKey;
import com.google.common.collect.HashBiMap$View;
import com.google.common.collect.Hashing;
import java.util.Map;

final class HashBiMap$EntrySet
extends HashBiMap$View {
    final /* synthetic */ HashBiMap this$0;

    public HashBiMap$EntrySet(HashBiMap hashBiMap) {
        this.this$0 = hashBiMap;
        super(hashBiMap);
    }

    public boolean contains(Object object) {
        int n3 = object instanceof Map.Entry;
        boolean bl2 = false;
        if (n3 != 0) {
            boolean bl3;
            int n4;
            object = (Map.Entry)object;
            Object object2 = object.getKey();
            object = object.getValue();
            Object[] objectArray = this.this$0;
            n3 = objectArray.findEntryByKey(object2);
            if (n3 != (n4 = -1) && (bl3 = Objects.equal(object, object2 = (objectArray = this.this$0.values)[n3]))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public Map.Entry forEntry(int n3) {
        HashBiMap hashBiMap = this.this$0;
        HashBiMap$EntryForKey hashBiMap$EntryForKey = new HashBiMap$EntryForKey(hashBiMap, n3);
        return hashBiMap$EntryForKey;
    }

    public boolean remove(Object object) {
        int n3 = object instanceof Map.Entry;
        if (n3 != 0) {
            boolean bl2;
            int n4;
            object = (Map.Entry)object;
            Object k2 = object.getKey();
            object = object.getValue();
            Object object2 = this.this$0;
            int n7 = Hashing.smearedHash(k2);
            n3 = ((HashBiMap)object2).findEntryByKey(k2, n7);
            if (n3 != (n4 = -1) && (bl2 = Objects.equal(object, object2 = this.this$0.values[n3]))) {
                this.this$0.removeEntryKeyHashKnown(n3, n7);
                return true;
            }
        }
        return false;
    }
}

