/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzxi;

public abstract class zzio
extends zzdc {
    private final int zzc;
    private final zzxi zzd;

    /*
     * WARNING - void declaration
     */
    public zzio(boolean bl2, zzxi zzxi2) {
        int n3;
        void var2_3;
        this.zzd = var2_3;
        this.zzc = n3 = var2_3.zzc();
    }

    private final int zzw(int n3, boolean n4) {
        block4: {
            block3: {
                block2: {
                    if (n4 == 0) break block2;
                    zzxi zzxi2 = this.zzd;
                    n3 = zzxi2.zzd(n3);
                    break block3;
                }
                n4 = this.zzc;
                int n7 = -1;
                if (n3 < (n4 += n7)) break block4;
                n3 = -1;
            }
            return n3;
        }
        return n3 + 1;
    }

    private final int zzx(int n3, boolean bl2) {
        int n4;
        block4: {
            block3: {
                block2: {
                    if (!bl2) break block2;
                    zzxi zzxi2 = this.zzd;
                    n3 = zzxi2.zze(n3);
                    break block3;
                }
                n4 = -1;
                if (n3 > 0) break block4;
                n3 = -1;
            }
            return n3;
        }
        return n3 + n4;
    }

    public final int zza(Object object) {
        int n3 = object instanceof Pair;
        int n4 = -1;
        if (n3 != 0) {
            zzdc zzdc2;
            int n7;
            object = (Pair)object;
            Object object2 = ((Pair)object).first;
            object = ((Pair)object).second;
            n3 = this.zzp(object2);
            if (n3 != n4 && (n7 = (zzdc2 = this.zzu(n3)).zza(object)) != n4) {
                return this.zzs(n3) + n7;
            }
        }
        return n4;
    }

    public final zzcz zzd(int n3, zzcz zzcz2, boolean bl2) {
        int n4 = this.zzq(n3);
        int n7 = this.zzt(n4);
        int n8 = this.zzs(n4);
        zzdc zzdc2 = this.zzu(n4);
        zzdc2.zzd(n3 -= n8, zzcz2, bl2);
        zzcz2.zzd = n3 = zzcz2.zzd + n7;
        if (bl2) {
            Object object = this.zzv(n4);
            Object object2 = zzcz2.zzc;
            object2.getClass();
            zzcz2.zzc = object = Pair.create((Object)object, (Object)object2);
        }
        return zzcz2;
    }

    public final zzdb zze(int n3, zzdb zzdb2, long l2) {
        int n4 = this.zzr(n3);
        int n7 = this.zzt(n4);
        int n8 = this.zzs(n4);
        zzdc zzdc2 = this.zzu(n4);
        zzdc2.zze(n3 -= n7, zzdb2, l2);
        Object object = this.zzv(n4);
        Object object2 = zzdb.zza;
        Object object3 = zzdb2.zzc;
        boolean bl2 = object2.equals(object3);
        if (!bl2) {
            object2 = zzdb2.zzc;
            object = Pair.create((Object)object, (Object)object2);
        }
        zzdb2.zzc = object;
        zzdb2.zzp = n3 = zzdb2.zzp + n8;
        zzdb2.zzq = n3 = zzdb2.zzq + n8;
        return zzdb2;
    }

    public final Object zzf(int n3) {
        int n4 = this.zzq(n3);
        int n7 = this.zzs(n4);
        zzdc zzdc2 = this.zzu(n4);
        Object object = zzdc2.zzf(n3 -= n7);
        return Pair.create((Object)this.zzv(n4), (Object)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int zzg(boolean bl2) {
        zzdc zzdc2;
        boolean bl3;
        zzxi zzxi2;
        int n3 = this.zzc;
        int n4 = -1;
        if (n3 == 0) return n4;
        if (bl2) {
            zzxi2 = this.zzd;
            n3 = zzxi2.zza();
        } else {
            n3 = 0;
            zzxi2 = null;
        }
        while (bl3 = (zzdc2 = this.zzu(n3)).zzo()) {
            if ((n3 = this.zzw(n3, bl2)) != n4) continue;
            return n4;
        }
        n4 = this.zzt(n3);
        return this.zzu(n3).zzg(bl2) + n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int zzh(boolean bl2) {
        zzdc zzdc2;
        boolean bl3;
        int n3 = this.zzc;
        int n4 = -1;
        if (n3 == 0) return n4;
        if (bl2) {
            zzxi zzxi2 = this.zzd;
            n3 = zzxi2.zzb();
        } else {
            n3 += n4;
        }
        while (bl3 = (zzdc2 = this.zzu(n3)).zzo()) {
            if ((n3 = this.zzx(n3, bl2)) != n4) continue;
            return n4;
        }
        n4 = this.zzt(n3);
        return this.zzu(n3).zzh(bl2) + n4;
    }

    public final int zzj(int n3, int n4, boolean bl2) {
        zzdc zzdc2;
        int n7;
        int n8 = this.zzr(n3);
        int n10 = this.zzt(n8);
        zzdc zzdc3 = this.zzu(n8);
        n3 -= n10;
        int n14 = 2;
        int n15 = n4 == n14 ? 0 : n4;
        if ((n3 = zzdc3.zzj(n3, n15, bl2)) != (n7 = -1)) {
            return n10 + n3;
        }
        n3 = this.zzw(n8, bl2);
        while (n3 != n7 && (n8 = (int)((zzdc2 = this.zzu(n3)).zzo() ? 1 : 0)) != 0) {
            n3 = this.zzw(n3, bl2);
        }
        if (n3 != n7) {
            n4 = this.zzt(n3);
            return this.zzu(n3).zzg(bl2) + n4;
        }
        if (n4 == n14) {
            return this.zzg(bl2);
        }
        return n7;
    }

    public final int zzk(int n3, int n4, boolean bl2) {
        zzdc zzdc2;
        int n7;
        n4 = this.zzr(n3);
        int n8 = this.zzt(n4);
        zzdc zzdc3 = this.zzu(n4);
        n3 -= n8;
        if ((n3 = zzdc3.zzk(n3, 0, false)) != (n7 = -1)) {
            return n8 + n3;
        }
        n3 = this.zzx(n4, false);
        while (n3 != n7 && (n4 = (int)((zzdc2 = this.zzu(n3)).zzo() ? 1 : 0)) != 0) {
            n3 = this.zzx(n3, false);
        }
        if (n3 != n7) {
            n4 = this.zzt(n3);
            return this.zzu(n3).zzh(false) + n4;
        }
        return n7;
    }

    public final zzcz zzn(Object object, zzcz zzcz2) {
        int n3;
        Object object2 = object;
        object2 = (Pair)object;
        Object object3 = ((Pair)object2).first;
        object2 = ((Pair)object2).second;
        int n4 = this.zzp(object3);
        int n7 = this.zzt(n4);
        this.zzu(n4).zzn(object2, zzcz2);
        zzcz2.zzd = n3 = zzcz2.zzd + n7;
        zzcz2.zzc = object;
        return zzcz2;
    }

    public abstract int zzp(Object var1);

    public abstract int zzq(int var1);

    public abstract int zzr(int var1);

    public abstract int zzs(int var1);

    public abstract int zzt(int var1);

    public abstract zzdc zzu(int var1);

    public abstract Object zzv(int var1);
}

