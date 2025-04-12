/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzacl;
import com.google.android.gms.internal.gtm.zzacm;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaj;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzal;
import com.google.android.gms.internal.gtm.zzam;
import com.google.android.gms.internal.gtm.zzan;
import com.google.android.gms.internal.gtm.zzao;
import com.google.android.gms.internal.gtm.zzyh;
import java.util.List;

public final class zzap
extends zzacc
implements zzadm {
    private static final zzacl zzd;
    private static final zzap zze;
    private int zzf;
    private int zzg = 1;
    private String zzh;
    private zzacn zzi;
    private zzacn zzj;
    private zzacn zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private boolean zzo;
    private zzacn zzp;
    private zzack zzq;
    private boolean zzr;
    private byte zzs = (byte)2;

    static {
        Object object = new zzaj();
        zzd = object;
        zze = object = new zzap();
        zzacf.zzao(zzap.class, (zzacf)object);
    }

    private zzap() {
        zzacn zzacn2;
        Object object = "";
        this.zzh = object;
        this.zzi = zzacn2 = zzacf.zzai();
        this.zzj = zzacn2 = zzacf.zzai();
        this.zzk = zzacn2 = zzacf.zzai();
        this.zzl = object;
        this.zzm = object;
        this.zzp = object = zzacf.zzai();
        this.zzq = object = zzacf.zzah();
    }

    public static /* synthetic */ void zzA(zzap zzap2, zzap zzap3) {
        zzap3.getClass();
        zzacn zzacn2 = zzap2.zzp;
        boolean bl2 = zzacn2.zzc();
        if (!bl2) {
            zzap2.zzp = zzacn2 = zzacf.zzaj(zzacn2);
        }
        zzap2.zzp.add(zzap3);
    }

    public static /* synthetic */ void zzB(zzap zzap2) {
        zzack zzack2;
        zzap2.zzq = zzack2 = zzacf.zzah();
    }

    public static /* synthetic */ void zzC(zzap zzap2) {
        zzacn zzacn2;
        zzap2.zzi = zzacn2 = zzacf.zzai();
    }

    public static /* synthetic */ void zzD(zzap zzap2) {
        zzacn zzacn2;
        zzap2.zzj = zzacn2 = zzacf.zzai();
    }

    public static /* synthetic */ void zzE(zzap zzap2) {
        zzacn zzacn2;
        zzap2.zzk = zzacn2 = zzacf.zzai();
    }

    public static /* synthetic */ void zzF(zzap zzap2) {
        zzacn zzacn2;
        zzap2.zzp = zzacn2 = zzacf.zzai();
    }

    public static /* synthetic */ void zzG(zzap zzap2, boolean bl2) {
        int n3;
        zzap2.zzf = n3 = zzap2.zzf | 0x20;
        zzap2.zzo = bl2;
    }

    public static /* synthetic */ void zzH(zzap zzap2, boolean bl2) {
        int n3;
        zzap2.zzf = n3 = zzap2.zzf | 0x40;
        zzap2.zzr = bl2;
    }

    public static /* synthetic */ void zzI(zzap zzap2, String string2) {
        int n3;
        string2.getClass();
        zzap2.zzf = n3 = zzap2.zzf | 8;
        zzap2.zzm = string2;
    }

    public static /* synthetic */ void zzJ(zzap zzap2, long l2) {
        int n3;
        zzap2.zzf = n3 = zzap2.zzf | 0x10;
        zzap2.zzn = l2;
    }

    public static /* synthetic */ void zzK(zzap zzap2, String string2) {
        int n3;
        string2.getClass();
        zzap2.zzf = n3 = zzap2.zzf | 4;
        zzap2.zzl = string2;
    }

    public static /* synthetic */ void zzL(zzap zzap2, String string2) {
        int n3;
        string2.getClass();
        zzap2.zzf = n3 = zzap2.zzf | 2;
        zzap2.zzh = string2;
    }

    public static /* synthetic */ void zzP(zzap zzap2, int n3) {
        zzap2.zzg = n3;
        zzap2.zzf = n3 = zzap2.zzf | 1;
    }

    private final void zzas() {
        zzacn zzacn2 = this.zzi;
        boolean bl2 = zzacn2.zzc();
        if (!bl2) {
            this.zzi = zzacn2 = zzacf.zzaj(zzacn2);
        }
    }

    private final void zzat() {
        zzacn zzacn2 = this.zzj;
        boolean bl2 = zzacn2.zzc();
        if (!bl2) {
            this.zzj = zzacn2 = zzacf.zzaj(zzacn2);
        }
    }

    private final void zzau() {
        zzacn zzacn2 = this.zzk;
        boolean bl2 = zzacn2.zzc();
        if (!bl2) {
            this.zzk = zzacn2 = zzacf.zzaj(zzacn2);
        }
    }

    public static zzak zzg() {
        return (zzak)zze.zzZ();
    }

    public static /* bridge */ /* synthetic */ zzap zzh() {
        return zze;
    }

    public static zzap zzi() {
        return zze;
    }

    public static /* synthetic */ void zzt(zzap zzap2, Iterable object) {
        int n3;
        Object object2 = zzap2.zzq;
        int n4 = object2.zzc();
        if (n4 == 0) {
            n4 = object2.size();
            n4 += n4;
            zzap2.zzq = object2 = object2.zzg(n4);
        }
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            object2 = (zzam)object.next();
            zzack zzack2 = zzap2.zzq;
            n3 = ((zzam)object2).zza();
            zzack2.zzh(n3);
        }
    }

    public static /* synthetic */ void zzu(zzap object, Iterable iterable) {
        ((zzap)object).zzas();
        object = ((zzap)object).zzi;
        zzyh.zzS(iterable, (List)object);
    }

    public static /* synthetic */ void zzv(zzap object, Iterable iterable) {
        ((zzap)object).zzat();
        object = ((zzap)object).zzj;
        zzyh.zzS(iterable, (List)object);
    }

    public static /* synthetic */ void zzw(zzap object, Iterable iterable) {
        ((zzap)object).zzau();
        object = ((zzap)object).zzk;
        zzyh.zzS(iterable, (List)object);
    }

    public static /* synthetic */ void zzx(zzap zzap2, zzap zzap3) {
        zzap3.getClass();
        zzap2.zzas();
        zzap2.zzi.add(zzap3);
    }

    public static /* synthetic */ void zzy(zzap zzap2, zzap zzap3) {
        zzap3.getClass();
        zzap2.zzat();
        zzap2.zzj.add(zzap3);
    }

    public static /* synthetic */ void zzz(zzap zzap2, zzap zzap3) {
        zzap3.getClass();
        zzap2.zzau();
        zzap2.zzk.add(zzap3);
    }

    public final boolean zzM() {
        return this.zzo;
    }

    public final boolean zzN() {
        return this.zzr;
    }

    public final int zzO() {
        int n3 = zzao.zza(this.zzg);
        if (n3 == 0) {
            n3 = 1;
        }
        return n3;
    }

    public final int zza() {
        return this.zzi.size();
    }

    public final Object zzb(int n3, Object clazz, Object object) {
        int n4 = 1;
        int n7 = 5;
        int n8 = 4;
        int n10 = 3;
        int n14 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n14) {
                if (n3 != n10) {
                    n10 = 0;
                    if (n3 != n8) {
                        if (n3 != n7) {
                            if (clazz == null) {
                                n4 = 0;
                                object = null;
                            }
                            this.zzs = (byte)n4;
                            return null;
                        }
                        return zze;
                    }
                    zzak zzak2 = new zzak(null);
                    return zzak2;
                }
                zzap zzap2 = new zzap();
                return zzap2;
            }
            Object[] objectArray = new Object[19];
            objectArray[0] = "zzf";
            objectArray[n4] = "zzg";
            clazz = zzan.zza;
            objectArray[n14] = clazz;
            objectArray[n10] = "zzh";
            objectArray[n8] = "zzi";
            objectArray[n7] = clazz = zzap.class;
            objectArray[6] = "zzj";
            objectArray[7] = clazz;
            objectArray[8] = "zzk";
            objectArray[9] = clazz;
            objectArray[10] = "zzl";
            objectArray[11] = "zzm";
            objectArray[12] = "zzn";
            objectArray[13] = "zzr";
            objectArray[14] = "zzq";
            objectArray[15] = object = zzal.zza;
            objectArray[16] = "zzp";
            objectArray[17] = clazz;
            objectArray[18] = "zzo";
            return zzacf.zzal(zze, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0005\u0005\u0001\u1d0c\u0000\u0002\u1008\u0001\u0003\u041b\u0004\u041b\u0005\u041b\u0006\u1008\u0002\u0007\u1008\u0003\b\u1002\u0004\t\u1007\u0006\n\u081e\u000b\u041b\f\u1007\u0005", objectArray);
        }
        return this.zzs;
    }

    public final int zzc() {
        return this.zzj.size();
    }

    public final int zzd() {
        return this.zzk.size();
    }

    public final int zze() {
        return this.zzp.size();
    }

    public final long zzf() {
        return this.zzn;
    }

    public final zzap zzj(int n3) {
        return (zzap)this.zzi.get(n3);
    }

    public final zzap zzk(int n3) {
        return (zzap)this.zzj.get(n3);
    }

    public final zzap zzl(int n3) {
        return (zzap)this.zzk.get(n3);
    }

    public final zzap zzm(int n3) {
        return (zzap)this.zzp.get(n3);
    }

    public final String zzn() {
        return this.zzm;
    }

    public final String zzo() {
        return this.zzl;
    }

    public final String zzp() {
        return this.zzh;
    }

    public final List zzq() {
        zzack zzack2 = this.zzq;
        zzacl zzacl2 = zzd;
        zzacm zzacm2 = new zzacm(zzack2, zzacl2);
        return zzacm2;
    }

    public final List zzr() {
        return this.zzi;
    }

    public final List zzs() {
        return this.zzp;
    }
}

