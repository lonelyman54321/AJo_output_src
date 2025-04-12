/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzc$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zzc
extends zzkg
implements zzlo {
    private static final zzgf$zzc zzc;
    private static volatile zzlz zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzgf$zzc zzgf$zzc;
        zzc = zzgf$zzc = new zzgf$zzc();
        zzkg.zza(zzgf$zzc.class, zzgf$zzc);
    }

    private zzgf$zzc() {
    }

    public static zzgf$zzc$zza zza() {
        return (zzgf$zzc$zza)zzc.zzcg();
    }

    public static /* synthetic */ void zza(zzgf$zzc zzgf$zzc, boolean bl2) {
        int n3;
        zzgf$zzc.zze = n3 = zzgf$zzc.zze | 0x20;
        zzgf$zzc.zzk = bl2;
    }

    public static /* bridge */ /* synthetic */ zzgf$zzc zzb() {
        return zzc;
    }

    public static /* synthetic */ void zzb(zzgf$zzc zzgf$zzc, boolean bl2) {
        int n3;
        zzgf$zzc.zze = n3 = zzgf$zzc.zze | 0x10;
        zzgf$zzc.zzj = bl2;
    }

    public static zzgf$zzc zzc() {
        return zzc;
    }

    public static /* synthetic */ void zzc(zzgf$zzc zzgf$zzc, boolean bl2) {
        int n3;
        zzgf$zzc.zze = n3 = zzgf$zzc.zze | 1;
        zzgf$zzc.zzf = bl2;
    }

    public static /* synthetic */ void zzd(zzgf$zzc zzgf$zzc, boolean bl2) {
        int n3;
        zzgf$zzc.zze = n3 = zzgf$zzc.zze | 0x40;
        zzgf$zzc.zzl = bl2;
    }

    public static /* synthetic */ void zze(zzgf$zzc zzgf$zzc, boolean bl2) {
        int n3;
        zzgf$zzc.zze = n3 = zzgf$zzc.zze | 2;
        zzgf$zzc.zzg = bl2;
    }

    public static /* synthetic */ void zzf(zzgf$zzc zzgf$zzc, boolean bl2) {
        int n3;
        zzgf$zzc.zze = n3 = zzgf$zzc.zze | 4;
        zzgf$zzc.zzh = bl2;
    }

    public static /* synthetic */ void zzg(zzgf$zzc zzgf$zzc, boolean bl2) {
        int n3;
        zzgf$zzc.zze = n3 = zzgf$zzc.zze | 8;
        zzgf$zzc.zzi = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzc>)zzgi.zza;
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
                clazz = zzgf$zzc.class;
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
                Object[] objectArray = new Object[8];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                objectArray[5] = "zzj";
                objectArray[6] = "zzk";
                objectArray[7] = "zzl";
                return zzkg.zza(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006", objectArray);
            }
            case 2: {
                return new zzgf$zzc$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzc();
    }

    public final boolean zzd() {
        return this.zzk;
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzl;
    }

    public final boolean zzh() {
        return this.zzg;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return this.zzi;
    }
}

