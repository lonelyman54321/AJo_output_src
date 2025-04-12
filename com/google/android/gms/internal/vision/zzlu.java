/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzld;
import com.google.android.gms.internal.vision.zzmr;

abstract class zzlu {
    public abstract Object zza();

    public abstract Object zza(Object var1);

    public abstract void zza(Object var1, int var2, int var3);

    public abstract void zza(Object var1, int var2, long var3);

    public abstract void zza(Object var1, int var2, zzht var3);

    public abstract void zza(Object var1, int var2, Object var3);

    public abstract void zza(Object var1, zzmr var2);

    public abstract void zza(Object var1, Object var2);

    public abstract boolean zza(zzld var1);

    public final boolean zza(Object object, zzld object2) {
        int n3 = object2.zzb();
        int n4 = n3 >>> 3;
        int n7 = 1;
        if ((n3 &= 7) != 0) {
            if (n3 != n7) {
                int n8 = 2;
                if (n3 != n8) {
                    int n10;
                    n8 = 4;
                    int n14 = 3;
                    if (n3 != n14) {
                        if (n3 != n8) {
                            n8 = 5;
                            if (n3 == n8) {
                                int n15 = object2.zzj();
                                this.zza(object, n4, n15);
                                return n7 != 0;
                            }
                            throw zzjk.zzf();
                        }
                        return false;
                    }
                    Object object3 = this.zza();
                    n14 = n4 << 3;
                    n8 |= n14;
                    while ((n14 = object2.zza()) != (n10 = -1 >>> 1) && (n14 = (int)(this.zza(object3, (zzld)object2) ? 1 : 0)) != 0) {
                    }
                    int n16 = object2.zzb();
                    if (n8 == n16) {
                        object2 = this.zza(object3);
                        this.zza(object, n4, object2);
                        return n7 != 0;
                    }
                    throw zzjk.zze();
                }
                object2 = object2.zzn();
                this.zza(object, n4, (zzht)object2);
                return n7 != 0;
            }
            long l2 = object2.zzi();
            this.zzb(object, n4, l2);
            return n7 != 0;
        }
        long l3 = object2.zzg();
        this.zza(object, n4, l3);
        return n7 != 0;
    }

    public abstract Object zzb(Object var1);

    public abstract void zzb(Object var1, int var2, long var3);

    public abstract void zzb(Object var1, zzmr var2);

    public abstract void zzb(Object var1, Object var2);

    public abstract Object zzc(Object var1);

    public abstract Object zzc(Object var1, Object var2);

    public abstract void zzd(Object var1);

    public abstract int zze(Object var1);

    public abstract int zzf(Object var1);
}

