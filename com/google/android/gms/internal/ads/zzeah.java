/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdzi;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzeaf;
import com.google.android.gms.internal.ads.zzeag;
import com.google.android.gms.internal.ads.zzebg;
import com.google.android.gms.internal.ads.zzebi;
import com.google.android.gms.internal.ads.zzeev;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhe;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class zzeah
implements zzebg {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdzi zzb;
    private final zzgge zzc;
    private final zzfho zzd;
    private final ScheduledExecutorService zze;
    private final zzeev zzf;
    private final zzfmn zzg;
    private final Context zzh;

    public zzeah(Context context, zzfho zzfho2, zzdzi zzdzi2, zzgge zzgge2, ScheduledExecutorService scheduledExecutorService, zzeev zzeev2, zzfmn zzfmn2) {
        this.zzh = context;
        this.zzd = zzfho2;
        this.zzb = zzdzi2;
        this.zzc = zzgge2;
        this.zze = scheduledExecutorService;
        this.zzf = zzeev2;
        this.zzg = zzfmn2;
    }

    public static /* bridge */ /* synthetic */ zzeev zza(zzeah zzeah2) {
        return zzeah2.zzf;
    }

    public static /* bridge */ /* synthetic */ Pattern zzd() {
        return zza;
    }

    public final ListenableFuture zzb(zzbxu object) {
        Object object2 = this.zzh;
        object = this.zzb.zzc((zzbxu)object);
        Object object3 = zzfmu.zzs;
        object2 = zzfmb.zza(object2, (zzfmu)object3);
        zzfmm.zze((ListenableFuture)object, (zzfmc)object2);
        object3 = new zzeae(this);
        Object object4 = this.zzc;
        object = zzgft.zzn((ListenableFuture)object, (zzgfa)object3, (Executor)object4);
        object3 = zzbep.zzfD;
        object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        boolean n3 = (Boolean)object3;
        if (n3) {
            object3 = zzbep.zzfF;
            int n4 = (Integer)zzba.zzc().zza((zzbeg)object3);
            long l2 = n4;
            Object object5 = this.zze;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            object = zzgft.zzo((ListenableFuture)object, l2, timeUnit, (ScheduledExecutorService)object5);
            object3 = new zzeaf();
            object4 = zzcci.zzf;
            object5 = TimeoutException.class;
            object = zzgft.zzf((ListenableFuture)object, (Class)object5, (zzgfa)object3, (Executor)object4);
        }
        object3 = this.zzg;
        zzfmm.zzb((ListenableFuture)object, (zzfmn)object3, (zzfmc)object2);
        object2 = new zzeag(this);
        object3 = zzcci.zzf;
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object3);
        return object;
    }

    public final /* synthetic */ ListenableFuture zzc(zzebi object) {
        Object object2 = this.zzd;
        zzfhc zzfhc2 = new zzfhc((zzfho)object2);
        InputStream inputStream = ((zzebi)object).zzb();
        object2 = new InputStreamReader(inputStream);
        object = ((zzebi)object).zza();
        object = zzfhe.zza((Reader)object2, (zzbxu)object);
        zzfhf zzfhf2 = new zzfhf(zzfhc2, (zzfhe)object);
        return zzgft.zzh(zzfhf2);
    }
}

