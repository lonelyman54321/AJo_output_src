/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashBiMap$EntryForValue;
import com.google.common.collect.HashBiMap$View;
import com.google.common.collect.Hashing;
import java.util.Map;

class HashBiMap$InverseEntrySet
extends HashBiMap$View {
    public HashBiMap$InverseEntrySet(HashBiMap hashBiMap) {
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
            Object[] objectArray = this.biMap;
            n3 = objectArray.findEntryByValue(object2);
            if (n3 != (n4 = -1) && (bl3 = Objects.equal(object2 = (objectArray = this.biMap.keys)[n3], object))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public Map.Entry forEntry(int n3) {
        HashBiMap hashBiMap = this.biMap;
        HashBiMap$EntryForValue hashBiMap$EntryForValue = new HashBiMap$EntryForValue(hashBiMap, n3);
        return hashBiMap$EntryForValue;
    }

    public boolean remove(Object object) {
        int n3 = object instanceof Map.Entry;
        if (n3 != 0) {
            boolean bl2;
            int n4;
            object = (Map.Entry)object;
            Object k2 = object.getKey();
            object = object.getValue();
            Object object2 = this.biMap;
            int n7 = Hashing.smearedHash(k2);
            n3 = ((HashBiMap)object2).findEntryByValue(k2, n7);
            if (n3 != (n4 = -1) && (bl2 = Objects.equal(object2 = this.biMap.keys[n3], object))) {
                this.biMap.removeEntryValueHashKnown(n3, n7);
                return true;
            }
        }
        return false;
    }
}

