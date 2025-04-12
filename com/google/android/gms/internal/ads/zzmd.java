/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzvq;
import java.util.ArrayList;
import java.util.List;

final class zzmd
implements zzlu {
    public final zzvj zza;
    public final Object zzb;
    public final List zzc;
    public int zzd;
    public boolean zze;

    public zzmd(zzvq object, boolean bl2) {
        zzvj zzvj2;
        this.zza = zzvj2 = new zzvj((zzvq)object, bl2);
        object = new ArrayList();
        this.zzc = object;
        this.zzb = object = new Object();
    }

    public final zzdc zza() {
        return this.zza.zzC();
    }

    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int n3) {
        this.zzd = n3;
        this.zze = false;
        this.zzc.clear();
    }
}

