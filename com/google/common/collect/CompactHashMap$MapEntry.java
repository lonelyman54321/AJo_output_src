/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.AbstractMapEntry;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.NullnessCasts;

final class CompactHashMap$MapEntry
extends AbstractMapEntry {
    private final Object key;
    private int lastKnownIndex;
    final /* synthetic */ CompactHashMap this$0;

    public CompactHashMap$MapEntry(CompactHashMap object, int n3) {
        this.this$0 = object;
        this.key = object = CompactHashMap.access$100((CompactHashMap)object, n3);
        this.lastKnownIndex = n3;
    }

    private void updateLastKnownIndex() {
        block3: {
            Object object;
            Object object2;
            int n3;
            block2: {
                n3 = this.lastKnownIndex;
                int n4 = -1;
                if (n3 == n4 || n3 >= (n4 = ((CompactHashMap)(object2 = this.this$0)).size())) break block2;
                object = this.key;
                object2 = this.this$0;
                int n7 = this.lastKnownIndex;
                n3 = (int)(Objects.equal(object, object2 = CompactHashMap.access$100((CompactHashMap)object2, n7)) ? 1 : 0);
                if (n3 != 0) break block3;
            }
            object = this.this$0;
            object2 = this.key;
            this.lastKnownIndex = n3 = CompactHashMap.access$500((CompactHashMap)object, object2);
        }
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        Object object = this.this$0.delegateOrNull();
        if (object != null) {
            Object object2 = this.key;
            return NullnessCasts.uncheckedCastNullableTToT(object.get(object2));
        }
        this.updateLastKnownIndex();
        int n3 = this.lastKnownIndex;
        int n4 = -1;
        if (n3 == n4) {
            object = NullnessCasts.unsafeNull();
        } else {
            CompactHashMap compactHashMap = this.this$0;
            object = CompactHashMap.access$600(compactHashMap, n3);
        }
        return object;
    }

    public Object setValue(Object object) {
        Object object2 = this.this$0.delegateOrNull();
        if (object2 != null) {
            Object object3 = this.key;
            return NullnessCasts.uncheckedCastNullableTToT(object2.put(object3, object));
        }
        this.updateLastKnownIndex();
        int n3 = this.lastKnownIndex;
        int n4 = -1;
        if (n3 == n4) {
            object2 = this.this$0;
            Object object4 = this.key;
            ((CompactHashMap)object2).put(object4, object);
            return NullnessCasts.unsafeNull();
        }
        object2 = CompactHashMap.access$600(this.this$0, n3);
        CompactHashMap compactHashMap = this.this$0;
        int n7 = this.lastKnownIndex;
        CompactHashMap.access$1300(compactHashMap, n7, object);
        return object2;
    }
}

