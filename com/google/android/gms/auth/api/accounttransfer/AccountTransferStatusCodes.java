/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class AccountTransferStatusCodes
extends CommonStatusCodes {
    public static final int CHALLENGE_NOT_ALLOWED = 20503;
    public static final int INVALID_REQUEST = 20502;
    public static final int NOT_ALLOWED_SECURITY = 20500;
    public static final int NO_DATA_AVAILABLE = 20501;
    public static final int SESSION_INACTIVE = 20504;

    private AccountTransferStatusCodes() {
    }

    public static String getStatusCodeString(int n3) {
        switch (n3) {
            default: {
                return CommonStatusCodes.getStatusCodeString(n3);
            }
            case 20504: {
                return "SESSION_INACTIVE";
            }
            case 20503: {
                return "CHALLENGE_NOT_ALLOWED";
            }
            case 20502: {
                return "INVALID_REQUEST";
            }
            case 20501: {
                return "NO_DATA_AVAILABLE";
            }
            case 20500: 
        }
        return "NOT_ALLOWED_SECURITY";
    }
}

