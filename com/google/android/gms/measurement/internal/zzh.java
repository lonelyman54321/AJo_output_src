/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class zzh {
    private final zzic zza;
    private Long zzaa;
    private Long zzab;
    private long zzac;
    private String zzad;
    private int zzae;
    private int zzaf;
    private long zzag;
    private String zzah;
    private byte[] zzai;
    private int zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private String zzaq;
    private boolean zzar;
    private long zzas;
    private long zzat;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private String zzq;
    private Boolean zzr;
    private long zzs;
    private List zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private int zzy;
    private boolean zzz;

    public zzh(zzic zzic2, String string2) {
        Preconditions.checkNotNull(zzic2);
        Preconditions.checkNotEmpty(string2);
        this.zza = zzic2;
        this.zzb = string2;
        zzic2.zzl().zzv();
    }

    public final int zza() {
        this.zza.zzl().zzv();
        return this.zzy;
    }

    public final void zza(int n3) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        int n4 = this.zzar;
        int n7 = this.zzy;
        n7 = n7 != n3 ? 1 : 0;
        int n8 = n4 | n7;
        this.zzar = n8;
        this.zzy = n3;
    }

    public final void zza(long l2) {
        long l3;
        long l4;
        Object object = this.zza.zzl();
        ((zzhv)object).zzv();
        long l7 = this.zzg + l2;
        long l8 = 1L;
        long l12 = Integer.MAX_VALUE;
        long l14 = l7 == l12 ? 0 : (l7 < l12 ? -1 : 1);
        if (l14 > 0) {
            object = this.zza.zzj().zzr();
            Object object2 = zzgo.zza(this.zzb);
            String string2 = "Bundle index overflow. appId";
            ((zzgq)object).zza(string2, object2);
            l7 = l2 - l8;
        }
        if ((l4 = (l3 = (l2 = this.zzag + l8) - l12) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            zzgq zzgq2 = this.zza.zzj().zzr();
            Object object3 = zzgo.zza(this.zzb);
            String string3 = "Delivery index overflow. appId";
            zzgq2.zza(string3, object3);
            l2 = 0L;
        }
        this.zzar = true;
        this.zzg = l7;
        this.zzag = l2;
    }

    public final void zza(Boolean bl2) {
        this.zza.zzl().zzv();
        boolean bl3 = this.zzar;
        boolean bl4 = Objects.equals(this.zzr, bl2) ^ true;
        this.zzar = bl3 |= bl4;
        this.zzr = bl2;
    }

    public final void zza(Long l2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzaa, l2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzaa = l2;
    }

    public final void zza(String string2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = null;
        }
        bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzq, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzq = string2;
    }

    public final void zza(List list) {
        this.zza.zzl().zzv();
        ArrayList arrayList = this.zzt;
        boolean bl2 = Objects.equals(arrayList, list);
        if (!bl2) {
            this.zzar = bl2 = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                bl2 = false;
                arrayList = null;
            }
            this.zzt = arrayList;
        }
    }

    public final void zza(boolean bl2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl3 = this.zzar;
        boolean bl4 = this.zzp;
        bl4 = bl4 != bl2;
        this.zzar = bl3 |= bl4;
        this.zzp = bl2;
    }

    public final void zza(byte[] byArray) {
        boolean bl2;
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl3 = this.zzar;
        byte[] byArray2 = this.zzai;
        if (byArray2 != byArray) {
            bl2 = true;
        } else {
            bl2 = false;
            byArray2 = null;
        }
        this.zzar = bl3 |= bl2;
        this.zzai = byArray;
    }

    public final String zzaa() {
        this.zza.zzl().zzv();
        return this.zzq;
    }

    public final String zzab() {
        this.zza.zzl().zzv();
        String string2 = this.zzaq;
        this.zzg(null);
        return string2;
    }

    public final String zzac() {
        this.zza.zzl().zzv();
        return this.zzb;
    }

    public final String zzad() {
        this.zza.zzl().zzv();
        return this.zzc;
    }

    public final String zzae() {
        this.zza.zzl().zzv();
        return this.zzl;
    }

    public final String zzaf() {
        this.zza.zzl().zzv();
        return this.zzj;
    }

    public final String zzag() {
        this.zza.zzl().zzv();
        return this.zzf;
    }

    public final String zzah() {
        this.zza.zzl().zzv();
        return this.zzd;
    }

    public final String zzai() {
        this.zza.zzl().zzv();
        return this.zzaq;
    }

    public final String zzaj() {
        this.zza.zzl().zzv();
        return this.zze;
    }

    public final String zzak() {
        this.zza.zzl().zzv();
        return this.zzah;
    }

    public final String zzal() {
        this.zza.zzl().zzv();
        return this.zzu;
    }

    public final String zzam() {
        this.zza.zzl().zzv();
        return this.zzad;
    }

    public final List zzan() {
        this.zza.zzl().zzv();
        return this.zzt;
    }

    public final void zzao() {
        this.zza.zzl().zzv();
        this.zzar = false;
    }

    public final void zzap() {
        Object object = this.zza.zzl();
        ((zzhv)object).zzv();
        long l2 = this.zzg + 1L;
        long l3 = Integer.MAX_VALUE;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            object = this.zza.zzj().zzr();
            Object object2 = zzgo.zza(this.zzb);
            String string2 = "Bundle index overflow. appId";
            ((zzgq)object).zza(string2, object2);
            l2 = 0L;
        }
        this.zzar = true;
        this.zzg = l2;
    }

    public final boolean zzaq() {
        this.zza.zzl().zzv();
        return this.zzp;
    }

    public final boolean zzar() {
        this.zza.zzl().zzv();
        return this.zzo;
    }

    public final boolean zzas() {
        this.zza.zzl().zzv();
        return this.zzar;
    }

    public final boolean zzat() {
        this.zza.zzl().zzv();
        return this.zzv;
    }

    public final boolean zzau() {
        this.zza.zzl().zzv();
        return this.zzz;
    }

    public final byte[] zzav() {
        this.zza.zzl().zzv();
        return this.zzai;
    }

    public final int zzb() {
        this.zza.zzl().zzv();
        return this.zzaj;
    }

    public final void zzb(int n3) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        int n4 = this.zzar;
        int n7 = this.zzaj;
        n7 = n7 != n3 ? 1 : 0;
        int n8 = n4 | n7;
        this.zzar = n8;
        this.zzaj = n3;
    }

    public final void zzb(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzk;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzk = l2;
    }

    public final void zzb(Long l2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzab, l2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzab = l2;
    }

    public final void zzb(String string2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzc, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzc = string2;
    }

    public final void zzb(boolean bl2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl3 = this.zzar;
        boolean bl4 = this.zzo;
        bl4 = bl4 != bl2;
        this.zzar = bl3 |= bl4;
        this.zzo = bl2;
    }

    public final int zzc() {
        this.zza.zzl().zzv();
        return this.zzaf;
    }

    public final void zzc(int n3) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        int n4 = this.zzar;
        int n7 = this.zzaf;
        n7 = n7 != n3 ? 1 : 0;
        int n8 = n4 | n7;
        this.zzar = n8;
        this.zzaf = n3;
    }

    public final void zzc(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzac;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzac = l2;
    }

    public final void zzc(String string2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzl, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzl = string2;
    }

    public final void zzc(boolean bl2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl3 = this.zzar;
        boolean bl4 = this.zzv;
        bl4 = bl4 != bl2;
        this.zzar = bl3 |= bl4;
        this.zzv = bl2;
    }

    public final int zzd() {
        this.zza.zzl().zzv();
        return this.zzae;
    }

    public final void zzd(int n3) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        int n4 = this.zzar;
        int n7 = this.zzae;
        n7 = n7 != n3 ? 1 : 0;
        int n8 = n4 | n7;
        this.zzar = n8;
        this.zzae = n3;
    }

    public final void zzd(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzas;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzas = l2;
    }

    public final void zzd(String string2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzj, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzj = string2;
    }

    public final void zzd(boolean bl2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl3 = this.zzar;
        boolean bl4 = this.zzz;
        bl4 = bl4 != bl2;
        this.zzar = bl3 |= bl4;
        this.zzz = bl2;
    }

    public final long zze() {
        this.zza.zzl().zzv();
        return this.zzk;
    }

    public final void zze(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzan;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzan = l2;
    }

    public final void zze(String string2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzf, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzf = string2;
    }

    public final long zzf() {
        this.zza.zzl().zzv();
        return this.zzac;
    }

    public final void zzf(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzao;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzao = l2;
    }

    public final void zzf(String string2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = null;
        }
        bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzd, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzd = string2;
    }

    public final long zzg() {
        this.zza.zzl().zzv();
        return this.zzas;
    }

    public final void zzg(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzam;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzam = l2;
    }

    public final void zzg(String string2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzaq, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzaq = string2;
    }

    public final long zzh() {
        this.zza.zzl().zzv();
        return this.zzan;
    }

    public final void zzh(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzal;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzal = l2;
    }

    public final void zzh(String string2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zze, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zze = string2;
    }

    public final long zzi() {
        this.zza.zzl().zzv();
        return this.zzao;
    }

    public final void zzi(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzap;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzap = l2;
    }

    public final void zzi(String string2) {
        boolean bl2;
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl3 = this.zzar;
        String string3 = this.zzah;
        if (string3 != string2) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        this.zzar = bl3 |= bl2;
        this.zzah = string2;
    }

    public final long zzj() {
        this.zza.zzl().zzv();
        return this.zzam;
    }

    public final void zzj(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzak;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzak = l2;
    }

    public final void zzj(String string2) {
        this.zza.zzl().zzv();
        boolean bl2 = this.zzar;
        boolean bl3 = Objects.equals(this.zzu, string2) ^ true;
        this.zzar = bl2 |= bl3;
        this.zzu = string2;
    }

    public final long zzk() {
        this.zza.zzl().zzv();
        return this.zzal;
    }

    public final void zzk(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzn;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzn = l2;
    }

    public final void zzk(String string2) {
        boolean bl2;
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl3 = this.zzar;
        String string3 = this.zzad;
        if (string3 != string2) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        this.zzar = bl3 |= bl2;
        this.zzad = string2;
    }

    public final long zzl() {
        this.zza.zzl().zzv();
        return this.zzap;
    }

    public final void zzl(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzs;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzs = l2;
    }

    public final long zzm() {
        this.zza.zzl().zzv();
        return this.zzak;
    }

    public final void zzm(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzat;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzat = l2;
    }

    public final long zzn() {
        this.zza.zzl().zzv();
        return this.zzn;
    }

    public final void zzn(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzm;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzm = l2;
    }

    public final long zzo() {
        this.zza.zzl().zzv();
        return this.zzs;
    }

    public final void zzo(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzag;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzag = l2;
    }

    public final long zzp() {
        this.zza.zzl().zzv();
        return this.zzat;
    }

    public final void zzp(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzi;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzi = l2;
    }

    public final long zzq() {
        this.zza.zzl().zzv();
        return this.zzm;
    }

    public final void zzq(long l2) {
        zzhv zzhv2;
        boolean bl2;
        long l3 = 0L;
        boolean bl3 = false;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            zzhv2 = null;
        }
        Preconditions.checkArgument(bl2);
        zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        bl2 = this.zzar;
        long l4 = this.zzg;
        long l7 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
        if (l7 != false) {
            bl3 = true;
        }
        this.zzar = bl2 |= bl3;
        this.zzg = l2;
    }

    public final long zzr() {
        this.zza.zzl().zzv();
        return this.zzag;
    }

    public final void zzr(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzh;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzh = l2;
    }

    public final long zzs() {
        this.zza.zzl().zzv();
        return this.zzi;
    }

    public final void zzs(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzx;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzx = l2;
    }

    public final long zzt() {
        this.zza.zzl().zzv();
        return this.zzg;
    }

    public final void zzt(long l2) {
        zzhv zzhv2 = this.zza.zzl();
        zzhv2.zzv();
        boolean bl2 = this.zzar;
        long l3 = this.zzw;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl3 = l4 != false;
        this.zzar = bl2 |= bl3;
        this.zzw = l2;
    }

    public final long zzu() {
        this.zza.zzl().zzv();
        return this.zzh;
    }

    public final long zzv() {
        this.zza.zzl().zzv();
        return this.zzx;
    }

    public final long zzw() {
        this.zza.zzl().zzv();
        return this.zzw;
    }

    public final Boolean zzx() {
        this.zza.zzl().zzv();
        return this.zzr;
    }

    public final Long zzy() {
        this.zza.zzl().zzv();
        return this.zzaa;
    }

    public final Long zzz() {
        this.zza.zzl().zzv();
        return this.zzab;
    }
}

