/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

final class ImmutableMap$Builder$DuplicateKey {
    private final Object key;
    private final Object value1;
    private final Object value2;

    public ImmutableMap$Builder$DuplicateKey(Object object, Object object2, Object object3) {
        this.key = object;
        this.value1 = object2;
        this.value2 = object3;
    }

    public IllegalArgumentException exception() {
        CharSequence charSequence = new StringBuilder("Multiple entries with same key: ");
        Object object = this.key;
        charSequence.append(object);
        object = "=";
        charSequence.append((String)object);
        Object object2 = this.value1;
        charSequence.append(object2);
        charSequence.append(" and ");
        object2 = this.key;
        charSequence.append(object2);
        charSequence.append((String)object);
        object = this.value2;
        charSequence.append(object);
        charSequence = charSequence.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        return illegalArgumentException;
    }
}

