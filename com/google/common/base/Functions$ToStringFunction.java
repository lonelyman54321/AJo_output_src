/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;

final class Functions$ToStringFunction
extends Enum
implements Function {
    private static final /* synthetic */ Functions$ToStringFunction[] $VALUES;
    public static final /* enum */ Functions$ToStringFunction INSTANCE;

    private static /* synthetic */ Functions$ToStringFunction[] $values() {
        Functions$ToStringFunction functions$ToStringFunction = INSTANCE;
        Functions$ToStringFunction[] functions$ToStringFunctionArray = new Functions$ToStringFunction[]{functions$ToStringFunction};
        return functions$ToStringFunctionArray;
    }

    static {
        Functions$ToStringFunction functions$ToStringFunction;
        INSTANCE = functions$ToStringFunction = new Functions$ToStringFunction("INSTANCE", 0);
        $VALUES = Functions$ToStringFunction.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Functions$ToStringFunction() {
        void var2_-1;
        void var1_-1;
    }

    public static Functions$ToStringFunction valueOf(String string2) {
        return Enum.valueOf(Functions$ToStringFunction.class, string2);
    }

    public static Functions$ToStringFunction[] values() {
        return (Functions$ToStringFunction[])$VALUES.clone();
    }

    public String apply(Object object) {
        Preconditions.checkNotNull(object);
        return object.toString();
    }

    public String toString() {
        return "Functions.toStringFunction()";
    }
}

