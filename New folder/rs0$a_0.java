/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from rs0$a
 */
public final class rs0$a_0
extends Enum {
    private static final /* synthetic */ rs0$a_0[] $VALUES;
    public static final /* enum */ rs0$a_0 DOWNLOAD_FAILED;
    public static final /* enum */ rs0$a_0 INIT_ERROR;
    public static final /* enum */ rs0$a_0 NO_IMAGE;
    public static final /* enum */ rs0$a_0 NO_NETWORK;
    public static final /* enum */ rs0$a_0 SIZE_LIMIT_EXCEEDED;
    public static final /* enum */ rs0$a_0 SUCCESS;
    private final String statusValue;

    private static final /* synthetic */ rs0$a_0[] $values() {
        rs0$a_0 rs0$a_0 = NO_IMAGE;
        rs0$a_0 = SUCCESS;
        rs0$a_0 = DOWNLOAD_FAILED;
        rs0$a_0 = NO_NETWORK;
        rs0$a_0 = INIT_ERROR;
        rs0$a_0 = SIZE_LIMIT_EXCEEDED;
        rs0$a_0[] rs0$a_0Array = new rs0$a_0[]{rs0$a_0, rs0$a_0, rs0$a_0, rs0$a_0, rs0$a_0, rs0$a_0};
        return rs0$a_0Array;
    }

    static {
        rs0$a_0 rs0$a_0;
        String string2 = "NO_IMAGE";
        NO_IMAGE = rs0$a_0 = new rs0$a_0(string2, 0, string2);
        string2 = "SUCCESS";
        SUCCESS = rs0$a_0 = new rs0$a_0(string2, 1, string2);
        string2 = "DOWNLOAD_FAILED";
        DOWNLOAD_FAILED = rs0$a_0 = new rs0$a_0(string2, 2, string2);
        string2 = "NO_NETWORK";
        NO_NETWORK = rs0$a_0 = new rs0$a_0(string2, 3, string2);
        string2 = "INIT_ERROR";
        INIT_ERROR = rs0$a_0 = new rs0$a_0(string2, 4, string2);
        string2 = "SIZE_LIMIT_EXCEEDED";
        SIZE_LIMIT_EXCEEDED = rs0$a_0 = new rs0$a_0(string2, 5, string2);
        $VALUES = rs0$a_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rs0$a_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.statusValue = var3_2;
    }

    public static rs0$a_0 valueOf(String string2) {
        return Enum.valueOf(rs0$a_0.class, string2);
    }

    public static rs0$a_0[] values() {
        return (rs0$a_0[])$VALUES.clone();
    }

    public final String getStatusValue() {
        return this.statusValue;
    }
}

