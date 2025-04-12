/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzce;
import com.google.android.gms.internal.gtm.zzcm;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzcw;
import com.google.android.gms.internal.gtm.zzcx;
import com.google.android.gms.internal.gtm.zzeg;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzeu;
import com.google.android.gms.internal.gtm.zzfg;

public final class zzbu {
    private static volatile zzbu zza;
    private final Context zzb;
    private final Context zzc;
    private final Clock zzd;
    private final zzcs zze;
    private final zzeo zzf;
    private final zzr zzg;
    private final zzbp zzh;
    private final zzcx zzi;
    private final zzfg zzj;
    private final zzeu zzk;
    private final GoogleAnalytics zzl;
    private final zzcm zzm;
    private final zzbh zzn;
    private final zzce zzo;
    private final zzcw zzp;

    public zzbu(zzbv object) {
        Object object2 = ((zzbv)object).zza();
        Preconditions.checkNotNull(object2, "Application context can't be null");
        Object object3 = ((zzbv)object).zzb();
        Preconditions.checkNotNull(object3);
        this.zzb = object2;
        this.zzc = object3;
        object3 = DefaultClock.getInstance();
        this.zzd = object3;
        super(this);
        this.zze = object3;
        super(this);
        ((zzbr)object3).zzW();
        this.zzf = object3;
        object3 = this.zzm();
        Object object4 = zzbs.zza;
        Object object5 = new StringBuilder("Google Analytics ");
        ((StringBuilder)object5).append((String)object4);
        ((StringBuilder)object5).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        object4 = ((StringBuilder)object5).toString();
        ((zzbq)object3).zzL((String)object4);
        object3 = new zzeu(this);
        ((zzbr)object3).zzW();
        this.zzk = object3;
        object3 = new zzfg(this);
        ((zzbr)object3).zzW();
        this.zzj = object3;
        object3 = new zzbp(this, (zzbv)object);
        object = new zzcm(this);
        object4 = new zzbh(this);
        object5 = new zzce(this);
        zzcw zzcw2 = new zzcw(this);
        object2 = zzr.zzb((Context)object2);
        zzbt zzbt2 = new zzbt(this);
        ((zzr)object2).zzj(zzbt2);
        this.zzg = object2;
        object2 = new GoogleAnalytics(this);
        ((zzbr)object).zzW();
        this.zzm = object;
        ((zzbr)object4).zzW();
        this.zzn = object4;
        ((zzbr)object5).zzW();
        this.zzo = object5;
        zzcw2.zzW();
        this.zzp = zzcw2;
        object = new zzcx(this);
        ((zzbr)object).zzW();
        this.zzi = object;
        ((zzbr)object3).zzW();
        this.zzh = object3;
        ((GoogleAnalytics)object2).zzg();
        this.zzl = object2;
        ((zzbp)object3).zzm();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbu zzg(Context object) {
        Preconditions.checkNotNull(object);
        Object object2 = zza;
        if (object2 != null) return zza;
        object2 = zzbu.class;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                long l2;
                long l3;
                Object object3;
                try {
                    object3 = zza;
                    if (object3 != null) return zza;
                    object3 = DefaultClock.getInstance();
                    l3 = object3.elapsedRealtime();
                    zzbv zzbv2 = new zzbv((Context)object);
                    object = new zzbu(zzbv2);
                    zza = object;
                    GoogleAnalytics.zzf();
                    l2 = object3.elapsedRealtime() - l3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object3 = zzeh.zzE;
                object3 = ((zzeg)object3).zzb();
                object3 = (Long)object3;
                l3 = (Long)object3;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 <= 0) return zza;
                object = ((zzbu)object).zzm();
                String string2 = "Slow initialization (ms)";
                Long l7 = l2;
                ((zzbq)object).zzS(string2, l7, object3);
                return zza;
            }
            throw throwable2;
        }
    }

    private static final void zzs(zzbr zzbr2) {
        Preconditions.checkNotNull(zzbr2, "Analytics service not created/initialized");
        Preconditions.checkArgument(zzbr2.zzX(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final GoogleAnalytics zzc() {
        Preconditions.checkNotNull(this.zzl);
        Preconditions.checkArgument(this.zzl.zzj(), "Analytics instance not initialized");
        return this.zzl;
    }

    public final zzr zzd() {
        Preconditions.checkNotNull(this.zzg);
        return this.zzg;
    }

    public final zzbh zze() {
        zzbu.zzs(this.zzn);
        return this.zzn;
    }

    public final zzbp zzf() {
        zzbu.zzs(this.zzh);
        return this.zzh;
    }

    public final zzce zzh() {
        zzbu.zzs(this.zzo);
        return this.zzo;
    }

    public final zzcm zzi() {
        zzbu.zzs(this.zzm);
        return this.zzm;
    }

    public final zzcs zzj() {
        return this.zze;
    }

    public final zzcw zzk() {
        return this.zzp;
    }

    public final zzcx zzl() {
        zzbu.zzs(this.zzi);
        return this.zzi;
    }

    public final zzeo zzm() {
        zzbu.zzs(this.zzf);
        return this.zzf;
    }

    public final zzeo zzn() {
        return this.zzf;
    }

    public final zzeu zzo() {
        zzbu.zzs(this.zzk);
        return this.zzk;
    }

    public final zzeu zzp() {
        boolean bl2;
        zzeu zzeu2 = this.zzk;
        if (zzeu2 != null && (bl2 = zzeu2.zzX())) {
            return zzeu2;
        }
        return null;
    }

    public final zzfg zzq() {
        zzbu.zzs(this.zzj);
        return this.zzj;
    }

    public final Clock zzr() {
        return this.zzd;
    }
}

