/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzvq;

final class zzkv
implements zzlu {
    private final Object zza;
    private final zzvq zzb;
    private zzdc zzc;

    public zzkv(Object object, zzvj zzvj2) {
        this.zza = object;
        this.zzb = zzvj2;
        this.zzc = object = zzvj2.zzC();
    }

    public final zzdc zza() {
        return this.zzc;
    }

    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzdc zzdc2) {
        this.zzc = zzdc2;
    }
}

