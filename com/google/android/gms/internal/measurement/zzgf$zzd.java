/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzd$zza;
import com.google.android.gms.internal.measurement.zzgf$zzm;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zzd
extends zzkg
implements zzlo {
    private static final zzgf$zzd zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private zzgf$zzm zzg;
    private zzgf$zzm zzh;
    private boolean zzi;

    static {
        zzgf$zzd zzgf$zzd;
        zzc = zzgf$zzd = new zzgf$zzd();
        zzkg.zza(zzgf$zzd.class, zzgf$zzd);
    }

    private zzgf$zzd() {
    }

    public static /* synthetic */ void zza(zzgf$zzd zzgf$zzd, int n3) {
        int n4;
        zzgf$zzd.zze = n4 = zzgf$zzd.zze | 1;
        zzgf$zzd.zzf = n3;
    }

    public static /* synthetic */ void zza(zzgf$zzd zzgf$zzd, zzgf$zzm zzgf$zzm) {
        int n3;
        zzgf$zzm.getClass();
        zzgf$zzd.zzg = zzgf$zzm;
        zzgf$zzd.zze = n3 = zzgf$zzd.zze | 2;
    }

    public static /* synthetic */ void zza(zzgf$zzd zzgf$zzd, boolean bl2) {
        int n3;
        zzgf$zzd.zze = n3 = zzgf$zzd.zze | 8;
        zzgf$zzd.zzi = bl2;
    }

    public static zzgf$zzd$zza zzb() {
        return (zzgf$zzd$zza)zzc.zzcg();
    }

    public static /* synthetic */ void zzb(zzgf$zzd zzgf$zzd, zzgf$zzm zzgf$zzm) {
        int n3;
        zzgf$zzm.getClass();
        zzgf$zzd.zzh = zzgf$zzm;
        zzgf$zzd.zze = n3 = zzgf$zzd.zze | 4;
    }

    public static /* bridge */ /* synthetic */ zzgf$zzd zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzd>)zzgi.zza;
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
                clazz = zzgf$zzd.class;
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
                Object[] objectArray = new Object[5];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                return zzkg.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003", objectArray);
            }
            case 2: {
                return new zzgf$zzd$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzd();
    }

    public final zzgf$zzm zzd() {
        zzgf$zzm zzgf$zzm = this.zzg;
        if (zzgf$zzm == null) {
            zzgf$zzm = zzgf$zzm.zzg();
        }
        return zzgf$zzm;
    }

    public final zzgf$zzm zze() {
        zzgf$zzm zzgf$zzm = this.zzh;
        if (zzgf$zzm == null) {
            zzgf$zzm = zzgf$zzm.zzg();
        }
        return zzgf$zzm;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzh() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }

    public final boolean zzi() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }
}

