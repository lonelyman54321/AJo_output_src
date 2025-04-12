/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hyper.constants;

public final class LogCategory {
    public static final String ACTION = "action";
    public static final String API_CALL = "api_call";
    public static final String CONTEXT = "context";
    public static final LogCategory INSTANCE;
    public static final String LIFECYCLE = "lifecycle";

    static {
        LogCategory logCategory;
        INSTANCE = logCategory = new LogCategory();
    }

    private LogCategory() {
    }
}

