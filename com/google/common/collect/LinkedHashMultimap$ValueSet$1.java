/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedHashMultimap$ValueEntry;
import com.google.common.collect.LinkedHashMultimap$ValueSet;
import com.google.common.collect.LinkedHashMultimap$ValueSetLink;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class LinkedHashMultimap$ValueSet$1
implements Iterator {
    int expectedModCount;
    LinkedHashMultimap$ValueSetLink nextEntry;
    final /* synthetic */ LinkedHashMultimap$ValueSet this$1;
    LinkedHashMultimap$ValueEntry toRemove;

    public LinkedHashMultimap$ValueSet$1(LinkedHashMultimap$ValueSet linkedHashMultimap$ValueSet) {
        int n3;
        LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink;
        this.this$1 = linkedHashMultimap$ValueSet;
        this.nextEntry = linkedHashMultimap$ValueSetLink = LinkedHashMultimap$ValueSet.access$000(linkedHashMultimap$ValueSet);
        this.expectedModCount = n3 = LinkedHashMultimap$ValueSet.access$100(linkedHashMultimap$ValueSet);
    }

    private void checkForComodification() {
        int n3;
        Object object = this.this$1;
        int n4 = LinkedHashMultimap$ValueSet.access$100((LinkedHashMultimap$ValueSet)object);
        if (n4 == (n3 = this.expectedModCount)) {
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public boolean hasNext() {
        boolean bl2;
        this.checkForComodification();
        LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink = this.nextEntry;
        LinkedHashMultimap$ValueSet linkedHashMultimap$ValueSet = this.this$1;
        if (linkedHashMultimap$ValueSetLink != linkedHashMultimap$ValueSet) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedHashMultimap$ValueSetLink = null;
        }
        return bl2;
    }

    public Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink = (LinkedHashMultimap$ValueEntry)this.nextEntry;
            Object object = linkedHashMultimap$ValueSetLink.getValue();
            this.toRemove = linkedHashMultimap$ValueSetLink;
            linkedHashMultimap$ValueSetLink = linkedHashMultimap$ValueSetLink.getSuccessorInValueSet();
            this.nextEntry = linkedHashMultimap$ValueSetLink;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        int n3;
        this.checkForComodification();
        LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink = this.toRemove;
        if (linkedHashMultimap$ValueSetLink != null) {
            n3 = 1;
        } else {
            n3 = 0;
            linkedHashMultimap$ValueSetLink = null;
        }
        Preconditions.checkState(n3 != 0, "no calls to next() since the last call to remove()");
        linkedHashMultimap$ValueSetLink = this.this$1;
        Object object = this.toRemove.getValue();
        ((LinkedHashMultimap$ValueSet)linkedHashMultimap$ValueSetLink).remove(object);
        this.expectedModCount = n3 = LinkedHashMultimap$ValueSet.access$100(this.this$1);
        this.toRemove = null;
    }
}

