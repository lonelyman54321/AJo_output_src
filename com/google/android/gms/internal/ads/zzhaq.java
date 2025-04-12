/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzhaq
extends IOException {
    public zzhaq() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzhaq(String string2, Throwable throwable) {
        string2 = String.valueOf(string2);
        string2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(string2);
        super(string2, throwable);
    }

    public zzhaq(Throwable throwable) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
    }
}

