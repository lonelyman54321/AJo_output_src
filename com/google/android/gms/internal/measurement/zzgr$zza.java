/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgq;
import com.google.android.gms.internal.measurement.zzgr$zza$zza;
import com.google.android.gms.internal.measurement.zzgr$zzb;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgr$zza
extends zzkg
implements zzlo {
    private static final zzgr$zza zzc;
    private static volatile zzlz zzd;
    private zzkm zze;

    static {
        zzgr$zza zzgr$zza;
        zzc = zzgr$zza = new zzgr$zza();
        zzkg.zza(zzgr$zza.class, zzgr$zza);
    }

    private zzgr$zza() {
        zzkm zzkm2;
        this.zze = zzkm2 = zzkg.zzcl();
    }

    public static /* bridge */ /* synthetic */ zzgr$zza zzb() {
        return zzc;
    }

    public static zzgr$zza zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zze.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgr$zza>)zzgq.zza;
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
                clazz = zzgr$zza.class;
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
                Object[] objectArray = new Object[2];
                objectArray[0] = "zze";
                objectArray[by2] = zzgr$zzb.class;
                return zzkg.zza(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objectArray);
            }
            case 2: {
                return new zzgr$zza$zza(null);
            }
            case 1: 
        }
        return new zzgr$zza();
    }

    public final List zzd() {
        return this.zze;
    }
}

