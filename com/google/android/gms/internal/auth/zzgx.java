/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.internal.auth.zzfw;

public final class zzgx
extends RuntimeException {
    public zzgx(zzfw zzfw2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzfa zza() {
        String string2 = this.getMessage();
        zzfa zzfa2 = new zzfa(string2);
        return zzfa2;
    }
}

