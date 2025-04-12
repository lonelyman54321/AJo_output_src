/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.TransformedIterator;
import java.util.Iterator;
import java.util.Map;

class Maps$2
extends TransformedIterator {
    public Maps$2(Iterator iterator) {
        super(iterator);
    }

    public Object transform(Map.Entry entry) {
        return entry.getValue();
    }
}

