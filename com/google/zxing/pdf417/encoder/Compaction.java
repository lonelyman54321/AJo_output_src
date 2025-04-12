/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.encoder;

public final class Compaction
extends Enum {
    private static final /* synthetic */ Compaction[] $VALUES;
    public static final /* enum */ Compaction AUTO;
    public static final /* enum */ Compaction BYTE;
    public static final /* enum */ Compaction NUMERIC;
    public static final /* enum */ Compaction TEXT;

    static {
        Compaction compaction;
        Compaction compaction2;
        Compaction compaction3;
        Compaction compaction4;
        AUTO = compaction4 = new Compaction("AUTO", 0);
        int n3 = 1;
        TEXT = compaction3 = new Compaction("TEXT", n3);
        int n4 = 2;
        BYTE = compaction2 = new Compaction("BYTE", n4);
        int n7 = 3;
        NUMERIC = compaction = new Compaction("NUMERIC", n7);
        Compaction[] compactionArray = new Compaction[4];
        compactionArray[0] = compaction4;
        compactionArray[n3] = compaction3;
        compactionArray[n4] = compaction2;
        compactionArray[n7] = compaction;
        $VALUES = compactionArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Compaction() {
        void var2_-1;
        void var1_-1;
    }

    public static Compaction valueOf(String string2) {
        return Enum.valueOf(Compaction.class, string2);
    }

    public static Compaction[] values() {
        return (Compaction[])$VALUES.clone();
    }
}

