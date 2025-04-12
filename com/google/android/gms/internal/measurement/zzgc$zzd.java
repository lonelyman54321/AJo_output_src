/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfw$zza;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc$zza;
import com.google.android.gms.internal.measurement.zzgc$zzb;
import com.google.android.gms.internal.measurement.zzgc$zzc;
import com.google.android.gms.internal.measurement.zzgc$zzd$zza;
import com.google.android.gms.internal.measurement.zzgc$zze;
import com.google.android.gms.internal.measurement.zzgc$zzf;
import com.google.android.gms.internal.measurement.zzgc$zzg;
import com.google.android.gms.internal.measurement.zzgc$zzh;
import com.google.android.gms.internal.measurement.zzgc$zzi;
import com.google.android.gms.internal.measurement.zzgr$zzc;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgc$zzd
extends zzkg
implements zzlo {
    private static final zzgc$zzd zzc;
    private static volatile zzlz zzd;
    private int zze;
    private long zzf;
    private String zzg;
    private int zzh;
    private zzkm zzi;
    private zzkm zzj;
    private zzkm zzk;
    private String zzl;
    private boolean zzm;
    private zzkm zzn;
    private zzkm zzo;
    private String zzp;
    private String zzq;
    private zzgc$zza zzr;
    private zzgc.zzf zzs;
    private zzgc$zzi zzt;
    private zzgc$zzg zzu;
    private zzgc.zze zzv;

    static {
        zzgc$zzd zzgc$zzd;
        zzc = zzgc$zzd = new zzgc$zzd();
        zzkg.zza(zzgc$zzd.class, zzgc$zzd);
    }

    private zzgc$zzd() {
        zzkm zzkm2;
        String string2;
        this.zzg = string2 = "";
        this.zzi = zzkm2 = zzkg.zzcl();
        this.zzj = zzkm2 = zzkg.zzcl();
        this.zzk = zzkm2 = zzkg.zzcl();
        this.zzl = string2;
        this.zzn = zzkm2 = zzkg.zzcl();
        this.zzo = zzkm2 = zzkg.zzcl();
        this.zzp = string2;
        this.zzq = string2;
    }

    public static /* synthetic */ void zza(zzgc$zzd zzgc$zzd) {
        zzkm zzkm2;
        zzgc$zzd.zzk = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zza(zzgc$zzd zzgc$zzd, int n3, zzgc$zzc zzgc$zzc) {
        zzgc$zzc.getClass();
        zzkm zzkm2 = zzgc$zzd.zzj;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            zzgc$zzd.zzj = zzkm2 = zzkg.zza(zzkm2);
        }
        zzgc$zzd.zzj.set(n3, zzgc$zzc);
    }

    public static zzgc$zzd$zza zze() {
        return (zzgc$zzd$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzgc$zzd zzf() {
        return zzc;
    }

    public static zzgc$zzd zzg() {
        return zzc;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final zzgc$zzc zza(int n3) {
        return (zzgc$zzc)this.zzj.get(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgc$zzd>)zzgb.zza;
        byte by2 = 1;
        object -= by2;
        object = clazz[object];
        clazz = null;
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
                clazz = zzgc$zzd.class;
                synchronized (clazz) {
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
                Object[] objectArray = new Object[23];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                objectArray[5] = zzgc.zzh.class;
                objectArray[6] = "zzj";
                objectArray[7] = zzgc$zzc.class;
                objectArray[8] = "zzk";
                objectArray[9] = zzfw$zza.class;
                objectArray[10] = "zzl";
                objectArray[11] = "zzm";
                objectArray[12] = "zzn";
                objectArray[13] = zzgr$zzc.class;
                objectArray[14] = "zzo";
                objectArray[15] = zzgc$zzb.class;
                objectArray[16] = "zzp";
                objectArray[17] = "zzq";
                objectArray[18] = "zzr";
                objectArray[19] = "zzs";
                objectArray[20] = "zzt";
                objectArray[21] = "zzu";
                objectArray[22] = "zzv";
                return zzkg.zza(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005\u000e\u1008\u0006\u000f\u1009\u0007\u0010\u1009\b\u0011\u1009\t\u0012\u1009\n\u0013\u1009\u000b", objectArray);
            }
            case 2: {
                return new zzgc$zzd$zza(null);
            }
            case 1: 
        }
        return new zzgc$zzd();
    }

    public final int zzb() {
        return this.zzj.size();
    }

    public final long zzc() {
        return this.zzf;
    }

    public final zzgc$zza zzd() {
        zzgc$zza zzgc$zza = this.zzr;
        if (zzgc$zza == null) {
            zzgc$zza = zzgc$zza.zzb();
        }
        return zzgc$zza;
    }

    public final zzgc$zzi zzh() {
        zzgc$zzi zzgc$zzi = this.zzt;
        if (zzgc$zzi == null) {
            zzgc$zzi = zzgc$zzi.zzc();
        }
        return zzgc$zzi;
    }

    public final String zzi() {
        return this.zzg;
    }

    public final String zzj() {
        return this.zzp;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final List zzl() {
        return this.zzo;
    }

    public final List zzm() {
        return this.zzn;
    }

    public final List zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        int n3 = this.zze & 0x80;
        return n3 != 0;
    }

    public final boolean zzp() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public final boolean zzq() {
        int n3 = this.zze & 0x200;
        return n3 != 0;
    }

    public final boolean zzr() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

