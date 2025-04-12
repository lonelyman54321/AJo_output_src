/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgon;
import com.google.android.gms.internal.ads.zzgor;
import com.google.android.gms.internal.ads.zzgpj;
import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgpu;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgqr;
import com.google.android.gms.internal.ads.zzgqx;
import com.google.android.gms.internal.ads.zzgqz;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgpl {
    private static final zzgpl zza;
    private final AtomicReference zzb;

    static {
        zzgpj zzgpj2 = new zzgpj();
        zza = (zzgpl)zzgqz.zza(zzgpj2);
    }

    public zzgpl() {
        AtomicReference<zzgqx> atomicReference;
        zzgqr zzgqr2 = new zzgqr();
        zzgqx zzgqx2 = new zzgqx(zzgqr2, null);
        this.zzb = atomicReference = new AtomicReference<zzgqx>(zzgqx2);
    }

    public static zzgpl zzc() {
        return zza;
    }

    public final zzghi zza(zzgqq zzgqq2, zzgic zzgic2) {
        return ((zzgqx)this.zzb.get()).zza(zzgqq2, zzgic2);
    }

    public final zzghx zzb(zzgqq zzgqq2) {
        return ((zzgqx)this.zzb.get()).zzb(zzgqq2);
    }

    public final zzgqq zzd(zzghi zzghi2, Class clazz, zzgic zzgic2) {
        return ((zzgqx)this.zzb.get()).zzc(zzghi2, clazz, zzgic2);
    }

    public final zzgqq zze(zzghx zzghx2, Class clazz) {
        return ((zzgqx)this.zzb.get()).zzd(zzghx2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(zzgon object) {
        synchronized (this) {
            Object object2 = this.zzb;
            object2 = ((AtomicReference)object2).get();
            object2 = (zzgqx)object2;
            Object object3 = new zzgqr((zzgqx)object2);
            ((zzgqr)object3).zza((zzgon)object);
            object2 = null;
            object = new zzgqx((zzgqr)object3, null);
            object3 = this.zzb;
            ((AtomicReference)object3).set(object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(zzgor object) {
        synchronized (this) {
            Object object2 = this.zzb;
            object2 = ((AtomicReference)object2).get();
            object2 = (zzgqx)object2;
            Object object3 = new zzgqr((zzgqx)object2);
            ((zzgqr)object3).zzb((zzgor)object);
            object2 = null;
            object = new zzgqx((zzgqr)object3, null);
            object3 = this.zzb;
            ((AtomicReference)object3).set(object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(zzgpq object) {
        synchronized (this) {
            Object object2 = this.zzb;
            object2 = ((AtomicReference)object2).get();
            object2 = (zzgqx)object2;
            Object object3 = new zzgqr((zzgqx)object2);
            ((zzgqr)object3).zzc((zzgpq)object);
            object2 = null;
            object = new zzgqx((zzgqr)object3, null);
            object3 = this.zzb;
            ((AtomicReference)object3).set(object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(zzgpu object) {
        synchronized (this) {
            Object object2 = this.zzb;
            object2 = ((AtomicReference)object2).get();
            object2 = (zzgqx)object2;
            Object object3 = new zzgqr((zzgqx)object2);
            ((zzgqr)object3).zzd((zzgpu)object);
            object2 = null;
            object = new zzgqx((zzgqr)object3, null);
            object3 = this.zzb;
            ((AtomicReference)object3).set(object);
            return;
        }
    }

    public final boolean zzj(zzgqq zzgqq2) {
        return ((zzgqx)this.zzb.get()).zzi(zzgqq2);
    }

    public final boolean zzk(zzgqq zzgqq2) {
        return ((zzgqx)this.zzb.get()).zzj(zzgqq2);
    }
}

