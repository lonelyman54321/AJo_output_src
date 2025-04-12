/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzab;
import com.google.android.gms.internal.gtm.zzabq;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzp;
import com.google.android.gms.internal.gtm.zzr;
import com.google.android.gms.internal.gtm.zzx;
import com.google.android.gms.internal.gtm.zzy;
import java.util.List;

public final class zzz
extends zzacf
implements zzadm {
    private static final zzz zza;
    private int zzd;
    private zzacn zze;
    private zzacn zzf;
    private zzacn zzg;
    private zzacn zzh;
    private zzacn zzi;
    private zzacn zzj;
    private zzacn zzk;
    private zzacn zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private zzp zzq;
    private float zzr;
    private boolean zzs;
    private zzacn zzt;
    private int zzu;
    private byte zzv = (byte)2;

    static {
        zzz zzz2;
        zza = zzz2 = new zzz();
        zzacf.zzao(zzz.class, zzz2);
    }

    private zzz() {
        Object object = zzacf.zzai();
        this.zze = object;
        object = zzacf.zzai();
        this.zzf = object;
        object = zzacf.zzai();
        this.zzg = object;
        object = zzacf.zzai();
        this.zzh = object;
        object = zzacf.zzai();
        this.zzi = object;
        object = zzacf.zzai();
        this.zzj = object;
        object = zzacf.zzai();
        this.zzk = object;
        object = zzacf.zzai();
        this.zzl = object;
        this.zzm = object = "";
        this.zzn = object;
        this.zzo = "0";
        this.zzp = object;
        this.zzt = object = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzz zzj() {
        return zza;
    }

    public static zzz zzk() {
        return zza;
    }

    public static zzz zzl(byte[] byArray, zzabq zzabq2) {
        return (zzz)zzacf.zzag(zza, byArray, zzabq2);
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
                            }
                            this.zzv = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzy zzy2 = new zzy(null);
                    return zzy2;
                }
                zzz zzz2 = new zzz();
                return zzz2;
            }
            Object[] objectArray = new Object[24];
            objectArray[0] = "zzd";
            objectArray[n4] = "zzf";
            objectArray[n14] = "zzg";
            objectArray[n10] = zzap.class;
            objectArray[n8] = "zzh";
            objectArray[n7] = zzx.class;
            objectArray[6] = "zzi";
            objectArray[7] = clazz = zzr.class;
            objectArray[8] = "zzj";
            objectArray[9] = clazz;
            objectArray[10] = "zzk";
            objectArray[11] = clazz;
            objectArray[12] = "zzl";
            objectArray[13] = zzab.class;
            objectArray[14] = "zzm";
            objectArray[15] = "zzn";
            objectArray[16] = "zzo";
            objectArray[17] = "zzp";
            objectArray[18] = "zzq";
            objectArray[19] = "zzr";
            objectArray[20] = "zzt";
            objectArray[21] = "zzu";
            objectArray[22] = "zzs";
            objectArray[23] = "zze";
            return zzacf.zzal(zza, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\t\u0005\u0001\u001a\u0002\u041b\u0003\u041b\u0004\u041b\u0005\u041b\u0006\u041b\u0007\u001b\t\u1008\u0000\n\u1008\u0001\f\u1008\u0002\r\u1008\u0003\u000e\u1009\u0004\u000f\u1001\u0005\u0010\u001a\u0011\u1004\u0007\u0012\u1007\u0006\u0013\u001a", objectArray);
        }
        return this.zzv;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final int zzd() {
        return this.zzu;
    }

    public final int zze() {
        return this.zzj.size();
    }

    public final int zzf() {
        return this.zzg.size();
    }

    public final zzr zzg(int n3) {
        return (zzr)this.zzi.get(n3);
    }

    public final zzr zzh(int n3) {
        return (zzr)this.zzk.get(n3);
    }

    public final zzr zzi(int n3) {
        return (zzr)this.zzj.get(n3);
    }

    public final zzap zzm(int n3) {
        return (zzap)this.zzg.get(n3);
    }

    public final String zzn() {
        return this.zzp;
    }

    public final List zzo() {
        return this.zzf;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final List zzq() {
        return this.zzl;
    }

    public final List zzr() {
        return this.zzg;
    }
}

