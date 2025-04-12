/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgq;
import com.google.android.gms.internal.measurement.zzgr$zza;
import com.google.android.gms.internal.measurement.zzgr$zzc$zza;
import com.google.android.gms.internal.measurement.zzgr$zzd;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgr$zzc
extends zzkg
implements zzlo {
    private static final zzgr$zzc zzc;
    private static volatile zzlz zzd;
    private int zze;
    private zzkm zzf;
    private zzgr$zza zzg;

    static {
        zzgr$zzc zzgr$zzc;
        zzc = zzgr$zzc = new zzgr$zzc();
        zzkg.zza(zzgr$zzc.class, zzgr$zzc);
    }

    private zzgr$zzc() {
        zzkm zzkm2;
        this.zzf = zzkm2 = zzkg.zzcl();
    }

    public static /* bridge */ /* synthetic */ zzgr$zzc zzb() {
        return zzc;
    }

    public final zzgr$zza zza() {
        zzgr$zza zzgr$zza = this.zzg;
        if (zzgr$zza == null) {
            zzgr$zza = zzgr$zza.zzc();
        }
        return zzgr$zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgr$zzc>)zzgq.zza;
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
                clazz = zzgr$zzc.class;
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
                Object[] objectArray = new Object[4];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = zzgr$zzd.class;
                objectArray[3] = "zzg";
                return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", objectArray);
            }
            case 2: {
                return new zzgr$zzc$zza(null);
            }
            case 1: 
        }
        return new zzgr$zzc();
    }

    public final List zzc() {
        return this.zzf;
    }
}

