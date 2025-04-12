/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzctp;
import com.google.android.gms.internal.ads.zzctq;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzctr
implements zzban {
    private final zzchd zza;
    private final Executor zzb;
    private final AtomicReference zzc;

    public zzctr(zzchd zzchd2, Executor executor) {
        AtomicReference atomicReference;
        this.zzc = atomicReference = new AtomicReference();
        this.zza = zzchd2;
        this.zzb = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdp(zzbam object) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block6: {
                    boolean bl2;
                    Object object2;
                    Object object3;
                    block7: {
                        try {
                            object3 = this.zza;
                            if (object3 == null) break block6;
                            object3 = zzbep.zzmA;
                            object2 = zzba.zzc();
                            object3 = ((zzben)object2).zza((zzbeg)object3);
                            boolean bl3 = (Boolean)(object3 = (Boolean)object3);
                            if (!bl3) break block6;
                            bl3 = ((zzbam)object).zzj;
                            if (!bl3) break block7;
                            object3 = this.zzc;
                            object2 = Boolean.TRUE;
                            bl3 = ((Boolean)object2).equals(object3 = ((AtomicReference)object3).getAndSet(object2));
                            if (!bl3) {
                                object = this.zzb;
                                object3 = this.zza;
                                Objects.requireNonNull(object3);
                                object2 = new zzctp((zzchd)object3);
                                object.execute((Runnable)object2);
                                return;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    if (!(bl2 = ((zzbam)object).zzj)) {
                        object = this.zzc;
                        object3 = Boolean.FALSE;
                        bl2 = ((Boolean)object3).equals(object = ((AtomicReference)object).getAndSet(object3));
                        if (!bl2) {
                            object = this.zzb;
                            object3 = this.zza;
                            Objects.requireNonNull(object3);
                            object2 = new zzctq((zzchd)object3);
                            object.execute((Runnable)object2);
                            return;
                        }
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

