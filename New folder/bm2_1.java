/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Bm2
 */
public final class bm2_1
extends Enum {
    private static final /* synthetic */ bm2_1[] $VALUES;
    public static final /* enum */ bm2_1 CustomAndOperationalData;
    public static final /* enum */ bm2_1 CustomData;
    public static final /* enum */ bm2_1 OperationalData;
    private final String value;

    private static final /* synthetic */ bm2_1[] $values() {
        bm2_1 bm2_12 = CustomData;
        bm2_12 = OperationalData;
        bm2_12 = CustomAndOperationalData;
        bm2_1[] bm2_1Array = new bm2_1[]{bm2_12, bm2_12, bm2_12};
        return bm2_1Array;
    }

    static {
        bm2_1 bm2_12;
        CustomData = bm2_12 = new bm2_1("CustomData", 0, "custom_data");
        OperationalData = bm2_12 = new bm2_1("OperationalData", 1, "operational_data");
        CustomAndOperationalData = bm2_12 = new bm2_1("CustomAndOperationalData", 2, "custom_and_operational_data");
        $VALUES = bm2_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bm2_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static bm2_1 valueOf(String string2) {
        return Enum.valueOf(bm2_1.class, string2);
    }

    public static bm2_1[] values() {
        return (bm2_1[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

