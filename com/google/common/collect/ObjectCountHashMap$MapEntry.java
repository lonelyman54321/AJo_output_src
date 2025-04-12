/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.Multisets$AbstractEntry;
import com.google.common.collect.ObjectCountHashMap;

class ObjectCountHashMap$MapEntry
extends Multisets$AbstractEntry {
    final Object key;
    int lastKnownIndex;
    final /* synthetic */ ObjectCountHashMap this$0;

    public ObjectCountHashMap$MapEntry(ObjectCountHashMap object, int n3) {
        this.this$0 = object;
        this.key = object = ((ObjectCountHashMap)object).keys[n3];
        this.lastKnownIndex = n3;
    }

    public int getCount() {
        this.updateLastKnownIndex();
        int n3 = this.lastKnownIndex;
        int n4 = -1;
        if (n3 == n4) {
            n3 = 0;
        } else {
            int[] nArray = this.this$0.values;
            n3 = nArray[n3];
        }
        return n3;
    }

    public Object getElement() {
        return this.key;
    }

    public int setCount(int n3) {
        this.updateLastKnownIndex();
        int n4 = this.lastKnownIndex;
        int n7 = -1;
        if (n4 == n7) {
            ObjectCountHashMap objectCountHashMap = this.this$0;
            Object object = this.key;
            objectCountHashMap.put(object, n3);
            return 0;
        }
        int[] nArray = this.this$0.values;
        int n8 = nArray[n4];
        nArray[n4] = n3;
        return n8;
    }

    public void updateLastKnownIndex() {
        block3: {
            Object object;
            Object object2;
            int n3;
            block2: {
                n3 = this.lastKnownIndex;
                int n4 = -1;
                if (n3 == n4 || n3 >= (n4 = (object2 = this.this$0).size())) break block2;
                object = this.key;
                object2 = this.this$0.keys;
                int n7 = this.lastKnownIndex;
                n3 = (int)(Objects.equal(object, object2 = object2[n7]) ? 1 : 0);
                if (n3 != 0) break block3;
            }
            object = this.this$0;
            object2 = this.key;
            this.lastKnownIndex = n3 = ((ObjectCountHashMap)object).indexOf(object2);
        }
    }
}

