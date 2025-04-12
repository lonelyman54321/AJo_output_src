/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.u2f.api.messagebased;

public class RequestType$UnsupportedRequestTypeException
extends Exception {
    public RequestType$UnsupportedRequestTypeException(String string2) {
        string2 = String.valueOf(string2);
        string2 = "Unsupported request type ".concat(string2);
        super(string2);
    }
}

