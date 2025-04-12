/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zza;
import com.google.android.gms.internal.measurement.zzgf$zzc;
import com.google.android.gms.internal.measurement.zzgf$zzd;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzi;
import com.google.android.gms.internal.measurement.zzgf$zzk$zza;
import com.google.android.gms.internal.measurement.zzgf$zzl;
import com.google.android.gms.internal.measurement.zzgf$zzo;
import com.google.android.gms.internal.measurement.zzgf$zzp;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgf$zzk
extends zzkg
implements zzlo {
    private static final zzgf$zzk zzc;
    private static volatile zzlz zzd;
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private zzkm zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private zzgf$zzl zzas;
    private zzkk zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private zzgf$zzi zzbc;
    private String zzbd;
    private zzkm zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private zzgf$zzc zzbn;
    private int zzbo;
    private zzgf$zza zzbp;
    private String zzbq;
    private zzgf$zzo zzbr;
    private long zzbs;
    private int zze;
    private int zzf;
    private int zzg;
    private zzkm zzh;
    private zzkm zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        zzgf$zzk zzgf$zzk;
        zzc = zzgf$zzk = new zzgf$zzk();
        zzkg.zza(zzgf$zzk.class, zzgf$zzk);
    }

    private zzgf$zzk() {
        zzkm zzkm2;
        Object object = zzkg.zzcl();
        this.zzh = object;
        object = zzkg.zzcl();
        this.zzi = object;
        this.zzo = object = "";
        this.zzp = object;
        this.zzq = object;
        this.zzr = object;
        this.zzt = object;
        this.zzu = object;
        this.zzv = object;
        this.zzy = object;
        this.zzaa = object;
        this.zzad = object;
        this.zzae = object;
        this.zzag = zzkm2 = zzkg.zzcl();
        this.zzah = object;
        this.zzal = object;
        this.zzao = object;
        this.zzap = object;
        this.zzar = object;
        zzkm2 = zzkg.zzcj();
        this.zzat = zzkm2;
        this.zzaw = object;
        this.zzax = object;
        this.zzba = object;
        this.zzbd = object;
        this.zzbe = zzkm2 = zzkg.zzcl();
        this.zzbf = object;
        this.zzbi = object;
        this.zzbk = object;
        this.zzbm = object;
        this.zzbq = object;
    }

    public static zzgf$zzk$zza zza(zzgf$zzk zzgf$zzk) {
        return (zzgf$zzk$zza)zzc.zza(zzgf$zzk);
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, int n3) {
        zzgf$zzk.zzcr();
        zzgf$zzk.zzh.remove(n3);
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, int n3, zzgf$zzf zzgf$zzf) {
        zzgf$zzf.getClass();
        zzgf$zzk.zzcr();
        zzgf$zzk.zzh.set(n3, zzgf$zzf);
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, int n3, zzgf$zzp zzgf$zzp) {
        zzgf$zzp.getClass();
        zzgf$zzk.zzcs();
        zzgf$zzk.zzi.set(n3, zzgf$zzp);
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x8000000;
        zzgf$zzk.zzbs = l2;
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, zzgf$zza zzgf$zza) {
        int n3;
        zzgf$zza.getClass();
        zzgf$zzk.zzbp = zzgf$zza;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x1000000;
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, zzgf$zzc zzgf$zzc) {
        int n3;
        zzgf$zzc.getClass();
        zzgf$zzk.zzbn = zzgf$zzc;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x400000;
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, zzgf$zzf zzgf$zzf) {
        zzgf$zzf.getClass();
        zzgf$zzk.zzcr();
        zzgf$zzk.zzh.add(zzgf$zzf);
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, zzgf$zzl zzgf$zzl) {
        int n3;
        zzgf$zzl.getClass();
        zzgf$zzk.zzas = zzgf$zzl;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 8;
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, zzgf$zzo zzgf$zzo) {
        int n3;
        zzgf$zzo.getClass();
        zzgf$zzk.zzbr = zzgf$zzo;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x4000000;
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, zzgf$zzp zzgf$zzp) {
        zzgf$zzp.getClass();
        zzgf$zzk.zzcs();
        zzgf$zzk.zzi.add(zzgf$zzp);
    }

    public static /* synthetic */ void zza(zzgf$zzk object, Iterable iterable) {
        zzkm zzkm2 = ((zzgf$zzk)object).zzag;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            ((zzgf$zzk)object).zzag = zzkm2 = zzkg.zza(zzkm2);
        }
        object = ((zzgf$zzk)object).zzag;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 4;
        zzgf$zzk.zzar = string2;
    }

    public static /* synthetic */ void zza(zzgf$zzk zzgf$zzk, boolean bl2) {
        int n3;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x10000;
        zzgf$zzk.zzbh = bl2;
    }

    public static /* synthetic */ void zzb(zzgf$zzk zzgf$zzk) {
        String string2;
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xFFFBFFFF;
        zzgf$zzk.zzaa = string2 = zzgf$zzk.zzc.zzaa;
    }

    public static /* synthetic */ void zzb(zzgf$zzk zzgf$zzk, int n3) {
        zzgf$zzk.zzcs();
        zzgf$zzk.zzi.remove(n3);
    }

    public static /* synthetic */ void zzb(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x20;
        zzgf$zzk.zzav = l2;
    }

    public static /* synthetic */ void zzb(zzgf$zzk object, Iterable iterable) {
        ((zzgf$zzk)object).zzcr();
        object = ((zzgf$zzk)object).zzh;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zzb(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x1000;
        zzgf$zzk.zzu = string2;
    }

    public static /* synthetic */ void zzb(zzgf$zzk zzgf$zzk, boolean bl2) {
        int n3;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x40000;
        zzgf$zzk.zzbj = bl2;
    }

    public static /* synthetic */ void zzc(zzgf$zzk zzgf$zzk) {
        zzkm zzkm2;
        zzgf$zzk.zzag = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zzc(zzgf$zzk zzgf$zzk, int n3) {
        int n4;
        zzgf$zzk.zzf = n4 = zzgf$zzk.zzf | 0x100000;
        zzgf$zzk.zzbl = n3;
    }

    public static /* synthetic */ void zzc(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x20000000;
        zzgf$zzk.zzam = l2;
    }

    public static /* synthetic */ void zzc(zzgf$zzk object, Iterable iterable) {
        zzkk zzkk2 = ((zzgf$zzk)object).zzat;
        int n3 = zzkk2.zzc();
        if (n3 == 0) {
            n3 = zzkk2.size() << 1;
            ((zzgf$zzk)object).zzat = zzkk2 = zzkk2.zzc(n3);
        }
        object = ((zzgf$zzk)object).zzat;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zzc(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x40000;
        zzgf$zzk.zzaa = string2;
    }

    public static /* synthetic */ void zzc(zzgf$zzk zzgf$zzk, boolean bl2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x20000;
        zzgf$zzk.zzz = bl2;
    }

    private final void zzcr() {
        zzkm zzkm2 = this.zzh;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            this.zzh = zzkm2 = zzkg.zza(zzkm2);
        }
    }

    private final void zzcs() {
        zzkm zzkm2 = this.zzi;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            this.zzi = zzkm2 = zzkg.zza(zzkm2);
        }
    }

    public static /* synthetic */ void zzd(zzgf$zzk zzgf$zzk) {
        String string2;
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xFFFFFEFF;
        zzgf$zzk.zzq = string2 = zzgf$zzk.zzc.zzq;
    }

    public static /* synthetic */ void zzd(zzgf$zzk zzgf$zzk, int n3) {
        int n4;
        zzgf$zzk.zze = n4 = zzgf$zzk.zze | 0x2000000;
        zzgf$zzk.zzai = n3;
    }

    public static /* synthetic */ void zzd(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x80000;
        zzgf$zzk.zzab = l2;
    }

    public static /* synthetic */ void zzd(zzgf$zzk object, Iterable iterable) {
        zzkm zzkm2 = ((zzgf$zzk)object).zzbe;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            ((zzgf$zzk)object).zzbe = zzkm2 = zzkg.zza(zzkm2);
        }
        object = ((zzgf$zzk)object).zzbe;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zzd(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x800;
        zzgf$zzk.zzt = string2;
    }

    public static /* synthetic */ void zzd(zzgf$zzk zzgf$zzk, boolean bl2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x800000;
        zzgf$zzk.zzaf = bl2;
    }

    public static /* synthetic */ void zze(zzgf$zzk zzgf$zzk) {
        String string2;
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & -1 >>> 1;
        zzgf$zzk.zzao = string2 = zzgf$zzk.zzc.zzao;
    }

    public static /* synthetic */ void zze(zzgf$zzk zzgf$zzk, int n3) {
        int n4;
        zzgf$zzk.zze = n4 = zzgf$zzk.zze | 0x100000;
        zzgf$zzk.zzac = n3;
    }

    public static /* synthetic */ void zze(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x10;
        zzgf$zzk.zzau = l2;
    }

    public static /* synthetic */ void zze(zzgf$zzk object, Iterable iterable) {
        ((zzgf$zzk)object).zzcs();
        object = ((zzgf$zzk)object).zzi;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zze(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x2000;
        zzgf$zzk.zzv = string2;
    }

    public static /* synthetic */ void zzf(zzgf$zzk zzgf$zzk) {
        zzkm zzkm2;
        zzgf$zzk.zzh = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zzf(zzgf$zzk zzgf$zzk, int n3) {
        int n4;
        zzgf$zzk.zzf = n4 = zzgf$zzk.zzf | 0x800000;
        zzgf$zzk.zzbo = n3;
    }

    public static /* synthetic */ void zzf(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 8;
        zzgf$zzk.zzl = l2;
    }

    public static /* synthetic */ void zzf(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x20000;
        zzgf$zzk.zzbi = string2;
    }

    public static /* synthetic */ void zzg(zzgf$zzk zzgf$zzk) {
        String string2;
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xFFDFFFFF;
        zzgf$zzk.zzad = string2 = zzgf$zzk.zzc.zzad;
    }

    public static /* synthetic */ void zzg(zzgf$zzk zzgf$zzk, int n3) {
        n3 = zzgf$zzk.zze;
        int n4 = 1;
        zzgf$zzk.zze = n3 |= n4;
        zzgf$zzk.zzg = n4;
    }

    public static /* synthetic */ void zzg(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x4000;
        zzgf$zzk.zzw = l2;
    }

    public static /* synthetic */ void zzg(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x80;
        zzgf$zzk.zzax = string2;
    }

    public static /* synthetic */ void zzh(zzgf$zzk zzgf$zzk) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xFFFDFFFF;
        zzgf$zzk.zzz = false;
    }

    public static /* synthetic */ void zzh(zzgf$zzk zzgf$zzk, int n3) {
        int n4;
        zzgf$zzk.zzf = n4 = zzgf$zzk.zzf | 2;
        zzgf$zzk.zzaq = n3;
    }

    public static /* synthetic */ void zzh(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x20;
        zzgf$zzk.zzn = l2;
    }

    public static /* synthetic */ void zzh(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x80000;
        zzgf$zzk.zzbk = string2;
    }

    public static /* synthetic */ void zzi(zzgf$zzk zzgf$zzk) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xFFFFFFDF;
        zzgf$zzk.zzn = 0L;
    }

    public static /* synthetic */ void zzi(zzgf$zzk zzgf$zzk, int n3) {
        int n4;
        zzgf$zzk.zze = n4 = zzgf$zzk.zze | 0x400;
        zzgf$zzk.zzs = n3;
    }

    public static /* synthetic */ void zzi(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x10;
        zzgf$zzk.zzm = l2;
    }

    public static /* synthetic */ void zzi(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x100;
        zzgf$zzk.zzq = string2;
    }

    public static /* synthetic */ void zzj(zzgf$zzk zzgf$zzk) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xFFFFFFEF;
        zzgf$zzk.zzm = 0L;
    }

    public static /* synthetic */ void zzj(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 4;
        zzgf$zzk.zzk = l2;
    }

    public static /* synthetic */ void zzj(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | -1 << -1;
        zzgf$zzk.zzao = string2;
    }

    public static /* synthetic */ void zzk(zzgf$zzk zzgf$zzk) {
        String string2;
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xFFFEFFFF;
        zzgf$zzk.zzy = string2 = zzgf$zzk.zzc.zzy;
    }

    public static /* synthetic */ void zzk(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x8000;
        zzgf$zzk.zzbg = l2;
    }

    public static /* synthetic */ void zzk(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x4000;
        zzgf$zzk.zzbf = string2;
    }

    public static /* synthetic */ void zzl(zzgf$zzk zzgf$zzk) {
        String string2;
        int n3;
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf & 0xFFFFDFFF;
        zzgf$zzk.zzbd = string2 = zzgf$zzk.zzc.zzbd;
    }

    public static /* synthetic */ void zzl(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 2;
        zzgf$zzk.zzj = l2;
    }

    public static /* synthetic */ void zzl(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x1000000;
        zzgf$zzk.zzah = string2;
    }

    public static /* synthetic */ void zzm(zzgf$zzk zzgf$zzk) {
        String string2;
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xEFFFFFFF;
        zzgf$zzk.zzal = string2 = zzgf$zzk.zzc.zzal;
    }

    public static /* synthetic */ void zzm(zzgf$zzk zzgf$zzk, long l2) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x8000;
        zzgf$zzk.zzx = l2;
    }

    public static /* synthetic */ void zzm(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x400000;
        zzgf$zzk.zzae = string2;
    }

    public static /* synthetic */ void zzn(zzgf$zzk zzgf$zzk) {
        int n3;
        zzgf$zzk.zze = n3 = zzgf$zzk.zze & 0xFFFFFFFD;
        zzgf$zzk.zzj = 0L;
    }

    public static /* synthetic */ void zzn(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x200000;
        zzgf$zzk.zzad = string2;
    }

    public static /* synthetic */ void zzo(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x80;
        zzgf$zzk.zzp = string2;
    }

    public static /* synthetic */ void zzp(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x40;
        zzgf$zzk.zzo = string2;
    }

    public static /* synthetic */ void zzq(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x10000;
        zzgf$zzk.zzy = string2;
    }

    public static /* synthetic */ void zzr(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zzf = n3 = zzgf$zzk.zzf | 0x2000;
        zzgf$zzk.zzbd = string2;
    }

    public static /* synthetic */ void zzs(zzgf$zzk zzgf$zzk, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzk.zze = n3 = zzgf$zzk.zze | 0x200;
        zzgf$zzk.zzr = string2;
    }

    public static zzgf$zzk$zza zzx() {
        return (zzgf$zzk$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzgf$zzk zzy() {
        return zzc;
    }

    public final String i_() {
        return this.zzae;
    }

    public final int zza() {
        return this.zzbl;
    }

    public final zzgf$zzf zza(int n3) {
        return (zzgf$zzf)this.zzh.get(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object objectArray, Object object2) {
        objectArray = zzgi.zza;
        byte by2 = 1;
        object -= by2;
        object = objectArray[object];
        objectArray = null;
        switch (object) {
            default: {
                throw null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                zzlz zzlz2 = zzd;
                if (zzlz2 != null) return zzlz2;
                objectArray = zzgf$zzk.class;
                synchronized (objectArray) {
                    try {
                        zzlz2 = zzd;
                        if (zzlz2 != null) return zzlz2;
                        object2 = zzc;
                        zzd = zzlz2 = new zzkg$zzc((zzkg)object2);
                        return zzlz2;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzc;
            }
            case 3: {
                zzkl zzkl2 = zzgh.zzb();
                objectArray = new Object[71];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = zzgf$zzf.class;
                objectArray[5] = "zzi";
                objectArray[6] = zzgf$zzp.class;
                objectArray[7] = "zzj";
                objectArray[8] = "zzk";
                objectArray[9] = "zzl";
                objectArray[10] = "zzn";
                objectArray[11] = "zzo";
                objectArray[12] = "zzp";
                objectArray[13] = "zzq";
                objectArray[14] = "zzr";
                objectArray[15] = "zzs";
                objectArray[16] = "zzt";
                objectArray[17] = "zzu";
                objectArray[18] = "zzv";
                objectArray[19] = "zzw";
                objectArray[20] = "zzx";
                objectArray[21] = "zzy";
                objectArray[22] = "zzz";
                objectArray[23] = "zzaa";
                objectArray[24] = "zzab";
                objectArray[25] = "zzac";
                objectArray[26] = "zzad";
                objectArray[27] = "zzae";
                objectArray[28] = "zzm";
                objectArray[29] = "zzaf";
                objectArray[30] = "zzag";
                objectArray[31] = zzgf$zzd.class;
                objectArray[32] = "zzah";
                objectArray[33] = "zzai";
                objectArray[34] = "zzaj";
                objectArray[35] = "zzak";
                objectArray[36] = "zzal";
                objectArray[37] = "zzam";
                objectArray[38] = "zzan";
                objectArray[39] = "zzao";
                objectArray[40] = "zzap";
                objectArray[41] = "zzaq";
                objectArray[42] = "zzar";
                objectArray[43] = "zzas";
                objectArray[44] = "zzat";
                objectArray[45] = "zzau";
                objectArray[46] = "zzav";
                objectArray[47] = "zzaw";
                objectArray[48] = "zzax";
                objectArray[49] = "zzay";
                objectArray[50] = zzkl2;
                objectArray[51] = "zzaz";
                objectArray[52] = "zzba";
                objectArray[53] = "zzbb";
                objectArray[54] = "zzbc";
                objectArray[55] = "zzbd";
                objectArray[56] = "zzbe";
                objectArray[57] = "zzbf";
                objectArray[58] = "zzbg";
                objectArray[59] = "zzbh";
                objectArray[60] = "zzbi";
                objectArray[61] = "zzbj";
                objectArray[62] = "zzbk";
                objectArray[63] = "zzbl";
                objectArray[64] = "zzbm";
                objectArray[65] = "zzbn";
                objectArray[66] = "zzbo";
                objectArray[67] = "zzbp";
                objectArray[68] = "zzbq";
                objectArray[69] = "zzbr";
                objectArray[70] = "zzbs";
                return zzkg.zza(zzc, "\u0004A\u0000\u0002\u0001RA\u0000\u0005\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1002\u0001\u0005\u1002\u0002\u0006\u1002\u0003\u0007\u1002\u0005\b\u1008\u0006\t\u1008\u0007\n\u1008\b\u000b\u1008\t\f\u1004\n\r\u1008\u000b\u000e\u1008\f\u0010\u1008\r\u0011\u1002\u000e\u0012\u1002\u000f\u0013\u1008\u0010\u0014\u1007\u0011\u0015\u1008\u0012\u0016\u1002\u0013\u0017\u1004\u0014\u0018\u1008\u0015\u0019\u1008\u0016\u001a\u1002\u0004\u001c\u1007\u0017\u001d\u001b\u001e\u1008\u0018\u001f\u1004\u0019 \u1004\u001a!\u1004\u001b\"\u1008\u001c#\u1002\u001d$\u1002\u001e%\u1008\u001f&\u1008 '\u1004!)\u1008\",\u1009#-\u001d.\u1002$/\u1002%2\u1008&4\u1008'5\u180c(7\u1007)9\u1008*:\u1007+;\u1009,?\u1008-@\u001aA\u1008.C\u1002/D\u10070G\u10081H\u10072I\u10083J\u10044K\u10085L\u10096M\u10047O\u10098P\u10089Q\u1009:R\u1002;", objectArray);
            }
            case 2: {
                return new zzgf$zzk$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzk();
    }

    public final String zzaa() {
        return this.zzar;
    }

    public final String zzab() {
        return this.zzu;
    }

    public final String zzac() {
        return this.zzaa;
    }

    public final String zzad() {
        return this.zzt;
    }

    public final String zzae() {
        return this.zzv;
    }

    public final String zzaf() {
        return this.zzbi;
    }

    public final String zzag() {
        return this.zzax;
    }

    public final String zzah() {
        return this.zzbk;
    }

    public final String zzai() {
        return this.zzq;
    }

    public final String zzaj() {
        return this.zzao;
    }

    public final String zzak() {
        return this.zzah;
    }

    public final String zzam() {
        return this.zzad;
    }

    public final String zzan() {
        return this.zzp;
    }

    public final String zzao() {
        return this.zzo;
    }

    public final String zzap() {
        return this.zzy;
    }

    public final String zzaq() {
        return this.zzbd;
    }

    public final String zzar() {
        return this.zzr;
    }

    public final List zzas() {
        return this.zzag;
    }

    public final List zzat() {
        return this.zzh;
    }

    public final List zzau() {
        return this.zzi;
    }

    public final boolean zzav() {
        return this.zzbh;
    }

    public final boolean zzaw() {
        return this.zzbj;
    }

    public final boolean zzax() {
        return this.zzz;
    }

    public final boolean zzay() {
        return this.zzaf;
    }

    public final boolean zzaz() {
        int n3 = this.zzf;
        int n4 = 0x1000000;
        return (n3 &= n4) != 0;
    }

    public final int zzb() {
        return this.zzai;
    }

    public final zzgf$zzp zzb(int n3) {
        return (zzgf$zzp)this.zzi.get(n3);
    }

    public final boolean zzba() {
        int n3 = this.zze;
        int n4 = 0x2000000;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbb() {
        int n3 = this.zzf;
        int n4 = 0x400000;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbc() {
        int n3 = this.zzf;
        int n4 = 0x8000000;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbd() {
        int n3 = this.zze;
        int n4 = 0x100000;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbe() {
        int n3 = this.zze;
        int n4 = 0x20000000;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbf() {
        int n3 = this.zzf;
        int n4 = 131072;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbg() {
        int n3 = this.zzf & 0x80;
        return n3 != 0;
    }

    public final boolean zzbh() {
        int n3 = this.zzf;
        int n4 = 524288;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbi() {
        int n3 = this.zzf;
        int n4 = 0x800000;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbj() {
        int n3 = this.zze;
        int n4 = 524288;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbk() {
        int n3 = this.zze;
        int n4 = -1 << -1;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbl() {
        int n3 = this.zzf & 0x10;
        return n3 != 0;
    }

    public final boolean zzbm() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }

    public final boolean zzbn() {
        int n3 = this.zze & 0x4000;
        return n3 != 0;
    }

    public final boolean zzbo() {
        int n3 = this.zzf;
        int n4 = 262144;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbp() {
        int n3 = this.zze;
        int n4 = 131072;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbq() {
        int n3 = this.zze & 0x20;
        return n3 != 0;
    }

    public final boolean zzbr() {
        int n3 = this.zze & 0x10;
        return n3 != 0;
    }

    public final boolean zzbs() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzbt() {
        int n3 = this.zzf & 2;
        return n3 != 0;
    }

    public final boolean zzbu() {
        int n3 = this.zze;
        int n4 = 0x800000;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbv() {
        int n3 = this.zzf & 0x2000;
        return n3 != 0;
    }

    public final boolean zzbw() {
        int n3 = this.zzf;
        int n4 = 0x4000000;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbx() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }

    public final boolean zzby() {
        int n3 = this.zzf;
        int n4 = 32768;
        return (n3 &= n4) != 0;
    }

    public final boolean zzbz() {
        int n3 = this.zze & 0x400;
        return n3 != 0;
    }

    public final int zzc() {
        return this.zzac;
    }

    public final boolean zzca() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public final boolean zzcb() {
        int n3 = this.zze;
        int n4 = 32768;
        return (n3 &= n4) != 0;
    }

    public final int zzd() {
        return this.zzbo;
    }

    public final int zze() {
        return this.zzh.size();
    }

    public final int zzf() {
        return this.zzg;
    }

    public final int zzg() {
        return this.zzaq;
    }

    public final int zzh() {
        return this.zzs;
    }

    public final int zzi() {
        return this.zzi.size();
    }

    public final long zzj() {
        return this.zzbs;
    }

    public final long zzk() {
        return this.zzam;
    }

    public final long zzl() {
        return this.zzab;
    }

    public final long zzm() {
        return this.zzau;
    }

    public final long zzn() {
        return this.zzl;
    }

    public final long zzo() {
        return this.zzw;
    }

    public final long zzp() {
        return this.zzn;
    }

    public final long zzq() {
        return this.zzm;
    }

    public final long zzr() {
        return this.zzk;
    }

    public final long zzs() {
        return this.zzbg;
    }

    public final long zzt() {
        return this.zzj;
    }

    public final long zzu() {
        return this.zzx;
    }

    public final zzgf$zza zzv() {
        zzgf$zza zzgf$zza = this.zzbp;
        if (zzgf$zza == null) {
            zzgf$zza = zzgf$zza.zze();
        }
        return zzgf$zza;
    }

    public final zzgf$zzc zzw() {
        zzgf$zzc zzgf$zzc = this.zzbn;
        if (zzgf$zzc == null) {
            zzgf$zzc = zzgf$zzc.zzc();
        }
        return zzgf$zzc;
    }

    public final zzgf$zzo zzz() {
        zzgf$zzo zzgf$zzo = this.zzbr;
        if (zzgf$zzo == null) {
            zzgf$zzo = zzgf$zzo.zzf();
        }
        return zzgf$zzo;
    }
}

