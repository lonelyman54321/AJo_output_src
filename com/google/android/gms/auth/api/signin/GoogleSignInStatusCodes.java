/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class GoogleSignInStatusCodes
extends CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    private GoogleSignInStatusCodes() {
    }

    public static String getStatusCodeString(int n3) {
        switch (n3) {
            default: {
                return CommonStatusCodes.getStatusCodeString(n3);
            }
            case 12502: {
                return "Sign-in in progress";
            }
            case 12501: {
                return "Sign in action cancelled";
            }
            case 12500: 
        }
        return "A non-recoverable sign in failure occurred";
    }
}

