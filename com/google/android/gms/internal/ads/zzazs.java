/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzawy;
import com.google.android.gms.internal.ads.zzaye;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzazs
implements Callable {
    protected final String zza;
    protected final zzaye zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzatp zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzazs(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        String string4;
        this.zza = string4 = this.getClass().getSimpleName();
        this.zzb = zzaye2;
        this.zzc = string2;
        this.zzd = string3;
        this.zze = zzatp2;
        this.zzg = n3;
        this.zzh = n4;
    }

    public abstract void zza();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Void zzl() {
        block15: {
            long l2 = System.nanoTime();
            Object object = this.zzb;
            Object object2 = this.zzc;
            String string2 = this.zzd;
            object = ((zzaye)object).zzj((String)object2, string2);
            this.zzf = object;
            if (object == null) break block15;
            this.zza();
            object = this.zzb;
            object2 = ((zzaye)object).zzd();
            if (object2 == null) break block15;
            int n3 = this.zzg;
            int n4 = -1 << -1;
            if (n3 == n4) return null;
            int n7 = this.zzh;
            long l3 = System.nanoTime() - l2;
            l2 = 1000L;
            l3 /= l2;
            try {
                ((zzawy)object2).zzc(n7, n3, l3, null, null);
            }
            catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
                return null;
            }
        }
        return null;
    }
}

