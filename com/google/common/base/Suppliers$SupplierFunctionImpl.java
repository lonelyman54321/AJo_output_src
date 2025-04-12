/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierFunction;

final class Suppliers$SupplierFunctionImpl
extends Enum
implements Suppliers$SupplierFunction {
    private static final /* synthetic */ Suppliers$SupplierFunctionImpl[] $VALUES;
    public static final /* enum */ Suppliers$SupplierFunctionImpl INSTANCE;

    private static /* synthetic */ Suppliers$SupplierFunctionImpl[] $values() {
        Suppliers$SupplierFunctionImpl suppliers$SupplierFunctionImpl = INSTANCE;
        Suppliers$SupplierFunctionImpl[] suppliers$SupplierFunctionImplArray = new Suppliers$SupplierFunctionImpl[]{suppliers$SupplierFunctionImpl};
        return suppliers$SupplierFunctionImplArray;
    }

    static {
        Suppliers$SupplierFunctionImpl suppliers$SupplierFunctionImpl;
        INSTANCE = suppliers$SupplierFunctionImpl = new Suppliers$SupplierFunctionImpl("INSTANCE", 0);
        $VALUES = Suppliers$SupplierFunctionImpl.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Suppliers$SupplierFunctionImpl() {
        void var2_-1;
        void var1_-1;
    }

    public static Suppliers$SupplierFunctionImpl valueOf(String string2) {
        return Enum.valueOf(Suppliers$SupplierFunctionImpl.class, string2);
    }

    public static Suppliers$SupplierFunctionImpl[] values() {
        return (Suppliers$SupplierFunctionImpl[])$VALUES.clone();
    }

    public Object apply(Supplier supplier) {
        return supplier.get();
    }

    public String toString() {
        return "Suppliers.supplierFunction()";
    }
}

