/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.AbstractMapEntry;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.NullnessCasts;

final class HashBiMap$EntryForValue
extends AbstractMapEntry {
    final HashBiMap biMap;
    int index;
    final Object value;

    public HashBiMap$EntryForValue(HashBiMap object, int n3) {
        this.biMap = object;
        this.value = object = NullnessCasts.uncheckedCastNullableTToT(((HashBiMap)object).values[n3]);
        this.index = n3;
    }

    private void updateIndex() {
        block3: {
            Object object;
            Object[] objectArray;
            int n3;
            block2: {
                Object object2;
                n3 = this.index;
                int n4 = -1;
                if (n3 == n4) break block2;
                objectArray = this.biMap;
                int n7 = objectArray.size;
                if (n3 <= n7 && (n3 = (int)(Objects.equal(object2 = this.value, object = (objectArray = objectArray.values)[n3]) ? 1 : 0)) != 0) break block3;
            }
            object = this.biMap;
            objectArray = this.value;
            this.index = n3 = ((HashBiMap)object).findEntryByValue(objectArray);
        }
    }

    public Object getKey() {
        return this.value;
    }

    public Object getValue() {
        Object object;
        this.updateIndex();
        int n3 = this.index;
        int n4 = -1;
        if (n3 == n4) {
            object = NullnessCasts.unsafeNull();
        } else {
            Object[] objectArray = this.biMap.keys;
            object = NullnessCasts.uncheckedCastNullableTToT(objectArray[n3]);
        }
        return object;
    }

    public Object setValue(Object object) {
        this.updateIndex();
        int n3 = this.index;
        int n4 = -1;
        if (n3 == n4) {
            HashBiMap hashBiMap = this.biMap;
            Object object2 = this.value;
            hashBiMap.putInverse(object2, object, false);
            return NullnessCasts.unsafeNull();
        }
        Object object3 = this.biMap.keys;
        Object object4 = NullnessCasts.uncheckedCastNullableTToT(object3[n3]);
        n4 = (int)(Objects.equal(object4, object) ? 1 : 0);
        if (n4 != 0) {
            return object;
        }
        object3 = this.biMap;
        int n7 = this.index;
        HashBiMap.access$400((HashBiMap)object3, n7, object, false);
        return object4;
    }
}

