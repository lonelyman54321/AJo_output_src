/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

public final class ReflectionAccessFilter$FilterResult
extends Enum {
    private static final /* synthetic */ ReflectionAccessFilter$FilterResult[] $VALUES;
    public static final /* enum */ ReflectionAccessFilter$FilterResult ALLOW;
    public static final /* enum */ ReflectionAccessFilter$FilterResult BLOCK_ALL;
    public static final /* enum */ ReflectionAccessFilter$FilterResult BLOCK_INACCESSIBLE;
    public static final /* enum */ ReflectionAccessFilter$FilterResult INDECISIVE;

    static {
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult;
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult2;
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult3;
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult4;
        ALLOW = reflectionAccessFilter$FilterResult4 = new ReflectionAccessFilter$FilterResult("ALLOW", 0);
        int n3 = 1;
        INDECISIVE = reflectionAccessFilter$FilterResult3 = new ReflectionAccessFilter$FilterResult("INDECISIVE", n3);
        int n4 = 2;
        BLOCK_INACCESSIBLE = reflectionAccessFilter$FilterResult2 = new ReflectionAccessFilter$FilterResult("BLOCK_INACCESSIBLE", n4);
        int n7 = 3;
        BLOCK_ALL = reflectionAccessFilter$FilterResult = new ReflectionAccessFilter$FilterResult("BLOCK_ALL", n7);
        ReflectionAccessFilter$FilterResult[] reflectionAccessFilter$FilterResultArray = new ReflectionAccessFilter$FilterResult[4];
        reflectionAccessFilter$FilterResultArray[0] = reflectionAccessFilter$FilterResult4;
        reflectionAccessFilter$FilterResultArray[n3] = reflectionAccessFilter$FilterResult3;
        reflectionAccessFilter$FilterResultArray[n4] = reflectionAccessFilter$FilterResult2;
        reflectionAccessFilter$FilterResultArray[n7] = reflectionAccessFilter$FilterResult;
        $VALUES = reflectionAccessFilter$FilterResultArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ReflectionAccessFilter$FilterResult() {
        void var2_-1;
        void var1_-1;
    }

    public static ReflectionAccessFilter$FilterResult valueOf(String string2) {
        return Enum.valueOf(ReflectionAccessFilter$FilterResult.class, string2);
    }

    public static ReflectionAccessFilter$FilterResult[] values() {
        return (ReflectionAccessFilter$FilterResult[])$VALUES.clone();
    }
}

