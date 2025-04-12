/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import java.io.IOException;

public final class zzzf
extends IOException {
    public zzzf() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzzf(long l2, long l3, int n3, Throwable throwable) {
        CharSequence charSequence = D70.c(l2, "Pos: ", ", limit: ");
        charSequence.append(l3);
        charSequence.append(", len: ");
        charSequence.append(n3);
        charSequence = charSequence.toString();
        charSequence = "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat((String)charSequence);
        super((String)charSequence, throwable);
    }

    public zzzf(Throwable throwable) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
    }
}

