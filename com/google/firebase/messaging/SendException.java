/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import java.util.Locale;

public final class SendException
extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN;
    private final int errorCode;

    public SendException(String string2) {
        super(string2);
        int n3;
        this.errorCode = n3 = this.parseErrorCode(string2);
    }

    private int parseErrorCode(String string2) {
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        if (string2 == null) {
            return 0;
        }
        Locale locale = Locale.US;
        string2 = string2.toLowerCase(locale);
        string2.getClass();
        int n10 = -1;
        int n14 = string2.hashCode();
        switch (n14) {
            default: {
                break;
            }
            case -95047692: {
                String string3 = "missing_to";
                boolean bl2 = string2.equals(string3);
                if (!bl2) break;
                n10 = 4;
                break;
            }
            case -617027085: {
                String string4 = "messagetoobig";
                boolean bl3 = string2.equals(string4);
                if (!bl3) break;
                n10 = 3;
                break;
            }
            case -920906446: {
                String string5 = "invalid_parameters";
                boolean bl4 = string2.equals(string5);
                if (!bl4) break;
                n10 = 2;
                break;
            }
            case -1290953729: {
                String string6 = "toomanymessages";
                boolean bl5 = string2.equals(string6);
                if (!bl5) break;
                n10 = 1;
                break;
            }
            case -1743242157: {
                String string7 = "service_not_available";
                boolean bl6 = string2.equals(string7);
                if (!bl6) break;
                n10 = 0;
                locale = null;
            }
        }
        switch (n10) {
            default: {
                return 0;
            }
            case 3: {
                return n7;
            }
            case 2: 
            case 4: {
                return n8;
            }
            case 1: {
                return n3;
            }
            case 0: 
        }
        return n4;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}

