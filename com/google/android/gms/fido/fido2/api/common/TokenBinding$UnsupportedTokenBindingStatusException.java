/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

public class TokenBinding$UnsupportedTokenBindingStatusException
extends Exception {
    public TokenBinding$UnsupportedTokenBindingStatusException(String string2) {
        string2 = cP.a("TokenBindingStatus ", string2, " not supported");
        super(string2);
    }
}

