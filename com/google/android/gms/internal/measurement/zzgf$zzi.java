/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzb;
import com.google.android.gms.internal.measurement.zzgf$zzi$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zzi
extends zzkg
implements zzlo {
    private static final zzgf$zzi zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private zzgf$zzb zzh;

    static {
        zzgf$zzi zzgf$zzi;
        zzc = zzgf$zzi = new zzgf$zzi();
        zzkg.zza(zzgf$zzi.class, zzgf$zzi);
    }

    private zzgf$zzi() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
    }

    public static /* bridge */ /* synthetic */ zzgf$zzi zza() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzi>)zzgi.zza;
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
                clazz = zzgf$zzi.class;
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
                objectArray[3] = "zzh";
                return zzkg.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", objectArray);
            }
            case 2: {
                return new zzgf$zzi$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzi();
    }
}

