/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzb$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zzb
extends zzkg
implements zzlo {
    private static final zzgf$zzb zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;

    static {
        zzgf$zzb zzgf$zzb;
        zzc = zzgf$zzb = new zzgf$zzb();
        zzkg.zza(zzgf$zzb.class, zzgf$zzb);
    }

    private zzgf$zzb() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
        this.zzh = string2;
        this.zzi = string2;
        this.zzj = string2;
        this.zzk = string2;
        this.zzl = string2;
    }

    public static /* bridge */ /* synthetic */ zzgf$zzb zza() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzb>)zzgi.zza;
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
                clazz = zzgf$zzb.class;
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
                Object[] objectArray = new Object[8];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                objectArray[5] = "zzj";
                objectArray[6] = "zzk";
                objectArray[7] = "zzl";
                return zzkg.zza(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006", objectArray);
            }
            case 2: {
                return new zzgf$zzb$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzb();
    }
}

