/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.LinkedListMultimap$1;
import com.google.common.collect.LinkedListMultimap$Node;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

class LinkedListMultimap$DistinctKeyIterator
implements Iterator {
    LinkedListMultimap$Node current;
    int expectedModCount;
    LinkedListMultimap$Node next;
    final Set seenKeys;
    final /* synthetic */ LinkedListMultimap this$0;

    private LinkedListMultimap$DistinctKeyIterator(LinkedListMultimap linkedListMultimap) {
        int n3;
        this.this$0 = linkedListMultimap;
        Object object = Sets.newHashSetWithExpectedSize(linkedListMultimap.keySet().size());
        this.seenKeys = object;
        this.next = object = LinkedListMultimap.access$200(linkedListMultimap);
        this.expectedModCount = n3 = LinkedListMultimap.access$000(linkedListMultimap);
    }

    public /* synthetic */ LinkedListMultimap$DistinctKeyIterator(LinkedListMultimap linkedListMultimap, LinkedListMultimap$1 linkedListMultimap$1) {
        this(linkedListMultimap);
    }

    private void checkForConcurrentModification() {
        int n3;
        Serializable serializable = this.this$0;
        int n4 = LinkedListMultimap.access$000(serializable);
        if (n4 == (n3 = this.expectedModCount)) {
            return;
        }
        serializable = new ConcurrentModificationException();
        throw serializable;
    }

    public boolean hasNext() {
        boolean bl2;
        this.checkForConcurrentModification();
        LinkedListMultimap$Node linkedListMultimap$Node = this.next;
        if (linkedListMultimap$Node != null) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedListMultimap$Node = null;
        }
        return bl2;
    }

    public Object next() {
        this.checkForConcurrentModification();
        Object object = this.next;
        if (object != null) {
            boolean bl2;
            this.current = object;
            Set set = this.seenKeys;
            object = ((LinkedListMultimap$Node)object).key;
            set.add(object);
            do {
                this.next = object = this.next.next;
            } while (object != null && !(bl2 = (set = this.seenKeys).add(object = ((LinkedListMultimap$Node)object).key)));
            return this.current.key;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public void remove() {
        int n3;
        this.checkForConcurrentModification();
        Object object = this.current;
        if (object != null) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        Preconditions.checkState(n3 != 0, "no calls to next() since the last call to remove()");
        object = this.this$0;
        Object object2 = this.current.key;
        LinkedListMultimap.access$400((LinkedListMultimap)object, object2);
        this.current = null;
        this.expectedModCount = n3 = LinkedListMultimap.access$000(this.this$0);
    }
}

