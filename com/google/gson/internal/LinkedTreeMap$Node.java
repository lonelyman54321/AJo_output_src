/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import java.util.Map;

final class LinkedTreeMap$Node
implements Map.Entry {
    final boolean allowNullValue;
    int height;
    final Object key;
    LinkedTreeMap$Node left;
    LinkedTreeMap$Node next;
    LinkedTreeMap$Node parent;
    LinkedTreeMap$Node prev;
    LinkedTreeMap$Node right;
    Object value;

    public LinkedTreeMap$Node(boolean bl2) {
        this.key = null;
        this.allowNullValue = bl2;
        this.prev = this;
        this.next = this;
    }

    public LinkedTreeMap$Node(boolean bl2, LinkedTreeMap$Node linkedTreeMap$Node, Object object, LinkedTreeMap$Node linkedTreeMap$Node2, LinkedTreeMap$Node linkedTreeMap$Node3) {
        this.parent = linkedTreeMap$Node;
        this.key = object;
        this.allowNullValue = bl2;
        this.height = 1;
        this.next = linkedTreeMap$Node2;
        this.prev = linkedTreeMap$Node3;
        linkedTreeMap$Node3.next = this;
        linkedTreeMap$Node2.prev = this;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            Object k2;
            object = (Map.Entry)object;
            Object object2 = this.key;
            if ((object2 == null ? (object2 = object.getKey()) == null : (bl2 = object2.equals(k2 = object.getKey()))) && ((object2 = this.value) == null ? (object = object.getValue()) == null : (bl4 = object2.equals(object = object.getValue())))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public LinkedTreeMap$Node first() {
        LinkedTreeMap$Node linkedTreeMap$Node = this.left;
        LinkedTreeMap$Node linkedTreeMap$Node2 = this;
        while (linkedTreeMap$Node != null) {
            LinkedTreeMap$Node linkedTreeMap$Node3 = linkedTreeMap$Node.left;
            linkedTreeMap$Node2 = linkedTreeMap$Node;
            linkedTreeMap$Node = linkedTreeMap$Node3;
        }
        return linkedTreeMap$Node2;
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        Object object = this.key;
        int n4 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        Object object2 = this.value;
        if (object2 != null) {
            n4 = object2.hashCode();
        }
        return n3 ^ n4;
    }

    public LinkedTreeMap$Node last() {
        LinkedTreeMap$Node linkedTreeMap$Node = this.right;
        LinkedTreeMap$Node linkedTreeMap$Node2 = this;
        while (linkedTreeMap$Node != null) {
            LinkedTreeMap$Node linkedTreeMap$Node3 = linkedTreeMap$Node.right;
            linkedTreeMap$Node2 = linkedTreeMap$Node;
            linkedTreeMap$Node = linkedTreeMap$Node3;
        }
        return linkedTreeMap$Node2;
    }

    public Object setValue(Object object) {
        boolean bl2;
        if (object == null && !(bl2 = this.allowNullValue)) {
            object = new NullPointerException("value == null");
            throw object;
        }
        Object object2 = this.value;
        this.value = object;
        return object2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.key;
        stringBuilder.append(object);
        stringBuilder.append("=");
        object = this.value;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

