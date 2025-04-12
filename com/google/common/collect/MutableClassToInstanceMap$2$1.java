/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap$2;
import com.google.common.collect.TransformedIterator;
import java.util.Iterator;
import java.util.Map;

class MutableClassToInstanceMap$2$1
extends TransformedIterator {
    public MutableClassToInstanceMap$2$1(MutableClassToInstanceMap.2 var1_1, Iterator iterator) {
        super(iterator);
    }

    public Map.Entry transform(Map.Entry entry) {
        return MutableClassToInstanceMap.access$100(entry);
    }
}

