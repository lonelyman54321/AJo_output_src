/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzgpy;
import com.google.android.gms.internal.ads.zzgqa;
import com.google.android.gms.internal.ads.zzgqe;
import com.google.android.gms.internal.ads.zzgqk;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgpi {
    private static final zzgpi zza;
    private final AtomicReference zzb;

    static {
        zzgpi zzgpi2;
        zza = zzgpi2 = new zzgpi();
    }

    public zzgpi() {
        AtomicReference<zzgqe> atomicReference;
        zzgqa zzgqa2 = new zzgqa(null);
        zzgqe zzgqe2 = new zzgqe(zzgqa2, null);
        this.zzb = atomicReference = new AtomicReference<zzgqe>(zzgqe2);
    }

    public static zzgpi zza() {
        return zza;
    }

    public final Class zzb(Class clazz) {
        return ((zzgqe)this.zzb.get()).zza(clazz);
    }

    public final Object zzc(zzghi zzghi2, Class clazz) {
        return ((zzgqe)this.zzb.get()).zzb(zzghi2, clazz);
    }

    public final Object zzd(zzgqk zzgqk2, Class clazz) {
        return ((zzgqe)this.zzb.get()).zzc(zzgqk2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(zzgpy object) {
        synchronized (this) {
            Object object2 = this.zzb;
            object2 = ((AtomicReference)object2).get();
            object2 = (zzgqe)object2;
            zzgqa zzgqa2 = new zzgqa((zzgqe)object2, null);
            zzgqa2.zza((zzgpy)object);
            object = new zzgqe(zzgqa2, null);
            object2 = this.zzb;
            ((AtomicReference)object2).set(object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(zzghy object) {
        synchronized (this) {
            Object object2 = this.zzb;
            object2 = ((AtomicReference)object2).get();
            object2 = (zzgqe)object2;
            zzgqa zzgqa2 = new zzgqa((zzgqe)object2, null);
            zzgqa2.zzb((zzghy)object);
            object = new zzgqe(zzgqa2, null);
            object2 = this.zzb;
            ((AtomicReference)object2).set(object);
            return;
        }
    }
}

