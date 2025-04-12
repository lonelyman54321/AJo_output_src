/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

final class Code128Writer$CType
extends Enum {
    private static final /* synthetic */ Code128Writer$CType[] $VALUES;
    public static final /* enum */ Code128Writer$CType FNC_1;
    public static final /* enum */ Code128Writer$CType ONE_DIGIT;
    public static final /* enum */ Code128Writer$CType TWO_DIGITS;
    public static final /* enum */ Code128Writer$CType UNCODABLE;

    static {
        Code128Writer$CType code128Writer$CType;
        Code128Writer$CType code128Writer$CType2;
        Code128Writer$CType code128Writer$CType3;
        Code128Writer$CType code128Writer$CType4;
        UNCODABLE = code128Writer$CType4 = new Code128Writer$CType("UNCODABLE", 0);
        int n3 = 1;
        ONE_DIGIT = code128Writer$CType3 = new Code128Writer$CType("ONE_DIGIT", n3);
        int n4 = 2;
        TWO_DIGITS = code128Writer$CType2 = new Code128Writer$CType("TWO_DIGITS", n4);
        int n7 = 3;
        FNC_1 = code128Writer$CType = new Code128Writer$CType("FNC_1", n7);
        Code128Writer$CType[] code128Writer$CTypeArray = new Code128Writer$CType[4];
        code128Writer$CTypeArray[0] = code128Writer$CType4;
        code128Writer$CTypeArray[n3] = code128Writer$CType3;
        code128Writer$CTypeArray[n4] = code128Writer$CType2;
        code128Writer$CTypeArray[n7] = code128Writer$CType;
        $VALUES = code128Writer$CTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Code128Writer$CType() {
        void var2_-1;
        void var1_-1;
    }

    public static Code128Writer$CType valueOf(String string2) {
        return Enum.valueOf(Code128Writer$CType.class, string2);
    }

    public static Code128Writer$CType[] values() {
        return (Code128Writer$CType[])$VALUES.clone();
    }
}

