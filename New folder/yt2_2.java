/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from yT2
 */
public final class yt2_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ yt2_2[] $VALUES;
    public static final /* enum */ yt2_2 CART;
    public static final /* enum */ yt2_2 PDP;
    public static final /* enum */ yt2_2 PLP;
    public static final /* enum */ yt2_2 UNKNOWN;
    public static final /* enum */ yt2_2 WISHLIST;

    private static final /* synthetic */ yt2_2[] $values() {
        yt2_2 yt2_22 = PLP;
        yt2_22 = PDP;
        yt2_22 = WISHLIST;
        yt2_22 = CART;
        yt2_22 = UNKNOWN;
        yt2_2[] yt2_2Array = new yt2_2[]{yt2_22, yt2_22, yt2_22, yt2_22, yt2_22};
        return yt2_2Array;
    }

    static {
        Enum[] enumArray = new yt2_2("PLP", 0);
        PLP = enumArray;
        enumArray = new yt2_2("PDP", 1);
        PDP = enumArray;
        enumArray = new yt2_2("WISHLIST", 2);
        WISHLIST = enumArray;
        enumArray = new yt2_2("CART", 3);
        CART = enumArray;
        enumArray = new yt2_2("UNKNOWN", 4);
        UNKNOWN = enumArray;
        enumArray = yt2_2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private yt2_2() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static yt2_2 valueOf(String string2) {
        return Enum.valueOf(yt2_2.class, string2);
    }

    public static yt2_2[] values() {
        return (yt2_2[])$VALUES.clone();
    }
}

