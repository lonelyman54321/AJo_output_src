/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hyper.constants;

public final class LogSubCategory$Action {
    public static final String DUI = "dynamic_ui";
    public static final LogSubCategory$Action INSTANCE;
    public static final String SYSTEM = "system";
    public static final String USER = "user";

    static {
        LogSubCategory$Action logSubCategory$Action;
        INSTANCE = logSubCategory$Action = new LogSubCategory$Action();
    }

    private LogSubCategory$Action() {
    }
}

