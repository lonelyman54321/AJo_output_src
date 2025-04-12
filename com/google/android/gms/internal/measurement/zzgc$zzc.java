/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc$zzc$zza;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgc$zzc
extends zzkg
implements zzlo {
    private static final zzgc$zzc zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzgc$zzc zzgc$zzc;
        zzc = zzgc$zzc = new zzgc$zzc();
        zzkg.zza(zzgc$zzc.class, zzgc$zzc);
    }

    private zzgc$zzc() {
    }

    public static /* synthetic */ void zza(zzgc$zzc zzgc$zzc, String string2) {
        int n3;
        string2.getClass();
        zzgc$zzc.zze = n3 = zzgc$zzc.zze | 1;
        zzgc$zzc.zzf = string2;
    }

    public static /* bridge */ /* synthetic */ zzgc$zzc zzb() {
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
        clazz = (Class<zzgc$zzc>)zzgb.zza;
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
                clazz = zzgc$zzc.class;
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
                Object[] objectArray = new Object[5];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                return zzkg.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1004\u0003", objectArray);
            }
            case 2: {
                return new zzgc$zzc$zza(null);
            }
            case 1: 
        }
        return new zzgc$zzc();
    }

    public final String zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public final boolean zzg() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }

    public final boolean zzh() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }
}

