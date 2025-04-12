/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.SmallSortedMap;
import java.util.Map;

class SmallSortedMap$Entry
implements Map.Entry,
Comparable {
    private final Comparable key;
    final /* synthetic */ SmallSortedMap this$0;
    private Object value;

    public SmallSortedMap$Entry(SmallSortedMap smallSortedMap, Comparable comparable, Object object) {
        this.this$0 = smallSortedMap;
        this.key = comparable;
        this.value = object;
    }

    public SmallSortedMap$Entry(SmallSortedMap smallSortedMap, Map.Entry entry) {
        Comparable comparable = (Comparable)entry.getKey();
        entry = entry.getValue();
        this(smallSortedMap, comparable, entry);
    }

    private boolean equals(Object object, Object object2) {
        boolean bl2;
        if (object == null) {
            if (object2 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
        } else {
            bl2 = object.equals(object2);
        }
        return bl2;
    }

    public int compareTo(SmallSortedMap$Entry comparable) {
        Comparable comparable2 = this.getKey();
        comparable = comparable.getKey();
        return comparable2.compareTo(comparable);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof Map.Entry;
        if (!bl4) {
            return false;
        }
        Object object2 = this.key;
        Object k2 = (object = (Map.Entry)object).getKey();
        bl4 = this.equals(object2, k2);
        if (!bl4 || !(bl2 = this.equals(object2 = this.value, object = object.getValue()))) {
            bl3 = false;
        }
        return bl3;
    }

    public Comparable getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        Comparable comparable = this.key;
        int n4 = 0;
        if (comparable == null) {
            n3 = 0;
            comparable = null;
        } else {
            n3 = comparable.hashCode();
        }
        Object object = this.value;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n3 ^ n4;
    }

    public Object setValue(Object object) {
        SmallSortedMap.access$300(this.this$0);
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

