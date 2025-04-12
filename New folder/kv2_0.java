/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from kv2
 */
public final class kv2_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ kv2_0[] $VALUES;
    public static final /* enum */ kv2_0 PLP_COUPON;
    public static final /* enum */ kv2_0 PLP_DEFAULT;
    public static final /* enum */ kv2_0 PLP_HISTORY;
    public static final /* enum */ kv2_0 PLP_MENU;
    public static final /* enum */ kv2_0 PLP_MORE;
    public static final /* enum */ kv2_0 PLP_SEARCH;

    private static final /* synthetic */ kv2_0[] $values() {
        kv2_0 kv2_02 = PLP_SEARCH;
        kv2_02 = PLP_MORE;
        kv2_02 = PLP_COUPON;
        kv2_02 = PLP_MENU;
        kv2_02 = PLP_HISTORY;
        kv2_02 = PLP_DEFAULT;
        kv2_0[] kv2_0Array = new kv2_0[]{kv2_02, kv2_02, kv2_02, kv2_02, kv2_02, kv2_02};
        return kv2_0Array;
    }

    static {
        Enum[] enumArray = new kv2_0("PLP_SEARCH", 0);
        PLP_SEARCH = enumArray;
        enumArray = new kv2_0("PLP_MORE", 1);
        PLP_MORE = enumArray;
        enumArray = new kv2_0("PLP_COUPON", 2);
        PLP_COUPON = enumArray;
        enumArray = new kv2_0("PLP_MENU", 3);
        PLP_MENU = enumArray;
        enumArray = new kv2_0("PLP_HISTORY", 4);
        PLP_HISTORY = enumArray;
        enumArray = new kv2_0("PLP_DEFAULT", 5);
        PLP_DEFAULT = enumArray;
        enumArray = kv2_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kv2_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static kv2_0 valueOf(String string2) {
        return Enum.valueOf(kv2_0.class, string2);
    }

    public static kv2_0[] values() {
        return (kv2_0[])$VALUES.clone();
    }
}

