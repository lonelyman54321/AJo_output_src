/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection;
import com.google.common.collect.AbstractMapBasedMultimap$WrappedList;
import java.util.List;
import java.util.RandomAccess;

class AbstractMapBasedMultimap$RandomAccessWrappedList
extends AbstractMapBasedMultimap$WrappedList
implements RandomAccess {
    public AbstractMapBasedMultimap$RandomAccessWrappedList(AbstractMapBasedMultimap abstractMapBasedMultimap, Object object, List list, AbstractMapBasedMultimap$WrappedCollection abstractMapBasedMultimap$WrappedCollection) {
        super(abstractMapBasedMultimap, object, list, abstractMapBasedMultimap$WrappedCollection);
    }
}

