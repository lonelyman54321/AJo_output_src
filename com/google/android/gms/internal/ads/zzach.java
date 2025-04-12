/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzabx;
import com.google.android.gms.internal.ads.zzaby;
import com.google.android.gms.internal.ads.zzabz;
import com.google.android.gms.internal.ads.zzaca;
import com.google.android.gms.internal.ads.zzacb;
import com.google.android.gms.internal.ads.zzacc;
import com.google.android.gms.internal.ads.zzacd;
import com.google.android.gms.internal.ads.zzace;
import com.google.android.gms.internal.ads.zzacf;
import com.google.android.gms.internal.ads.zzacg;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;

public final class zzach {
    private final Handler zza;
    private final zzaci zzb;

    public zzach(Handler handler, zzaci zzaci2) {
        if (zzaci2 == null) {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzaci2;
    }

    public final void zza(String string2, long l2, long l3) {
        Handler handler = this.zza;
        if (handler != null) {
            zzabx zzabx2 = new zzabx(this, string2, l2, l3);
            handler.post((Runnable)zzabx2);
        }
    }

    public final void zzb(String string2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzacg zzacg2 = new zzacg(this, string2);
            handler.post((Runnable)zzacg2);
        }
    }

    public final void zzc(zzix zzix2) {
        zzix2.zza();
        Handler handler = this.zza;
        if (handler != null) {
            zzacf zzacf2 = new zzacf(this, zzix2);
            handler.post((Runnable)zzacf2);
        }
    }

    public final void zzd(int n3, long l2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzabz zzabz2 = new zzabz(this, n3, l2);
            handler.post((Runnable)zzabz2);
        }
    }

    public final void zze(zzix zzix2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzacd zzacd2 = new zzacd(this, zzix2);
            handler.post((Runnable)zzacd2);
        }
    }

    public final void zzf(zzan zzan2, zziy zziy2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzace zzace2 = new zzace(this, zzan2, zziy2);
            handler.post((Runnable)zzace2);
        }
    }

    public final /* synthetic */ void zzg(String string2, long l2, long l3) {
        this.zzb.zzp(string2, l2, l3);
    }

    public final /* synthetic */ void zzh(String string2) {
        this.zzb.zzq(string2);
    }

    public final /* synthetic */ void zzi(zzix zzix2) {
        zzix2.zza();
        this.zzb.zzr(zzix2);
    }

    public final /* synthetic */ void zzj(int n3, long l2) {
        this.zzb.zzl(n3, l2);
    }

    public final /* synthetic */ void zzk(zzix zzix2) {
        this.zzb.zzs(zzix2);
    }

    public final /* synthetic */ void zzl(zzan zzan2, zziy zziy2) {
        this.zzb.zzu(zzan2, zziy2);
    }

    public final /* synthetic */ void zzm(Object object, long l2) {
        this.zzb.zzm(object, l2);
    }

    public final /* synthetic */ void zzn(long l2, int n3) {
        this.zzb.zzt(l2, n3);
    }

    public final /* synthetic */ void zzo(Exception exception) {
        this.zzb.zzo(exception);
    }

    public final /* synthetic */ void zzp(zzdv zzdv2) {
        this.zzb.zzv(zzdv2);
    }

    public final void zzq(Object object) {
        Handler handler = this.zza;
        if (handler != null) {
            long l2 = SystemClock.elapsedRealtime();
            zzaca zzaca2 = new zzaca(this, object, l2);
            handler.post((Runnable)zzaca2);
        }
    }

    public final void zzr(long l2, int n3) {
        Handler handler = this.zza;
        if (handler != null) {
            zzacb zzacb2 = new zzacb(this, l2, n3);
            handler.post((Runnable)zzacb2);
        }
    }

    public final void zzs(Exception exception) {
        Handler handler = this.zza;
        if (handler != null) {
            zzacc zzacc2 = new zzacc(this, exception);
            handler.post((Runnable)zzacc2);
        }
    }

    public final void zzt(zzdv zzdv2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzaby zzaby2 = new zzaby(this, zzdv2);
            handler.post((Runnable)zzaby2);
        }
    }
}

