/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzah;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzca;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzcl;
import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzcs;
import com.google.android.gms.internal.ads.zzct;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzfh;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzmx;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzmz;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zznb;
import com.google.android.gms.internal.ads.zznc;
import com.google.android.gms.internal.ads.zznd;
import com.google.android.gms.internal.ads.zzne;
import com.google.android.gms.internal.ads.zznf;
import com.google.android.gms.internal.ads.zzng;
import com.google.android.gms.internal.ads.zznh;
import com.google.android.gms.internal.ads.zzni;
import com.google.android.gms.internal.ads.zznj;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zznl;
import com.google.android.gms.internal.ads.zznm;
import com.google.android.gms.internal.ads.zznn;
import com.google.android.gms.internal.ads.zzno;
import com.google.android.gms.internal.ads.zznp;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zzns;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zznu;
import com.google.android.gms.internal.ads.zznv;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzny;
import com.google.android.gms.internal.ads.zznz;
import com.google.android.gms.internal.ads.zzoa;
import com.google.android.gms.internal.ads.zzob;
import com.google.android.gms.internal.ads.zzoc;
import com.google.android.gms.internal.ads.zzod;
import com.google.android.gms.internal.ads.zzoe;
import com.google.android.gms.internal.ads.zzof;
import com.google.android.gms.internal.ads.zzog;
import com.google.android.gms.internal.ads.zzoh;
import com.google.android.gms.internal.ads.zzoi;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzok;
import com.google.android.gms.internal.ads.zzol;
import com.google.android.gms.internal.ads.zzom;
import com.google.android.gms.internal.ads.zzon;
import com.google.android.gms.internal.ads.zzoo;
import com.google.android.gms.internal.ads.zzop;
import com.google.android.gms.internal.ads.zzoq;
import com.google.android.gms.internal.ads.zzor;
import com.google.android.gms.internal.ads.zzos;
import com.google.android.gms.internal.ads.zzot;
import com.google.android.gms.internal.ads.zzou;
import com.google.android.gms.internal.ads.zzov;
import com.google.android.gms.internal.ads.zzow;
import com.google.android.gms.internal.ads.zzox;
import com.google.android.gms.internal.ads.zzoy;
import com.google.android.gms.internal.ads.zzoz;
import com.google.android.gms.internal.ads.zzqp;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;

public final class zzpa
implements zzmx {
    private final zzer zza;
    private final zzcz zzb;
    private final zzdb zzc;
    private final zzoz zzd;
    private final SparseArray zze;
    private zzfh zzf;
    private zzct zzg;
    private zzfb zzh;
    private boolean zzi;

    public zzpa(zzer object) {
        object.getClass();
        this.zza = object;
        Looper looper = zzgd.zzy();
        zzob zzob2 = new zzob();
        Object object2 = new zzfh(looper, (zzer)object, zzob2);
        this.zzf = object2;
        this.zzb = object = new zzcz();
        this.zzc = object2 = new zzdb();
        this.zzd = object2 = new zzoz((zzcz)object);
        object = new SparseArray();
        this.zze = object;
    }

    public static /* synthetic */ void zzV(zzpa zzpa2) {
        zzmy zzmy2 = zzpa2.zzT();
        zznc zznc2 = new zznc(zzmy2);
        zzpa2.zzY(zzmy2, 1028, zznc2);
        zzpa2.zzf.zze();
    }

    private final zzmy zzZ(zzvo object) {
        int n3;
        this.zzg.getClass();
        int n4 = 0;
        zzcz zzcz2 = null;
        zzdc zzdc2 = object == null ? null : this.zzd.zza((zzvo)object);
        if (object != null && zzdc2 != null) {
            zzcz2 = this.zzb;
            Object object2 = ((zzvo)object).zza;
            n4 = zzdc2.zzn((Object)object2, (zzcz)zzcz2).zzd;
            return this.zzU(zzdc2, n4, (zzvo)object);
        }
        object = this.zzg;
        int n7 = object.zzd();
        if (n7 >= (n3 = (zzdc2 = this.zzg.zzn()).zzc())) {
            zzdc2 = zzdc.zza;
        }
        return this.zzU(zzdc2, n7, null);
    }

    private final zzmy zzaa(int n3, zzvo object) {
        Object object2 = this.zzg;
        object2.getClass();
        if (object != null) {
            zzmy zzmy2;
            object2 = this.zzd.zza((zzvo)object);
            if (object2 != null) {
                zzmy2 = this.zzZ((zzvo)object);
            } else {
                object2 = zzdc.zza;
                zzmy2 = this.zzU((zzdc)object2, n3, (zzvo)object);
            }
            return zzmy2;
        }
        object = object2.zzn();
        int n4 = ((zzdc)object).zzc();
        if (n3 >= n4) {
            object = zzdc.zza;
        }
        return this.zzU((zzdc)object, n3, null);
    }

    private final zzmy zzab() {
        zzvo zzvo2 = this.zzd.zzd();
        return this.zzZ(zzvo2);
    }

    private final zzmy zzac() {
        zzvo zzvo2 = this.zzd.zze();
        return this.zzZ(zzvo2);
    }

    private final zzmy zzad(zzcj object) {
        boolean bl2 = object instanceof zzjh;
        if (bl2 && (object = ((zzjh)object).zzj) != null) {
            return this.zzZ((zzvo)object);
        }
        return this.zzT();
    }

    public final void zzA(zzan zzan2, zziy zziy2) {
        zzmy zzmy2 = this.zzac();
        zzoo zzoo2 = new zzoo(zzmy2, zzan2, zziy2);
        this.zzY(zzmy2, 1009, zzoo2);
    }

    public final void zzB(long l2) {
        zzmy zzmy2 = this.zzac();
        zzns zzns2 = new zzns(zzmy2, l2);
        this.zzY(zzmy2, 1010, zzns2);
    }

    public final void zzC(Exception exception) {
        zzmy zzmy2 = this.zzac();
        zzow zzow2 = new zzow(zzmy2, exception);
        this.zzY(zzmy2, 1014, zzow2);
    }

    public final void zzD(zzqp zzqp2) {
        zzmy zzmy2 = this.zzac();
        zzol zzol2 = new zzol(zzmy2, zzqp2);
        this.zzY(zzmy2, 1031, zzol2);
    }

    public final void zzE(zzqp zzqp2) {
        zzmy zzmy2 = this.zzac();
        zzov zzov2 = new zzov(zzmy2, zzqp2);
        this.zzY(zzmy2, 1032, zzov2);
    }

    public final void zzF(int n3, long l2, long l3) {
        zzmy zzmy2 = this.zzac();
        zzno zzno2 = new zzno(zzmy2, n3, l2, l3);
        this.zzY(zzmy2, 1011, zzno2);
    }

    public final void zzG(int n3, long l2) {
        zzmy zzmy2 = this.zzab();
        zzny zzny2 = new zzny(zzmy2, n3, l2);
        this.zzY(zzmy2, 1018, zzny2);
    }

    public final void zzH(Object object, long l2) {
        zzmy zzmy2 = this.zzac();
        zzos zzos2 = new zzos(zzmy2, object, l2);
        this.zzY(zzmy2, 26, zzos2);
    }

    public final void zzI(Exception exception) {
        zzmy zzmy2 = this.zzac();
        zznn zznn2 = new zznn(zzmy2, exception);
        this.zzY(zzmy2, 1030, zznn2);
    }

    public final void zzJ(String string2, long l2, long l3) {
        zzmy zzmy2 = this.zzac();
        zzou zzou2 = new zzou(zzmy2, string2, l3, l2);
        this.zzY(zzmy2, 1016, zzou2);
    }

    public final void zzK(String string2) {
        zzmy zzmy2 = this.zzac();
        zznx zznx2 = new zznx(zzmy2, string2);
        this.zzY(zzmy2, 1019, zznx2);
    }

    public final void zzL(zzix zzix2) {
        zzmy zzmy2 = this.zzab();
        zzok zzok2 = new zzok(zzmy2, zzix2);
        this.zzY(zzmy2, 1020, zzok2);
    }

    public final void zzM(zzix zzix2) {
        zzmy zzmy2 = this.zzac();
        zzoq zzoq2 = new zzoq(zzmy2, zzix2);
        this.zzY(zzmy2, 1015, zzoq2);
    }

    public final void zzN(long l2, int n3) {
        zzmy zzmy2 = this.zzab();
        zzoc zzoc2 = new zzoc(zzmy2, l2, n3);
        this.zzY(zzmy2, 1021, zzoc2);
    }

    public final void zzO(zzan zzan2, zziy zziy2) {
        zzmy zzmy2 = this.zzac();
        zzoj zzoj2 = new zzoj(zzmy2, zzan2, zziy2);
        this.zzY(zzmy2, 1017, zzoj2);
    }

    public final void zzP() {
        zzfb zzfb2 = this.zzh;
        zzeq.zzb(zzfb2);
        zzor zzor2 = new zzor(this);
        zzfb2.zzh(zzor2);
    }

    public final void zzQ(zzna zzna2) {
        this.zzf.zzf(zzna2);
    }

    public final void zzR(zzct object, Looper looper) {
        zznq zznq2;
        boolean bl2;
        Object object2 = this.zzg;
        boolean bl3 = true;
        if (object2 != null && !(bl2 = ((AbstractCollection)(object2 = zzoz.zzf(this.zzd))).isEmpty())) {
            bl3 = false;
            zznq2 = null;
        }
        zzeq.zzf(bl3);
        object.getClass();
        this.zzg = object;
        this.zzh = object2 = this.zza.zzb(looper, null);
        object2 = this.zzf;
        zznq2 = new zznq(this, (zzct)object);
        this.zzf = object = ((zzfh)object2).zza(looper, zznq2);
    }

    public final void zzS(List list, zzvo zzvo2) {
        zzct zzct2 = this.zzg;
        zzct2.getClass();
        this.zzd.zzh(list, zzvo2, zzct2);
    }

    public final zzmy zzT() {
        zzvo zzvo2 = this.zzd.zzb();
        return this.zzZ(zzvo2);
    }

    public final zzmy zzU(zzdc zzdc2, int n3, zzvo zzvo2) {
        zzmy zzmy2;
        zzvo zzvo3;
        Object object;
        zzpa zzpa2 = this;
        zzdc zzdc3 = zzdc2;
        int n4 = n3;
        int n7 = 1;
        int n8 = zzdc2.zzo();
        if (n7 == n8) {
            n8 = 0;
            object = null;
            zzvo3 = null;
        } else {
            zzvo3 = zzvo2;
        }
        long l2 = zzpa2.zza.zza();
        object = zzpa2.zzg.zzn();
        n8 = zzdc3.equals(object);
        if (n8 == 0 || n4 != (n8 = (object = zzpa2.zzg).zzd())) {
            n7 = 0;
        }
        long l3 = 0L;
        if (zzvo3 != null && (n8 = (int)(zzvo3.zzb() ? 1 : 0)) != 0) {
            if (n7 != 0 && (n8 = (object = zzpa2.zzg).zzb()) == (n7 = zzvo3.zzb) && (n8 = (object = zzpa2.zzg).zzc()) == (n7 = zzvo3.zzc)) {
                object = zzpa2.zzg;
                l3 = object.zzk();
            }
        } else if (n7 != 0) {
            long l4;
            object = zzpa2.zzg;
            l3 = l4 = object.zzj();
        } else {
            n8 = (int)(zzdc2.zzo() ? 1 : 0);
            if (n8 == 0) {
                object = zzpa2.zzc;
                object = zzdc3.zze(n4, (zzdb)object, l3);
                long l7 = ((zzdb)object).zzn;
                l3 = zzgd.zzu(l3);
            }
        }
        zzvo zzvo4 = zzpa2.zzd.zzb();
        zzdc zzdc4 = zzpa2.zzg.zzn();
        int n10 = zzpa2.zzg.zzd();
        long l8 = zzpa2.zzg.zzk();
        long l12 = zzpa2.zzg.zzm();
        object = zzmy2;
        long l14 = l2;
        zzdc3 = zzdc2;
        n4 = n3;
        l2 = l3;
        long l15 = l8;
        l8 = l12;
        zzmy2 = new zzmy(l14, zzdc2, n3, zzvo3, l3, zzdc4, n10, zzvo4, l15, l12);
        return zzmy2;
    }

    public final /* synthetic */ void zzW(zzct zzct2, zzna zzna2, zzah zzah2) {
        SparseArray sparseArray = this.zze;
        zzmz zzmz2 = new zzmz(zzah2, sparseArray);
        zzna2.zzi(zzct2, zzmz2);
    }

    public final void zzX(int n3, long l2, long l3) {
        Object object = this.zzd.zzc();
        object = this.zzZ((zzvo)object);
        zznl zznl2 = new zznl((zzmy)object, n3, l2, l3);
        this.zzY((zzmy)object, 1006, zznl2);
    }

    public final void zzY(zzmy object, int n3, zzfe zzfe2) {
        this.zze.put(n3, object);
        object = this.zzf;
        ((zzfh)object).zzd(n3, zzfe2);
        ((zzfh)object).zzc();
    }

    public final void zza(zzcp zzcp2) {
        zzmy zzmy2 = this.zzT();
        zznh zznh2 = new zznh(zzmy2, zzcp2);
        this.zzY(zzmy2, 13, zznh2);
    }

    public final void zzae(int n3, zzvo object, zzvk zzvk2) {
        zzmy zzmy2 = this.zzaa(n3, (zzvo)object);
        object = new zzod(zzmy2, zzvk2);
        this.zzY(zzmy2, 1004, (zzfe)object);
    }

    public final void zzaf(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        zzmy zzmy2 = this.zzaa(n3, (zzvo)object);
        object = new zzoe(zzmy2, zzvf2, zzvk2);
        this.zzY(zzmy2, 1002, (zzfe)object);
    }

    public final void zzag(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        zzmy zzmy2 = this.zzaa(n3, (zzvo)object);
        object = new zzoi(zzmy2, zzvf2, zzvk2);
        this.zzY(zzmy2, 1001, (zzfe)object);
    }

    public final void zzah(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2, IOException iOException, boolean bl2) {
        zzmy zzmy2 = this.zzaa(n3, (zzvo)object);
        object = new zznp(zzmy2, zzvf2, zzvk2, iOException, bl2);
        this.zzY(zzmy2, 1003, (zzfe)object);
    }

    public final void zzai(int n3, zzvo object, zzvf zzvf2, zzvk zzvk2) {
        zzmy zzmy2 = this.zzaa(n3, (zzvo)object);
        object = new zzng(zzmy2, zzvf2, zzvk2);
        this.zzY(zzmy2, 1000, (zzfe)object);
    }

    public final void zzb(boolean bl2) {
        zzmy zzmy2 = this.zzT();
        zzne zzne2 = new zzne(zzmy2, bl2);
        this.zzY(zzmy2, 3, zzne2);
    }

    public final void zzc(boolean bl2) {
        zzmy zzmy2 = this.zzT();
        zznt zznt2 = new zznt(zzmy2, bl2);
        this.zzY(zzmy2, 7, zznt2);
    }

    public final void zzd(zzbu zzbu2, int n3) {
        zzmy zzmy2 = this.zzT();
        zznj zznj2 = new zznj(zzmy2, zzbu2, n3);
        this.zzY(zzmy2, 1, zznj2);
    }

    public final void zze(zzca zzca2) {
        zzmy zzmy2 = this.zzT();
        zzox zzox2 = new zzox(zzmy2, zzca2);
        this.zzY(zzmy2, 14, zzox2);
    }

    public final void zzf(boolean bl2, int n3) {
        zzmy zzmy2 = this.zzT();
        zzoa zzoa2 = new zzoa(zzmy2, bl2, n3);
        this.zzY(zzmy2, 5, zzoa2);
    }

    public final void zzg(zzcl zzcl2) {
        zzmy zzmy2 = this.zzT();
        zznb zznb2 = new zznb(zzmy2, zzcl2);
        this.zzY(zzmy2, 12, zznb2);
    }

    public final void zzh(int n3) {
        zzmy zzmy2 = this.zzT();
        zzoh zzoh2 = new zzoh(zzmy2, n3);
        this.zzY(zzmy2, 4, zzoh2);
    }

    public final void zzi(int n3) {
        zzmy zzmy2 = this.zzT();
        zznw zznw2 = new zznw(zzmy2, n3);
        this.zzY(zzmy2, 6, zznw2);
    }

    public final void zzj(zzcj zzcj2) {
        zzmy zzmy2 = this.zzad(zzcj2);
        zzof zzof2 = new zzof(zzmy2, zzcj2);
        this.zzY(zzmy2, 10, zzof2);
    }

    public final void zzk(zzcj zzcj2) {
        zzmy zzmy2 = this.zzad(zzcj2);
        zznz zznz2 = new zznz(zzmy2, zzcj2);
        this.zzY(zzmy2, 10, zznz2);
    }

    public final void zzl(boolean bl2, int n3) {
        zzmy zzmy2 = this.zzT();
        zznr zznr2 = new zznr(zzmy2, bl2, n3);
        this.zzY(zzmy2, -1, zznr2);
    }

    public final void zzm(zzcs zzcs2, zzcs zzcs3, int n3) {
        int n4 = 1;
        if (n3 == n4) {
            this.zzi = false;
            n3 = 1;
        }
        Object object = this.zzd;
        Object object2 = this.zzg;
        object2.getClass();
        ((zzoz)object).zzg((zzct)object2);
        object = this.zzT();
        object2 = new zzop((zzmy)object, n3, zzcs2, zzcs3);
        this.zzY((zzmy)object, 11, (zzfe)object2);
    }

    public final void zzn(boolean bl2) {
        zzmy zzmy2 = this.zzac();
        zznk zznk2 = new zznk(zzmy2, bl2);
        this.zzY(zzmy2, 23, zznk2);
    }

    public final void zzo(int n3, int n4) {
        zzmy zzmy2 = this.zzac();
        zzoy zzoy2 = new zzoy(zzmy2, n3, n4);
        this.zzY(zzmy2, 24, zzoy2);
    }

    public final void zzp(zzdc object, int n3) {
        object = this.zzg;
        object.getClass();
        this.zzd.zzi((zzct)object);
        object = this.zzT();
        zzni zzni2 = new zzni((zzmy)object, n3);
        this.zzY((zzmy)object, 0, zzni2);
    }

    public final void zzq(zzdp zzdp2) {
        zzmy zzmy2 = this.zzT();
        zznu zznu2 = new zznu(zzmy2, zzdp2);
        this.zzY(zzmy2, 2, zznu2);
    }

    public final void zzr(zzdv zzdv2) {
        zzmy zzmy2 = this.zzac();
        zzom zzom2 = new zzom(zzmy2, zzdv2);
        this.zzY(zzmy2, 25, zzom2);
    }

    public final void zzs(float f5) {
        zzmy zzmy2 = this.zzac();
        zznm zznm2 = new zznm(zzmy2, f5);
        this.zzY(zzmy2, 22, zznm2);
    }

    public final void zzt(zzna zzna2) {
        this.zzf.zzb(zzna2);
    }

    public final void zzu() {
        boolean bl2 = this.zzi;
        if (!bl2) {
            boolean bl3;
            zzmy zzmy2 = this.zzT();
            this.zzi = bl3 = true;
            zzon zzon2 = new zzon(zzmy2);
            int n3 = -1;
            this.zzY(zzmy2, n3, zzon2);
        }
    }

    public final void zzv(Exception exception) {
        zzmy zzmy2 = this.zzac();
        zzot zzot2 = new zzot(zzmy2, exception);
        this.zzY(zzmy2, 1029, zzot2);
    }

    public final void zzw(String string2, long l2, long l3) {
        zzmy zzmy2 = this.zzac();
        zznv zznv2 = new zznv(zzmy2, string2, l3, l2);
        this.zzY(zzmy2, 1008, zznv2);
    }

    public final void zzx(String string2) {
        zzmy zzmy2 = this.zzac();
        zznf zznf2 = new zznf(zzmy2, string2);
        this.zzY(zzmy2, 1012, zznf2);
    }

    public final void zzy(zzix zzix2) {
        zzmy zzmy2 = this.zzab();
        zzog zzog2 = new zzog(zzmy2, zzix2);
        this.zzY(zzmy2, 1013, zzog2);
    }

    public final void zzz(zzix zzix2) {
        zzmy zzmy2 = this.zzac();
        zznd zznd2 = new zznd(zzmy2, zzix2);
        this.zzY(zzmy2, 1007, zznd2);
    }
}

