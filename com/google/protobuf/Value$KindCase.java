/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

public final class Value$KindCase
extends Enum {
    private static final /* synthetic */ Value$KindCase[] $VALUES;
    public static final /* enum */ Value$KindCase BOOL_VALUE;
    public static final /* enum */ Value$KindCase KIND_NOT_SET;
    public static final /* enum */ Value$KindCase LIST_VALUE;
    public static final /* enum */ Value$KindCase NULL_VALUE;
    public static final /* enum */ Value$KindCase NUMBER_VALUE;
    public static final /* enum */ Value$KindCase STRING_VALUE;
    public static final /* enum */ Value$KindCase STRUCT_VALUE;
    private final int value;

    static {
        Value$KindCase value$KindCase;
        Value$KindCase value$KindCase2;
        Value$KindCase value$KindCase3;
        Value$KindCase value$KindCase4;
        Value$KindCase value$KindCase5;
        Value$KindCase value$KindCase6;
        Value$KindCase value$KindCase7;
        int n3 = 1;
        NULL_VALUE = value$KindCase7 = new Value$KindCase("NULL_VALUE", 0, n3);
        int n4 = 2;
        NUMBER_VALUE = value$KindCase6 = new Value$KindCase("NUMBER_VALUE", n3, n4);
        int n7 = 3;
        STRING_VALUE = value$KindCase5 = new Value$KindCase("STRING_VALUE", n4, n7);
        int n8 = 4;
        BOOL_VALUE = value$KindCase4 = new Value$KindCase("BOOL_VALUE", n7, n8);
        int n10 = 5;
        STRUCT_VALUE = value$KindCase3 = new Value$KindCase("STRUCT_VALUE", n8, n10);
        int n14 = 6;
        LIST_VALUE = value$KindCase2 = new Value$KindCase("LIST_VALUE", n10, n14);
        KIND_NOT_SET = value$KindCase = new Value$KindCase("KIND_NOT_SET", n14, 0);
        Value$KindCase[] value$KindCaseArray = new Value$KindCase[7];
        value$KindCaseArray[0] = value$KindCase7;
        value$KindCaseArray[n3] = value$KindCase6;
        value$KindCaseArray[n4] = value$KindCase5;
        value$KindCaseArray[n7] = value$KindCase4;
        value$KindCaseArray[n8] = value$KindCase3;
        value$KindCaseArray[n10] = value$KindCase2;
        value$KindCaseArray[n14] = value$KindCase;
        $VALUES = value$KindCaseArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Value$KindCase() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Value$KindCase forNumber(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 6: {
                return LIST_VALUE;
            }
            case 5: {
                return STRUCT_VALUE;
            }
            case 4: {
                return BOOL_VALUE;
            }
            case 3: {
                return STRING_VALUE;
            }
            case 2: {
                return NUMBER_VALUE;
            }
            case 1: {
                return NULL_VALUE;
            }
            case 0: 
        }
        return KIND_NOT_SET;
    }

    public static Value$KindCase valueOf(int n3) {
        return Value$KindCase.forNumber(n3);
    }

    public static Value$KindCase valueOf(String string2) {
        return Enum.valueOf(Value$KindCase.class, string2);
    }

    public static Value$KindCase[] values() {
        return (Value$KindCase[])$VALUES.clone();
    }

    public int getNumber() {
        return this.value;
    }
}

