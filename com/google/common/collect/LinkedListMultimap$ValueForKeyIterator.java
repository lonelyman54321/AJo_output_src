/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.LinkedListMultimap$KeyList;
import com.google.common.collect.LinkedListMultimap$Node;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class LinkedListMultimap$ValueForKeyIterator
implements ListIterator {
    LinkedListMultimap$Node current;
    final Object key;
    LinkedListMultimap$Node next;
    int nextIndex;
    LinkedListMultimap$Node previous;
    final /* synthetic */ LinkedListMultimap this$0;

    public LinkedListMultimap$ValueForKeyIterator(LinkedListMultimap object, Object object2) {
        this.this$0 = object;
        this.key = object2;
        object = (LinkedListMultimap$KeyList)LinkedListMultimap.access$500((LinkedListMultimap)object).get(object2);
        object = object == null ? null : ((LinkedListMultimap$KeyList)object).head;
        this.next = object;
    }

    public LinkedListMultimap$ValueForKeyIterator(LinkedListMultimap object, Object object2, int n3) {
        this.this$0 = object;
        object = (LinkedListMultimap$KeyList)LinkedListMultimap.access$500((LinkedListMultimap)object).get(object2);
        int n4 = object == null ? 0 : ((LinkedListMultimap$KeyList)object).count;
        Preconditions.checkPositionIndex(n3, n4);
        int n7 = n4 / 2;
        if (n3 >= n7) {
            int n8;
            if (object == null) {
                n8 = 0;
                object = null;
            } else {
                object = ((LinkedListMultimap$KeyList)object).tail;
            }
            this.previous = object;
            this.nextIndex = n4;
            while (true) {
                n8 = n3 + 1;
                if (n3 < n4) {
                    this.previous();
                    n3 = n8;
                    continue;
                }
                break;
            }
        } else {
            int n10;
            if (object == null) {
                n10 = 0;
                object = null;
            } else {
                object = ((LinkedListMultimap$KeyList)object).head;
            }
            this.next = object;
            while (true) {
                n10 = n3 + -1;
                if (n3 <= 0) break;
                this.next();
                n3 = n10;
            }
        }
        this.key = object2;
        this.current = null;
    }

    public void add(Object object) {
        int n3;
        LinkedListMultimap linkedListMultimap = this.this$0;
        Object object2 = this.key;
        LinkedListMultimap$Node linkedListMultimap$Node = this.next;
        this.previous = object = LinkedListMultimap.access$600(linkedListMultimap, object2, object, linkedListMultimap$Node);
        this.nextIndex = n3 = this.nextIndex + 1;
        this.current = null;
    }

    public boolean hasNext() {
        boolean bl2;
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
        LinkedListMultimap$Node linkedListMultimap$Node = this.previous;
        if (linkedListMultimap$Node != null) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedListMultimap$Node = null;
        }
        return bl2;
    }

    public Object next() {
        Object object = this.next;
        if (object != null) {
            int n3;
            LinkedListMultimap$Node linkedListMultimap$Node;
            this.current = object;
            this.previous = object;
            this.next = linkedListMultimap$Node = ((LinkedListMultimap$Node)object).nextSibling;
            this.nextIndex = n3 = this.nextIndex + 1;
            return ((LinkedListMultimap$Node)object).value;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public int nextIndex() {
        return this.nextIndex;
    }

    public Object previous() {
        Object object = this.previous;
        if (object != null) {
            int n3;
            LinkedListMultimap$Node linkedListMultimap$Node;
            this.current = object;
            this.next = object;
            this.previous = linkedListMultimap$Node = ((LinkedListMultimap$Node)object).previousSibling;
            this.nextIndex = n3 = this.nextIndex + -1;
            return ((LinkedListMultimap$Node)object).value;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public int previousIndex() {
        return this.nextIndex + -1;
    }

    public void remove() {
        boolean bl2;
        LinkedListMultimap$Node linkedListMultimap$Node = this.current;
        int n3 = 1;
        if (linkedListMultimap$Node != null) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedListMultimap$Node = null;
        }
        Preconditions.checkState(bl2, "no calls to next() since the last call to remove()");
        linkedListMultimap$Node = this.current;
        LinkedListMultimap$Node linkedListMultimap$Node2 = this.next;
        if (linkedListMultimap$Node != linkedListMultimap$Node2) {
            int n4;
            this.previous = linkedListMultimap$Node2 = linkedListMultimap$Node.previousSibling;
            this.nextIndex = n4 = this.nextIndex - n3;
        } else {
            LinkedListMultimap$Node linkedListMultimap$Node3;
            this.next = linkedListMultimap$Node3 = linkedListMultimap$Node.nextSibling;
        }
        LinkedListMultimap.access$300(this.this$0, linkedListMultimap$Node);
        this.current = null;
    }

    public void set(Object object) {
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

