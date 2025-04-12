/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgb {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd;

    public zzgb(long l2) {
        ThreadLocal threadLocal;
        this.zzd = threadLocal = new ThreadLocal();
        this.zzi(0L);
    }

    public static long zzg(long l2) {
        return l2 * 1000000L / 90000L;
    }

    public static long zzh(long l2) {
        return l2 * 90000L / 1000000L;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zza(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                long l3;
                block6: {
                    block7: {
                        try {
                            boolean bl2 = this.zzj();
                            if (bl2) break block6;
                            l3 = this.zza;
                            long l4 = 0x7FFFFFFFFFFFFFFEL;
                            long l7 = l3 - l4;
                            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (object != false) break block7;
                            Object object2 = this.zzd;
                            object2 = ((ThreadLocal)object2).get();
                            if ((object2 = (Long)object2) == null) {
                                Object var10_8 = null;
                                throw null;
                            }
                            l3 = (Long)object2;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    this.zzb = l3 -= l2;
                    this.notifyAll();
                }
                this.zzc = l2;
                l3 = this.zzb;
                return l2 += l3;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    long l3;
                    long l4;
                    long l7;
                    long l8 = -9223372036854775807L;
                    long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
                    if (l12 == false) {
                        return l8;
                    }
                    try {
                        l7 = this.zzc;
                        l4 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                        if (l4 == false) break block6;
                        l8 = zzgb.zzh(l7);
                        l7 = 0x100000000L + l8;
                        l3 = 0x200000000L;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    long l14 = ((long)-1 + (l7 /= l3)) * l3 + l2;
                    l7 = l7 * l3 + l2;
                    l2 = l7 - l8;
                    l8 = l14 - l8;
                    l8 = Math.abs(l8);
                    l2 = Math.abs(l2);
                    l4 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
                    l2 = l4 < 0 ? l14 : l7;
                }
                l2 = zzgb.zzg(l2);
                return this.zza(l2);
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzc(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                long l3;
                long l4;
                long l7 = -9223372036854775807L;
                long l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
                if (l8 == false) {
                    return l7;
                }
                try {
                    l4 = this.zzc;
                    long l12 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                    if (l12 == false) break block6;
                    l7 = zzgb.zzh(l4);
                    l4 = 0x200000000L;
                    l3 = l7 / l4;
                }
                catch (Throwable throwable2) {}
                Long.signum(l3);
                long l14 = l3 * l4 + l2;
                long l15 = 1L;
                l3 = (l3 + l15) * l4 + l2;
                long l16 = l14 == l7 ? 0 : (l14 < l7 ? -1 : 1);
                l2 = l16 >= 0 ? l14 : l3;
            }
            l2 = zzgb.zzg(l2);
            return this.zza(l2);
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzd() {
        synchronized (this) {
            long l2;
            long l3 = this.zza;
            long l4 = Long.MAX_VALUE;
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 != false && (l7 = (l2 = l3 - (l4 = 0x7FFFFFFFFFFFFFFEL)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                return l3;
            }
            return -9223372036854775807L;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zze() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                long l2;
                try {
                    l2 = this.zzc;
                    long l3 = -9223372036854775807L;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 == false) return this.zzd();
                    l3 = this.zzb;
                    l2 += l3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return l2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzf() {
        synchronized (this) {
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(long l2) {
        synchronized (this) {
            this.zza = l2;
            long l3 = Long.MAX_VALUE;
            long l4 = -9223372036854775807L;
            long l7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            l2 = l7 == false ? 0L : l4;
            this.zzb = l2;
            this.zzc = l4;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzj() {
        synchronized (this) {
            long l2 = this.zzb;
            long l3 = -9223372036854775807L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            return l4 != false;
        }
    }
}

