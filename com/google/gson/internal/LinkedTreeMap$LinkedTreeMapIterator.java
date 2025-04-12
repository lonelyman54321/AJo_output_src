/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.LinkedTreeMap$Node;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class LinkedTreeMap$LinkedTreeMapIterator
implements Iterator {
    int expectedModCount;
    LinkedTreeMap$Node lastReturned;
    LinkedTreeMap$Node next;
    final /* synthetic */ LinkedTreeMap this$0;

    public LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap linkedTreeMap) {
        int n3;
        LinkedTreeMap$Node linkedTreeMap$Node;
        this.this$0 = linkedTreeMap;
        this.next = linkedTreeMap$Node = linkedTreeMap.header.next;
        this.lastReturned = null;
        this.expectedModCount = n3 = linkedTreeMap.modCount;
    }

    public final boolean hasNext() {
        boolean bl2;
        LinkedTreeMap$Node linkedTreeMap$Node = this.next;
        LinkedTreeMap$Node linkedTreeMap$Node2 = this.this$0.header;
        if (linkedTreeMap$Node != linkedTreeMap$Node2) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedTreeMap$Node = null;
        }
        return bl2;
    }

    public final LinkedTreeMap$Node nextNode() {
        Object object = this.next;
        Object object2 = this.this$0;
        LinkedTreeMap$Node linkedTreeMap$Node = ((LinkedTreeMap)object2).header;
        if (object != linkedTreeMap$Node) {
            int n3 = ((LinkedTreeMap)object2).modCount;
            int n4 = this.expectedModCount;
            if (n3 == n4) {
                this.next = object2 = ((LinkedTreeMap$Node)object).next;
                this.lastReturned = object;
                return object;
            }
            object = new ConcurrentModificationException();
            throw object;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public final void remove() {
        Object object = this.lastReturned;
        if (object != null) {
            int n3;
            this.this$0.removeInternal((LinkedTreeMap$Node)object, true);
            this.lastReturned = null;
            this.expectedModCount = n3 = this.this$0.modCount;
            return;
        }
        object = new IllegalStateException();
        throw object;
    }
}

