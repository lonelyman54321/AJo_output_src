/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from pg2
 */
public final class pg2_0
extends Enum {
    private static final /* synthetic */ pg2_0[] $VALUES;
    public static final /* enum */ pg2_0 Horizontal;
    public static final /* enum */ pg2_0 Vertical;

    private static final /* synthetic */ pg2_0[] $values() {
        pg2_0 pg2_02 = Vertical;
        pg2_02 = Horizontal;
        pg2_0[] pg2_0Array = new pg2_0[]{pg2_02, pg2_02};
        return pg2_0Array;
    }

    static {
        pg2_0 pg2_02;
        Vertical = pg2_02 = new pg2_0("Vertical", 0);
        Horizontal = pg2_02 = new pg2_0("Horizontal", 1);
        $VALUES = pg2_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pg2_0() {
        void var2_-1;
        void var1_-1;
    }

    public static pg2_0 valueOf(String string2) {
        return Enum.valueOf(pg2_0.class, string2);
    }

    public static pg2_0[] values() {
        return (pg2_0[])$VALUES.clone();
    }
}

