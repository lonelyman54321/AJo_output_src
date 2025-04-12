/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from HT0
 */
public final class ht0_0
extends Enum {
    private static final /* synthetic */ ht0_0[] $VALUES;
    public static final /* enum */ ht0_0 NO_CONNECTIVITY;
    public static final /* enum */ ht0_0 SERVER_ERROR;
    public static final /* enum */ ht0_0 SUCCESS;
    public static final /* enum */ ht0_0 UNKNOWN_ERROR;

    private static final /* synthetic */ ht0_0[] $values() {
        ht0_0 ht0_02 = SUCCESS;
        ht0_02 = SERVER_ERROR;
        ht0_02 = NO_CONNECTIVITY;
        ht0_02 = UNKNOWN_ERROR;
        ht0_0[] ht0_0Array = new ht0_0[]{ht0_02, ht0_02, ht0_02, ht0_02};
        return ht0_0Array;
    }

    static {
        ht0_0 ht0_02;
        SUCCESS = ht0_02 = new ht0_0("SUCCESS", 0);
        SERVER_ERROR = ht0_02 = new ht0_0("SERVER_ERROR", 1);
        NO_CONNECTIVITY = ht0_02 = new ht0_0("NO_CONNECTIVITY", 2);
        UNKNOWN_ERROR = ht0_02 = new ht0_0("UNKNOWN_ERROR", 3);
        $VALUES = ht0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ht0_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ht0_0 valueOf(String string2) {
        return Enum.valueOf(ht0_0.class, string2);
    }

    public static ht0_0[] values() {
        return (ht0_0[])$VALUES.clone();
    }
}

