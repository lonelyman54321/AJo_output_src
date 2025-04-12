/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc$zzi$zza;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgc$zzi
extends zzkg
implements zzlo {
    private static final zzgc$zzi zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private int zzi;
    private String zzj;

    static {
        zzgc$zzi zzgc$zzi;
        zzc = zzgc$zzi = new zzgc$zzi();
        zzkg.zza(zzgc$zzi.class, zzgc$zzi);
    }

    private zzgc$zzi() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
        this.zzh = string2;
        this.zzj = string2;
    }

    public static /* bridge */ /* synthetic */ zzgc$zzi zzb() {
        return zzc;
    }

    public static zzgc$zzi zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zzi;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgc$zzi>)zzgb.zza;
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
                clazz = zzgc$zzi.class;
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
                Object[] objectArray = new Object[6];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                objectArray[5] = "zzj";
                return zzkg.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1004\u0003\u0005\u1008\u0004", objectArray);
            }
            case 2: {
                return new zzgc$zzi$zza(null);
            }
            case 1: 
        }
        return new zzgc$zzi();
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzj;
    }

    public final String zzf() {
        return this.zzf;
    }
}

