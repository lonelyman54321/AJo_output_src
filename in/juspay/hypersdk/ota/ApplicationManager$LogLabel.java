/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

final class ApplicationManager$LogLabel {
    public static final String APP_LOAD_EXCEPTION = "app_load_exception";
    public static final String CLEAN_UP_ERROR = "clean_up_error";
    public static final ApplicationManager$LogLabel INSTANCE;
    public static final String TOSS_GENERATION_ERROR = "toss_generation_error";

    static {
        ApplicationManager$LogLabel applicationManager$LogLabel;
        INSTANCE = applicationManager$LogLabel = new ApplicationManager$LogLabel();
    }

    private ApplicationManager$LogLabel() {
    }
}

