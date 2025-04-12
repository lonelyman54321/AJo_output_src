/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzny;
import com.google.android.gms.measurement.internal.zzod;
import com.google.android.gms.measurement.internal.zzof;

public final class zznx
extends zzf {
    protected final zzof zza;
    protected final zzod zzb;
    private Handler zzc;
    private boolean zzd = true;
    private final zzny zze;

    public zznx(zzic object) {
        super((zzic)object);
        this.zza = object = new zzof(this);
        this.zzb = object = new zzod(this);
        this.zze = object = new zzny(this);
    }

    public static /* bridge */ /* synthetic */ Handler zza(zznx zznx2) {
        return zznx2.zzc;
    }

    public static /* synthetic */ void zza(zznx object, long l2) {
        ((zznx)object).zzv();
        ((zznx)object).zzad();
        Object object2 = ((zznx)object).zzj().zzq();
        Long l3 = l2;
        String string2 = "Activity paused, time";
        ((zzgq)object2).zza(string2, l3);
        ((zznx)object).zze.zza(l2);
        object2 = ((zznx)object).zze();
        boolean bl2 = ((zzai)object2).zzx();
        if (bl2) {
            object = ((zznx)object).zzb;
            ((zzod)object).zzb(l2);
        }
    }

    private final void zzad() {
        this.zzv();
        Handler handler = this.zzc;
        if (handler == null) {
            Looper looper = Looper.getMainLooper();
            this.zzc = handler = new zzdj(looper);
        }
    }

    public static /* synthetic */ void zzb(zznx zznx2) {
        zznx2.zzad();
    }

    public static /* synthetic */ void zzb(zznx object, long l2) {
        ((zznx)object).zzv();
        ((zznx)object).zzad();
        Object object2 = ((zznx)object).zzj().zzq();
        Object object3 = l2;
        String string2 = "Activity resumed, time";
        ((zzgq)object2).zza(string2, object3);
        object2 = ((zznx)object).zze();
        object3 = zzbn.zzcv;
        boolean bl2 = ((zzai)object2).zza((zzfx)object3);
        if (bl2) {
            object2 = ((zznx)object).zze();
            bl2 = ((zzai)object2).zzx();
            if (bl2 || (bl2 = ((zznx)object).zzd)) {
                object2 = ((zznx)object).zzb;
                ((zzod)object2).zzc(l2);
            }
        } else {
            object2 = ((zznx)object).zze();
            bl2 = ((zzai)object2).zzx();
            if (bl2 || (bl2 = ((zzhd)(object2 = ((zznx)object).zzk().zzn)).zza())) {
                object2 = ((zznx)object).zzb;
                ((zzod)object2).zzc(l2);
            }
        }
        ((zznx)object).zze.zza();
        object = ((zznx)object).zza;
        ((zzof)object).zza.zzv();
        Object object4 = ((zzof)object).zza.zzu;
        boolean bl3 = ((zzic)object4).zzae();
        if (bl3) {
            object4 = ((zzof)object).zza.zzb();
            l2 = object4.currentTimeMillis();
            bl2 = false;
            object2 = null;
            ((zzof)object).zza(l2, false);
        }
    }

    public final void zza(boolean bl2) {
        this.zzv();
        this.zzd = bl2;
    }

    public final boolean zza(boolean bl2, boolean bl3, long l2) {
        return this.zzb.zza(bl2, bl3, l2);
    }

    public final boolean zzab() {
        return false;
    }

    public final boolean zzac() {
        this.zzv();
        return this.zzd;
    }
}

