/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.CommonStatusCodes;

public class AuthApiStatusCodes
extends CommonStatusCodes {
    public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;
    public static final int AUTH_API_CLIENT_ERROR = 3002;
    public static final int AUTH_API_INVALID_CREDENTIALS = 3000;
    public static final int AUTH_API_SERVER_ERROR = 3003;
    public static final int AUTH_APP_CERT_ERROR = 3006;
    public static final int AUTH_TOKEN_ERROR = 3004;
    public static final int AUTH_URL_RESOLUTION = 3005;

    private AuthApiStatusCodes() {
    }

    public static String getStatusCodeString(int n3) {
        switch (n3) {
            default: {
                return CommonStatusCodes.getStatusCodeString(n3);
            }
            case 3006: {
                return "AUTH_APP_CERT_ERROR";
            }
            case 3005: {
                return "AUTH_URL_RESOLUTION";
            }
            case 3004: {
                return "AUTH_TOKEN_ERROR";
            }
            case 3003: {
                return "AUTH_API_SERVER_ERROR";
            }
            case 3002: {
                return "AUTH_API_CLIENT_ERROR";
            }
            case 3001: {
                return "AUTH_API_ACCESS_FORBIDDEN";
            }
            case 3000: 
        }
        return "AUTH_API_INVALID_CREDENTIALS";
    }
}

