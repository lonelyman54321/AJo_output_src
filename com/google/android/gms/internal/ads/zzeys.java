/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Secure
 */
package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzeyq;
import com.google.android.gms.internal.ads.zzeyr;
import com.google.android.gms.internal.ads.zzeyt;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfvg;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeys
implements zzexw {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcbp zzg;

    public zzeys(zzcbp zzcbp2, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int n3, boolean bl2, boolean bl3) {
        this.zzg = zzcbp2;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = n3;
        this.zze = bl2;
        this.zzf = bl3;
    }

    public final int zza() {
        return 40;
    }

    public final ListenableFuture zzb() {
        Object object = zzbep.zzaV;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzg;
            object2 = this.zza;
            int n3 = this.zzd;
            object = zzgfk.zzu(((zzcbp)object).zza((Context)object2, n3));
            object2 = new zzeyq(this);
            Executor executor = this.zzc;
            object = zzgft.zzm((ListenableFuture)object, (zzfxu)object2, executor);
            object2 = zzbep.zzaW;
            long l2 = (Long)zzba.zzc().zza((zzbeg)object2);
            ScheduledExecutorService scheduledExecutorService = this.zzb;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            object = (zzgfk)zzgft.zzo((ListenableFuture)object, l2, timeUnit, scheduledExecutorService);
            object2 = new zzeyr(this);
            executor = this.zzc;
            return zzgft.zze((ListenableFuture)object, Throwable.class, (zzfxu)object2, executor);
        }
        object = new Exception("Did not ad Ad ID into query param.");
        return zzgft.zzg((Throwable)object);
    }

    public final /* synthetic */ zzeyt zzc(AdvertisingIdClient$Info advertisingIdClient$Info) {
        Object object;
        Object object2;
        block15: {
            Object object3;
            block18: {
                boolean bl2;
                block17: {
                    object2 = new zzfvd();
                    bl2 = this.zze;
                    if (bl2) break block17;
                    object = zzbep.zzcZ;
                    object3 = zzba.zzc();
                    object = (Boolean)((zzben)object3).zza((zzbeg)object);
                    bl2 = (Boolean)object;
                    if (bl2) break block18;
                }
                if (!(bl2 = this.zze)) break block15;
                object = zzbep.zzda;
                object3 = zzba.zzc();
                object = (Boolean)((zzben)object3).zza((zzbeg)object);
                bl2 = (Boolean)object;
                if (!bl2) break block15;
            }
            object2 = this.zza;
            object = zzfvg.zzj((Context)object2);
            Objects.requireNonNull(advertisingIdClient$Info);
            object3 = advertisingIdClient$Info.getId();
            Objects.requireNonNull(object3);
            object2 = this.zza;
            String string2 = object2.getPackageName();
            object2 = zzbep.zzdg;
            zzben zzben2 = zzba.zzc();
            object2 = zzben2.zza((zzbeg)object2);
            object2 = (Long)object2;
            long l2 = (Long)object2;
            boolean bl3 = this.zzf;
            try {
                object2 = ((zzfvg)object).zzi((String)object3, string2, l2, bl3);
                break block15;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            object = "AdIdInfoSignalSource.getPaidV1";
            object3 = zzu.zzo();
            ((zzcby)object3).zzw((Throwable)object2, (String)object);
            object2 = new zzfvd();
        }
        object = new zzeyt(advertisingIdClient$Info, null, (zzfvd)object2);
        return object;
    }

    public final /* synthetic */ zzeyt zzd(Throwable object) {
        Object object2;
        zzay.zzb();
        object = this.zza.getContentResolver();
        if (object == null) {
            object = null;
        } else {
            object2 = "android_id";
            object = Settings.Secure.getString((ContentResolver)object, (String)object2);
        }
        zzfvd zzfvd2 = new zzfvd();
        object2 = new zzeyt(null, (String)object, zzfvd2);
        return object2;
    }
}

