/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ForwardingSet;
import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap$2$1;
import java.util.Iterator;
import java.util.Set;

class MutableClassToInstanceMap$2
extends ForwardingSet {
    final /* synthetic */ MutableClassToInstanceMap this$0;

    public MutableClassToInstanceMap$2(MutableClassToInstanceMap mutableClassToInstanceMap) {
        this.this$0 = mutableClassToInstanceMap;
    }

    public Set delegate() {
        return this.this$0.delegate().entrySet();
    }

    public Iterator iterator() {
        Iterator iterator = this.delegate().iterator();
        MutableClassToInstanceMap$2$1 mutableClassToInstanceMap$2$1 = new MutableClassToInstanceMap$2$1(this, iterator);
        return mutableClassToInstanceMap$2$1;
    }

    public Object[] toArray() {
        return this.standardToArray();
    }

    public Object[] toArray(Object[] objectArray) {
        return this.standardToArray(objectArray);
    }
}

