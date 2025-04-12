/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapEntry;

final class LinkedListMultimap$Node
extends AbstractMapEntry {
    final Object key;
    LinkedListMultimap$Node next;
    LinkedListMultimap$Node nextSibling;
    LinkedListMultimap$Node previous;
    LinkedListMultimap$Node previousSibling;
    Object value;

    public LinkedListMultimap$Node(Object object, Object object2) {
        this.key = object;
        this.value = object2;
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public Object setValue(Object object) {
        Object object2 = this.value;
        this.value = object;
        return object2;
    }
}

