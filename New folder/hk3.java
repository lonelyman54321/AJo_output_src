/*
 * Decompiled with CFR 0.152.
 */
public final class hk3
extends Enum {
    private static final /* synthetic */ hk3[] $VALUES;
    public static final /* enum */ hk3 ClearHistory;
    public static final /* enum */ hk3 MergeIfPossible;
    public static final /* enum */ hk3 NeverMerge;

    private static final /* synthetic */ hk3[] $values() {
        hk3 hk32 = MergeIfPossible;
        hk32 = ClearHistory;
        hk32 = NeverMerge;
        hk3[] hk3Array = new hk3[]{hk32, hk32, hk32};
        return hk3Array;
    }

    static {
        hk3 hk32;
        MergeIfPossible = hk32 = new hk3("MergeIfPossible", 0);
        ClearHistory = hk32 = new hk3("ClearHistory", 1);
        NeverMerge = hk32 = new hk3("NeverMerge", 2);
        $VALUES = hk3.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hk3() {
        void var2_-1;
        void var1_-1;
    }

    public static hk3 valueOf(String string2) {
        return Enum.valueOf(hk3.class, string2);
    }

    public static hk3[] values() {
        return (hk3[])$VALUES.clone();
    }
}

