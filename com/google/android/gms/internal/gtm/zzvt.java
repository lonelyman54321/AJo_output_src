/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzvq;
import com.google.android.gms.internal.gtm.zzvr;

final class zzvt
extends zzvq {
    private static final zzvq zza;

    static {
        zzvt zzvt2 = new zzvt();
        zza = zzvt2;
    }

    public zzvt() {
        new zzvr(null);
    }

    public static final zzvq zzb() {
        return zza;
    }

    public final String toString() {
        return "No-op Provider";
    }
}

