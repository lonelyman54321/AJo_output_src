/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Function;

final class Functions$IdentityFunction
extends Enum
implements Function {
    private static final /* synthetic */ Functions$IdentityFunction[] $VALUES;
    public static final /* enum */ Functions$IdentityFunction INSTANCE;

    private static /* synthetic */ Functions$IdentityFunction[] $values() {
        Functions$IdentityFunction functions$IdentityFunction = INSTANCE;
        Functions$IdentityFunction[] functions$IdentityFunctionArray = new Functions$IdentityFunction[]{functions$IdentityFunction};
        return functions$IdentityFunctionArray;
    }

    static {
        Functions$IdentityFunction functions$IdentityFunction;
        INSTANCE = functions$IdentityFunction = new Functions$IdentityFunction("INSTANCE", 0);
        $VALUES = Functions$IdentityFunction.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Functions$IdentityFunction() {
        void var2_-1;
        void var1_-1;
    }

    public static Functions$IdentityFunction valueOf(String string2) {
        return Enum.valueOf(Functions$IdentityFunction.class, string2);
    }

    public static Functions$IdentityFunction[] values() {
        return (Functions$IdentityFunction[])$VALUES.clone();
    }

    public Object apply(Object object) {
        return object;
    }

    public String toString() {
        return "Functions.identity()";
    }
}

