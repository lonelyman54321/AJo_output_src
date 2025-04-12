/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

class Ordering$IncomparableValueException
extends ClassCastException {
    private static final long serialVersionUID;
    final Object value;

    public Ordering$IncomparableValueException(Object object) {
        String string2 = jk0_0.a(object, "Cannot compare value: ");
        super(string2);
        this.value = object;
    }
}

