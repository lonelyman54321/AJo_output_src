/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacp;
import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzadw;
import com.google.android.gms.internal.gtm.zzyx;

abstract class zzaem {
    private static volatile int zza = 100;

    public abstract Object zza(Object var1);

    public abstract Object zzb();

    public abstract Object zzc(Object var1);

    public abstract void zzd(Object var1, int var2, int var3);

    public abstract void zze(Object var1, int var2, long var3);

    public abstract void zzf(Object var1, int var2, Object var3);

    public abstract void zzg(Object var1, int var2, zzyx var3);

    public abstract void zzh(Object var1, int var2, long var3);

    public abstract void zzi(Object var1);

    public abstract void zzj(Object var1, Object var2);

    public final boolean zzk(Object object, zzadw object2, int n3) {
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
                                this.zzd(object, n7, n15);
                                return n8 != 0;
                            }
                            object = new zzacp("Protocol message tag had invalid wire type.");
                            throw object;
                        }
                        return false;
                    }
                    Object object3 = this.zzb();
                    n14 = n7 << 3;
                    int n16 = zza;
                    if ((n3 += n8) < n16) {
                        int n17;
                        while ((n16 = object2.zzc()) != (n17 = -1 >>> 1) && (n16 = (int)(this.zzk(object3, (zzadw)object2, n3) ? 1 : 0)) != 0) {
                        }
                        n3 = n14 | 4;
                        int n18 = object2.zzd();
                        if (n3 == n18) {
                            object2 = this.zzc(object3);
                            this.zzf(object, n7, object2);
                            return n8 != 0;
                        }
                        object = new zzacq("Protocol message end-group tag did not match expected tag.");
                        throw object;
                    }
                    object = new zzacq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    throw object;
                }
                object2 = object2.zzp();
                this.zzg(object, n7, (zzyx)object2);
                return n8 != 0;
            }
            long l2 = object2.zzk();
            this.zze(object, n7, l2);
            return n8 != 0;
        }
        long l3 = object2.zzl();
        this.zzh(object, n7, l3);
        return n8 != 0;
    }
}

