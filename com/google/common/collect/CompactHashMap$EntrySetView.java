/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashing;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class CompactHashMap$EntrySetView
extends AbstractSet {
    final /* synthetic */ CompactHashMap this$0;

    public CompactHashMap$EntrySetView(CompactHashMap compactHashMap) {
        this.this$0 = compactHashMap;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object object) {
        boolean bl2;
        int n3;
        Object object2;
        Object object3 = this.this$0.delegateOrNull();
        if (object3 != null) {
            return object3.entrySet().contains(object);
        }
        int n4 = object instanceof Map.Entry;
        boolean bl3 = false;
        if (n4 != 0 && (n4 = CompactHashMap.access$500((CompactHashMap)(object3 = this.this$0), object2 = (object = (Map.Entry)object).getKey())) != (n3 = -1) && (bl2 = Objects.equal(object3 = CompactHashMap.access$600(object2 = this.this$0, n4), object = object.getValue()))) {
            bl3 = true;
        }
        return bl3;
    }

    public Iterator iterator() {
        return this.this$0.entrySetIterator();
    }

    public boolean remove(Object object) {
        Map map2 = this.this$0.delegateOrNull();
        if (map2 != null) {
            return map2.entrySet().remove(object);
        }
        boolean n3 = object instanceof Map.Entry;
        if (n3) {
            int n4;
            Object[] objectArray;
            Object[] objectArray2;
            int[] nArray;
            Object object2;
            Object v4;
            object = (Map.Entry)object;
            map2 = this.this$0;
            boolean bl2 = ((CompactHashMap)map2).needsAllocArrays();
            if (bl2) {
                return false;
            }
            map2 = this.this$0;
            int n7 = CompactHashMap.access$700((CompactHashMap)map2);
            Object k2 = object.getKey();
            int n8 = CompactHashing.remove(k2, v4 = object.getValue(), n7, object2 = CompactHashMap.access$800(this.this$0), nArray = CompactHashMap.access$900(this.this$0), objectArray2 = CompactHashMap.access$1000(this.this$0), objectArray = CompactHashMap.access$1100((CompactHashMap)(object = this.this$0)));
            if (n8 == (n4 = -1)) {
                return false;
            }
            this.this$0.moveLastEntry(n8, n7);
            CompactHashMap.access$1210(this.this$0);
            this.this$0.incrementModCount();
            return true;
        }
        return false;
    }

    public int size() {
        return this.this$0.size();
    }
}

