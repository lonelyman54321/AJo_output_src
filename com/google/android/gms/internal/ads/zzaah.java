/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzaah
extends IOException {
    public zzaah(Throwable throwable) {
        String string2 = throwable.getClass().getSimpleName();
        String string3 = throwable.getMessage();
        if (string3 != null) {
            string3 = String.valueOf(throwable.getMessage());
            String string4 = ": ";
            string3 = string4.concat(string3);
        } else {
            string3 = "";
        }
        string2 = cP.a("Unexpected ", string2, string3);
        super(string2, throwable);
    }
}

