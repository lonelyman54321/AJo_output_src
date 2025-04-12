/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.ToNumberPolicy$1;
import com.google.gson.ToNumberPolicy$2;
import com.google.gson.ToNumberPolicy$3;
import com.google.gson.ToNumberPolicy$4;
import com.google.gson.ToNumberStrategy;

public abstract class ToNumberPolicy
extends Enum
implements ToNumberStrategy {
    private static final /* synthetic */ ToNumberPolicy[] $VALUES;
    public static final /* enum */ ToNumberPolicy BIG_DECIMAL;
    public static final /* enum */ ToNumberPolicy DOUBLE;
    public static final /* enum */ ToNumberPolicy LAZILY_PARSED_NUMBER;
    public static final /* enum */ ToNumberPolicy LONG_OR_DOUBLE;

    static {
        ToNumberPolicy$1 toNumberPolicy$1 = new ToNumberPolicy$1();
        DOUBLE = toNumberPolicy$1;
        int n3 = 1;
        ToNumberPolicy$2 toNumberPolicy$2 = new ToNumberPolicy$2();
        LAZILY_PARSED_NUMBER = toNumberPolicy$2;
        int n4 = 2;
        ToNumberPolicy$3 toNumberPolicy$3 = new ToNumberPolicy$3();
        LONG_OR_DOUBLE = toNumberPolicy$3;
        int n7 = 3;
        ToNumberPolicy$4 toNumberPolicy$4 = new ToNumberPolicy$4();
        BIG_DECIMAL = toNumberPolicy$4;
        ToNumberPolicy[] toNumberPolicyArray = new ToNumberPolicy[4];
        toNumberPolicyArray[0] = toNumberPolicy$1;
        toNumberPolicyArray[n3] = toNumberPolicy$2;
        toNumberPolicyArray[n4] = toNumberPolicy$3;
        toNumberPolicyArray[n7] = toNumberPolicy$4;
        $VALUES = toNumberPolicyArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ToNumberPolicy() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ ToNumberPolicy(ToNumberPolicy$1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static ToNumberPolicy valueOf(String string2) {
        return Enum.valueOf(ToNumberPolicy.class, string2);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[])$VALUES.clone();
    }
}

