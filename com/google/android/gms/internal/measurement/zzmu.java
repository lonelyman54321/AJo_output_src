/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzmf;
import com.google.android.gms.internal.measurement.zznl;

abstract class zzmu {
    private static volatile int zza = 100;

    public abstract int zza(Object var1);

    public abstract Object zza();

    public abstract Object zza(Object var1, Object var2);

    public abstract void zza(Object var1, int var2, int var3);

    public abstract void zza(Object var1, int var2, long var3);

    public abstract void zza(Object var1, int var2, zziy var3);

    public abstract void zza(Object var1, int var2, Object var3);

    public abstract void zza(Object var1, zznl var2);

    public abstract boolean zza(zzmf var1);

    public final boolean zza(Object object, zzmf object2, int n3) {
        int n4 = object2.zzd();
        int n7 = n4 >>> 3;
        int n8 = 1;
        if ((n4 &= 7) != 0) {
            if (n4 != n8) {
                int n10 = 2;
                if (n4 != n10) {
                    n10 = 4;
                    int n14 = 3;
                    if (n4 != n14) {
                        if (n4 != n10) {
                            n3 = 5;
                            if (n4 == n3) {
                                int n15 = object2.zzf();
                                this.zza(object, n7, n15);
                                return n8 != 0;
                            }
                            throw zzkp.zza();
                        }
                        if (n3 != 0) {
                            return false;
                        }
                        throw zzkp.zzb();
                    }
                    Object object3 = this.zza();
                    n14 = n7 << 3;
                    n10 |= n14;
                    n14 = zza;
                    if ((n3 += n8) < n14) {
                        int n16;
                        while ((n14 = object2.zzc()) != (n16 = -1 >>> 1) && (n14 = (int)(this.zza(object3, (zzmf)object2, n3) ? 1 : 0)) != 0) {
                        }
                        int n17 = object2.zzd();
                        if (n10 == n17) {
                            object2 = this.zze(object3);
                            this.zza(object, n7, object2);
                            return n8 != 0;
                        }
                        throw zzkp.zzb();
                    }
                    throw zzkp.zzh();
                }
                object2 = object2.zzp();
                this.zza(object, n7, (zziy)object2);
                return n8 != 0;
            }
            long l2 = object2.zzk();
            this.zza(object, n7, l2);
            return n8 != 0;
        }
        long l3 = object2.zzl();
        this.zzb(object, n7, l3);
        return n8 != 0;
    }

    public abstract int zzb(Object var1);

    public abstract void zzb(Object var1, int var2, long var3);

    public abstract void zzb(Object var1, zznl var2);

    public abstract void zzb(Object var1, Object var2);

    public abstract Object zzc(Object var1);

    public abstract void zzc(Object var1, Object var2);

    public abstract Object zzd(Object var1);

    public abstract Object zze(Object var1);

    public abstract void zzf(Object var1);
}

