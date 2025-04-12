/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.debug.validate;

import com.affise.attribution.debug.validate.ValidationStatus$Companion;

public final class ValidationStatus
extends Enum {
    private static final /* synthetic */ ValidationStatus[] $VALUES;
    public static final ValidationStatus$Companion Companion;
    public static final /* enum */ ValidationStatus INVALID_APP_ID;
    public static final /* enum */ ValidationStatus INVALID_SECRET_KEY;
    public static final /* enum */ ValidationStatus NETWORK_ERROR;
    public static final /* enum */ ValidationStatus NOT_WORKING_ON_PRODUCTION;
    public static final /* enum */ ValidationStatus PACKAGE_NAME_NOT_FOUND;
    public static final /* enum */ ValidationStatus UNKNOWN_ERROR;
    public static final /* enum */ ValidationStatus VALID;
    private final String status;

    private static final /* synthetic */ ValidationStatus[] $values() {
        ValidationStatus validationStatus = VALID;
        validationStatus = INVALID_APP_ID;
        validationStatus = INVALID_SECRET_KEY;
        validationStatus = PACKAGE_NAME_NOT_FOUND;
        validationStatus = NOT_WORKING_ON_PRODUCTION;
        validationStatus = NETWORK_ERROR;
        validationStatus = UNKNOWN_ERROR;
        ValidationStatus[] validationStatusArray = new ValidationStatus[]{validationStatus, validationStatus, validationStatus, validationStatus, validationStatus, validationStatus, validationStatus};
        return validationStatusArray;
    }

    static {
        Object object;
        VALID = object = new ValidationStatus("VALID", 0, "valid");
        INVALID_APP_ID = object = new ValidationStatus("INVALID_APP_ID", 1, "invalid_app_id");
        INVALID_SECRET_KEY = object = new ValidationStatus("INVALID_SECRET_KEY", 2, "invalid_secret_key");
        PACKAGE_NAME_NOT_FOUND = object = new ValidationStatus("PACKAGE_NAME_NOT_FOUND", 3, "package_name_not_found");
        NOT_WORKING_ON_PRODUCTION = object = new ValidationStatus("NOT_WORKING_ON_PRODUCTION", 4, "not_working_on_production");
        NETWORK_ERROR = object = new ValidationStatus("NETWORK_ERROR", 5, "network_error");
        UNKNOWN_ERROR = object = new ValidationStatus("UNKNOWN_ERROR", 6, "unknown_error");
        $VALUES = ValidationStatus.$values();
        object = new ValidationStatus$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ValidationStatus() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.status = var3_2;
    }

    public static final ValidationStatus from(String string2) {
        return Companion.from(string2);
    }

    public static ValidationStatus valueOf(String string2) {
        return Enum.valueOf(ValidationStatus.class, string2);
    }

    public static ValidationStatus[] values() {
        return (ValidationStatus[])$VALUES.clone();
    }

    public final String getStatus() {
        return this.status;
    }
}

