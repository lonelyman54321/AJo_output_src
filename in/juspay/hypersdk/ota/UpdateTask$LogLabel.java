/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

final class UpdateTask$LogLabel {
    public static final UpdateTask$LogLabel INSTANCE;
    public static final String PACKAGE_UPDATE_RESULT = "package_update_result";
    public static final String UPDATE_ERROR = "update_error";

    static {
        UpdateTask$LogLabel updateTask$LogLabel;
        INSTANCE = updateTask$LogLabel = new UpdateTask$LogLabel();
    }

    private UpdateTask$LogLabel() {
    }
}

