/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc$zzg$zza;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgc$zzg
extends zzkg
implements zzlo {
    private static final zzgc$zzg zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf;
    private String zzg;

    static {
        zzgc$zzg zzgc$zzg;
        zzc = zzgc$zzg = new zzgc$zzg();
        zzkg.zza(zzgc$zzg.class, zzgc$zzg);
    }

    private zzgc$zzg() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
    }

    public static /* bridge */ /* synthetic */ zzgc$zzg zza() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgc$zzg>)zzgb.zza;
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
                clazz = zzgc$zzg.class;
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
                return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", objectArray);
            }
            case 2: {
                return new zzgc$zzg$zza(null);
            }
            case 1: 
        }
        return new zzgc$zzg();
    }
}

