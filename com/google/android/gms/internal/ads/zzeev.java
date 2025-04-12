/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzeev {
    private long zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private final Object zzf;
    private final Object zzg;
    private final Object zzh;
    private final Object zzi;
    private final Object zzj;

    public zzeev() {
        Object object;
        long l2;
        this.zza = l2 = 0L;
        this.zzb = 0;
        this.zzc = l2;
        this.zzd = l2;
        this.zze = l2;
        this.zzf = object = new Object();
        this.zzg = object = new Object();
        this.zzh = object = new Object();
        this.zzi = object = new Object();
        this.zzj = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        Object object = this.zzg;
        synchronized (object) {
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb() {
        synchronized (this) {
            Object object = this.zzj;
            synchronized (object) {
                return this.zze;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzc() {
        synchronized (this) {
            Object object = this.zzi;
            synchronized (object) {
                return this.zzd;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzd() {
        synchronized (this) {
            Object object = this.zzf;
            synchronized (object) {
                return this.zza;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zze() {
        Object object = this.zzh;
        synchronized (object) {
            return this.zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(long l2) {
        synchronized (this) {
            Object object = this.zzj;
            synchronized (object) {
                this.zze = l2;
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(long l2) {
        synchronized (this) {
            Object object = this.zzi;
            synchronized (object) {
                this.zzd = l2;
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(long l2) {
        synchronized (this) {
            Object object = this.zzf;
            synchronized (object) {
                this.zza = l2;
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(int n3) {
        Object object = this.zzg;
        synchronized (object) {
            this.zzb = n3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(long l2) {
        Object object = this.zzh;
        synchronized (object) {
            this.zzc = l2;
            return;
        }
    }
}

