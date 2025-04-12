/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableEnumMap;
import java.io.Serializable;
import java.util.EnumMap;

class ImmutableEnumMap$EnumSerializedForm
implements Serializable {
    private static final long serialVersionUID;
    final EnumMap delegate;

    public ImmutableEnumMap$EnumSerializedForm(EnumMap enumMap) {
        this.delegate = enumMap;
    }

    public Object readResolve() {
        EnumMap enumMap = this.delegate;
        ImmutableEnumMap immutableEnumMap = new ImmutableEnumMap(enumMap, null);
        return immutableEnumMap;
    }
}

