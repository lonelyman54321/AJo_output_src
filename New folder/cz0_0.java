/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Cz0
 */
public final class cz0_0
extends Enum {
    private static final /* synthetic */ cz0_0[] $VALUES;
    public static final /* enum */ cz0_0 NONE;
    public static final /* enum */ cz0_0 SOURCE;
    public static final /* enum */ cz0_0 TRANSFORMED;

    private static /* synthetic */ cz0_0[] $values() {
        cz0_0 cz0_02 = SOURCE;
        cz0_02 = TRANSFORMED;
        cz0_02 = NONE;
        cz0_0[] cz0_0Array = new cz0_0[]{cz0_02, cz0_02, cz0_02};
        return cz0_0Array;
    }

    static {
        cz0_0 cz0_02;
        SOURCE = cz0_02 = new cz0_0("SOURCE", 0);
        TRANSFORMED = cz0_02 = new cz0_0("TRANSFORMED", 1);
        NONE = cz0_02 = new cz0_0("NONE", 2);
        $VALUES = cz0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cz0_0() {
        void var2_-1;
        void var1_-1;
    }

    public static cz0_0 valueOf(String string2) {
        return Enum.valueOf(cz0_0.class, string2);
    }

    public static cz0_0[] values() {
        return (cz0_0[])$VALUES.clone();
    }
}

