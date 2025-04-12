/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from iR2
 */
public final class ir2_1
extends Enum {
    private static final /* synthetic */ ir2_1[] $VALUES;
    public static final /* enum */ ir2_1 API_TIME_OUT;
    public static final /* enum */ ir2_1 NO_INTERNET_CONNECTION;
    public static final /* enum */ ir2_1 NO_INTERNET_RETRY_INITIATED;
    public static final /* enum */ ir2_1 NO_INTERNET_RETRY_SUCCESS;
    public static final /* enum */ ir2_1 NO_SERVER_CONNECTION;
    public static final /* enum */ ir2_1 OTHERS_ERRORS;

    private static /* synthetic */ ir2_1[] $values() {
        ir2_1 ir2_12 = NO_INTERNET_CONNECTION;
        ir2_12 = NO_SERVER_CONNECTION;
        ir2_12 = API_TIME_OUT;
        ir2_12 = OTHERS_ERRORS;
        ir2_12 = NO_INTERNET_RETRY_INITIATED;
        ir2_12 = NO_INTERNET_RETRY_SUCCESS;
        ir2_1[] ir2_1Array = new ir2_1[]{ir2_12, ir2_12, ir2_12, ir2_12, ir2_12, ir2_12};
        return ir2_1Array;
    }

    static {
        ir2_1 ir2_12;
        NO_INTERNET_CONNECTION = ir2_12 = new ir2_1("NO_INTERNET_CONNECTION", 0);
        NO_SERVER_CONNECTION = ir2_12 = new ir2_1("NO_SERVER_CONNECTION", 1);
        API_TIME_OUT = ir2_12 = new ir2_1("API_TIME_OUT", 2);
        OTHERS_ERRORS = ir2_12 = new ir2_1("OTHERS_ERRORS", 3);
        NO_INTERNET_RETRY_INITIATED = ir2_12 = new ir2_1("NO_INTERNET_RETRY_INITIATED", 4);
        NO_INTERNET_RETRY_SUCCESS = ir2_12 = new ir2_1("NO_INTERNET_RETRY_SUCCESS", 5);
        $VALUES = ir2_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ir2_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ir2_1 valueOf(String string2) {
        return Enum.valueOf(ir2_1.class, string2);
    }

    public static ir2_1[] values() {
        return (ir2_1[])$VALUES.clone();
    }
}

