/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.TransformedIterator;
import java.util.Iterator;

class Multisets$5
extends TransformedIterator {
    public Multisets$5(Iterator iterator) {
        super(iterator);
    }

    public Object transform(Multiset$Entry multiset$Entry) {
        return multiset$Entry.getElement();
    }
}

