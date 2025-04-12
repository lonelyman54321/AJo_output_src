/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.internal.ads.zzdas;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcvk
implements zzp {
    private final zzdas zza;
    private final AtomicBoolean zzb;
    private final AtomicBoolean zzc;

    public zzcvk(zzdas zzdas2) {
        AtomicBoolean atomicBoolean;
        this.zzb = atomicBoolean = new AtomicBoolean(false);
        this.zzc = atomicBoolean = new AtomicBoolean(false);
        this.zza = zzdas2;
    }

    private final void zzh() {
        Object object = this.zzc;
        boolean bl2 = ((AtomicBoolean)object).get();
        if (!bl2) {
            object = this.zzc;
            boolean bl3 = true;
            ((AtomicBoolean)object).set(bl3);
            object = this.zza;
            ((zzdas)object).zza();
        }
    }

    public final void zzdH() {
    }

    public final void zzdk() {
    }

    public final void zzdq() {
        this.zzh();
    }

    public final void zzdr() {
        this.zza.zzc();
    }

    public final void zzdt() {
    }

    public final void zzdu(int n3) {
        this.zzb.set(true);
        this.zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}

