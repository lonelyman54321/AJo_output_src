/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzp$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zzp
extends zzkg
implements zzlo {
    private static final zzgf$zzp zzc;
    private static volatile zzlz zzd;
    private int zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        zzgf$zzp zzgf$zzp;
        zzc = zzgf$zzp = new zzgf$zzp();
        zzkg.zza(zzgf$zzp.class, zzgf$zzp);
    }

    private zzgf$zzp() {
        String string2;
        this.zzg = string2 = "";
        this.zzh = string2;
    }

    public static /* synthetic */ void zza(zzgf$zzp zzgf$zzp) {
        int n3;
        zzgf$zzp.zze = n3 = zzgf$zzp.zze & 0xFFFFFFDF;
        zzgf$zzp.zzk = 0.0;
    }

    public static /* synthetic */ void zza(zzgf$zzp zzgf$zzp, double d2) {
        int n3;
        zzgf$zzp.zze = n3 = zzgf$zzp.zze | 0x20;
        zzgf$zzp.zzk = d2;
    }

    public static /* synthetic */ void zza(zzgf$zzp zzgf$zzp, long l2) {
        int n3;
        zzgf$zzp.zze = n3 = zzgf$zzp.zze | 8;
        zzgf$zzp.zzi = l2;
    }

    public static /* synthetic */ void zza(zzgf$zzp zzgf$zzp, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzp.zze = n3 = zzgf$zzp.zze | 2;
        zzgf$zzp.zzg = string2;
    }

    public static /* synthetic */ void zzb(zzgf$zzp zzgf$zzp) {
        int n3;
        zzgf$zzp.zze = n3 = zzgf$zzp.zze & 0xFFFFFFF7;
        zzgf$zzp.zzi = 0L;
    }

    public static /* synthetic */ void zzb(zzgf$zzp zzgf$zzp, long l2) {
        int n3;
        zzgf$zzp.zze = n3 = zzgf$zzp.zze | 1;
        zzgf$zzp.zzf = l2;
    }

    public static /* synthetic */ void zzb(zzgf$zzp zzgf$zzp, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzp.zze = n3 = zzgf$zzp.zze | 4;
        zzgf$zzp.zzh = string2;
    }

    public static /* synthetic */ void zzc(zzgf$zzp zzgf$zzp) {
        String string2;
        int n3;
        zzgf$zzp.zze = n3 = zzgf$zzp.zze & 0xFFFFFFFB;
        zzgf$zzp.zzh = string2 = zzgf$zzp.zzc.zzh;
    }

    public static zzgf$zzp$zza zze() {
        return (zzgf$zzp$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzgf$zzp zzf() {
        return zzc;
    }

    public final double zza() {
        return this.zzk;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzp>)zzgi.zza;
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
                clazz = zzgf$zzp.class;
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
                Object[] objectArray = new Object[7];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                objectArray[5] = "zzj";
                objectArray[6] = "zzk";
                return zzkg.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005", objectArray);
            }
            case 2: {
                return new zzgf$zzp$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzp();
    }

    public final float zzb() {
        return this.zzj;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final boolean zzi() {
        int n3 = this.zze & 0x20;
        return n3 != 0;
    }

    public final boolean zzj() {
        int n3 = this.zze & 0x10;
        return n3 != 0;
    }

    public final boolean zzk() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }

    public final boolean zzl() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzm() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }
}

