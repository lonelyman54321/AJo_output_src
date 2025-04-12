/*
 * Decompiled with CFR 0.152.
 */
public final class ng1$a
extends Enum {
    private static final /* synthetic */ ng1$a[] $VALUES;
    public static final /* enum */ ng1$a NONE;
    public static final /* enum */ ng1$a V1;
    public static final /* enum */ ng1$a V2_V4;
    public static final /* enum */ ng1$a V5_V7;
    private final String type;

    private static final /* synthetic */ ng1$a[] $values() {
        ng1$a ng1$a = NONE;
        ng1$a = V1;
        ng1$a = V2_V4;
        ng1$a = V5_V7;
        ng1$a[] ng1$aArray = new ng1$a[]{ng1$a, ng1$a, ng1$a, ng1$a};
        return ng1$aArray;
    }

    static {
        ng1$a ng1$a;
        NONE = ng1$a = new ng1$a("NONE", 0, "none");
        V1 = ng1$a = new ng1$a("V1", 1, "Android-GPBL-V1");
        V2_V4 = ng1$a = new ng1$a("V2_V4", 2, "Android-GPBL-V2-V4");
        V5_V7 = ng1$a = new ng1$a("V5_V7", 3, "Android-GPBL-V5-V7");
        $VALUES = ng1$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ng1$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ng1$a valueOf(String string2) {
        return Enum.valueOf(ng1$a.class, string2);
    }

    public static ng1$a[] values() {
        return (ng1$a[])$VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

