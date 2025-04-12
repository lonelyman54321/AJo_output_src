/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzfcc;
import com.google.android.gms.internal.ads.zzfcd;
import com.google.android.gms.internal.ads.zzfce;
import com.google.android.gms.internal.ads.zzfcf;
import com.google.android.gms.internal.ads.zzfcg;
import com.google.android.gms.internal.ads.zzfch;
import com.google.android.gms.internal.ads.zzfci;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzfck;
import com.google.android.gms.internal.ads.zzfcl;
import com.google.android.gms.internal.ads.zzfcm;
import com.google.android.gms.internal.ads.zzfcn;
import com.google.android.gms.internal.ads.zzfco;
import com.google.android.gms.internal.ads.zzfcp;
import com.google.android.gms.internal.ads.zzfcq;
import com.google.android.gms.internal.ads.zzfdx;
import com.google.android.gms.internal.ads.zzfdy;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfiy;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfcr
implements zzczo,
zzdbk,
zzfeh,
zzp,
zzdbw,
zzdab,
zzdhi {
    private final zzfiy zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private zzfcr zzh;

    public zzfcr(zzfiy zzfiy2) {
        AtomicReference atomicReference;
        this.zzb = atomicReference = new AtomicReference();
        this.zzc = atomicReference = new AtomicReference();
        this.zzd = atomicReference = new AtomicReference();
        this.zze = atomicReference = new AtomicReference();
        this.zzf = atomicReference = new AtomicReference();
        this.zzg = atomicReference = new AtomicReference();
        this.zzh = null;
        this.zza = zzfiy2;
    }

    public static zzfcr zzi(zzfcr zzfcr2) {
        zzfiy zzfiy2 = zzfcr2.zza;
        zzfcr zzfcr3 = new zzfcr(zzfiy2);
        zzfcr3.zzh = zzfcr2;
        return zzfcr3;
    }

    public final void zzdB(zze zze2) {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzdB(zze2);
            return;
        }
        object = this.zzb;
        zzfdx zzfdx2 = new zzfcm(zze2);
        zzfdy.zza((AtomicReference)object, zzfdx2);
        object = this.zzb;
        zzfdx2 = new zzfcn(zze2);
        zzfdy.zza((AtomicReference)object, zzfdx2);
    }

    public final void zzdG() {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzdG();
            return;
        }
        object = this.zzd;
        zzfci zzfci2 = new zzfci();
        zzfdy.zza((AtomicReference)object, zzfci2);
    }

    public final void zzdH() {
    }

    public final void zzdf() {
    }

    public final void zzdk() {
    }

    public final void zzdq() {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzdq();
            return;
        }
        object = this.zzf;
        zzfcf zzfcf2 = new zzfcf();
        zzfdy.zza((AtomicReference)object, zzfcf2);
    }

    public final void zzdr() {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzdr();
            return;
        }
        object = this.zzf;
        zzfdx zzfdx2 = new zzfcq();
        zzfdy.zza((AtomicReference)object, zzfdx2);
        object = this.zzd;
        zzfdx2 = new zzfcd();
        zzfdy.zza((AtomicReference)object, zzfdx2);
        object = this.zzd;
        zzfdx2 = new zzfce();
        zzfdy.zza((AtomicReference)object, zzfdx2);
    }

    public final void zzdt() {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzdt();
            return;
        }
        object = this.zzf;
        zzfcp zzfcp2 = new zzfcp();
        zzfdy.zza((AtomicReference)object, zzfcp2);
    }

    public final void zzdu(int n3) {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzdu(n3);
            return;
        }
        object = this.zzf;
        zzfcl zzfcl2 = new zzfcl(n3);
        zzfdy.zza((AtomicReference)object, zzfcl2);
    }

    public final void zzg() {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzg();
            return;
        }
        object = this.zze;
        zzfco zzfco2 = new zzfco();
        zzfdy.zza((AtomicReference)object, zzfco2);
    }

    public final void zzh(zzs zzs2) {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzh(zzs2);
            return;
        }
        object = this.zzg;
        zzfcc zzfcc2 = new zzfcc(zzs2);
        zzfdy.zza((AtomicReference)object, zzfcc2);
    }

    public final void zzj() {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzj();
            return;
        }
        this.zza.zza();
        object = this.zzc;
        zzfdx zzfdx2 = new zzfcj();
        zzfdy.zza((AtomicReference)object, zzfdx2);
        object = this.zzd;
        zzfdx2 = new zzfck();
        zzfdy.zza((AtomicReference)object, zzfdx2);
    }

    public final void zzk(zzbcg zzbcg2) {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzk(zzbcg2);
            return;
        }
        object = this.zzb;
        zzfch zzfch2 = new zzfch(zzbcg2);
        zzfdy.zza((AtomicReference)object, zzfch2);
    }

    public final void zzl(zzfeh zzfeh2) {
        zzfeh2 = (zzfcr)zzfeh2;
        this.zzh = zzfeh2;
    }

    public final void zzm(zzp zzp2) {
        this.zzf.set(zzp2);
    }

    public final void zzn(zzdg zzdg2) {
        this.zzg.set(zzdg2);
    }

    public final void zzo(zzbcj zzbcj2) {
        this.zzb.set(zzbcj2);
    }

    public final void zzp(zzbcn zzbcn2) {
        this.zzd.set(zzbcn2);
    }

    public final void zzq(zze zze2) {
        Object object = this.zzh;
        if (object != null) {
            ((zzfcr)object).zzq(zze2);
            return;
        }
        object = this.zzd;
        zzfcg zzfcg2 = new zzfcg(zze2);
        zzfdy.zza((AtomicReference)object, zzfcg2);
    }
}

