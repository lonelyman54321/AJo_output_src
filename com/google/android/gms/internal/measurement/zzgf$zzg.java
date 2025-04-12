/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzg$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zzg
extends zzkg
implements zzlo {
    private static final zzgf$zzg zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzgf$zzg zzgf$zzg;
        zzc = zzgf$zzg = new zzgf$zzg();
        zzkg.zza(zzgf$zzg.class, zzgf$zzg);
    }

    private zzgf$zzg() {
    }

    public static zzgf$zzg$zza zza() {
        return (zzgf$zzg$zza)zzc.zzcg();
    }

    public static /* synthetic */ void zza(zzgf$zzg zzgf$zzg, long l2) {
        int n3;
        zzgf$zzg.zze = n3 = zzgf$zzg.zze | 2;
        zzgf$zzg.zzg = l2;
    }

    public static /* synthetic */ void zza(zzgf$zzg zzgf$zzg, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzg.zze = n3 = zzgf$zzg.zze | 1;
        zzgf$zzg.zzf = string2;
    }

    public static /* bridge */ /* synthetic */ zzgf$zzg zzb() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzg>)zzgi.zza;
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
                clazz = zzgf$zzg.class;
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
                Object[] objectArray = new Object[3];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", objectArray);
            }
            case 2: {
                return new zzgf$zzg$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzg();
    }
}

