/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from hv1
 */
public final class hv1_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ hv1_1[] $VALUES;
    public static final /* enum */ hv1_1 ERROR;
    public static final /* enum */ hv1_1 IDLE;
    public static final /* enum */ hv1_1 LOADING;
    public static final /* enum */ hv1_1 PAGINATING;
    public static final /* enum */ hv1_1 PAGINATION_ERROR;
    public static final /* enum */ hv1_1 PAGINATION_EXHAUST;

    private static final /* synthetic */ hv1_1[] $values() {
        hv1_1 hv1_12 = IDLE;
        hv1_12 = LOADING;
        hv1_12 = PAGINATING;
        hv1_12 = ERROR;
        hv1_12 = PAGINATION_EXHAUST;
        hv1_12 = PAGINATION_ERROR;
        hv1_1[] hv1_1Array = new hv1_1[]{hv1_12, hv1_12, hv1_12, hv1_12, hv1_12, hv1_12};
        return hv1_1Array;
    }

    static {
        Enum[] enumArray = new hv1_1("IDLE", 0);
        IDLE = enumArray;
        enumArray = new hv1_1("LOADING", 1);
        LOADING = enumArray;
        enumArray = new hv1_1("PAGINATING", 2);
        PAGINATING = enumArray;
        enumArray = new hv1_1("ERROR", 3);
        ERROR = enumArray;
        enumArray = new hv1_1("PAGINATION_EXHAUST", 4);
        PAGINATION_EXHAUST = enumArray;
        enumArray = new hv1_1("PAGINATION_ERROR", 5);
        PAGINATION_ERROR = enumArray;
        enumArray = hv1_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hv1_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static hv1_1 valueOf(String string2) {
        return Enum.valueOf(hv1_1.class, string2);
    }

    public static hv1_1[] values() {
        return (hv1_1[])$VALUES.clone();
    }
}

