/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Fw1
 */
public final class fw1_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ fw1_2[] $VALUES;
    public static final /* enum */ fw1_2 ALL;
    public static final /* enum */ fw1_2 BODY;
    public static final /* enum */ fw1_2 HEADERS;
    public static final /* enum */ fw1_2 INFO;
    public static final /* enum */ fw1_2 NONE;
    private final boolean body;
    private final boolean headers;
    private final boolean info;

    private static final /* synthetic */ fw1_2[] $values() {
        fw1_2 fw1_22 = ALL;
        fw1_22 = HEADERS;
        fw1_22 = BODY;
        fw1_22 = INFO;
        fw1_22 = NONE;
        fw1_2[] fw1_2Array = new fw1_2[]{fw1_22, fw1_22, fw1_22, fw1_22, fw1_22};
        return fw1_2Array;
    }

    static {
        Enum[] enumArray;
        boolean bl2 = true;
        Enum[] enumArray2 = enumArray;
        enumArray = new fw1_2("ALL", 0, true, bl2, true);
        ALL = enumArray;
        boolean bl3 = true;
        enumArray2 = new fw1_2("HEADERS", 1, bl3, true, false);
        HEADERS = enumArray2;
        enumArray2 = new fw1_2("BODY", 2, bl2, false, true);
        BODY = enumArray2;
        enumArray2 = new fw1_2("INFO", 3, bl3, false, false);
        INFO = enumArray2;
        enumArray2 = new fw1_2("NONE", 4, false, false, false);
        NONE = enumArray2;
        enumArray2 = fw1_2.$values();
        $VALUES = enumArray2;
        $ENTRIES = ha0_2.a(enumArray2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fw1_2(boolean bl3) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.info = bl3;
        this.headers = var4_2;
        this.body = var5_3;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static fw1_2 valueOf(String string2) {
        return Enum.valueOf(fw1_2.class, string2);
    }

    public static fw1_2[] values() {
        return (fw1_2[])$VALUES.clone();
    }

    public final boolean getBody() {
        return this.body;
    }

    public final boolean getHeaders() {
        return this.headers;
    }

    public final boolean getInfo() {
        return this.info;
    }
}

