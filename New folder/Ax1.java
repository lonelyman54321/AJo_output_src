/*
 * Decompiled with CFR 0.152.
 */
public final class Ax1
extends Enum {
    private static final /* synthetic */ Ax1[] $VALUES;
    public static final /* enum */ Ax1 APP_EVENTS;
    public static final /* enum */ Ax1 CACHE;
    public static final /* enum */ Ax1 DEVELOPER_ERRORS;
    public static final /* enum */ Ax1 GRAPH_API_DEBUG_INFO;
    public static final /* enum */ Ax1 GRAPH_API_DEBUG_WARNING;
    public static final /* enum */ Ax1 INCLUDE_ACCESS_TOKENS;
    public static final /* enum */ Ax1 INCLUDE_RAW_RESPONSES;
    public static final /* enum */ Ax1 REQUESTS;

    private static final /* synthetic */ Ax1[] $values() {
        Ax1 ax1 = REQUESTS;
        ax1 = INCLUDE_ACCESS_TOKENS;
        ax1 = INCLUDE_RAW_RESPONSES;
        ax1 = CACHE;
        ax1 = APP_EVENTS;
        ax1 = DEVELOPER_ERRORS;
        ax1 = GRAPH_API_DEBUG_WARNING;
        ax1 = GRAPH_API_DEBUG_INFO;
        Ax1[] ax1Array = new Ax1[]{ax1, ax1, ax1, ax1, ax1, ax1, ax1, ax1};
        return ax1Array;
    }

    static {
        Ax1 ax1;
        REQUESTS = ax1 = new Ax1("REQUESTS", 0);
        INCLUDE_ACCESS_TOKENS = ax1 = new Ax1("INCLUDE_ACCESS_TOKENS", 1);
        INCLUDE_RAW_RESPONSES = ax1 = new Ax1("INCLUDE_RAW_RESPONSES", 2);
        CACHE = ax1 = new Ax1("CACHE", 3);
        APP_EVENTS = ax1 = new Ax1("APP_EVENTS", 4);
        DEVELOPER_ERRORS = ax1 = new Ax1("DEVELOPER_ERRORS", 5);
        GRAPH_API_DEBUG_WARNING = ax1 = new Ax1("GRAPH_API_DEBUG_WARNING", 6);
        GRAPH_API_DEBUG_INFO = ax1 = new Ax1("GRAPH_API_DEBUG_INFO", 7);
        $VALUES = Ax1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ax1() {
        void var2_-1;
        void var1_-1;
    }

    public static Ax1 valueOf(String string2) {
        return Enum.valueOf(Ax1.class, string2);
    }

    public static Ax1[] values() {
        return (Ax1[])$VALUES.clone();
    }
}

