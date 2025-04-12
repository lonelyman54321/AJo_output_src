/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zza$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zza
extends zzkg
implements zzlo {
    private static final zzgf$zza zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private long zzm;

    static {
        zzgf$zza zzgf$zza;
        zzc = zzgf$zza = new zzgf$zza();
        zzkg.zza(zzgf$zza.class, zzgf$zza);
    }

    private zzgf$zza() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
        this.zzh = string2;
        this.zzj = string2;
        this.zzk = string2;
        this.zzl = string2;
    }

    public static /* synthetic */ void zza(zzgf$zza zzgf$zza) {
        String string2;
        int n3;
        zzgf$zza.zze = n3 = zzgf$zza.zze & 0xFFFFFFFB;
        zzgf$zza.zzh = string2 = zzgf$zza.zzc.zzh;
    }

    public static /* synthetic */ void zza(zzgf$zza zzgf$zza, long l2) {
        int n3;
        zzgf$zza.zze = n3 = zzgf$zza.zze | 8;
        zzgf$zza.zzi = l2;
    }

    public static /* synthetic */ void zza(zzgf$zza zzgf$zza, String string2) {
        int n3;
        string2.getClass();
        zzgf$zza.zze = n3 = zzgf$zza.zze | 4;
        zzgf$zza.zzh = string2;
    }

    public static /* synthetic */ void zzb(zzgf$zza zzgf$zza) {
        String string2;
        int n3;
        zzgf$zza.zze = n3 = zzgf$zza.zze & 0xFFFFFFFD;
        zzgf$zza.zzg = string2 = zzgf$zza.zzc.zzg;
    }

    public static /* synthetic */ void zzb(zzgf$zza zzgf$zza, long l2) {
        int n3;
        zzgf$zza.zze = n3 = zzgf$zza.zze | 0x80;
        zzgf$zza.zzm = l2;
    }

    public static /* synthetic */ void zzb(zzgf$zza zzgf$zza, String string2) {
        int n3;
        string2.getClass();
        zzgf$zza.zze = n3 = zzgf$zza.zze | 2;
        zzgf$zza.zzg = string2;
    }

    public static zzgf$zza$zza zzc() {
        return (zzgf$zza$zza)zzc.zzcg();
    }

    public static /* synthetic */ void zzc(zzgf$zza zzgf$zza) {
        String string2;
        int n3;
        zzgf$zza.zze = n3 = zzgf$zza.zze & 0xFFFFFFFE;
        zzgf$zza.zzf = string2 = zzgf$zza.zzc.zzf;
    }

    public static /* synthetic */ void zzc(zzgf$zza zzgf$zza, String string2) {
        int n3;
        string2.getClass();
        zzgf$zza.zze = n3 = zzgf$zza.zze | 1;
        zzgf$zza.zzf = string2;
    }

    public static /* bridge */ /* synthetic */ zzgf$zza zzd() {
        return zzc;
    }

    public static /* synthetic */ void zzd(zzgf$zza zzgf$zza) {
        String string2;
        int n3;
        zzgf$zza.zze = n3 = zzgf$zza.zze & 0xFFFFFFBF;
        zzgf$zza.zzl = string2 = zzgf$zza.zzc.zzl;
    }

    public static /* synthetic */ void zzd(zzgf$zza zzgf$zza, String string2) {
        int n3;
        string2.getClass();
        zzgf$zza.zze = n3 = zzgf$zza.zze | 0x40;
        zzgf$zza.zzl = string2;
    }

    public static zzgf$zza zze() {
        return zzc;
    }

    public static /* synthetic */ void zze(zzgf$zza zzgf$zza) {
        String string2;
        int n3;
        zzgf$zza.zze = n3 = zzgf$zza.zze & 0xFFFFFFDF;
        zzgf$zza.zzk = string2 = zzgf$zza.zzc.zzk;
    }

    public static /* synthetic */ void zze(zzgf$zza zzgf$zza, String string2) {
        int n3;
        string2.getClass();
        zzgf$zza.zze = n3 = zzgf$zza.zze | 0x20;
        zzgf$zza.zzk = string2;
    }

    public static /* synthetic */ void zzf(zzgf$zza zzgf$zza) {
        String string2;
        int n3;
        zzgf$zza.zze = n3 = zzgf$zza.zze & 0xFFFFFFEF;
        zzgf$zza.zzj = string2 = zzgf$zza.zzc.zzj;
    }

    public static /* synthetic */ void zzf(zzgf$zza zzgf$zza, String string2) {
        int n3;
        string2.getClass();
        zzgf$zza.zze = n3 = zzgf$zza.zze | 0x10;
        zzgf$zza.zzj = string2;
    }

    public final long zza() {
        return this.zzi;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zza>)zzgi.zza;
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
                clazz = zzgf$zza.class;
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
                Object[] objectArray = new Object[9];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                objectArray[5] = "zzj";
                objectArray[6] = "zzk";
                objectArray[7] = "zzl";
                objectArray[8] = "zzm";
                return zzkg.zza(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1002\u0007", objectArray);
            }
            case 2: {
                return new zzgf$zza$zza(null);
            }
            case 1: 
        }
        return new zzgf$zza();
    }

    public final long zzb() {
        return this.zzm;
    }

    public final String zzf() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzl;
    }

    public final String zzj() {
        return this.zzk;
    }

    public final String zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }

    public final boolean zzm() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public final boolean zzn() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzo() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }

    public final boolean zzp() {
        int n3 = this.zze & 0x80;
        return n3 != 0;
    }

    public final boolean zzq() {
        int n3 = this.zze & 0x40;
        return n3 != 0;
    }

    public final boolean zzr() {
        int n3 = this.zze & 0x20;
        return n3 != 0;
    }

    public final boolean zzs() {
        int n3 = this.zze & 0x10;
        return n3 != 0;
    }
}

