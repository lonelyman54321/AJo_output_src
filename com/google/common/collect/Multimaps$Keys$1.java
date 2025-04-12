/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multimaps$Keys;
import com.google.common.collect.Multimaps$Keys$1$1;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.TransformedIterator;
import java.util.Iterator;
import java.util.Map;

class Multimaps$Keys$1
extends TransformedIterator {
    public Multimaps$Keys$1(Multimaps.Keys keys, Iterator iterator) {
        super(iterator);
    }

    public Multiset$Entry transform(Map.Entry entry) {
        Multimaps$Keys$1$1 multimaps$Keys$1$1 = new Multimaps$Keys$1$1(this, entry);
        return multimaps$Keys$1$1;
    }
}

