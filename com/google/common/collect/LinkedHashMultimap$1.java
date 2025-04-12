/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedHashMultimap$ValueEntry;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

class LinkedHashMultimap$1
implements Iterator {
    LinkedHashMultimap$ValueEntry nextEntry;
    final /* synthetic */ LinkedHashMultimap this$0;
    LinkedHashMultimap$ValueEntry toRemove;

    public LinkedHashMultimap$1(LinkedHashMultimap serializable) {
        this.this$0 = serializable;
        serializable = LinkedHashMultimap.access$300(serializable).getSuccessorInMultimap();
        this.nextEntry = serializable;
    }

    public boolean hasNext() {
        boolean bl2;
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry = this.nextEntry;
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry2 = LinkedHashMultimap.access$300(this.this$0);
        if (linkedHashMultimap$ValueEntry != linkedHashMultimap$ValueEntry2) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedHashMultimap$ValueEntry = null;
        }
        return bl2;
    }

    public Map.Entry next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry;
            LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry2;
            this.toRemove = linkedHashMultimap$ValueEntry2 = this.nextEntry;
            this.nextEntry = linkedHashMultimap$ValueEntry = linkedHashMultimap$ValueEntry2.getSuccessorInMultimap();
            return linkedHashMultimap$ValueEntry2;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        boolean bl2;
        Serializable serializable = this.toRemove;
        if (serializable != null) {
            bl2 = true;
        } else {
            bl2 = false;
            serializable = null;
        }
        Preconditions.checkState(bl2, "no calls to next() since the last call to remove()");
        serializable = this.this$0;
        Object object = this.toRemove.getKey();
        Object object2 = this.toRemove.getValue();
        ((LinkedHashMultimap)serializable).remove(object, object2);
        this.toRemove = null;
    }
}

