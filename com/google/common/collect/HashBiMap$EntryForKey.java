/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.AbstractMapEntry;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.NullnessCasts;

final class HashBiMap$EntryForKey
extends AbstractMapEntry {
    int index;
    final Object key;
    final /* synthetic */ HashBiMap this$0;

    public HashBiMap$EntryForKey(HashBiMap object, int n3) {
        this.this$0 = object;
        this.key = object = NullnessCasts.uncheckedCastNullableTToT(((HashBiMap)object).keys[n3]);
        this.index = n3;
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        Object object;
        this.updateIndex();
        int n3 = this.index;
        int n4 = -1;
        if (n3 == n4) {
            object = NullnessCasts.unsafeNull();
        } else {
            Object[] objectArray = this.this$0.values;
            object = NullnessCasts.uncheckedCastNullableTToT(objectArray[n3]);
        }
        return object;
    }

    public Object setValue(Object object) {
        this.updateIndex();
        int n3 = this.index;
        int n4 = -1;
        if (n3 == n4) {
            HashBiMap hashBiMap = this.this$0;
            Object object2 = this.key;
            hashBiMap.put(object2, object);
            return NullnessCasts.unsafeNull();
        }
        Object object3 = this.this$0.values;
        Object object4 = NullnessCasts.uncheckedCastNullableTToT(object3[n3]);
        n4 = (int)(Objects.equal(object4, object) ? 1 : 0);
        if (n4 != 0) {
            return object;
        }
        object3 = this.this$0;
        int n7 = this.index;
        HashBiMap.access$200((HashBiMap)object3, n7, object, false);
        return object4;
    }

    public void updateIndex() {
        block3: {
            Object object;
            Object object2;
            int n3;
            block2: {
                n3 = this.index;
                int n4 = -1;
                if (n3 == n4) break block2;
                object2 = this.this$0;
                int n7 = ((HashBiMap)object2).size;
                if (n3 <= n7 && (n3 = (int)(Objects.equal(object = ((HashBiMap)object2).keys[n3], object2 = this.key) ? 1 : 0)) != 0) break block3;
            }
            object = this.this$0;
            object2 = this.key;
            this.index = n3 = ((HashBiMap)object).findEntryByKey(object2);
        }
    }
}

