/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzqb;
import com.google.android.gms.internal.ads.zzqc;
import com.google.android.gms.internal.ads.zzqd;
import com.google.android.gms.internal.ads.zzqe;
import com.google.android.gms.internal.ads.zzqf;
import com.google.android.gms.internal.ads.zzqg;
import com.google.android.gms.internal.ads.zzqh;
import com.google.android.gms.internal.ads.zzqi;
import com.google.android.gms.internal.ads.zzqj;
import com.google.android.gms.internal.ads.zzqk;
import com.google.android.gms.internal.ads.zzql;
import com.google.android.gms.internal.ads.zzqm;
import com.google.android.gms.internal.ads.zzqo;
import com.google.android.gms.internal.ads.zzqp;

public final class zzqn {
    private final Handler zza;
    private final zzqo zzb;

    public zzqn(Handler handler, zzqo zzqo2) {
        if (zzqo2 == null) {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzqo2;
    }

    public final void zza(Exception exception) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqh zzqh2 = new zzqh(this, exception);
            handler.post((Runnable)zzqh2);
        }
    }

    public final void zzb(Exception exception) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqi zzqi2 = new zzqi(this, exception);
            handler.post((Runnable)zzqi2);
        }
    }

    public final void zzc(zzqp zzqp2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqf zzqf2 = new zzqf(this, zzqp2);
            handler.post((Runnable)zzqf2);
        }
    }

    public final void zzd(zzqp zzqp2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqg zzqg2 = new zzqg(this, zzqp2);
            handler.post((Runnable)zzqg2);
        }
    }

    public final void zze(String string2, long l2, long l3) {
        Handler handler = this.zza;
        if (handler != null) {
            zzql zzql2 = new zzql(this, string2, l2, l3);
            handler.post((Runnable)zzql2);
        }
    }

    public final void zzf(String string2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqm zzqm2 = new zzqm(this, string2);
            handler.post((Runnable)zzqm2);
        }
    }

    public final void zzg(zzix zzix2) {
        zzix2.zza();
        Handler handler = this.zza;
        if (handler != null) {
            zzqc zzqc2 = new zzqc(this, zzix2);
            handler.post((Runnable)zzqc2);
        }
    }

    public final void zzh(zzix zzix2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqb zzqb2 = new zzqb(this, zzix2);
            handler.post((Runnable)zzqb2);
        }
    }

    public final void zzi(zzan zzan2, zziy zziy2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqj zzqj2 = new zzqj(this, zzan2, zziy2);
            handler.post((Runnable)zzqj2);
        }
    }

    public final /* synthetic */ void zzj(Exception exception) {
        this.zzb.zza(exception);
    }

    public final /* synthetic */ void zzk(Exception exception) {
        this.zzb.zzh(exception);
    }

    public final /* synthetic */ void zzl(zzqp zzqp2) {
        this.zzb.zzi(zzqp2);
    }

    public final /* synthetic */ void zzm(zzqp zzqp2) {
        this.zzb.zzj(zzqp2);
    }

    public final /* synthetic */ void zzn(String string2, long l2, long l3) {
        this.zzb.zzb(string2, l2, l3);
    }

    public final /* synthetic */ void zzo(String string2) {
        this.zzb.zzc(string2);
    }

    public final /* synthetic */ void zzp(zzix zzix2) {
        zzix2.zza();
        this.zzb.zzd(zzix2);
    }

    public final /* synthetic */ void zzq(zzix zzix2) {
        this.zzb.zze(zzix2);
    }

    public final /* synthetic */ void zzr(zzan zzan2, zziy zziy2) {
        this.zzb.zzf(zzan2, zziy2);
    }

    public final /* synthetic */ void zzs(long l2) {
        this.zzb.zzg(l2);
    }

    public final /* synthetic */ void zzt(boolean bl2) {
        this.zzb.zzn(bl2);
    }

    public final /* synthetic */ void zzu(int n3, long l2, long l3) {
        this.zzb.zzk(n3, l2, l3);
    }

    public final void zzv(long l2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqd zzqd2 = new zzqd(this, l2);
            handler.post((Runnable)zzqd2);
        }
    }

    public final void zzw(boolean bl2) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqk zzqk2 = new zzqk(this, bl2);
            handler.post((Runnable)zzqk2);
        }
    }

    public final void zzx(int n3, long l2, long l3) {
        Handler handler = this.zza;
        if (handler != null) {
            zzqe zzqe2 = new zzqe(this, n3, l2, l3);
            handler.post((Runnable)zzqe2);
        }
    }
}

