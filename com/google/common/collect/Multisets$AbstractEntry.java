/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.Multiset$Entry;

abstract class Multisets$AbstractEntry
implements Multiset$Entry {
    public boolean equals(Object object) {
        int n3 = object instanceof Multiset$Entry;
        boolean bl2 = false;
        if (n3 != 0) {
            Object object2;
            boolean bl3;
            int n4;
            object = (Multiset$Entry)object;
            n3 = this.getCount();
            if (n3 == (n4 = object.getCount()) && (bl3 = Objects.equal(object2 = this.getElement(), object = object.getElement()))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public int hashCode() {
        int n3;
        Object object = this.getElement();
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        int n4 = this.getCount();
        return n3 ^ n4;
    }

    public String toString() {
        int n3;
        String string2 = String.valueOf(this.getElement());
        int n4 = this.getCount();
        if (n4 != (n3 = 1)) {
            String string3 = " x ";
            string2 = LO1.a(n4, string2, string3);
        }
        return string2;
    }
}

