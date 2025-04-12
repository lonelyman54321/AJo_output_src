/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzfoz;
import com.google.android.gms.internal.ads.zzfpa;
import com.google.android.gms.internal.ads.zzfpb;
import com.google.android.gms.internal.ads.zzfpd;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfpf;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfqo;

public final class zzfpm
implements zzfpf {
    private static zzfpm zza;
    private float zzb = 0.0f;
    private final zzfpb zzc;
    private final zzfoz zzd;
    private zzfpa zze;
    private zzfpe zzf;

    public zzfpm(zzfpb zzfpb2, zzfoz zzfoz2) {
        this.zzc = zzfpb2;
        this.zzd = zzfoz2;
    }

    public static zzfpm zzb() {
        Object object = zza;
        if (object == null) {
            zzfpm zzfpm2;
            object = new zzfoz();
            zzfpb zzfpb2 = new zzfpb();
            zza = zzfpm2 = new zzfpm(zzfpb2, (zzfoz)object);
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(boolean bl2) {
        if (bl2) {
            zzfqo.zzd().zzi();
            return;
        }
        zzfqo.zzd().zzh();
    }

    public final void zzd(Context context) {
        zzfpa zzfpa2;
        zzfoy zzfoy2 = new zzfoy();
        Handler handler = new Handler();
        this.zze = zzfpa2 = new zzfpa(handler, context, zzfoy2, this);
    }

    public final void zze(float f5) {
        boolean bl2;
        this.zzb = f5;
        Object object = this.zzf;
        if (object == null) {
            object = zzfpe.zza();
            this.zzf = object;
        }
        object = this.zzf.zzb().iterator();
        while (bl2 = object.hasNext()) {
            zzfps zzfps2 = ((zzfon)object.next()).zzg();
            zzfps2.zzl(f5);
        }
    }

    public final void zzf() {
        zzfpd.zza().zze(this);
        zzfpd.zza().zzf();
        zzfqo.zzd().zzi();
        this.zze.zza();
    }

    public final void zzg() {
        zzfqo.zzd().zzj();
        zzfpd.zza().zzg();
        this.zze.zzb();
    }
}

