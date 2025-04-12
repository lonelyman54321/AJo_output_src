/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableEnumSet;
import java.io.Serializable;
import java.util.EnumSet;

class ImmutableEnumSet$EnumSerializedForm
implements Serializable {
    private static final long serialVersionUID;
    final EnumSet delegate;

    public ImmutableEnumSet$EnumSerializedForm(EnumSet enumSet) {
        this.delegate = enumSet;
    }

    public Object readResolve() {
        Object object = this.delegate.clone();
        ImmutableEnumSet immutableEnumSet = new ImmutableEnumSet((EnumSet)object, null);
        return immutableEnumSet;
    }
}

