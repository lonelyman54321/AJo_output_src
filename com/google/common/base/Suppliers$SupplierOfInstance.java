/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Objects;
import com.google.common.base.Supplier;
import java.io.Serializable;

class Suppliers$SupplierOfInstance
implements Supplier,
Serializable {
    private static final long serialVersionUID;
    final Object instance;

    public Suppliers$SupplierOfInstance(Object object) {
        this.instance = object;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Suppliers$SupplierOfInstance;
        if (bl2) {
            object = (Suppliers$SupplierOfInstance)object;
            Object object2 = this.instance;
            object = ((Suppliers$SupplierOfInstance)object).instance;
            return Objects.equal(object2, object);
        }
        return false;
    }

    public Object get() {
        return this.instance;
    }

    public int hashCode() {
        Object object = this.instance;
        Object[] objectArray = new Object[]{object};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Suppliers.ofInstance(");
        Object object = this.instance;
        return fK.a(stringBuilder, object, ")");
    }
}

