/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import java.util.AbstractList;

class Joiner$3
extends AbstractList {
    final /* synthetic */ Object val$first;
    final /* synthetic */ Object[] val$rest;
    final /* synthetic */ Object val$second;

    public Joiner$3(Object[] objectArray, Object object, Object object2) {
        this.val$rest = objectArray;
        this.val$first = object;
        this.val$second = object2;
    }

    public Object get(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                Object[] objectArray = this.val$rest;
                return objectArray[n3 += -2];
            }
            return this.val$second;
        }
        return this.val$first;
    }

    public int size() {
        return this.val$rest.length + 2;
    }
}

