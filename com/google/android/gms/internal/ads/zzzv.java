/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzzo;
import com.google.android.gms.internal.ads.zzzp;
import java.util.Arrays;

public final class zzzv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzzo[] zzd;

    public zzzv(boolean bl2, int n3) {
        zzzo[] zzzoArray = new zzzo[100];
        this.zzd = zzzoArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        synchronized (this) {
            return this.zzb * 65536;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzzo zzb() {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                int n3;
                zzzo[] zzzoArray;
                Object[] objectArray;
                zzzo zzzo2;
                block11: {
                    block9: {
                        int n4;
                        block8: {
                            try {
                                this.zzb = n4 = this.zzb + 1;
                                n4 = this.zzc;
                                if (n4 <= 0) break block8;
                                zzzo[] zzzoArray2 = this.zzd;
                                this.zzc = n4 += -1;
                                zzzo2 = zzzoArray2[n4];
                                boolean bl2 = false;
                                if (zzzo2 == null) {
                                    throw null;
                                }
                                zzzoArray2[n4] = null;
                                break block9;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                        }
                        n4 = 65536;
                        objectArray = new byte[n4];
                        zzzoArray = null;
                        zzzo2 = new zzzo((byte[])objectArray, 0);
                        n4 = this.zzb;
                        zzzoArray = this.zzd;
                        n3 = zzzoArray.length;
                        if (n4 > n3) break block11;
                    }
                    return zzzo2;
                }
                n3 += n3;
                {
                    objectArray = Arrays.copyOf(zzzoArray, n3);
                    objectArray = (zzzo[])objectArray;
                    this.zzd = (zzzo[])objectArray;
                    return zzzo2;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(zzzo zzzo2) {
        synchronized (this) {
            int n3;
            int n4;
            zzzo[] zzzoArray = this.zzd;
            int n7 = this.zzc;
            this.zzc = n4 = n7 + 1;
            zzzoArray[n7] = zzzo2;
            this.zzb = n3 = this.zzb + -1;
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzzp zzzp2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                while (zzzp2 != null) {
                    try {
                        int n3;
                        zzzo zzzo2;
                        int n4;
                        zzzo[] zzzoArray = this.zzd;
                        int n7 = this.zzc;
                        this.zzc = n4 = n7 + 1;
                        zzzoArray[n7] = zzzo2 = zzzp2.zzc();
                        this.zzb = n3 = this.zzb + -1;
                        zzzp2 = zzzp2.zzd();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.notifyAll();
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
    public final void zze() {
        synchronized (this) {
            Object var1_1 = null;
            this.zzf(0);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    int n4 = this.zza;
                    this.zza = n3;
                    if (n3 < n4) {
                        this.zzg();
                        return;
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
    public final void zzg() {
        synchronized (this) {
            int n3 = this.zza;
            int n4 = zzgd.zza;
            n3 += (char)-1;
            n4 = 65536;
            n3 /= n4;
            n4 = this.zzb;
            n3 -= n4;
            n4 = 0;
            n3 = Math.max(0, n3);
            n4 = this.zzc;
            if (n3 >= n4) {
                return;
            }
            Object[] objectArray = this.zzd;
            Arrays.fill(objectArray, n3, n4, null);
            this.zzc = n3;
            return;
        }
    }
}

