/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhde;

public final class zzhep
extends RuntimeException {
    public zzhep(zzhde zzhde2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhcd zza() {
        String string2 = this.getMessage();
        zzhcd zzhcd2 = new zzhcd(string2);
        return zzhcd2;
    }
}

