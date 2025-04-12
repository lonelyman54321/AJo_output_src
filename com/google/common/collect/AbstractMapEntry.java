/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Map;

abstract class AbstractMapEntry
implements Map.Entry {
    public boolean equals(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            Object k2;
            object = (Map.Entry)object;
            Object object2 = this.getKey();
            bl2 = Objects.equal(object2, k2 = object.getKey());
            if (bl2 && (bl4 = Objects.equal(object2 = this.getValue(), object = object.getValue()))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public int hashCode() {
        int n3;
        Object object = this.getKey();
        Object object2 = this.getValue();
        int n4 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        if (object2 != null) {
            n4 = object2.hashCode();
        }
        return n3 ^ n4;
    }

    public Object setValue(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getKey();
        stringBuilder.append(object);
        stringBuilder.append("=");
        object = this.getValue();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

