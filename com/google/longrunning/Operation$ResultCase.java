/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

public final class Operation$ResultCase
extends Enum {
    private static final /* synthetic */ Operation$ResultCase[] $VALUES;
    public static final /* enum */ Operation$ResultCase ERROR;
    public static final /* enum */ Operation$ResultCase RESPONSE;
    public static final /* enum */ Operation$ResultCase RESULT_NOT_SET;
    private final int value;

    static {
        Operation$ResultCase operation$ResultCase;
        Operation$ResultCase operation$ResultCase2;
        Operation$ResultCase operation$ResultCase3;
        ERROR = operation$ResultCase3 = new Operation$ResultCase("ERROR", 0, 4);
        int n3 = 1;
        RESPONSE = operation$ResultCase2 = new Operation$ResultCase("RESPONSE", n3, 5);
        int n4 = 2;
        RESULT_NOT_SET = operation$ResultCase = new Operation$ResultCase("RESULT_NOT_SET", n4, 0);
        Operation$ResultCase[] operation$ResultCaseArray = new Operation$ResultCase[3];
        operation$ResultCaseArray[0] = operation$ResultCase3;
        operation$ResultCaseArray[n3] = operation$ResultCase2;
        operation$ResultCaseArray[n4] = operation$ResultCase;
        $VALUES = operation$ResultCaseArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Operation$ResultCase() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Operation$ResultCase forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 4;
            if (n3 != n4) {
                n4 = 5;
                if (n3 != n4) {
                    return null;
                }
                return RESPONSE;
            }
            return ERROR;
        }
        return RESULT_NOT_SET;
    }

    public static Operation$ResultCase valueOf(int n3) {
        return Operation$ResultCase.forNumber(n3);
    }

    public static Operation$ResultCase valueOf(String string2) {
        return Enum.valueOf(Operation$ResultCase.class, string2);
    }

    public static Operation$ResultCase[] values() {
        return (Operation$ResultCase[])$VALUES.clone();
    }

    public int getNumber() {
        return this.value;
    }
}

