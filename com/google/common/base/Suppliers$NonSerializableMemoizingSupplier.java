/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.NullnessCasts;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.a;

class Suppliers$NonSerializableMemoizingSupplier
implements Supplier {
    private static final Supplier SUCCESSFULLY_COMPUTED;
    private volatile Supplier delegate;
    private Object value;

    static {
        a a2 = new Object();
        SUCCESSFULLY_COMPUTED = a2;
    }

    public Suppliers$NonSerializableMemoizingSupplier(Supplier supplier) {
        this.delegate = supplier = (Supplier)Preconditions.checkNotNull(supplier);
    }

    public static /* synthetic */ Void a() {
        return Suppliers$NonSerializableMemoizingSupplier.lambda$static$0();
    }

    private static /* synthetic */ Void lambda$static$0() {
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object get() {
        Object object = this.delegate;
        Supplier supplier = SUCCESSFULLY_COMPUTED;
        if (object == supplier) return NullnessCasts.uncheckedCastNullableTToT(this.value);
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    object = this.delegate;
                    if (object == supplier) return NullnessCasts.uncheckedCastNullableTToT(this.value);
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = this.delegate;
                this.value = object = object.get();
                this.delegate = supplier;
                return object;
            }
            throw throwable2;
        }
    }

    public String toString() {
        Object object = this.delegate;
        StringBuilder stringBuilder = new StringBuilder("Suppliers.memoize(");
        Object object2 = SUCCESSFULLY_COMPUTED;
        if (object == object2) {
            object = new StringBuilder("<supplier that returned ");
            object2 = this.value;
            String string2 = ">";
            object = fK.a((StringBuilder)object, object2, string2);
        }
        return fK.a(stringBuilder, object, ")");
    }
}

