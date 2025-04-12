/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ForwardingSet;
import java.util.Collection;
import java.util.Set;

class Maps$4
extends ForwardingSet {
    final /* synthetic */ Set val$set;

    public Maps$4(Set set) {
        this.val$set = set;
    }

    public boolean add(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public boolean addAll(Collection object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public Set delegate() {
        return this.val$set;
    }
}

