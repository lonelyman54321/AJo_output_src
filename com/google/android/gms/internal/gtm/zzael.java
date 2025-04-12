/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzadl;

public final class zzael
extends RuntimeException {
    public zzael(zzadl zzadl2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzacq zza() {
        String string2 = this.getMessage();
        zzacq zzacq2 = new zzacq(string2);
        return zzacq2;
    }
}

