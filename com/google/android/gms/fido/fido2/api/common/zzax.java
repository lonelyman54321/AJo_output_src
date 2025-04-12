/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

public final class zzax
extends Exception {
    public zzax(String string2) {
        string2 = cP.a("User verification requirement ", string2, " not supported");
        super(string2);
    }
}

