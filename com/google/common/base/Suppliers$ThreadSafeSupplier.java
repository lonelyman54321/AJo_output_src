/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;

class Suppliers$ThreadSafeSupplier
implements Supplier,
Serializable {
    private static final long serialVersionUID;
    final Supplier delegate;

    public Suppliers$ThreadSafeSupplier(Supplier supplier) {
        this.delegate = supplier = (Supplier)Preconditions.checkNotNull(supplier);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object get() {
        Supplier supplier = this.delegate;
        synchronized (supplier) {
            Supplier supplier2 = this.delegate;
            return supplier2.get();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Suppliers.synchronizedSupplier(");
        Supplier supplier = this.delegate;
        stringBuilder.append(supplier);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

