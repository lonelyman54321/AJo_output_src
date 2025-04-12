/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.LinkedListMultimap$Node;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;

class LinkedListMultimap$NodeIterator
implements ListIterator {
    LinkedListMultimap$Node current;
    int expectedModCount;
    LinkedListMultimap$Node next;
    int nextIndex;
    LinkedListMultimap$Node previous;
    final /* synthetic */ LinkedListMultimap this$0;

    public LinkedListMultimap$NodeIterator(LinkedListMultimap object, int n3) {
        int n4;
        this.this$0 = object;
        this.expectedModCount = n4 = LinkedListMultimap.access$000((LinkedListMultimap)object);
        n4 = ((LinkedListMultimap)object).size();
        Preconditions.checkPositionIndex(n3, n4);
        int n7 = n4 / 2;
        if (n3 >= n7) {
            this.previous = object = LinkedListMultimap.access$100((LinkedListMultimap)object);
            this.nextIndex = n4;
            while (true) {
                int n8 = n3 + 1;
                if (n3 < n4) {
                    this.previous();
                    n3 = n8;
                    continue;
                }
                break;
            }
        } else {
            this.next = object = LinkedListMultimap.access$200((LinkedListMultimap)object);
            while (true) {
                int n10 = n3 + -1;
                if (n3 <= 0) break;
                this.next();
                n3 = n10;
            }
        }
        this.current = null;
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

    public void add(Map.Entry object) {
        object = new UnsupportedOperationException();
        throw object;
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

    public boolean hasPrevious() {
        boolean bl2;
        this.checkForConcurrentModification();
        LinkedListMultimap$Node linkedListMultimap$Node = this.previous;
        if (linkedListMultimap$Node != null) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedListMultimap$Node = null;
        }
        return bl2;
    }

    public LinkedListMultimap$Node next() {
        this.checkForConcurrentModification();
        Object object = this.next;
        if (object != null) {
            int n3;
            LinkedListMultimap$Node linkedListMultimap$Node;
            this.current = object;
            this.previous = object;
            this.next = linkedListMultimap$Node = ((LinkedListMultimap$Node)object).next;
            this.nextIndex = n3 = this.nextIndex + 1;
            return object;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public int nextIndex() {
        return this.nextIndex;
    }

    public LinkedListMultimap$Node previous() {
        this.checkForConcurrentModification();
        Object object = this.previous;
        if (object != null) {
            int n3;
            LinkedListMultimap$Node linkedListMultimap$Node;
            this.current = object;
            this.next = object;
            this.previous = linkedListMultimap$Node = ((LinkedListMultimap$Node)object).previous;
            this.nextIndex = n3 = this.nextIndex + -1;
            return object;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public int previousIndex() {
        return this.nextIndex + -1;
    }

    public void remove() {
        int n3;
        this.checkForConcurrentModification();
        LinkedListMultimap$Node linkedListMultimap$Node = this.current;
        int n4 = 1;
        if (linkedListMultimap$Node != null) {
            n3 = 1;
        } else {
            n3 = 0;
            linkedListMultimap$Node = null;
        }
        Preconditions.checkState(n3 != 0, "no calls to next() since the last call to remove()");
        linkedListMultimap$Node = this.current;
        LinkedListMultimap$Node linkedListMultimap$Node2 = this.next;
        if (linkedListMultimap$Node != linkedListMultimap$Node2) {
            int n7;
            this.previous = linkedListMultimap$Node2 = linkedListMultimap$Node.previous;
            this.nextIndex = n7 = this.nextIndex - n4;
        } else {
            LinkedListMultimap$Node linkedListMultimap$Node3;
            this.next = linkedListMultimap$Node3 = linkedListMultimap$Node.next;
        }
        LinkedListMultimap.access$300(this.this$0, linkedListMultimap$Node);
        this.current = null;
        this.expectedModCount = n3 = LinkedListMultimap.access$000(this.this$0);
    }

    public void set(Map.Entry object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public void setValue(Object object) {
        boolean bl2;
        LinkedListMultimap$Node linkedListMultimap$Node = this.current;
        if (linkedListMultimap$Node != null) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedListMultimap$Node = null;
        }
        Preconditions.checkState(bl2);
        this.current.value = object;
    }
}

