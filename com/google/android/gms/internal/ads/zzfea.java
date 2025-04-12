/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzfdz;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfea
implements zzfek {
    private final zzfek zza;
    private zzcys zzb;

    public zzfea(zzfek zzfek2) {
        this.zza = zzfek2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcys zza() {
        synchronized (this) {
            return this.zzb;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzb(zzfel object, zzfej object2, zzcys zzcys2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object3;
                try {
                    this.zzb = zzcys2;
                    object3 = ((zzfel)object).zza;
                    if (object3 != null) {
                        object2 = zzcys2.zzb();
                        object = ((zzfel)object).zza;
                        object = zzgft.zzh(object);
                        object = ((zzcvx)object2).zzk((ListenableFuture)object);
                        return ((zzcvx)object2).zzi((ListenableFuture)object);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    object3 = this.zza;
                    object3 = (zzfdz)object3;
                    return ((zzfdz)object3).zzb((zzfel)object, (zzfej)object2, zzcys2);
                }
            }
            throw throwable2;
        }
    }
}

