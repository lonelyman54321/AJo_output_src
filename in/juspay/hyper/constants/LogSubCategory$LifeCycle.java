/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hyper.constants;

public final class LogSubCategory$LifeCycle {
    public static final String ANDROID = "android";
    public static final String HYPER_SDK = "hypersdk";
    public static final LogSubCategory$LifeCycle INSTANCE;

    static {
        LogSubCategory$LifeCycle logSubCategory$LifeCycle;
        INSTANCE = logSubCategory$LifeCycle = new LogSubCategory$LifeCycle();
    }

    private LogSubCategory$LifeCycle() {
    }
}

