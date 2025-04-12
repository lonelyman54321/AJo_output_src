/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

class AbstractMapBasedMultimap$WrappedSet
extends AbstractMapBasedMultimap$WrappedCollection
implements Set {
    final /* synthetic */ AbstractMapBasedMultimap this$0;

    public AbstractMapBasedMultimap$WrappedSet(AbstractMapBasedMultimap abstractMapBasedMultimap, Object object, Set set) {
        this.this$0 = abstractMapBasedMultimap;
        super(abstractMapBasedMultimap, object, set, null);
    }

    public boolean removeAll(Collection collection) {
        int n3 = collection.isEmpty();
        if (n3 != 0) {
            return false;
        }
        n3 = this.size();
        Collection collection2 = (Set)this.delegate;
        boolean bl2 = Sets.removeAllImpl((Set)collection2, collection);
        if (bl2) {
            collection2 = this.delegate;
            int n4 = collection2.size();
            AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
            AbstractMapBasedMultimap.access$212(abstractMapBasedMultimap, n4 -= n3);
            this.removeIfEmpty();
        }
        return bl2;
    }
}

