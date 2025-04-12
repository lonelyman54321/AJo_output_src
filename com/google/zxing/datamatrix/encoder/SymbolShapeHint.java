/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

public final class SymbolShapeHint
extends Enum {
    private static final /* synthetic */ SymbolShapeHint[] $VALUES;
    public static final /* enum */ SymbolShapeHint FORCE_NONE;
    public static final /* enum */ SymbolShapeHint FORCE_RECTANGLE;
    public static final /* enum */ SymbolShapeHint FORCE_SQUARE;

    static {
        SymbolShapeHint symbolShapeHint;
        SymbolShapeHint symbolShapeHint2;
        SymbolShapeHint symbolShapeHint3;
        FORCE_NONE = symbolShapeHint3 = new SymbolShapeHint("FORCE_NONE", 0);
        int n3 = 1;
        FORCE_SQUARE = symbolShapeHint2 = new SymbolShapeHint("FORCE_SQUARE", n3);
        int n4 = 2;
        FORCE_RECTANGLE = symbolShapeHint = new SymbolShapeHint("FORCE_RECTANGLE", n4);
        SymbolShapeHint[] symbolShapeHintArray = new SymbolShapeHint[3];
        symbolShapeHintArray[0] = symbolShapeHint3;
        symbolShapeHintArray[n3] = symbolShapeHint2;
        symbolShapeHintArray[n4] = symbolShapeHint;
        $VALUES = symbolShapeHintArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SymbolShapeHint() {
        void var2_-1;
        void var1_-1;
    }

    public static SymbolShapeHint valueOf(String string2) {
        return Enum.valueOf(SymbolShapeHint.class, string2);
    }

    public static SymbolShapeHint[] values() {
        return (SymbolShapeHint[])$VALUES.clone();
    }
}

