/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ld3
 */
public final class ld3_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ld3_2[] $VALUES;
    public static final /* enum */ ld3_2 STORE_AJIO;
    public static final /* enum */ ld3_2 STORE_AJIOGRAM;
    public static final /* enum */ ld3_2 STORE_LUXE;
    private final String storeId;

    private static final /* synthetic */ ld3_2[] $values() {
        ld3_2 ld3_22 = STORE_AJIO;
        ld3_22 = STORE_LUXE;
        ld3_22 = STORE_AJIOGRAM;
        ld3_2[] ld3_2Array = new ld3_2[]{ld3_22, ld3_22, ld3_22};
        return ld3_2Array;
    }

    static {
        Enum[] enumArray = new ld3_2("STORE_AJIO", 0, "ajio");
        STORE_AJIO = enumArray;
        enumArray = new ld3_2("STORE_LUXE", 1, "luxe");
        STORE_LUXE = enumArray;
        enumArray = new ld3_2("STORE_AJIOGRAM", 2, "ajiogram");
        STORE_AJIOGRAM = enumArray;
        enumArray = ld3_2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ld3_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.storeId = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ld3_2 valueOf(String string2) {
        return Enum.valueOf(ld3_2.class, string2);
    }

    public static ld3_2[] values() {
        return (ld3_2[])$VALUES.clone();
    }

    public final String getStoreId() {
        return this.storeId;
    }
}

