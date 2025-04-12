/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class ModuleInstallStatusCodes
extends CommonStatusCodes {
    public static final int INSUFFICIENT_STORAGE = 46003;
    public static final int MODULE_NOT_FOUND = 46002;
    public static final int NOT_ALLOWED_MODULE = 46001;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN_MODULE = 46000;

    private ModuleInstallStatusCodes() {
    }

    public static String getStatusCodeString(int n3) {
        switch (n3) {
            default: {
                return CommonStatusCodes.getStatusCodeString(n3);
            }
            case 46003: {
                return "INSUFFICIENT_STORAGE";
            }
            case 46002: {
                return "MODULE_NOT_FOUND";
            }
            case 46001: {
                return "NOT_ALLOWED_MODULE";
            }
            case 46000: 
        }
        return "UNKNOWN_MODULE";
    }
}

