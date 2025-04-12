/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzuo;
import com.google.android.gms.internal.gtm.zzvq;
import com.google.android.gms.internal.gtm.zzwc;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

final class zzvl
extends zzvq {
    private static final zzvl zza;
    private final AtomicReference zzb;

    static {
        zzvl zzvl2;
        zzvq zzvq2 = zzvq.zze();
        zza = zzvl2 = new zzvl(zzvq2);
    }

    public zzvl(zzvq zzvq2) {
        AtomicReference<zzvq> atomicReference;
        this.zzb = atomicReference = new AtomicReference<zzvq>(zzvq2);
    }

    public static final zzvl zzb() {
        return zza;
    }

    public final zzuo zza() {
        return ((zzvq)this.zzb.get()).zza();
    }

    public final zzwc zzc() {
        return ((zzvq)this.zzb.get()).zzc();
    }

    public final boolean zzd(String string2, Level level, boolean bl2) {
        ((zzvq)this.zzb.get()).zzd(string2, level, bl2);
        return false;
    }
}

