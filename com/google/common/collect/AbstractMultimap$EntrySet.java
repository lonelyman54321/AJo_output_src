/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.AbstractMultimap$Entries;
import com.google.common.collect.Sets;
import java.util.Set;

class AbstractMultimap$EntrySet
extends AbstractMultimap$Entries
implements Set {
    public AbstractMultimap$EntrySet(AbstractMultimap abstractMultimap) {
        super(abstractMultimap);
    }

    public boolean equals(Object object) {
        return Sets.equalsImpl(this, object);
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }
}

