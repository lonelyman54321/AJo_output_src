/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfel;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfdz
implements zzfek {
    private zzcys zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcys zza() {
        synchronized (this) {
            return this.zza;
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
                block4: {
                    block5: {
                        if (zzcys2 == null) break block5;
                        try {
                            this.zza = zzcys2;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object = ((zzfel)object).zzb;
                    object = object2.zza((zzfei)object);
                    object = object.zzh();
                    this.zza = object = (zzcys)object;
                }
                object = this.zza;
                object = object.zzb();
                object2 = ((zzcvx)object).zzj();
                return ((zzcvx)object).zzi((ListenableFuture)object2);
            }
            throw throwable2;
        }
    }
}

