/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzers;
import com.google.android.gms.internal.ads.zzert;
import com.google.android.gms.internal.ads.zzeru;
import com.google.android.gms.internal.ads.zzerw;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzerv
implements zzexw {
    final zzcby zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgge zzd;
    private final Context zze;

    public zzerv(Context context, zzcby zzcby2, ScheduledExecutorService scheduledExecutorService, zzgge zzgge2) {
        Object object = zzbep.zzcO;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            this.zzb = object = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcby2;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgge2;
    }

    public final int zza() {
        return 11;
    }

    public final ListenableFuture zzb() {
        Object object = zzbep.zzcK;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        int n3 = -1;
        Object object3 = null;
        if (bl2) {
            object = zzbep.zzcP;
            Object object4 = zzba.zzc();
            object = (Boolean)((zzben)object4).zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (!bl2) {
                object = zzbep.zzcL;
                object4 = zzba.zzc();
                object = (Boolean)((zzben)object4).zza((zzbeg)object);
                bl2 = (Boolean)object;
                if (!bl2) {
                    object = zzfvk.zza(this.zzb.getAppSetIdInfo(), null);
                    object2 = new zzers();
                    object3 = zzcci.zzf;
                    object = zzgft.zzm((ListenableFuture)object, (zzfxu)object2, (Executor)object3);
                } else {
                    object = zzbep.zzcO;
                    object4 = zzba.zzc();
                    object = (Boolean)((zzben)object4).zza((zzbeg)object);
                    bl2 = (Boolean)object;
                    object = bl2 ? zzfit.zza(this.zze) : this.zzb.getAppSetIdInfo();
                    if (object == null) {
                        object = new zzerw(null, n3);
                        object = zzgft.zzh(object);
                    } else {
                        object = zzfvk.zza((Task)object, null);
                        object2 = new zzert();
                        object3 = zzcci.zzf;
                        object = zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object3);
                        object2 = zzbep.zzcM;
                        object3 = zzba.zzc();
                        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
                        n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                        if (n3 != 0) {
                            object2 = zzbep.zzcN;
                            object3 = zzba.zzc();
                            object2 = (Long)((zzben)object3).zza((zzbeg)object2);
                            long l2 = (Long)object2;
                            object4 = this.zzc;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            object = zzgft.zzo((ListenableFuture)object, l2, timeUnit, (ScheduledExecutorService)object4);
                        }
                        object2 = new zzeru(this);
                        object3 = this.zzd;
                        object4 = Exception.class;
                        object = zzgft.zze((ListenableFuture)object, (Class)object4, (zzfxu)object2, (Executor)object3);
                    }
                }
                return object;
            }
        }
        object = new zzerw(null, n3);
        return zzgft.zzh(object);
    }
}

