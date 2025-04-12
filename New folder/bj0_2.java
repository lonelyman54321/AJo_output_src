/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bj0
 */
public final class bj0_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ bj0_2[] $VALUES;
    public static final /* enum */ bj0_2 ARRAY_WRAPPED;
    public static final /* enum */ bj0_2 AUTO_DETECT;
    public static final /* enum */ bj0_2 WHITESPACE_SEPARATED;

    private static final /* synthetic */ bj0_2[] $values() {
        bj0_2 bj0_22 = WHITESPACE_SEPARATED;
        bj0_22 = ARRAY_WRAPPED;
        bj0_22 = AUTO_DETECT;
        bj0_2[] bj0_2Array = new bj0_2[]{bj0_22, bj0_22, bj0_22};
        return bj0_2Array;
    }

    static {
        Enum[] enumArray = new bj0_2("WHITESPACE_SEPARATED", 0);
        WHITESPACE_SEPARATED = enumArray;
        enumArray = new bj0_2("ARRAY_WRAPPED", 1);
        ARRAY_WRAPPED = enumArray;
        enumArray = new bj0_2("AUTO_DETECT", 2);
        AUTO_DETECT = enumArray;
        enumArray = bj0_2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bj0_2() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static bj0_2 valueOf(String string2) {
        return Enum.valueOf(bj0_2.class, string2);
    }

    public static bj0_2[] values() {
        return (bj0_2[])$VALUES.clone();
    }
}

