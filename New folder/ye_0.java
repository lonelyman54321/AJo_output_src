/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from yE
 */
public final class ye_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ye_0[] $VALUES;
    public static final /* enum */ ye_0 EXCHANGE_CONFIRM_FRAGMENT;
    public static final /* enum */ ye_0 NOT_SHIPPED_YET_VIEW_HOLDER;
    public static final /* enum */ ye_0 SELF_SHIP_BOTTOM_SHEET_FRAGMENT;

    private static final /* synthetic */ ye_0[] $values() {
        ye_0 ye_02 = SELF_SHIP_BOTTOM_SHEET_FRAGMENT;
        ye_02 = EXCHANGE_CONFIRM_FRAGMENT;
        ye_02 = NOT_SHIPPED_YET_VIEW_HOLDER;
        ye_0[] ye_0Array = new ye_0[]{ye_02, ye_02, ye_02};
        return ye_0Array;
    }

    static {
        Enum[] enumArray = new ye_0("SELF_SHIP_BOTTOM_SHEET_FRAGMENT", 0);
        SELF_SHIP_BOTTOM_SHEET_FRAGMENT = enumArray;
        enumArray = new ye_0("EXCHANGE_CONFIRM_FRAGMENT", 1);
        EXCHANGE_CONFIRM_FRAGMENT = enumArray;
        enumArray = new ye_0("NOT_SHIPPED_YET_VIEW_HOLDER", 2);
        NOT_SHIPPED_YET_VIEW_HOLDER = enumArray;
        enumArray = ye_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ye_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ye_0 valueOf(String string2) {
        return Enum.valueOf(ye_0.class, string2);
    }

    public static ye_0[] values() {
        return (ye_0[])$VALUES.clone();
    }
}

