/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzfgz;
import com.google.android.gms.internal.ads.zzfho;
import java.util.ArrayList;

public final class zzfhm {
    private zzl zza;
    private zzq zzb;
    private String zzc;
    private zzfk zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbhk zzh;
    private zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private zzcb zzl;
    private int zzm = 1;
    private zzbnz zzn;
    private final zzfgz zzo;
    private boolean zzp;
    private boolean zzq;
    private zzepc zzr;
    private boolean zzs;
    private Bundle zzt;
    private zzcf zzu;

    public zzfhm() {
        zzfgz zzfgz2;
        this.zzo = zzfgz2 = new zzfgz();
        this.zzp = false;
        this.zzq = false;
        this.zzs = false;
    }

    public static /* bridge */ /* synthetic */ String zzK(zzfhm zzfhm2) {
        return zzfhm2.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzM(zzfhm zzfhm2) {
        return zzfhm2.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzN(zzfhm zzfhm2) {
        return zzfhm2.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzO(zzfhm zzfhm2) {
        return zzfhm2.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzP(zzfhm zzfhm2) {
        return zzfhm2.zzq;
    }

    public static /* bridge */ /* synthetic */ boolean zzQ(zzfhm zzfhm2) {
        return zzfhm2.zzs;
    }

    public static /* bridge */ /* synthetic */ boolean zzR(zzfhm zzfhm2) {
        return zzfhm2.zze;
    }

    public static /* bridge */ /* synthetic */ zzcf zzT(zzfhm zzfhm2) {
        return zzfhm2.zzu;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfhm zzfhm2) {
        return zzfhm2.zzm;
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzfhm zzfhm2) {
        return zzfhm2.zzt;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzc(zzfhm zzfhm2) {
        return zzfhm2.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzd(zzfhm zzfhm2) {
        return zzfhm2.zzk;
    }

    public static /* bridge */ /* synthetic */ zzl zze(zzfhm zzfhm2) {
        return zzfhm2.zza;
    }

    public static /* bridge */ /* synthetic */ zzq zzg(zzfhm zzfhm2) {
        return zzfhm2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzw zzi(zzfhm zzfhm2) {
        return zzfhm2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzcb zzj(zzfhm zzfhm2) {
        return zzfhm2.zzl;
    }

    public static /* bridge */ /* synthetic */ zzfk zzk(zzfhm zzfhm2) {
        return zzfhm2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbhk zzl(zzfhm zzfhm2) {
        return zzfhm2.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbnz zzm(zzfhm zzfhm2) {
        return zzfhm2.zzn;
    }

    public static /* bridge */ /* synthetic */ zzepc zzn(zzfhm zzfhm2) {
        return zzfhm2.zzr;
    }

    public static /* bridge */ /* synthetic */ zzfgz zzo(zzfhm zzfhm2) {
        return zzfhm2.zzo;
    }

    public final zzfhm zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfhm zzB(boolean bl2) {
        this.zze = bl2;
        return this;
    }

    public final zzfhm zzC(int n3) {
        this.zzm = n3;
        return this;
    }

    public final zzfhm zzD(zzbhk zzbhk2) {
        this.zzh = zzbhk2;
        return this;
    }

    public final zzfhm zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfhm zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfhm zzG(PublisherAdViewOptions object) {
        this.zzk = object;
        if (object != null) {
            boolean bl2;
            this.zze = bl2 = ((PublisherAdViewOptions)object).zzc();
            this.zzl = object = ((PublisherAdViewOptions)object).zza();
        }
        return this;
    }

    public final zzfhm zzH(zzl zzl2) {
        this.zza = zzl2;
        return this;
    }

    public final zzfhm zzI(zzfk zzfk2) {
        this.zzd = zzfk2;
        return this;
    }

    public final zzfho zzJ() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        zzfho zzfho2 = new zzfho(this, null);
        return zzfho2;
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzq;
    }

    public final zzfhm zzU(zzcf zzcf2) {
        this.zzu = zzcf2;
        return this;
    }

    public final zzl zzf() {
        return this.zza;
    }

    public final zzq zzh() {
        return this.zzb;
    }

    public final zzfgz zzp() {
        return this.zzo;
    }

    public final zzfhm zzq(zzfho zzfho2) {
        boolean bl2;
        Object object = this.zzo;
        int n3 = zzfho2.zzo.zza;
        ((zzfgz)object).zza(n3);
        this.zza = object = zzfho2.zzd;
        this.zzb = object = zzfho2.zze;
        this.zzu = object = zzfho2.zzt;
        this.zzc = object = zzfho2.zzf;
        this.zzd = object = zzfho2.zza;
        this.zzf = object = zzfho2.zzg;
        this.zzg = object = zzfho2.zzh;
        this.zzh = object = zzfho2.zzi;
        this.zzi = object = zzfho2.zzj;
        object = zzfho2.zzl;
        this.zzr((AdManagerAdViewOptions)object);
        object = zzfho2.zzm;
        this.zzG((PublisherAdViewOptions)object);
        this.zzp = bl2 = zzfho2.zzp;
        this.zzq = bl2 = zzfho2.zzq;
        this.zzr = object = zzfho2.zzc;
        this.zzs = bl2 = zzfho2.zzr;
        zzfho2 = zzfho2.zzs;
        this.zzt = zzfho2;
        return this;
    }

    public final zzfhm zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            boolean bl2;
            this.zze = bl2 = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfhm zzs(zzq zzq2) {
        this.zzb = zzq2;
        return this;
    }

    public final zzfhm zzt(String string2) {
        this.zzc = string2;
        return this;
    }

    public final zzfhm zzu(zzw zzw2) {
        this.zzi = zzw2;
        return this;
    }

    public final zzfhm zzv(zzepc zzepc2) {
        this.zzr = zzepc2;
        return this;
    }

    public final zzfhm zzw(zzbnz abstractSafeParcelable) {
        this.zzn = abstractSafeParcelable;
        abstractSafeParcelable = new zzfk(false, true, false);
        this.zzd = abstractSafeParcelable;
        return this;
    }

    public final zzfhm zzx(boolean bl2) {
        this.zzp = bl2;
        return this;
    }

    public final zzfhm zzy(boolean bl2) {
        this.zzq = bl2;
        return this;
    }

    public final zzfhm zzz(boolean bl2) {
        this.zzs = true;
        return this;
    }
}

