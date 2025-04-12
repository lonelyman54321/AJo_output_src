/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import java.io.IOException;

public final class zzcl
extends IOException {
    public zzcl() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzcl(String string2, Throwable throwable) {
        string2 = String.valueOf(string2);
        int n3 = string2.length();
        String string3 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
        string2 = n3 != 0 ? string3.concat(string2) : new String(string3);
        super(string2, throwable);
    }

    public zzcl(Throwable throwable) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
    }
}

