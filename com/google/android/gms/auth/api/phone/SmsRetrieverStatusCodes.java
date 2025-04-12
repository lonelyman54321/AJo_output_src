/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class SmsRetrieverStatusCodes
extends CommonStatusCodes {
    public static final int API_NOT_AVAILABLE = 36501;
    public static final int PLATFORM_NOT_SUPPORTED = 36500;
    public static final int USER_PERMISSION_REQUIRED = 36502;

    private SmsRetrieverStatusCodes() {
    }

    public static String getStatusCodeString(int n3) {
        switch (n3) {
            default: {
                return CommonStatusCodes.getStatusCodeString(n3);
            }
            case 36502: {
                return "USER_PERMISSION_REQUIRED";
            }
            case 36501: {
                return "API_NOT_AVAILABLE";
            }
            case 36500: 
        }
        return "PLATFORM_NOT_SUPPORTED";
    }
}

