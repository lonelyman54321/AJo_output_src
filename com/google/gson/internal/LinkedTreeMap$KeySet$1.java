/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.LinkedTreeMap$KeySet;
import com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator;

class LinkedTreeMap$KeySet$1
extends LinkedTreeMap$LinkedTreeMapIterator {
    final /* synthetic */ LinkedTreeMap$KeySet this$1;

    public LinkedTreeMap$KeySet$1(LinkedTreeMap$KeySet object) {
        this.this$1 = object;
        object = ((LinkedTreeMap$KeySet)object).this$0;
        super((LinkedTreeMap)object);
    }

    public Object next() {
        return this.nextNode().key;
    }
}

