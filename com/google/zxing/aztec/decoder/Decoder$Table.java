/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.decoder;

final class Decoder$Table
extends Enum {
    private static final /* synthetic */ Decoder$Table[] $VALUES;
    public static final /* enum */ Decoder$Table BINARY;
    public static final /* enum */ Decoder$Table DIGIT;
    public static final /* enum */ Decoder$Table LOWER;
    public static final /* enum */ Decoder$Table MIXED;
    public static final /* enum */ Decoder$Table PUNCT;
    public static final /* enum */ Decoder$Table UPPER;

    static {
        Decoder$Table decoder$Table;
        Decoder$Table decoder$Table2;
        Decoder$Table decoder$Table3;
        Decoder$Table decoder$Table4;
        Decoder$Table decoder$Table5;
        Decoder$Table decoder$Table6;
        UPPER = decoder$Table6 = new Decoder$Table("UPPER", 0);
        int n3 = 1;
        LOWER = decoder$Table5 = new Decoder$Table("LOWER", n3);
        int n4 = 2;
        MIXED = decoder$Table4 = new Decoder$Table("MIXED", n4);
        int n7 = 3;
        DIGIT = decoder$Table3 = new Decoder$Table("DIGIT", n7);
        int n8 = 4;
        PUNCT = decoder$Table2 = new Decoder$Table("PUNCT", n8);
        int n10 = 5;
        BINARY = decoder$Table = new Decoder$Table("BINARY", n10);
        Decoder$Table[] decoder$TableArray = new Decoder$Table[6];
        decoder$TableArray[0] = decoder$Table6;
        decoder$TableArray[n3] = decoder$Table5;
        decoder$TableArray[n4] = decoder$Table4;
        decoder$TableArray[n7] = decoder$Table3;
        decoder$TableArray[n8] = decoder$Table2;
        decoder$TableArray[n10] = decoder$Table;
        $VALUES = decoder$TableArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Decoder$Table() {
        void var2_-1;
        void var1_-1;
    }

    public static Decoder$Table valueOf(String string2) {
        return Enum.valueOf(Decoder$Table.class, string2);
    }

    public static Decoder$Table[] values() {
        return (Decoder$Table[])$VALUES.clone();
    }
}

