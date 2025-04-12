/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzo$zza;
import com.google.android.gms.internal.measurement.zzgf$zzo$zzb;
import com.google.android.gms.internal.measurement.zzgf$zzo$zzc;
import com.google.android.gms.internal.measurement.zzgf$zzo$zzd;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zzo
extends zzkg
implements zzlo {
    private static final zzgf$zzo zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgf$zzo zzgf$zzo;
        zzc = zzgf$zzo = new zzgf$zzo();
        zzkg.zza(zzgf$zzo.class, zzgf$zzo);
    }

    private zzgf$zzo() {
    }

    public static zzgf$zzo$zzb zza() {
        return (zzgf$zzo$zzb)zzc.zzcg();
    }

    public static /* synthetic */ void zza(zzgf$zzo zzgf$zzo, zzgf$zzo$zza zzgf$zzo$zza) {
        int n3;
        zzgf$zzo.zzg = n3 = zzgf$zzo$zza.zza();
        zzgf$zzo.zze = n3 = zzgf$zzo.zze | 2;
    }

    public static /* synthetic */ void zza(zzgf$zzo zzgf$zzo, zzgf$zzo$zzc zzgf$zzo$zzc) {
        int n3;
        zzgf$zzo.zzh = n3 = zzgf$zzo$zzc.zza();
        zzgf$zzo.zze = n3 = zzgf$zzo.zze | 4;
    }

    public static /* synthetic */ void zza(zzgf$zzo zzgf$zzo, zzgf$zzo$zzd zzgf$zzo$zzd) {
        int n3;
        zzgf$zzo.zzf = n3 = zzgf$zzo$zzd.zza();
        zzgf$zzo.zze = n3 = zzgf$zzo.zze | 1;
    }

    public static /* bridge */ /* synthetic */ zzgf$zzo zze() {
        return zzc;
    }

    public static zzgf$zzo zzf() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzo>)zzgi.zza;
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
                clazz = zzgf$zzo.class;
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
                zzkl zzkl2 = zzgf$zzo$zzd.zzb();
                clazz = zzgf$zzo$zza.zzb();
                zzkl zzkl3 = zzgf$zzo$zzc.zzb();
                Object[] objectArray = new Object[7];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = zzkl2;
                objectArray[3] = "zzg";
                objectArray[4] = clazz;
                objectArray[5] = "zzh";
                objectArray[6] = zzkl3;
                return zzkg.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002", objectArray);
            }
            case 2: {
                return new zzgf$zzo$zzb(null);
            }
            case 1: 
        }
        return new zzgf$zzo();
    }

    public final zzgf$zzo$zza zzb() {
        int n3 = this.zzg;
        zzgf$zzo$zza zzgf$zzo$zza = zzgf$zzo$zza.zza(n3);
        if (zzgf$zzo$zza == null) {
            zzgf$zzo$zza = zzgf$zzo$zza.zza;
        }
        return zzgf$zzo$zza;
    }

    public final zzgf$zzo$zzc zzc() {
        int n3 = this.zzh;
        zzgf$zzo$zzc zzgf$zzo$zzc = zzgf$zzo$zzc.zza(n3);
        if (zzgf$zzo$zzc == null) {
            zzgf$zzo$zzc = zzgf$zzo$zzc.zza;
        }
        return zzgf$zzo$zzc;
    }

    public final zzgf$zzo$zzd zzd() {
        int n3 = this.zzf;
        zzgf$zzo$zzd zzgf$zzo$zzd = zzgf$zzo$zzd.zza(n3);
        if (zzgf$zzo$zzd == null) {
            zzgf$zzo$zzd = zzgf$zzo$zzd.zza;
        }
        return zzgf$zzo$zzd;
    }
}

