/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.NullnessCasts;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class Suppliers$ExpiringMemoizingSupplier
implements Supplier,
Serializable {
    private static final long serialVersionUID;
    final Supplier delegate;
    final long durationNanos;
    volatile transient long expirationNanos;
    volatile transient Object value;

    public Suppliers$ExpiringMemoizingSupplier(Supplier supplier, long l2, TimeUnit timeUnit) {
        long l3;
        this.delegate = supplier = (Supplier)Preconditions.checkNotNull(supplier);
        this.durationNanos = l3 = timeUnit.toNanos(l2);
        l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            l4 = 1;
        } else {
            l4 = 0;
            supplier = null;
        }
        Preconditions.checkArgument((boolean)l4, "duration (%s %s) must be > 0", l2, (Object)timeUnit);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public Object get() {
        Object l4;
        long l2;
        long l7 = this.expirationNanos;
        long l8 = System.nanoTime();
        long l12 = 0L;
        long l3 = l7 - l12;
        Object object = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (object != false) {
            l2 = l8 - l7;
            long l14 = l2 - l12;
            l4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (l4 < 0) return NullnessCasts.uncheckedCastNullableTToT(this.value);
        }
        // MONITORENTER : this
        l2 = this.expirationNanos;
        l4 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
        if (l4 != false) return NullnessCasts.uncheckedCastNullableTToT(this.value);
        Object object2 = this.delegate;
        this.value = object2 = object2.get();
        l2 = this.durationNanos;
        long l15 = (l8 += l2) - l12;
        Object object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object3 == false) {
            l8 = 1L;
        }
        this.expirationNanos = l8;
        // MONITOREXIT : this
        return object2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Suppliers.memoizeWithExpiration(");
        Supplier supplier = this.delegate;
        stringBuilder.append(supplier);
        stringBuilder.append(", ");
        long l2 = this.durationNanos;
        return jl0_0.b(stringBuilder, l2, ", NANOS)");
    }
}

