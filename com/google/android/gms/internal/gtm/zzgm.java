/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzge;
import com.google.android.gms.internal.gtm.zzgf;
import com.google.android.gms.internal.gtm.zzgi;
import com.google.android.gms.internal.gtm.zzgo;
import com.google.android.gms.internal.gtm.zzgt;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhv;
import com.google.android.gms.internal.gtm.zzhw;
import com.google.android.gms.internal.gtm.zzpe;
import com.google.android.gms.tagmanager.zzck;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzgm {
    private final Context zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final zzhw zze;
    private final zzpe zzf;
    private final ExecutorService zzg;
    private final ScheduledExecutorService zzh;
    private final zzck zzi;
    private final Clock zzj;
    private final zzgo zzk;
    private zzhv zzl;
    private volatile int zzm = 1;
    private List zzn;
    private ScheduledFuture zzo;
    private boolean zzp;

    public zzgm(Context object, String string2, String string3, String string4, zzhw object2, zzpe zzpe2, ExecutorService object3, ScheduledExecutorService scheduledExecutorService, zzck zzck2, Clock clock, zzgo zzgo2) {
        ArrayList arrayList;
        this.zzn = arrayList = new ArrayList();
        this.zzo = null;
        this.zzp = false;
        Object object4 = object;
        this.zza = object;
        object4 = (String)Preconditions.checkNotNull(string2);
        this.zzb = object4;
        Object object5 = (zzhw)Preconditions.checkNotNull(object2);
        this.zze = object5;
        this.zzf = object5 = (zzpe)Preconditions.checkNotNull(zzpe2);
        this.zzg = object5 = (ExecutorService)Preconditions.checkNotNull(object3);
        Object object6 = (ScheduledExecutorService)Preconditions.checkNotNull(scheduledExecutorService);
        this.zzh = object6;
        this.zzi = object6 = (zzck)Preconditions.checkNotNull(zzck2);
        Object object7 = (Clock)Preconditions.checkNotNull(clock);
        this.zzj = object7;
        this.zzk = object7 = (zzgo)Preconditions.checkNotNull(zzgo2);
        object7 = string4;
        this.zzc = string4;
        object7 = string3;
        this.zzd = string3;
        Bundle bundle = new Bundle();
        Date date = new Date();
        object = object7;
        string2 = "gtm.load";
        string3 = bundle;
        string4 = "gtm";
        object2 = date;
        object3 = object6;
        object7 = new zzgt(string2, bundle, string4, date, false, (zzck)object6);
        this.zzn.add(object7);
        object6 = new StringBuilder("Container ");
        ((StringBuilder)object6).append((String)object4);
        ((StringBuilder)object6).append("is scheduled for loading.");
        zzhi.zzd(((StringBuilder)object6).toString());
        super(this, null);
        object5.execute((Runnable)object4);
    }

    public static /* bridge */ /* synthetic */ int zza(zzgm zzgm2) {
        return zzgm2.zzm;
    }

    public static /* bridge */ /* synthetic */ Context zzb(zzgm zzgm2) {
        return zzgm2.zza;
    }

    public static /* bridge */ /* synthetic */ Clock zzc(zzgm zzgm2) {
        return zzgm2.zzj;
    }

    public static /* bridge */ /* synthetic */ zzck zzd(zzgm zzgm2) {
        return zzgm2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzgo zze(zzgm zzgm2) {
        return zzgm2.zzk;
    }

    public static /* bridge */ /* synthetic */ zzhv zzf(zzgm zzgm2) {
        return zzgm2.zzl;
    }

    public static /* bridge */ /* synthetic */ zzhw zzg(zzgm zzgm2) {
        return zzgm2.zze;
    }

    public static /* bridge */ /* synthetic */ zzpe zzh(zzgm zzgm2) {
        return zzgm2.zzf;
    }

    public static /* bridge */ /* synthetic */ String zzi(zzgm zzgm2) {
        return zzgm2.zzb;
    }

    public static /* bridge */ /* synthetic */ String zzj(zzgm zzgm2) {
        return zzgm2.zzc;
    }

    public static /* bridge */ /* synthetic */ String zzk(zzgm zzgm2) {
        return zzgm2.zzd;
    }

    public static /* bridge */ /* synthetic */ List zzl(zzgm zzgm2) {
        return zzgm2.zzn;
    }

    public static /* bridge */ /* synthetic */ ExecutorService zzm(zzgm zzgm2) {
        return zzgm2.zzg;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzgm zzgm2, boolean bl2) {
        zzgm2.zzp = bl2;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzgm zzgm2, List list) {
        zzgm2.zzn = null;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzgm zzgm2, zzhv zzhv2) {
        zzgm2.zzl = zzhv2;
    }

    public static /* bridge */ /* synthetic */ void zzq(zzgm zzgm2, int n3) {
        zzgm2.zzm = n3;
    }

    public static /* bridge */ /* synthetic */ void zzr(zzgm zzgm2, long l2) {
        ScheduledFuture<?> scheduledFuture;
        Object object;
        Object object2 = zzgm2.zzo;
        if (object2 != null) {
            object = null;
            object2.cancel(false);
        }
        object2 = zzgm2.zzb;
        object = new StringBuilder("Refresh container ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" in ");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append("ms.");
        zzhi.zzd(((StringBuilder)object).toString());
        object2 = zzgm2.zzh;
        object = new zzgf(zzgm2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zzgm2.zzo = scheduledFuture = object2.schedule((Runnable)object, l2, timeUnit);
    }

    public static /* bridge */ /* synthetic */ boolean zzu(zzgm zzgm2) {
        return zzgm2.zzp;
    }

    public final void zzs() {
        zzge zzge2 = new zzge(this);
        this.zzg.execute(zzge2);
    }

    public final void zzt(zzgt zzgt2) {
        zzgi zzgi2 = new zzgi(this, zzgt2);
        this.zzg.execute(zzgi2);
    }
}

