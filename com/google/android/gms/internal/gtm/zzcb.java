/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzca;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzcv;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzel;
import com.google.android.gms.internal.gtm.zzfb;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzcb
extends zzbr {
    private final zzca zza;
    private final zzcv zzb;
    private final zzfb zzc;
    private zzel zzd;

    public zzcb(zzbu zzbu2) {
        super(zzbu2);
        Clock clock = zzbu2.zzr();
        Object object = new zzfb(clock);
        this.zzc = object;
        this.zza = object = new zzca(this);
        this.zzb = object = new zzbx(this, zzbu2);
    }

    public static /* bridge */ /* synthetic */ zzca zza(zzcb zzcb2) {
        return zzcb2.zza;
    }

    public static /* synthetic */ void zzb(zzcb zzbr2, ComponentName componentName) {
        zzr.zzh();
        Object object = ((zzcb)zzbr2).zzd;
        if (object != null) {
            ((zzcb)zzbr2).zzd = null;
            object = "Disconnected from device AnalyticsService";
            zzbr2.zzO((String)object, componentName);
            zzbr2 = zzbr2.zzs();
            ((zzbp)zzbr2).zzk();
        }
    }

    public static /* synthetic */ void zzi(zzcb zzcb2, zzel zzel2) {
        zzr.zzh();
        zzcb2.zzd = zzel2;
        zzcb2.zzj();
        zzcb2.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        this.zzw();
        long l2 = (Long)zzeh.zzA.zzb();
        this.zzb.zzg(l2);
    }

    public final void zzc() {
        zzr.zzh();
        this.zzV();
        Object object = ConnectionTracker.getInstance();
        Context context = this.zzo();
        zzca zzca2 = this.zza;
        try {
            ((ConnectionTracker)object).unbindService(context, zzca2);
        }
        catch (IllegalArgumentException | IllegalStateException runtimeException) {}
        object = this.zzd;
        if (object != null) {
            this.zzd = null;
            object = this.zzs();
            ((zzbp)object).zzk();
        }
    }

    public final void zzd() {
    }

    public final boolean zze() {
        zzr.zzh();
        this.zzV();
        zzel zzel2 = this.zzd;
        if (zzel2 == null) {
            return false;
        }
        try {
            zzel2.zze();
            this.zzj();
            return true;
        }
        catch (RemoteException remoteException) {
            this.zzN("Failed to clear hits from AnalyticsService");
            return false;
        }
    }

    public final boolean zzf() {
        zzr.zzh();
        this.zzV();
        zzel zzel2 = this.zzd;
        boolean bl2 = true;
        if (zzel2 != null) {
            return bl2;
        }
        zzel2 = this.zza.zza();
        if (zzel2 != null) {
            this.zzd = zzel2;
            this.zzj();
            return bl2;
        }
        return false;
    }

    public final boolean zzg() {
        zzr.zzh();
        this.zzV();
        zzel zzel2 = this.zzd;
        return zzel2 != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzh(zzek zzek2) {
        Object object;
        Preconditions.checkNotNull(zzek2);
        zzr.zzh();
        this.zzV();
        zzel zzel2 = this.zzd;
        if (zzel2 == null) {
            return false;
        }
        boolean bl2 = zzek2.zzh();
        if (bl2) {
            this.zzw();
            object = zzcs.zzi();
        } else {
            this.zzw();
            object = zzcs.zzk();
        }
        String string2 = object;
        List list = Collections.emptyList();
        try {
            object = zzek2.zzg();
            long l2 = zzek2.zzd();
            zzel2.zzf((Map)object, l2, string2, list);
            this.zzj();
            return true;
        }
        catch (RemoteException remoteException) {
            this.zzN("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}

