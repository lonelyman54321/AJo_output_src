/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.NullnessCasts;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;

class Suppliers$MemoizingSupplier
implements Supplier,
Serializable {
    private static final long serialVersionUID;
    final Supplier delegate;
    volatile transient boolean initialized;
    transient Object value;

    public Suppliers$MemoizingSupplier(Supplier supplier) {
        this.delegate = supplier = (Supplier)Preconditions.checkNotNull(supplier);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object get() {
        boolean bl2 = this.initialized;
        if (bl2) return NullnessCasts.uncheckedCastNullableTToT(this.value);
        synchronized (this) {
            try {
                boolean bl3;
                bl2 = this.initialized;
                if (bl2) return NullnessCasts.uncheckedCastNullableTToT(this.value);
                Object object = this.delegate;
                this.value = object = object.get();
                this.initialized = bl3 = true;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public String toString() {
        Object object = "Suppliers.memoize(";
        StringBuilder stringBuilder = new StringBuilder((String)object);
        boolean bl2 = this.initialized;
        if (bl2) {
            object = new StringBuilder("<supplier that returned ");
            Object object2 = this.value;
            String string2 = ">";
            object = fK.a((StringBuilder)object, object2, string2);
        } else {
            object = this.delegate;
        }
        return fK.a(stringBuilder, object, ")");
    }
}

