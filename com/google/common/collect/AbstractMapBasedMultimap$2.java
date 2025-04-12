/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMapBasedMultimap$Itr;
import com.google.common.collect.Maps;
import java.util.Map;

class AbstractMapBasedMultimap$2
extends AbstractMapBasedMultimap$Itr {
    public AbstractMapBasedMultimap$2(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        super(abstractMapBasedMultimap);
    }

    public Map.Entry output(Object object, Object object2) {
        return Maps.immutableEntry(object, object2);
    }
}

