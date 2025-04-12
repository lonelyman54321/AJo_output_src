/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hyper.constants;

public final class LogSubCategory$ApiCall {
    public static final LogSubCategory$ApiCall INSTANCE;
    public static final String NETWORK = "network";
    public static final String SDK = "external_sdk";

    static {
        LogSubCategory$ApiCall logSubCategory$ApiCall;
        INSTANCE = logSubCategory$ApiCall = new LogSubCategory$ApiCall();
    }

    private LogSubCategory$ApiCall() {
    }
}

