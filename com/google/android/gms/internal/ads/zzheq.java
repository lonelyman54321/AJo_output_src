/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhdr;
import com.google.android.gms.internal.ads.zzhfi;

abstract class zzheq {
    public abstract int zza(Object var1);

    public abstract int zzb(Object var1);

    public abstract Object zzc(Object var1);

    public abstract Object zzd(Object var1);

    public abstract Object zze(Object var1, Object var2);

    public abstract Object zzf();

    public abstract Object zzg(Object var1);

    public abstract void zzh(Object var1, int var2, int var3);

    public abstract void zzi(Object var1, int var2, long var3);

    public abstract void zzj(Object var1, int var2, Object var3);

    public abstract void zzk(Object var1, int var2, zzhac var3);

    public abstract void zzl(Object var1, int var2, long var3);

    public abstract void zzm(Object var1);

    public abstract void zzn(Object var1, Object var2);

    public abstract void zzo(Object var1, Object var2);

    public abstract void zzp(Object var1, zzhfi var2);

    public abstract void zzq(Object var1, zzhfi var2);

    public final boolean zzr(Object object, zzhdr object2) {
        int n3 = object2.zzd();
        int n4 = n3 >>> 3;
        int n7 = 1;
        if ((n3 &= 7) != 0) {
            if (n3 != n7) {
                int n8 = 2;
                if (n3 != n8) {
                    int n10;
                    int n14;
                    n8 = 4;
                    int n15 = 3;
                    if (n3 != n15) {
                        if (n3 != n8) {
                            n8 = 5;
                            if (n3 == n8) {
                                int n16 = object2.zzf();
                                this.zzh(object, n4, n16);
                                return n7 != 0;
                            }
                            throw zzhcd.zza();
                        }
                        return false;
                    }
                    Object object3 = this.zzf();
                    n15 = n4 << 3;
                    while ((n14 = object2.zzc()) != (n10 = -1 >>> 1) && (n14 = (int)(this.zzr(object3, (zzhdr)object2) ? 1 : 0)) != 0) {
                    }
                    int n17 = object2.zzd();
                    if ((n8 |= n15) == n17) {
                        this.zzg(object3);
                        this.zzj(object, n4, object3);
                        return n7 != 0;
                    }
                    throw zzhcd.zzb();
                }
                object2 = object2.zzp();
                this.zzk(object, n4, (zzhac)object2);
                return n7 != 0;
            }
            long l2 = object2.zzk();
            this.zzi(object, n4, l2);
            return n7 != 0;
        }
        long l3 = object2.zzl();
        this.zzl(object, n4, l3);
        return n7 != 0;
    }

    public abstract boolean zzs(zzhdr var1);
}

