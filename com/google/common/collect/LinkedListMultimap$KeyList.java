/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.LinkedListMultimap$Node;

class LinkedListMultimap$KeyList {
    int count;
    LinkedListMultimap$Node head;
    LinkedListMultimap$Node tail;

    public LinkedListMultimap$KeyList(LinkedListMultimap$Node linkedListMultimap$Node) {
        this.head = linkedListMultimap$Node;
        this.tail = linkedListMultimap$Node;
        linkedListMultimap$Node.previousSibling = null;
        linkedListMultimap$Node.nextSibling = null;
        this.count = 1;
    }
}

