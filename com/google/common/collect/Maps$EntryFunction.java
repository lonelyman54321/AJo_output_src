/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps$1;
import com.google.common.collect.Maps$EntryFunction$1;
import com.google.common.collect.Maps$EntryFunction$2;

abstract class Maps$EntryFunction
extends Enum
implements Function {
    private static final /* synthetic */ Maps$EntryFunction[] $VALUES;
    public static final /* enum */ Maps$EntryFunction KEY;
    public static final /* enum */ Maps$EntryFunction VALUE;

    private static /* synthetic */ Maps$EntryFunction[] $values() {
        Maps$EntryFunction maps$EntryFunction = KEY;
        maps$EntryFunction = VALUE;
        Maps$EntryFunction[] maps$EntryFunctionArray = new Maps$EntryFunction[]{maps$EntryFunction, maps$EntryFunction};
        return maps$EntryFunctionArray;
    }

    static {
        Maps$EntryFunction maps$EntryFunction = new Maps$EntryFunction$1();
        KEY = maps$EntryFunction;
        maps$EntryFunction = new Maps$EntryFunction$2();
        VALUE = maps$EntryFunction;
        $VALUES = Maps$EntryFunction.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Maps$EntryFunction() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ Maps$EntryFunction(Maps$1 maps$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static Maps$EntryFunction valueOf(String string2) {
        return Enum.valueOf(Maps$EntryFunction.class, string2);
    }

    public static Maps$EntryFunction[] values() {
        return (Maps$EntryFunction[])$VALUES.clone();
    }
}

