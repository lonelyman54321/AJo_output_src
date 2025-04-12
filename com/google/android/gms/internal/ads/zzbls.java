/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbls {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd;

    public zzbls() {
        AtomicBoolean atomicBoolean;
        this.zzd = atomicBoolean = new AtomicBoolean(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float zza() {
        synchronized (this) {
            return this.zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(boolean bl2, float f5) {
        synchronized (this) {
            this.zzb = bl2;
            this.zzc = f5;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(boolean bl2) {
        synchronized (this) {
            this.zza = bl2;
            AtomicBoolean atomicBoolean = this.zzd;
            boolean bl3 = true;
            atomicBoolean.set(bl3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd() {
        synchronized (this) {
            return this.zzb;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze(boolean bl2) {
        synchronized (this) {
            try {
                AtomicBoolean atomicBoolean = this.zzd;
                boolean bl3 = atomicBoolean.get();
                if (!bl3) return bl2;
                return this.zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

