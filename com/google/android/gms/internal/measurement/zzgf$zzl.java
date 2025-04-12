/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzg;
import com.google.android.gms.internal.measurement.zzgf$zzl$zza;
import com.google.android.gms.internal.measurement.zzgf$zzl$zzb;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zzl
extends zzkg
implements zzlo {
    private static final zzgf$zzl zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf = 1;
    private zzkm zzg;

    static {
        zzgf$zzl zzgf$zzl;
        zzc = zzgf$zzl = new zzgf$zzl();
        zzkg.zza(zzgf$zzl.class, zzgf$zzl);
    }

    private zzgf$zzl() {
        zzkm zzkm2;
        this.zzg = zzkm2 = zzkg.zzcl();
    }

    public static zzgf$zzl$zzb zza() {
        return (zzgf$zzl$zzb)zzc.zzcg();
    }

    public static /* synthetic */ void zza(zzgf$zzl zzgf$zzl, zzgf$zzg zzgf$zzg) {
        zzgf$zzg.getClass();
        zzkm zzkm2 = zzgf$zzl.zzg;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            zzgf$zzl.zzg = zzkm2 = zzkg.zza(zzkm2);
        }
        zzgf$zzl.zzg.add(zzgf$zzg);
    }

    public static /* bridge */ /* synthetic */ zzgf$zzl zzb() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object objectArray, Object object2) {
        objectArray = zzgi.zza;
        byte by2 = 1;
        object -= by2;
        object = objectArray[object];
        objectArray = null;
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
                objectArray = zzgf$zzl.class;
                synchronized (objectArray) {
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
                zzkl zzkl2 = zzgf$zzl$zza.zzb();
                objectArray = new Object[5];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = zzkl2;
                objectArray[3] = "zzg";
                objectArray[4] = zzgf$zzg.class;
                return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b", objectArray);
            }
            case 2: {
                return new zzgf$zzl$zzb(null);
            }
            case 1: 
        }
        return new zzgf$zzl();
    }
}

