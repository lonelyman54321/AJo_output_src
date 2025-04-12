/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

public class ErrorCode$UnsupportedErrorCodeException
extends Exception {
    public ErrorCode$UnsupportedErrorCodeException(int n3) {
        String string2 = Gj0.b(n3, "Error code ", " is not supported");
        super(string2);
    }
}

