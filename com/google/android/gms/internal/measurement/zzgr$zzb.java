/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgq;
import com.google.android.gms.internal.measurement.zzgr$zzb$zza;
import com.google.android.gms.internal.measurement.zzgr$zzd;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgr$zzb
extends zzkg
implements zzlo {
    private static final zzgr$zzb zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf = "";
    private zzkm zzg;

    static {
        zzgr$zzb zzgr$zzb;
        zzc = zzgr$zzb = new zzgr$zzb();
        zzkg.zza(zzgr$zzb.class, zzgr$zzb);
    }

    private zzgr$zzb() {
        zzkm zzkm2;
        this.zzg = zzkm2 = zzkg.zzcl();
    }

    public static /* bridge */ /* synthetic */ zzgr$zzb zza() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgr$zzb>)zzgq.zza;
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
                clazz = zzgr$zzb.class;
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
                objectArray[2] = "zzg";
                objectArray[3] = zzgr$zzd.class;
                return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", objectArray);
            }
            case 2: {
                return new zzgr$zzb$zza(null);
            }
            case 1: 
        }
        return new zzgr$zzb();
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }
}

