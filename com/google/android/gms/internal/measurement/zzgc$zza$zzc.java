/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc$zza$zzc$zza;
import com.google.android.gms.internal.measurement.zzgc$zza$zze;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgc$zza$zzc
extends zzkg
implements zzlo {
    private static final zzgc$zza$zzc zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgc$zza$zzc zzgc$zza$zzc;
        zzc = zzgc$zza$zzc = new zzgc$zza$zzc();
        zzkg.zza(zzgc$zza$zzc.class, zzgc$zza$zzc);
    }

    private zzgc$zza$zzc() {
    }

    public static /* bridge */ /* synthetic */ zzgc$zza$zzc zza() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgc$zza$zzc>)zzgb.zza;
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
                clazz = zzgc$zza$zzc.class;
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
                zzkl zzkl2 = zzgc$zza$zze.zzb();
                clazz = zzgc$zza$zze.zzb();
                Object[] objectArray = new Object[5];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = zzkl2;
                objectArray[3] = "zzg";
                objectArray[4] = clazz;
                return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", objectArray);
            }
            case 2: {
                return new zzgc$zza$zzc$zza(null);
            }
            case 1: 
        }
        return new zzgc$zza$zzc();
    }

    public final zzgc$zza$zze zzb() {
        int n3 = this.zzg;
        zzgc$zza$zze zzgc$zza$zze = zzgc$zza$zze.zza(n3);
        if (zzgc$zza$zze == null) {
            zzgc$zza$zze = zzgc$zza$zze.zza;
        }
        return zzgc$zza$zze;
    }

    public final zzgc$zza$zze zzc() {
        int n3 = this.zzf;
        zzgc$zza$zze zzgc$zza$zze = zzgc$zza$zze.zza(n3);
        if (zzgc$zza$zze == null) {
            zzgc$zza$zze = zzgc$zza$zze.zza;
        }
        return zzgc$zza$zze;
    }
}

