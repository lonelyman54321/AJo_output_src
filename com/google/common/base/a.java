/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$NonSerializableMemoizingSupplier;

public final class a
implements Supplier {
    public final Object get() {
        return Suppliers$NonSerializableMemoizingSupplier.a();
    }
}

