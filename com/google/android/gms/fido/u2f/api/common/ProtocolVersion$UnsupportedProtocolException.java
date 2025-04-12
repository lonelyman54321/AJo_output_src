/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.u2f.api.common;

public class ProtocolVersion$UnsupportedProtocolException
extends Exception {
    public ProtocolVersion$UnsupportedProtocolException(String string2) {
        string2 = cP.a("Protocol version ", string2, " not supported");
        super(string2);
    }
}

