/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzer;

public final class zzeu {
    private final zzer zza;
    private boolean zzb;

    public zzeu() {
        throw null;
    }

    public zzeu(zzer zzer2) {
        this.zza = zzer2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    while (!(bl2 = this.zzb)) {
                        this.wait();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                boolean bl2 = false;
                Thread thread2 = null;
                try {
                    boolean bl3;
                    while (!(bl3 = this.zzb)) {
                        try {
                            this.wait();
                        }
                        catch (InterruptedException interruptedException) {
                            bl2 = true;
                        }
                    }
                    if (bl2) {
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzc() {
        synchronized (this) {
            boolean bl2 = this.zzb;
            this.zzb = false;
            return bl2;
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze() {
        synchronized (this) {
            boolean bl2 = this.zzb;
            if (bl2) {
                return false;
            }
            this.zzb = bl2 = true;
            this.notifyAll();
            return bl2;
        }
    }
}

