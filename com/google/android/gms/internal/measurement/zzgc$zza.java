/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc$zza$zza;
import com.google.android.gms.internal.measurement.zzgc$zza$zzb;
import com.google.android.gms.internal.measurement.zzgc$zza$zzc;
import com.google.android.gms.internal.measurement.zzgc$zza$zzf;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgc$zza
extends zzkg
implements zzlo {
    private static final zzgc$zza zzc;
    private static volatile zzlz zzd;
    private int zze;
    private zzkm zzf;
    private zzkm zzg;
    private zzkm zzh;
    private boolean zzi;
    private zzkm zzj;

    static {
        zzgc$zza zzgc$zza;
        zzc = zzgc$zza = new zzgc$zza();
        zzkg.zza(zzgc$zza.class, zzgc$zza);
    }

    private zzgc$zza() {
        zzkm zzkm2;
        this.zzf = zzkm2 = zzkg.zzcl();
        this.zzg = zzkm2 = zzkg.zzcl();
        this.zzh = zzkm2 = zzkg.zzcl();
        this.zzj = zzkm2 = zzkg.zzcl();
    }

    public static /* bridge */ /* synthetic */ zzgc$zza zza() {
        return zzc;
    }

    public static zzgc$zza zzb() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class)zzgb.zza;
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
                clazz = zzgc$zza.class;
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
                Object[] objectArray = new Object[10];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = clazz = zzgc$zza$zzb.class;
                objectArray[3] = "zzg";
                objectArray[4] = zzgc$zza$zzc.class;
                objectArray[5] = "zzh";
                objectArray[6] = zzgc$zza$zzf.class;
                objectArray[7] = "zzi";
                objectArray[8] = "zzj";
                objectArray[9] = clazz;
                return zzkg.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u1007\u0000\u0005\u001b", objectArray);
            }
            case 2: {
                return new zzgc$zza$zza(null);
            }
            case 1: 
        }
        return new zzgc$zza();
    }

    public final List zzc() {
        return this.zzh;
    }

    public final List zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzj;
    }

    public final boolean zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

